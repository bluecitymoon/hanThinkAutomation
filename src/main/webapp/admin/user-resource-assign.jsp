<%@ page contentType="text/html;charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]>	<html class="no-js lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]>	<html class="no-js lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]> <html class="no-js ie9" lang="en"> <!-->
<html lang="en">
<!--<![endif]-->
<head>
<!-- Set the viewport width to device width for mobile -->
<meta name="viewport" content="width=device-width" />
<title>�û��������</title>
<s:include value="/jsps/common/head.jsp" />

</head>
<body>
	<s:include value="/jsps/common/brand.jsp" />
	<s:include value="/jsps/common/menu.jsp" />
	<section class="mainbg">
		<div class="container" id ="usercityModelContainer">
			<div class="row">
				<div class="app-wrapper ui-corner-top">
					<div class="blue module ui-corner-top clearfix">
						<h2>����</h2>
					</div>
					<div class="content">
						<div class="row">
							<div class="three columns"></div>
							<div class="six columns">
								<div class="row collapse">
									<div class="eight columns">
										<input id="userNameInput" type="text" class="addon-postfix" placeholder="�������û�����" data-bind="value : userName" />
									</div>
									<div class="four columns">
										<button class="small nice blue button postfix" data-bind="click : searchUser">����</button>
									</div>
								</div>
							</div>
							<div class="three columns"></div>
							<br>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="six columns">
						<div class="app-wrapper ui-corner-top">
							<div class="blue module ui-corner-top clearfix">
								<h2>�û��б�</h2>
							</div>
							<div class="content">
								<div class="row">
									
										<table class="infoTable">
										<thead>
											<tr>
												<th>���</th>
												<th>����</th>
												<th>�˺�</th>
												<th>����</th>
											</tr>
										</thead>
											<tbody data-bind="foreach : users">
												<tr>
													<td style="text-align: center" data-bind="text : id"></td>
													<td style="text-align: center" data-bind="text : name"></td>
													<td style="text-align: center" data-bind="text : username"></td>
													<td style="text-align: center">
														<a title="������Դ" data-bind="click : $root.showOrderedResource" style="margin-left : 10px;" href="#"><i class="icon-user small icon-blue"></i></a>
													</td>
												</tr>
											</tbody>
										</table>
									</div>
								<br>
							</div>
						</div>
					</div>
					<div class="six columns">
							<div class="app-wrapper ui-corner-top">
							<div class="blue module ui-corner-top clearfix">
								<h2>��Դ����</h2>
								<h2 class="right" data-bind="with : selectedUser">
									<span data-bind="text : name"></span>
								</h2>
							</div>
							<div class="content">
								<div class="row">
									<div data-bind="foreach : $root.allStores">
											<label class="input-checkbox">
												<input type="checkbox" name="storeCheckbox" data-bind="value : name, click : $root.assignOrRemoveStore, checked : $root.assignedStores"/> 
												<span data-bind="text : name"></span>
											</label>
									</div>
								</div>
							</div>
						</div>		
					</div>
				</div>
			</div>
			</div>
	</section>

	<s:include value="/jsps/common/footer.jsp" />
	<script src="/ls/js/User.js"></script>
	<script>
		$(document).ready( function() {
					var Store = function() {
						var self = this;
						self.id = '';
						self.name = '';
					}
			
					var UserModel = function() {
						var self = this;
						self.userName = ko.observable('');
						self.users = ko.observableArray([]);
						self.selectedUser = ko.observable(new User());
						self.userResources  = ko.observableArray([]);						
						self.allStores = ko.observableArray([]);	
						self.selectedCities = ko.observableArray([]);
						self.assignedStores = ko.observableArray([]);
						self.assignOrRemoveStore = function() {
							$.ajax({	
								url : 'findAllStores.action',
								success : function(data) {
									self.allStores(data);
								}
							});
						};
						
						self.loadAllResources = function() {
							$.ajax({	
								url : 'findAllStores.action',
								success : function(data) {
									self.allStores(data);
								}
							});
						}
						self.loadAllResources();
						
						self.showOrderedResource = function(item) {
							
							self.selectedUser(item);
							
							$.ajax({	
								url : 'showOrderedResource.action',
								data : {
									userId : item.id
								},
								success : function(data) {
									
									if (data) {
										
									}
								}
							});
						};
						
						self.assignOrCancelCity = function() {
							
							if (!self.selectedUser() || !self.selectedUser().id ) {
								fail("δѡ���û�!");
								return;
							}
							
							$.ajax({
								url : 'updateUserStore.action',
								method : 'POST',
								data : {
										selectedCities : JSON.stringify(self.selectedCities()),
										userId : self.selectedUser().id
								},
								success : function(data) {
									handleStanderdResponse(data);
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
							$.ajax({                        
								  url: 'getAllUserAccounts.action',
								  async: false,      
								  success: function(data) {   
									  $("#userNameInput").autocomplete({ source: data, minLength: 2 });
								  }
								});
						};
						
						self.loadAllUsers = function() {
							$.ajax({                        
								  url: 'loadAllUsers.action',
								  success: function(data) {   
									  	self.users(data);

								  }
								});
						};
					};
					
					var usercityModel = new UserModel();
					usercityModel.loadUserAccouts();
					usercityModel.loadAllUsers();
					
					var $usercityModelContainer = $("#usercityModelContainer")[0];
					ko.applyBindings(usercityModel, $usercityModelContainer);
				});
		
		function activeCurrentMenuItem() {
			$('#resourceAssign').addClass('active');
		}
	</script>
</body>
</html>
