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
		<div class="container" id ="dataCenterContainer">
			<div class="content" id="userRolesManagementDialog" style="display : none;">
				<div data-bind="foreach : allRoles">
					<label class="input-checkbox" for="employeeProblem">
						<input class="icheckbox" type="checkbox" name="userRoleInput" data-bind="value : name, click : $root.updateUserRole, checked : $root.selectedUserRoles"/> <span
															data-bind="text : description"></span>
					</label>
				</div>
			</div>
			
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
								<h2 class="right">
								</h2>
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
												<td style="text-align: center">
													<a title="查看" data-bind="click : $root.showDetails" style="margin-left : 10px;" href="#"><i class="icon-user small icon-blue"></i></a>
												</td>
											</tr>
										</tbody>
									</table>
									</div>
									<br>
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
							<td style="text-align: center"
								data-bind="text : countInSingleBox"></td>
							<td style="text-align: center" data-bind="text : priceWithoutTax"></td>
						</tr>
					</tbody>
				</table>
			</div>
			</div>
	</section>

	<s:include value="/jsps/common/footer.jsp" />
	<script src="/ls/js/User.js"></script>
	<script>
		$(document).ready( function() {
			var Order = function() {
				var self = this;
				self.id= '';
				self.orderNumber= '';
				self.supplierNumber= '';
				self.orderDate= '';
				self.estimateTakeOverDate= '';
				self.storeNumber= '';
				self.createDate= '';
			};
			
			var ProductDetail = function() {
				var self = this;
				self.id= '';
				self.productNumber= '';
				self.barCode= '';
				self.description= '';
				self.count= '';
				self.countInSingleBox= '';
				self.priceWithTax= '';
				self.priceWithoutTax= '';
				self.createDate= '';
			};
			
			var Role = function() {
				var self = this;
				self.id = '';
				self.name = '';
				self.description = '';
			}
					var UserModel = function() {
						var self = this;
						self.orderList = ko.observableArray([]);
						self.userName = ko.observable('');
						self.users = ko.observableArray([]);
						self.selectedUser = ko.observable(new User());
						self.newPasswordToReset = ko.observable('');
						self.allRoles = ko.observable([]);
						self.loadedProductDetailList = ko.observableArray([]);
						self.showDetails = function(item, event) {
							var orderIdSelected = item.id;
							$.ajax({
								url : 'showProductDetailsByOrderId.action',
								data : { orderIdSelected : orderIdSelected },
								success : function(data) {
									if(data) {
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
						
						$.ajax({
							url : 'getAllGrabData.action',
							success : function(data) {
								self.orderList(data);
							}
						});
						
						self.updateUserRole = function(item, event) {
							$.ajax({
								url : 'updateUserRole.action',
								method : 'POST',
								data : {
										roleJson : JSON.stringify(item),
										checkedOrNot : $(event.target).is(':checked'),
										userJson : JSON.stringify(self.selectedUser())
								},
								success : function(data) {
									
									if (isOK(data)) {
										
										success();
										self.loadAllUsers();
										
									} else {
										fail();
									}
								}
							});
							return true;
						};
						self.selectedUserRoles = ko.observableArray([]);
						
						self.openAssignRolesDialog = function(item, event) {
							$('#userRolesManagementDialog').dialog({
								modal : true,
								width : 500,
								height : 300,
								open : function(e) {
									changeButtonStyleForPopup(e);
								},
								
								buttons : {
									'关闭窗口' : function() {
										self.closeDialog('userRolesManagementDialog');
									}
								}
							});
							
							self.selectedUser(item);
							self.selectedUserRoles([]);
							$.each(item.roles, function(index, role) {
								self.selectedUserRoles.push(role.name);
							});
						};
						
						self.assignRoles = function(item, event) {
							
						};
						
						self.disactiveUser = function(item, event) {
							if (window.confirm('你真的确定要关闭这个用户吗？')) {
								
								$.ajax({
									url : 'disactiveUser.action',
									method : 'POST',
									data : {
											userJson : JSON.stringify(item)
									},
									success : function(data) {
										
										if (isOK(data)) {
											
											success();
											self.loadAllUsers();
											
										} else {
											fail();
										}
									}
								});
							}
						};
						
						self.resetPassword = function() {
							$.ajax({                        
								  url: 'resetPassword.action',
								  data: { newPasswordToReset : self.newPasswordToReset() , userJson : JSON.stringify(self.selectedUser()) },
								  type : 'POST',
								  success: function(data) {  
									  
									  handleStanderdResponse(data);
									  self.selectedUser(new User());
									  self.loadAllUsers();
									  self.closeDialog('resetPasswordDialog');
								  }
								});
						};
						
						self.openResetPasswordDialog = function(item, event) {
							self.selectedUser(item);
							
							$('#resetPasswordDialog').dialog({
								modal : true,
								dialogClass : 'noTitle',
								height : 'auto',
								width : 'auto',
								maxHeight: 'auto',
								maxWidth:'auto',
								minHeight:'auto',
								minWidth:'auto',
								position : ['center', 200]
							});
						};
						
						self.closeDialog = function(id) {
							$('#' + id).dialog("close");
						};
						self.openUserManagementDialog = function() {
							self.selectedUser(new User());
							
							$('#userManagementDialog').dialog({
								modal : true,
								width : 500,
								height : 300,
								open : function(e) {
									changeButtonStyleForPopup(e);
								},
								
								buttons : {
									'保存用户' : function() {
										self.saveUser();
									},
									'关闭窗口' : function() {
										self.closeDialog('userManagementDialog');
									}
								}
							});
						};
						
						self.searchUser = function() {
							$.ajax({	url : 'ajaxFindUser.action',
										data : {
											userName : self.userName()
										},
										success : function(data) {
											self.users(data);
										}
									});
						};
						
						self.loadUserAccouts = function() {
							//apply country auto-complete 
							$.ajax({                        
								  url: 'getAllUserAccounts.action',
								  async: false,      
								  success: function(data) {   
									  $("#userNameInput").autocomplete({ source: data, minLength: 2 });
								  }
								});
						};
						
						self.loadAllUsers = function() {
							//load all
							$.ajax({                        
								  url: 'loadAllUsers.action',
								  success: function(data) {   
									  	self.users(data);

								  }
								});
						};
						
						self.saveUser = function() {
							var currentUser = self.selectedUser();
							if (!currentUser.name) {
								fail("请输入用户姓名");
								return;
							}
							if (!currentUser.username) {
								fail("请输入用户账号");
								return;
							}
							if (!currentUser.password) {
								fail("请输入密码");
								return;
							}
							$.ajax({                        
								  url: 'createUser.action',
								  data: { userJson : JSON.stringify(currentUser) },
								  type : 'POST',
								  success: function(data) {  
									  
									  handleStanderdResponse(data);
									  self.selectedUser(new User());
									  self.loadAllUsers();
									  self.closeDialog('userManagementDialog');
								  }
								});
						};
					};
					var model = new UserModel();
					model.loadUserAccouts();
					model.loadAllUsers();
					
					var $dataCenterContainer = $("#dataCenterContainer")[0];
					ko.applyBindings(model, dataCenterContainer);
					
				});
		
		function activeCurrentMenuItem() {
			$('#dataCenter').addClass('active');
		}
	</script>
</body>
</html>
