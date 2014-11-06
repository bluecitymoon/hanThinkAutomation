package com.ls.grab;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.Tag;
import org.htmlparser.nodes.TagNode;
import org.htmlparser.tags.DefinitionList;
import org.htmlparser.tags.DefinitionListBullet;
import org.htmlparser.tags.Div;
import org.htmlparser.tags.ImageTag;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.tags.Span;
import org.htmlparser.tags.TableColumn;
import org.htmlparser.tags.TableHeader;
import org.htmlparser.tags.TableRow;
import org.htmlparser.tags.TableTag;
import org.htmlparser.util.ParserException;
import org.htmlparser.visitors.NodeVisitor;

import com.ls.entity.City;
import com.ls.entity.Company;
import com.ls.entity.Province;
import com.ls.vo.Orders;

public class HtmlParserUtilPlanB {

	public static void main(String[] args) {

		File file = new File("D:\\Jerry\\58.txt");

		//
		// try {
		// String string = Files.toString(file, Charset.defaultCharset());
		//
		// System.out.println(findContactorName(string));
		//
		// System.out.println(findContactorPhoneNumberImgSrc(string));
		//
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

	public static Div findFirstOneWithClassName(String html, final String className) {
		Node[] nodes = null;
		try {
			Parser htmlParser = new Parser();
			htmlParser.setInputHTML(html);

			nodes = htmlParser.extractAllNodesThatMatch(new NodeFilter() {

				public boolean accept(Node node) {
					if (node instanceof Div && StringUtils.isNotBlank(((Div) node).getAttribute("class")) && ((Div) node).getAttribute("class").equalsIgnoreCase(className)) {
						return true;
					}
					return false;
				}
			}).toNodeArray();

		} catch (ParserException e) {
			return null;
		}

		if (nodes != null && nodes.length > 0) {
			return (Div) nodes[0];
		}

		return null;
	}

	public static List<Company> findPagedCompanyList(String wholeCityPageHTML) {

		final List<Company> companyList = new ArrayList<Company>();

		try {

			Parser htmlParser = new Parser();
			htmlParser.setInputHTML(wholeCityPageHTML);

			NodeVisitor nodeVisitor = new NodeVisitor() {

				@Override
				public void visitTag(Tag tag) {

					super.visitTag(tag);

					if (TagFinderUtil.findCompanyLink(tag)) {
						LinkTag linkTag = (LinkTag) tag;
						Company company = new Company();
						company.setName(StringUtils.trimToEmpty(tag.getAttribute("title")));
						company.setfEurl(tag.getAttribute("href"));

						Node nodeLink = linkTag.getParent().getParent();

						Node[] nodes = nodeLink.getChildren().toNodeArray();

						for (int i = 0; i < nodes.length; i++) {
							Node node = nodes[i];

							if (node instanceof DefinitionListBullet) {

								DefinitionListBullet nodeTranslated = (DefinitionListBullet) node;
								String className = nodeTranslated.getAttribute("class");
								if (className != null && className.equals("w96")) {
									company.setArea(nodeTranslated.getStringText());
								}
								if (className != null && className.equals("w68")) {
									company.setPublishDate(nodeTranslated.getStringText());
								}
							}

						}
						companyList.add(company);
					}
				}
			};

			htmlParser.visitAllNodesWith(nodeVisitor);

		} catch (ParserException e) {

			e.printStackTrace();
		}

		return companyList;
	}

	public static List<String> findOrderList(String wholeCityPageHTML) {

		final List<String> orderList = new ArrayList<String>();

		try {

			Parser htmlParser = new Parser();
			htmlParser.setInputHTML(wholeCityPageHTML);

			NodeVisitor nodeVisitor = new NodeVisitor() {

				@Override
				public void visitTag(Tag tag) {

					super.visitTag(tag);
					if (tag instanceof LinkTag) {
						LinkTag grnDetailLinkTag = (LinkTag) tag;
						String onclickValue = grnDetailLinkTag.getAttribute("onclick");
						if (StringUtils.isNotBlank(onclickValue) && onclickValue.startsWith("grnDetail")) {
							int start = onclickValue.indexOf("'") + 1;
							String order = onclickValue.substring(start, onclickValue.length() - 2);
							orderList.add(order);
						}
					}
				}
			};

			htmlParser.visitAllNodesWith(nodeVisitor);

		} catch (ParserException e) {

			e.printStackTrace();
		}

		return orderList;
	}

	public static Orders parseOrder(final String orderPage, final String orderId) throws ParserException {

		final Orders order = new Orders();
		final Map<String, String> headersMap = new HashMap<String, String>();
		order.setOrderTitleMap(headersMap);

		Parser htmlParser = new Parser();
		htmlParser.setInputHTML(orderPage);

		NodeVisitor nodeVisitor = new NodeVisitor() {

			@Override
			public void visitTag(Tag tag) {

				super.visitTag(tag);

				// parse title
				TableTag titleTableTag = (TableTag) findNodeById(orderPage, "hide_table");

				Node[] trs = titleTableTag.getChildrenAsNodeArray();

				for (Node node : trs) {
					if (node instanceof TableRow) {
						TableRow row = (TableRow) node;
						// every row has 4 td, name to value
						Node[] tds = row.getChildrenAsNodeArray();
						List<TableColumn> celList = new ArrayList<TableColumn>();

						for (int i = 0; i < tds.length; i++) {
							if (tds[i] instanceof TableColumn) {
								celList.add((TableColumn) tds[i]);
							}
						}

						headersMap.put(celList.get(0).getStringText().trim(), celList.get(1).getStringText().trim());
						headersMap.put(celList.get(2).getStringText().trim(), celList.get(3).getStringText().trim());

					}
				}

				// parse product detail
				Node productTableTagNode = findNodeById(orderPage, "row");

				if (productTableTagNode != null) {
					TableTag productTableTag = (TableTag) productTableTagNode;

					TableRow[] rows = productTableTag.getRows();

					List<Map<String, String>> productMaps = new ArrayList<Map<String, String>>();
					List<String> headersList = new ArrayList<String>();

					for (TableRow tableRow : rows) {

						TableColumn[] columns = tableRow.getColumns();
						if (columns.length == 0) {
							TableHeader[] headers = tableRow.getHeaders();
							for (int i = 0; i < headers.length; i++) {
								headersList.add(headers[i].getStringText().trim());
							}

						} else {
							Map<String, String> dataMap = new HashMap<String, String>();
							for (int i = 0; i < columns.length; i++) {
								TableColumn tableColumn = columns[i];
								dataMap.put(headersList.get(i), tableColumn.toPlainTextString().trim());
							}
							dataMap.put("id", orderId);
							
							productMaps.add(dataMap);
						}
					}

					order.setOrdersItemList(productMaps);
				}
			}
		};

		htmlParser.visitAllNodesWith(nodeVisitor);

		return order;
	}

	public static String findCompanyName(String detailPageHtml) {

		final StringBuilder comanyName = new StringBuilder();

		try {

			Parser htmlParser = new Parser();
			htmlParser.setInputHTML(detailPageHtml);

			NodeVisitor nodeVisitor = new NodeVisitor() {

				@Override
				public void visitTag(Tag tag) {

					super.visitTag(tag);

					if (TagFinderUtil.findCompanyName(tag)) {

						Node[] childList = tag.getChildren().toNodeArray();

						for (Node node : childList) {

							if (node instanceof LinkTag) {
								LinkTag nodeLink = (LinkTag) node;
								comanyName.append(StringUtils.trimToEmpty(nodeLink.getStringText()));
							}
						}
					}
				}
			};

			htmlParser.visitAllNodesWith(nodeVisitor);

		} catch (ParserException e) {

			e.printStackTrace();
		}

		return comanyName.toString();
	}

	public static String findContactorPhoneNumberImgSrc(String detailPageHtml) {

		final StringBuilder contactorsPhoneImgSrcBuilder = new StringBuilder();

		try {

			Parser htmlParser = new Parser();
			htmlParser.setInputHTML(detailPageHtml);

			htmlParser.extractAllNodesThatMatch(new NodeFilter() {

				private static final long serialVersionUID = -93037936232004146L;

				public boolean accept(Node node) {
					if (node instanceof TableRow) {
						TableRow row = (TableRow) node;

						Node[] nodeList = row.getChildren().toNodeArray();

						// find header, find column
						boolean contactorHeaderFound = false;
						for (int i = 0; i < nodeList.length; i++) {
							Node current = nodeList[i];

							// find title hardly
							if (!contactorHeaderFound && current instanceof TableHeader) {

								TableHeader th = (TableHeader) current;
								String tdConent = th.getStringText();

								// found!!!!!!
								if (tdConent.trim().contains("联系电话")) {
									contactorHeaderFound = true;
								}
							}

							// find his name after title found!!
							if (contactorHeaderFound && current instanceof TableColumn) {
								TableColumn td = (org.htmlparser.tags.TableColumn) current;

								if (td.getAttribute("class") != null && td.getAttribute("class").equals("telNum")) {

									Node[] list = td.getChildren().toNodeArray();
									for (Node img : list) {

										if (img instanceof ImageTag) {

											ImageTag imageTag = (ImageTag) img;

											contactorsPhoneImgSrcBuilder.append(imageTag.getImageURL());

											return true;
										}
									}
								}
							}

						}
					}
					return false;
				}
			});

		} catch (ParserException e) {
			e.printStackTrace();
		}

		return contactorsPhoneImgSrcBuilder.toString();

	}

	public static String findContactorEmailImgSrc(String detailPageHtml) {

		final StringBuilder contactorsEmailSrcBuilder = new StringBuilder();

		try {

			Parser htmlParser = new Parser();
			htmlParser.setInputHTML(detailPageHtml);

			htmlParser.extractAllNodesThatMatch(new NodeFilter() {

				private static final long serialVersionUID = -93037936232004146L;

				public boolean accept(Node node) {
					if (node instanceof TableRow) {
						TableRow row = (TableRow) node;

						Node[] nodeList = row.getChildren().toNodeArray();

						// find header, find column
						boolean contactorHeaderFound = false;
						for (int i = 0; i < nodeList.length; i++) {
							Node current = nodeList[i];

							// find title hardly
							if (!contactorHeaderFound && current instanceof TableHeader) {

								TableHeader th = (TableHeader) current;
								String tdConent = th.getStringText();

								// found!!!!!!
								if (tdConent.trim().contains("邮箱")) {
									contactorHeaderFound = true;
								}
							}

							// find his email after title found!!
							if (contactorHeaderFound && current instanceof TableColumn) {
								TableColumn td = (org.htmlparser.tags.TableColumn) current;

								Node[] list = td.getChildren().toNodeArray();
								for (Node img : list) {

									if (img instanceof ImageTag) {

										ImageTag imageTag = (ImageTag) img;

										contactorsEmailSrcBuilder.append(imageTag.getImageURL());

										return true;
									}
								}
							}

						}
					}
					return false;
				}
			});

		} catch (ParserException e) {
			e.printStackTrace();
		}
		System.out.println(contactorsEmailSrcBuilder.toString());

		return contactorsEmailSrcBuilder.toString();

	}

	public static List<Province> findCities(final String detailPageHtml) {
		final List<Province> provinces = new ArrayList<Province>();

		try {

			Parser htmlParser = new Parser();
			htmlParser.setInputHTML(detailPageHtml);

			htmlParser.extractAllNodesThatMatch(new NodeFilter() {

				private static final long serialVersionUID = 7680728721047912165L;

				public boolean accept(Node node) {

					if (node instanceof DefinitionList) {

						DefinitionList cityList = ((DefinitionList) node);
						if (StringUtils.isNotBlank(cityList.getAttribute("id")) && cityList.getAttribute("id").equals("clist")) {
							Node[] nodelist = cityList.getChildren().toNodeArray();

							for (int i = 0; i < nodelist.length; i++) {
								if (nodelist[i] instanceof DefinitionListBullet) {

									DefinitionListBullet definitionListBullet = (DefinitionListBullet) nodelist[i];

									if (definitionListBullet.getStringText().equals("安徽") || definitionListBullet.getStringText().equals("江苏") || definitionListBullet.getStringText().equals("浙江")) {
										Province province = new Province();
										province.setName(definitionListBullet.getStringText());

										DefinitionListBullet subCities = (DefinitionListBullet) nodelist[i + 1];

										Node[] cityLinks = subCities.getChildren().toNodeArray();
										List<City> cities = new ArrayList<City>();
										for (int j = 0; j < cityLinks.length; j++) {
											if (cityLinks[j] instanceof LinkTag) {

												LinkTag cityLink = (LinkTag) cityLinks[j];

												City city = new City();
												city.setName(cityLink.getStringText());
												city.setUrl(cityLink.getAttribute("href"));
												city.setProvince(province);

												cities.add(city);
											}

										}

										province.setCitys(cities);

										provinces.add(province);
									}
								}
							}
						}

					}
					return false;
				}
			});

		} catch (ParserException e) {
			e.printStackTrace();
		}

		return provinces;

	}

	public static String findContactorName(String detailPageHtml) {
		final StringBuilder contactorsBuilder = new StringBuilder();

		try {

			Parser htmlParser = new Parser();
			htmlParser.setInputHTML(detailPageHtml);

			htmlParser.extractAllNodesThatMatch(new NodeFilter() {

				private static final long serialVersionUID = -93037936232004146L;

				public boolean accept(Node node) {
					if (node instanceof TableRow) {
						TableRow row = (TableRow) node;

						Node[] nodeList = row.getChildren().toNodeArray();

						// find header, find column
						boolean contactorHeaderFound = false;
						for (int i = 0; i < nodeList.length; i++) {
							Node current = nodeList[i];

							// find title hardly
							if (!contactorHeaderFound && current instanceof TableHeader) {

								TableHeader th = (TableHeader) current;
								String tdConent = th.getStringText();

								// found!!!!!!
								if (tdConent.trim().contains("联系人")) {
									contactorHeaderFound = true;
								}
							}

							// find his name after title found!!
							if (contactorHeaderFound && current instanceof TableColumn) {
								TableColumn td = (org.htmlparser.tags.TableColumn) current;

								contactorsBuilder.append(td.getStringText().trim());

								return true;
							}

						}
					}
					return false;
				}
			});

		} catch (ParserException e) {

		}

		return contactorsBuilder.toString();
	}

	public static Node findNodeById(String html, final String divId) {

		try {

			Parser htmlParser = new Parser();
			htmlParser.setInputHTML(html);

			Node[] nodes = htmlParser.extractAllNodesThatMatch(new NodeFilter() {

				public boolean accept(Node node) {

					if (node instanceof TagNode) {
						TagNode tag = (TagNode) node;

						String id = StringUtils.trimToEmpty(tag.getAttribute("id"));

						if (StringUtils.isNotBlank(id) && divId.equals(id)) {
							return true;
						}
					}
					return false;
				}
			}).toNodeArray();

			if (null != nodes && nodes.length > 0) {
				Node foundNode = nodes[0];
				return foundNode;
			}

		} catch (ParserException e) {

			e.printStackTrace();
		}

		return null;
	}

	public static String findCompanyAddress(String detailPageHtml) {

		final StringBuilder address = new StringBuilder();

		try {

			Parser htmlParser = new Parser();
			htmlParser.setInputHTML(detailPageHtml);

			htmlParser.extractAllNodesThatMatch(new NodeFilter() {

				private static final long serialVersionUID = -93037936232004146L;

				public boolean accept(Node node) {
					if (node instanceof TableRow) {
						TableRow row = (TableRow) node;

						Node[] nodeList = row.getChildren().toNodeArray();

						// find header, find column
						boolean contactorHeaderFound = false;
						for (int i = 0; i < nodeList.length; i++) {
							Node current = nodeList[i];

							// find title hardly
							if (!contactorHeaderFound && current instanceof TableHeader) {

								TableHeader th = (TableHeader) current;
								String tdConent = th.getStringText();

								// found!!!!!!
								if (tdConent.trim().contains("公司地址")) {
									contactorHeaderFound = true;
								}
							}

							// find his name after title found!!
							if (contactorHeaderFound && current instanceof TableColumn) {
								TableColumn td = (org.htmlparser.tags.TableColumn) current;

								if (td.getAttribute("class") != null && td.getAttribute("class").equals("adress")) {

									Node[] list = td.getChildren().toNodeArray();
									for (Node span : list) {

										if (span instanceof Span) {

											Span spanTag = (Span) span;

											address.append(spanTag.getStringText().trim());

											return true;
										}
									}
								}
							}

						}
					}
					return false;
				}
			});

		} catch (ParserException e) {

		}

		return address.toString();

	}

	public static String findCompanyEmployeeCount(String detailPageHtml) {
		final StringBuilder description = new StringBuilder();

		try {

			Parser htmlParser = new Parser();
			htmlParser.setInputHTML(detailPageHtml);

			htmlParser.extractAllNodesThatMatch(new NodeFilter() {

				private static final long serialVersionUID = -93037936232004146L;

				public boolean accept(Node node) {
					if (node instanceof TableRow) {
						TableRow row = (TableRow) node;

						Node[] nodeList = row.getChildren().toNodeArray();

						// find header, find column
						boolean contactorHeaderFound = false;
						for (int i = 0; i < nodeList.length; i++) {
							Node current = nodeList[i];

							// find title hardly
							if (!contactorHeaderFound && current instanceof TableHeader) {

								TableHeader th = (TableHeader) current;
								String tdConent = th.getStringText();

								// found!!!!!!
								if (tdConent.trim().contains("公司规模")) {
									contactorHeaderFound = true;
								}
							}

							// find his name after title found!!
							if (contactorHeaderFound && current instanceof TableColumn) {
								TableColumn td = (org.htmlparser.tags.TableColumn) current;

								description.append(td.getStringText().trim());

								return true;
							}

						}
					}
					return false;
				}
			});

		} catch (ParserException e) {

		}

		return description.toString();
	}

	public static String findCompanyDescription(String html) {
		Div descriptionDiv = findFirstOneWithClassName(html, "compIntro");

		return descriptionDiv == null ? "" : descriptionDiv.getStringText();
	}
}
