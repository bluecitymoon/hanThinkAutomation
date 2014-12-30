<%@ page contentType="text/html;charset=utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]>	<html class="no-js lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]>	<html class="no-js lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]> <html class="no-js ie9" lang="en"> <!-->
<html lang="en">
<!--<![endif]-->
<s:include value="/jsps/common/head.jsp" />
<body>
	<s:include value="/jsps/common/brand.jsp" />
	<s:include value="/jsps/common/menu.jsp" />
	<section class="mainbg">
		<div class="container" id="dataCenterContainer">


			<!-- 
			<div class="row">
				<div class="app-wrapper ui-corner-top">
					<div class="blue module ui-corner-top clearfix">
						<h2>搜索</h2>
					</div>
					<div class="content">
						<div class="row">
							<div class="three columns"></div>
							<div class="six columns">
								<div class="row collapse">
									<div class="eight columns">
										<input id="userNameInput" type="text" class="addon-postfix" placeholder="" data-bind="value : userName" />
									</div>
									<div class="four columns">
										<button class="small nice blue button postfix" data-bind="click : searchUser">搜索</button>
									</div>
								</div>
							</div>
							<div class="three columns"></div>
							<br>
						</div>
					</div>
				</div>
				 -->
			<div class="row">
				<div class="app-wrapper ui-corner-top">
					<div class="blue module ui-corner-top clearfix">
						<h2>数据列表</h2>
						<h2 class="right"></h2>
					</div>
					<div class="content">
						<div class="row">
							<table class="infoTable">
								<thead>
									<tr>
										<th>创建时间</th>
										<th>订单编号</th>
										<th>供应商</th>
										<th>店号</th>
										<th>订单日期</th>
										<th>预定收货日期</th>
										<th>地址</th>
										<th>明细</th>
									</tr>
								</thead>
								<tbody data-bind="foreach : orderList">
									<tr>
										<td style="text-align: center" data-bind="text : createDate"></td>
										<td style="text-align: center" data-bind="text : orderNumber"></td>
										<td style="text-align: center" data-bind="text : supplierNumber"></td>
										<td style="text-align: center" data-bind="text : storeNumber"></td>
										<td style="text-align: center" data-bind="text : orderDate"></td>
										<td style="text-align: center" data-bind="text : estimateTakeOverDate"></td>
										<td style="text-align: left" data-bind="text : address"></td>
										<td style="text-align: center"><a title="查看" data-bind="click : $root.showDetails" style="margin-left: 10px;" href="#"><i class="icon-user small icon-blue"></i></a></td>
									</tr>
								</tbody>
							</table>
						</div>
						<br>
						<!-- data-bind="visible : totalOrderCount > 50" -->
						<div class="row" id="orderPagenavigation"></div>
					</div>
				</div>
			</div>

			<div id="productDetailDialog" class="content" title="明细" style="display: none;">
				<table class="infoTable">
					<thead>
						<tr>
							<th>编号</th>
							<th>货号</th>
							<th>条目号</th>
							<th>货品描述</th>
							<th>订货数</th>
							<th>箱含量</th>
							<th>未税进价</th>
							
						</tr>
					</thead>
					<tbody data-bind="foreach : loadedProductDetailList">
						<tr>
							<td style="text-align: center" data-bind="text : id"></td>
							<td style="text-align: center" data-bind="text : productNumber"></td>
							<td style="text-align: center" data-bind="text : barCode"></td>
							<td style="text-align: center" data-bind="text : description"></td>
							<td style="text-align: center" data-bind="text : count"></td>
							<td style="text-align: center" data-bind="text : countInSingleBox"></td>
							<td style="text-align: center" data-bind="text : priceWithoutTax"></td>
							
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</section>

	<s:include value="/jsps/common/footer.jsp" />
	<script src="/ls/js/User.js"></script>
	<script src="/ls/js/jquery.pagination.js"></script>
	<script>
		$(document).ready(function() {

			var Order = function() {
				var self = this;
				self.id = '';
				self.orderNumber = '';
				self.supplierNumber = '';
				self.orderDate = '';
				self.estimateTakeOverDate = '';
				self.storeNumber = '';
				self.createDate = '';
				self.address = '';
			};

			var ProductDetail = function() {

				var self = this;
				self.id = '';
				self.productNumber = '';
				self.barCode = '';
				self.description = '';
				self.count = '';
				self.countInSingleBox = '';
				self.priceWithTax = '';
				self.priceWithoutTax = '';
				self.createDate = '';
				
			};

			var DataCenterModel = function() {
				var self = this;
				self.orderList = ko.observableArray([]);
				self.loadedProductDetailList = ko.observableArray([]);
				self.currentIndex = ko.observable(1);
				self.totalOrderCount = ko.observable(1);
				self.showDetails = function(item, event) {
					var orderIdSelected = item.id;
					$.ajax({
						url : 'showProductDetailsByOrderId.action',
						data : {
							orderIdSelected : orderIdSelected
						},
						success : function(data) {
							if (data) {
								self.loadedProductDetailList(data);
								$('#productDetailDialog').dialog({
									modal : true,
									width : 909,
									height : 'auto',
									open : function(e) {
										changeButtonStyleForPopup(e);
									},

									buttons : {
										'关闭窗口' : function() {
											closeDialog('productDetailDialog');
										}
									}
								});
							}
						}
					});
				};

				self.totalPage = ko.observable(1);
				self.loadOrderList = function() {
					$.ajax({
						url : 'getAllGrabData.action',
						data : {currentIndex : self.currentIndex() - 1},
						success : function(data) {
							self.orderList(data.elements);
							self.totalOrderCount(data.total);
							self.totalPage(data.totalPages);
							
							$('#orderPagenavigation').pagination(
									self.totalOrderCount(), 
								{
									num_edge_entries: 1, 
									num_display_entries: 15, 
									callback: self.pageselectCallback,
									items_per_page: 50, 
									prev_text: "上一页",
									next_text: "下一页",
									current_page : self.currentIndex() - 1,
									load_first_page : false
								}
							);
						}
					});
				};
				self.loadOrderList();
				
				self.pageselectCallback = function(page_index, jq){
					self.currentIndex(page_index + 1);
					self.loadOrderList();
					return false;
				};
				
				self.closeDialog = function(id) {
					$('#' + id).dialog("close");
				};

			};
			var dataCenterModel = new DataCenterModel();

			var $dataCenterContainer = $("#dataCenterContainer")[0];
			ko.applyBindings(dataCenterModel, dataCenterContainer);

		});

		function activeCurrentMenuItem() {
			$('#dataCenter').addClass('active');
		}
	</script>
</body>
</html>
