package com.ls.jobs;

import java.io.File;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.common.collect.ImmutableList;
import com.google.common.io.Files;
import com.ls.entity.Company;
import com.ls.entity.CompanyResource;
import com.ls.entity.Problem;
import com.ls.entity.Province;
import com.ls.grab.GrapImgUtil;
import com.ls.grab.HtmlParserUtilPlanB;
import com.ls.grab.HttpClientGrabUtil;
import com.ls.repository.CompanyRepository;
import com.ls.repository.CompanyResourceRepository;
import com.ls.repository.ProblemRepository;
import com.ls.repository.ProvinceRepository;
import com.ls.service.AuthanAutomationService;
import com.ls.service.GrabService;
import com.ls.service.impl.AuthanAutomationServiceImpl;
import com.ls.vo.Orders;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestGrabCompany {

	private File file = new File("D:\\Jerry\\58.txt");

	@Autowired
	private CompanyRepository companyRepository;
	
	@Autowired
	private ProblemRepository problemRepository;
	
	@Autowired
	private CompanyResourceRepository companyResourceRepository;
	
	@Autowired
	private ProvinceRepository provinceRepository;
	
	@Resource(name = "grabService")
	private GrabService grabService;

	@Test
	public void testGrabCompanyList() throws Exception{

		String testURL = "http://su.58.com/meirongshi/pn0";

		String htmlForPage = HttpClientGrabUtil.fetchHTMLwithURL(testURL);
		
		File file = new File("wholePagedcompanyList.html");
		if (!file.exists()) {
			file.createNewFile();
		}
		
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(htmlForPage);
		fileWriter.close();
		
	//	String htmlForPage = Files.toString(file, Charset.defaultCharset());
		
	//	System.out.println(htmlForPage);
		
		List<Company> companiesInThisPage = HtmlParserUtilPlanB.findPagedCompanyList(htmlForPage);
		Assert.assertTrue(!companiesInThisPage.isEmpty());

		for (Company company : companiesInThisPage) {

			System.out.println(company.toString());
		}
	}

	@Test
	public void testReadOrderList() throws Exception {
		//String file = "D:\\workspace\\hanThinkAutomation\\src\\main\\java\\com\\ls\\service\\impl\\searchResult.html";
		String file = "D:\\data\\Jerry\\hanThinkAutomation\\src\\main\\java\\com\\ls\\service\\impl\\searchResult.html";
		
		List<String> orderList = HtmlParserUtilPlanB.findOrderList(Files.toString(new File(file), Charset.defaultCharset()));
		
		System.out.println(orderList);
	}
//	
//	@Test
//	public void testReadDetail() throws Exception {
//		String file = "D:\\data\\Jerry\\hanThinkAutomation\\src\\main\\java\\com\\ls\\service\\impl\\detail.html";
//		
//		Orders orders = HtmlParserUtilPlanB.parseOrder(Files.toString(new File(file), Charset.defaultCharset()));
//		
//		System.out.println(orders.toString());
//		
//	}
	
	@Test
	public void testGrabOrderDetail() throws Exception {
//		AuthanAutomationService authanAutomationService = new AuthanAutomationServiceImpl();
//		
//		List<Orders> orders = authanAutomationService.grabOrders("2014-10-01", "2014-10-28");
//		
//		Assert.assertEquals(orders.size(), 3);
	}
	
	
	@Test
	public void testGrabCompanyName() throws Exception {

		String htmlForPage = Files.toString(file, Charset.defaultCharset());

		Company testcomCompany = HtmlParserUtilPlanB.findPagedCompanyList(htmlForPage).get(0);

		Assert.assertNotNull(testcomCompany.getName());
		Assert.assertNotNull(testcomCompany.getfEurl());
	}

	@Test
	public void testGrabDetailedPage() throws Exception {
		// http://qy.58.com/9880155593991/?PGTID=14042836308430.7793496957798185&ClickID=2
		String testURL = "http://qy.58.com/13571834103302/";
		String htmlForPage = HttpClientGrabUtil.fetchHTMLwithURL(testURL, "detailedCompanyPageHtml.txt");

		Assert.assertNotNull(htmlForPage);

	}

	@Test
	public void testGrabContractorInDetailedPage() throws Exception {
		String html = Files.toString(new File("detailedCompanyPageHtml.txt"), Charset.defaultCharset());
		String contactor = HtmlParserUtilPlanB.findContactorName(html);

		Assert.assertEquals("", contactor);
	}

	@Test
	public void testGrabEmployeeCountInDetailedPage() throws Exception {
		String html = Files.toString(new File("detailedCompanyPageHtml.txt"), Charset.defaultCharset());
		String contactor = HtmlParserUtilPlanB.findCompanyEmployeeCount(html);
		
		System.out.println(contactor);
		Assert.assertEquals("1-49锟斤拷", contactor);
	}
	
	@Test
	public void testGrabContractorPhoneImgSrcInDetailedPage() throws Exception {
		String html = Files.toString(new File("detailedCompanyPageHtml.txt"), Charset.defaultCharset());
		String contactorPhone = HtmlParserUtilPlanB.findContactorPhoneNumberImgSrc(html);

		Assert.assertEquals(contactorPhone, "http://image.58.com/showphone.aspx?t=v55&v=82319568EEFB8401DCC4BEA34EC3736B6");
	}

	@Test
	public void testGrabContractorEmailImgSrcInDetailedPage() throws Exception {
		String html = Files.toString(new File("detailedCompanyPageHtml.txt"), Charset.defaultCharset());
		String contactorEmail = HtmlParserUtilPlanB.findContactorEmailImgSrc(html);

		Assert.assertEquals(contactorEmail, "http://image.58.com/showphone.aspx?t=v55&v=ADE0982AA4122C1859F727629C15A292B2421493BF67452E");
	}

	@Test
	public void testGrabContractorAddressInDetailedPage() throws Exception {
		String html = Files.toString(new File("detailedCompanyPageHtml.txt"), Charset.defaultCharset());
		String contactorPhone = HtmlParserUtilPlanB.findCompanyAddress(html);

		Assert.assertEquals(contactorPhone, "");
	}
	
	@Test
	public void testGrabCompanyDescriptionInDetailedPage() throws Exception {
		String html = Files.toString(new File("detailedCompanyPageHtml.txt"), Charset.defaultCharset());
		String description = HtmlParserUtilPlanB.findCompanyDescription(html);

		//Assert.assertEquals(description, "");
		System.out.println(description);
	}
	@Test
	public void testGrabImg() throws Exception {
		String src = "http://image.58.com/showphone.aspx?t=v55&v=82319568EEFB84016CC4BEA34EC3736B6";
		String imgFileName = GrapImgUtil.grabImgWithSrc(src);
		
		System.out.println(imgFileName);
	}

	@Test
	public void testGrabJob() throws Exception {

		String testURL = "http://su.58.com/meirongshi/pn0";

		String htmlForPage = HttpClientGrabUtil.fetchHTMLwithURL(testURL);

		List<Company> companiesInThisPage = HtmlParserUtilPlanB.findPagedCompanyList(htmlForPage);
		
		StringBuilder stringBuilder = new StringBuilder();
		for (Company company : companiesInThisPage) {
			
			synchronized (this) {
				try {
					String companyDetailUrl = company.getfEurl();
					String detailPageHtml = HttpClientGrabUtil.fetchHTMLwithURL(companyDetailUrl);

					String contactor = HtmlParserUtilPlanB.findContactorName(detailPageHtml);
					company.setContactor(contactor);

					String phoneImgSrc = HtmlParserUtilPlanB.findContactorPhoneNumberImgSrc(detailPageHtml);
					company.setPhoneImgSrc(phoneImgSrc);
					
					String address = HtmlParserUtilPlanB.findCompanyAddress(detailPageHtml);
					company.setAddress(address);

					String imgFileNameAfterGrabed = GrapImgUtil.grabImgWithSrc(phoneImgSrc);
					company.setPhoneSrc(imgFileNameAfterGrabed);
					
					String emailImgSrc = HtmlParserUtilPlanB.findContactorEmailImgSrc(detailPageHtml);
					company.setEmailSrc(emailImgSrc);
					
					if (StringUtils.isNotBlank(emailImgSrc)) {
						String emailImgFileNameAfterGrabed = GrapImgUtil.grabImgWithSrc(emailImgSrc);
						company.setEmailSrc(emailImgFileNameAfterGrabed);
					}
					
					System.out.println(company);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				companyRepository.save(company);
				
				//stringBuilder.append(company.toString() + "\n");
			}
		}
		
	//	FileWriter fileWriter = new FileWriter(new File("companies.txt"));
	//	fileWriter.write(stringBuilder.toString());
	//	fileWriter.close();
	}
	
	
	@Test
	public void testGrabJobWithFile() throws Exception {
		
		File file = new File("wholePagedcompanyList.html");
		
		String htmlForPage = Files.toString(file, Charset.defaultCharset());

		List<Company> companiesInThisPage = HtmlParserUtilPlanB.findPagedCompanyList(htmlForPage);
		
		StringBuilder stringBuilder = new StringBuilder();
		for (Company company : companiesInThisPage) {
			
			synchronized (this) {
				try {
					String companyDetailUrl = company.getfEurl();
					String detailPageHtml = HttpClientGrabUtil.fetchHTMLwithURL(companyDetailUrl);

					String contactor = HtmlParserUtilPlanB.findContactorName(detailPageHtml);
					company.setContactor(contactor);

					String phoneImgSrc = HtmlParserUtilPlanB.findContactorPhoneNumberImgSrc(detailPageHtml);
					company.setPhoneImgSrc(phoneImgSrc);
					
					String address = HtmlParserUtilPlanB.findCompanyAddress(detailPageHtml);
					company.setAddress(address);

					String imgFileNameAfterGrabed = GrapImgUtil.grabImgWithSrc(phoneImgSrc);
					company.setPhoneSrc(imgFileNameAfterGrabed);
					
					String emailImgSrc = HtmlParserUtilPlanB.findContactorEmailImgSrc(detailPageHtml);
					company.setEmailSrc(emailImgSrc);
					
					if (StringUtils.isNotBlank(emailImgSrc)) {
						String emailImgFileNameAfterGrabed = GrapImgUtil.grabImgWithSrc(emailImgSrc);
						company.setEmailSrc(emailImgFileNameAfterGrabed);
					}
					
					System.out.println(company);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				//companyRepository.save(company);
				
				//stringBuilder.append(company.toString() + "\n");
			}
		}
		
	}

	@Test
	public void testSaveCompany() throws Exception {
		Company testCompany = new Company();
		testCompany.setAddress("锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷路");
		testCompany.setContactor("锟斤拷锟斤拷锟斤拷");
		testCompany.setEmail("sdfasdfasdf");
		testCompany.setPhone("1123345564");
		
		companyRepository.save(testCompany);
	}
	
	@Test
	public void testSaveCompanyURL() throws Exception {
		
		grabService.grabAllCompanyResource();
	}
	@Test
	public void testSaveCompanyURLone() throws Exception {
		
		CompanyResource companyResource = new CompanyResource();
		companyResource.setName("锟斤拷锟斤拷锟斤拷欧泉锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�");
		companyResource.setUrl("http://qy.58.com/24230403986438/?PGTID=14047374119020.5358016782187727&ClickID=1");
		companyResource.setType("58");
		
		CompanyResource result = companyResourceRepository.save(companyResource);
		
		System.out.println(result.toString());
	}
	
	@Test
	public void testSaveProblem() throws Exception {
		Problem problem = new Problem();
		problem.setName("Jerry太帅");
		
		Problem result = problemRepository.save(problem);
		
		System.out.println(result.toString());
		
		Company testCompany = new Company();
		testCompany.setAddress("aaa");
		testCompany.setContactor("");
		testCompany.setEmail("jjiang");
		testCompany.setPhone("1123345564");
		List<Problem> problems = ImmutableList.of(result);
		testCompany.setProblems(problems);
		
		Company companyResult = companyRepository.save(testCompany);
		
		System.out.println(companyResult.toString());
		
		
	}
	
	@Test
	public void testGrabCities() throws Exception {
		String urlString = "http://www.58.com/changecity.aspx";
		String htmlForPage = HttpClientGrabUtil.fetchHTMLwithURL(urlString);
		
		List<Province> provinces = HtmlParserUtilPlanB.findCities(htmlForPage);
		
		for (Province province : provinces) {
			
			provinceRepository.save(province);
		}
		
		
	}
	
	@Test
	public void testGrabByService() throws Exception {
		String city = "http://su.58.com/";
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		grabService.grabCompanyInformationByUrl(city, simpleDateFormat.parse("2014-7-17"));
	}
	
	@Test
	public void testSaveFile() throws Exception {
		
		System.out.println(System.getProperty("user.dir"));
		File file = new File("D:\\workspace\\littleshop\\src\\main\\webapp\\img\\aa.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
	}
	
	@Test
	public void testFindCompanyWithNameContactorArea() {
//		List<Company> companies = companyRepository.findByNameAndContactorAndArea("锟斤拷锟斤拷锟斤拷欧泉锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�, "锟斤拷锟斤拷锟斤拷", "锟斤拷锟斤拷");
//		Assert.assertTrue(companies.size() > 0);
//		
//		System.out.println(companies);
		
	}
//	public static final HashMap<String, String> acceptTypes = new HashMap<String, String>(){{
//        put("html", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
//        put("img", "image/png,image/*;q=0.8,*/*;q=0.5");
//        put("script", "*/*");
//        put("style", "text/css,*/*;q=0.1");
//    }};
//
//protected void downloadCssAndImages(HtmlPage page) {
//        String xPathExpression = "//*[name() = 'img' or name() = 'link' and @type = 'text/css']";
//        List<?> resultList = page.getByXPath(xPathExpression);
//
//        Iterator<?> i = resultList.iterator();
//        while (i.hasNext()) {
//            try {
//                HtmlElement el = (HtmlElement) i.next();
//
//                String path = el.getAttribute("src").equals("")?el.getAttribute("href"):el.getAttribute("src");
//                if (path == null || path.equals("")) continue;
//
//                URL url = page.getFullyQualifiedUrl(path);
//
//                WebRequestSettings wrs = new WebRequestSettings(url);
//                wrs.setAdditionalHeader("Referer", page.getWebResponse().getRequestSettings().getUrl().toString());
//
//                client.addRequestHeader("Accept", acceptTypes.get(el.getTagName().toLowerCase()));
//                client.getPage(wrs);
//            } catch (Exception e) {}
//        }
//
//
//
//client.removeRequestHeader("Accept");
//}
}
