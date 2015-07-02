<%@ page contentType="text/html;charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="zh"> <![endif]-->
<!--[if IE 7]>	<html class="no-js lt-ie9 lt-ie8" lang="zh"> <![endif]-->
<!--[if IE 8]>	<html class="no-js lt-ie9" lang="zh"> <![endif]-->
<!--[if gt IE 8]> <html class="no-js ie9" lang="zh"> <!-->
<html lang="zh">
<!--<![endif]-->
<%@ include file="/jsps/common/head.jsp" %>
<body>
	
	<%@ include file="/jsps/common/brand.jsp" %>
	<s:include value="/jsps/common/menu.jsp" />
	<section class="mainbg">
		<div class="container" id="jobsContainer">
			<div class="row">
				<div class="three columns">
					<select data-bind="options: $root.allStores,
                      											optionsText: 'name',
                       									    	value: $root.selectedStoreId,
                       									    	optionsValue : 'id',
                       									    	selectedOption : $root.selectedStoreId,
                       									    	optionsCaption: '��ѡ������Դ...'">
							</select>
				</div>
			</div>
			
			<div class="row">
				<div id="moduleTabs" class="app-wrapper ui-corner-top">
				<nav class="blue module-nav ui-corner-top clearfix">
					<section class="moduleNavigation">
						<ul>
							<li class="corner"><a href="#tabs-1"><span>�Զ���������</span></a></li>
							<li><a href="#tabs-2"><span>�ֶ�ͬ��</span></a></li>
						</ul>
					</section>
				</nav>
				<div id="tabs-1">

					<div class="content">
							<div class="row">
								<div class="three columns">
									<sec:authorize ifAllGranted="ROLE_ADMIN">  
 										 <select data-bind="options: $root.allUsers,
                      											optionsText: 'name',
                       									    	value: $root.selectedUserId,
                       									    	optionsValue : 'id',
                       									    	selectedOption : $root.selectedUserId,
                       									    	optionsCaption: '��ѡ���û�...'">
										</select>
									</sec:authorize>
								</div>
								<div class="three columns">
									
								</div>
								<div class="three columns">
								</div>
								<div class="three columns">
									<sec:authorize ifAllGranted="ROLE_ADMIN">
										<a class="tiny blue button right" href="#" data-bind="click : $root.clearForm">�½�����</a>
									</sec:authorize>
								</div>
							</div>
							<table class="infoTable" id="jobListTable">
									<thead>
										<tr>
											<th class="text-center">����</th>
											<th class="text-center">����</th>
											<th class="text-center">����״̬</th>
											<th class="text-center">����</th>
											<sec:authorize ifAllGranted="ROLE_ADMIN">
												<th class="text-center">����/ֹͣ</th>
											</sec:authorize>
										</tr>
									</thead>
									<tbody data-bind="foreach: jobList">
										<tr>
											<td class="text-center"><span data-bind="text: name"></span></td>
											<td class="text-center"><span data-bind="text: dbName"></span></td>
											<td class="text-center"><span data-bind="text: status"></span></td>
											<td class="text-center">
												<a href="#" data-bind="click : $root.editJob" title="�༭"><i class="icon-pencil small icon-blue"></i></a> 
												<a style="margin-left : 15px;" title="ɾ��" href="#" data-bind="click : $root.deleteJob"><i class="icon-trash small icon-red"></i></a>
												<a style="margin-left : 15px;" title="��������" href="#" data-bind="click : $root.copyJob"><i class="icon-copy small icon-green"></i></a>
											</td>
											<sec:authorize ifAllGranted="ROLE_ADMIN">
											<td class="text-center">
												<a  href="#" data-bind="click : $root.startJob" title="����"><i class="icon-play-sign small icon-blue"></i></a> 
												<a  href="#" style="margin-left : 15px;" data-bind="click : $root.stopJob" title="ֹͣ"><i class="icon-stop small icon-red"></i></a>
												<a  href="#" style="margin-left : 15px;" data-bind="click : $root.restartJob" title="��������"><i class="icon-refresh small icon-green"></i></a>
											</td>
											</sec:authorize>
										</tr>
									</tbody>
								</table>
								<br>
					 </div>

				</div>
				<div id="tabs-2">

					<div class="content">
					 <form id="grabForm">
								<div class="row">
									<div class="four columns">
										<label>��������</label>
										<!-- <input type="text" id="jobNameInput" /> -->
										<select data-bind="options: $root.jobList,
                      										optionsText: 'name',
                       									    value: $root.selectedTaskId,
                       									    selectedOption : $root.selectedTaskId,
                       									    optionsCaption: '��ѡ��...'">
                       					</select>
									</div>
									<div class="four columns" data-bind="visible : showOrHideDateInputs">
										<label>��ʼ����</label>
										<div class="row collapse">
											<div class="ten columns">
												<input type="text" id="manuallyStart" class="required addon-postfix" data-bind="datepicker : {showSecond : true, dateFormat : 'yy-mm-dd',stepHour : 1,stepMinute : 1,stepSecond : 1, onClose : startDateOnClose}, value : manuallyStart" />
											</div>
											<div class="two columns">
												<a href="javascript:void(0);" id="manuallyStart-btn"><span class="button-addon postfix" title="Choose Date"><i class="icon-calendar"></i></span></a>
											</div>
										</div>

									</div>
									<div class="four columns" data-bind="visible : showOrHideDateInputs">
										<label>��������</label>
										<div class="row collapse">
											<div class="ten columns">
												<input type="text" id="manuallyStop" class="required addon-postfix" data-bind="datepicker : {showSecond : true, dateFormat : 'yy-mm-dd',stepHour : 1,stepMinute : 1,stepSecond : 1, onClose : endDateOnClose}, value : manuallyStop" />
											</div>
											<div class="two columns">
												<a id="manuallyStop-btn" href="javascript:void(0);"><span class="button-addon postfix" title="Choose Date"><i class="icon-calendar"></i></span></a>
											</div>
										</div>
									</div>
								</div>
								<br>
								<div class="row">
									<div class="six columns">
										<a class=" blue button" href="#" data-bind="click : startManually">��ʼץȡ</a>
										<a id="checkResultMessage" class=" green button" href="#" data-bind="click : checkResultMessage" style="margin-left: 10px">�鿴���</a>
									</div>
								</div>
								<div class="row" id="console">
									<label for="xmlContent">Console XML Message</label>
									<textarea id="xmlContent" class="tall" disabled></textarea>
								</div>
							</form>
					 </div>
				</div>
				<div id="manageJobDialog"  data-bind="with : job" style="display:none" title="�������">
						<form id="jobForm">
							<div class="content">
								<div class="row">
									<div class="five columns">
										<label class="required">����</label> 
										<input type="text" class="addon-postfix required" data-bind="value : dbName" />
									</div>
									
									<div class="four columns">
										<label class="required">����Դ</label> 
										<select data-bind="options: $root.allStores,
                      											optionsText: 'name',
                       									    	value: storeId,
                       									    	optionsValue : 'id',
                       									    	selectedOption : storeId,
                       									    	optionsCaption: '��ѡ������Դ...'">
									</select>
									</div>
									<div class="three columns">
										<label>����Դ����(Ĭ�϶���)</label> 
										<select data-bind="options: $root.allComponentTypes,
                      											optionsText: 'description',
                       									    	value: componentType,
                       									    	optionsValue : 'name',
                       									    	selectedOption : componentType,
                       									    	optionsCaption: '��ѡ����������...'">
                       					</select>
									</div>
								</div>
								<div class="row">
									<div class="five columns">
										<label class="required">��������</label> <input type="text" class="addon-postfix  required" data-bind="value : name" />
									</div>
									<div class="four columns">
										<label class="required">ӵ���߱��</label>
										<input type="text" class="addon-postfix  required" data-bind="value : ownerId" />
									</div>
									<div class="three columns">
										<label>����״̬</label> <input type="text" class="addon-postfix" disabled="disabled" data-bind="value : status" />
									</div>

								</div>
								<div class="row">
									<div class="ten columns">
										<label class="required">�洢���ݿͻ���IP</label> 
										<input type="text" class="addon-postfix  required" data-bind="value : clientIp" />
									</div>
									<div class="two columns" data-bind="visible : $root.showZone ">
										<label>����</label> 
										<select data-bind="options: $root.allZones,
                      											optionsText: 'description',
                       									    	value: zone,
                       									    	optionsValue : 'id',
                       									    	selectedOption : zone,
                       									    	optionsCaption: '��ѡ������'">
                       					</select>
									</div>
								</div>
								<div class="row">
									<div class="four columns">
										<label class="required">ÿ��Ŀ�ʼץȡʱ�� (��С 00:00)</label> <input type="text" class="required" data-bind="value : start" />
									</div>
									<div class="four columns">
										<label class="required">ÿ���ץȡ��ֹʱ��(���23:59)</label> <input type="text" class="required" data-bind="value : stop" />
									</div>
									<div class="two columns">
										<label class="required">���(ʱ)</label> <input type="text" class="required" data-bind="value : restartInHours" />
									</div>
									 
									<div class="two columns">
										<label>�����ӳ�(��)</label> <input type="text" class="required" data-bind="value : delayDays" />
									</div>
								</div>
								<div class="row">
									<div class="six columns">
										<label>��һ��ץȡ�Ŀ�ʼʱ��</label> <input type="text" disabled="disabled" data-bind="value : lastGrabStart" />
									</div>
									<div class="six columns">
										<label>��һ��ץȡ�Ľ���ʱ��</label> <input type="text" disabled="disabled" data-bind="value : lastGrabEnd" />
									</div>
								</div>
								<div class="row">
									<div class="four columns">
										<label class="required">��½�û���</label> <input type="text" class="required" data-bind="value : username" />
									</div>
									<div class="four columns">
										<label class="required">��½����</label> <input type="password" class="required" data-bind="value : password" />
									</div>
									<div class="four columns">
										<label>��ҵ����</label> <input type="text" class="required" data-bind="value : companyCode" />
									</div>
								</div>
							</div>
						</form>
					</div>
			</div>
		
			</div>
		</div>
	</section>
<!-- Footer -->
<footer role="footer">
	<div class="container">
		<div class="row">
			<div class="eight columns">
				<p>Copyright &copy; 2009 - 2015 HanThink Technology. All rights reserved.</p>
			</div>
			<div class="four columns"></div>
		</div>
	</div>
</footer>

	<script src="/ls/js/knockout-jqueryui.min.js"></script>
	<script src="/ls/js/jquery.dataTables.js"></script>
	<script src="/ls/js/jquery.pagination.js"></script>
	<script>
		function activeCurrentMenuItem() {
			$('#jobCenter').addClass('active');	
		}
		
		$(document).ready( function() {
			
					$("#moduleTabs").tabs();
					$('#console').hide();
					$('#grabForm').validate({});
					$('#jobForm').validate({});
					$('#console').hide();
					
					var Job = function() {
						var self = this;
						self.id = '';
						self.status = '';
						self.name = '';
						self.clientIp = '';
						self.start = '';
						self.stop = '';
						self.restartInHours = '';
						self.lastGrabStart = '';
						self.lastGrabEnd = '';
						self.username = '';
						self.password = '';
						self.type = 'authan';
						self.dbName = '';
						self.delayDays = '';
						self.ownerId = '';
						self.storeId = '';
						self.companyCode = '';
						self.componentType = '';
						self.zone = '1';
					};

					var ComponentType = function() {
						var self = this;
						self.name = '';
						self.description = '';	
					};
					
					var ConfigurationModel = function() {

						var self = this;
						
						self.job = ko.observable(new Job());
						self.manuallyStart = ko.observable('');
						self.manuallyStop = ko.observable('');
						self.manuallyDbName = ko.observable('');
						self.jobList = ko.observableArray([]);
						self.selectedTaskId = ko.observable('');
						self.allStores = ko.observableArray([]);
						self.allUsers = ko.observableArray([]);
						self.selectedStoreId = ko.observable('');
						
						self.selectedUserId = ko.observable('');
						self.allComponentTypes = [{"name" : "order", "description": "����"},{"name" : "storage", "description": "���汨��"}];
						self.allZones = [{"id" : "1", "description" : "����"},{"id" : "2", "description" : "����"},{"id" : "3", "description" : "����"},{"id" : "4", "description" : "����"},{"id" : "5", "description" : "����"}];
						self.selectedStoreId.subscribe(function(item) {
							self.reloadJobList();
						});
						self.selectedUserId.subscribe(function() {
							self.reloadJobList();
						});
						
						self.showOrHideDateInputs = ko.observable(true);
						self.showZone = ko.observable(false);
						
						self.consoleMessage = ko.observable('');
						
						self.checkResultMessage = function() {
							$('#checkResultMessage').grumble(
									{
										text: self.consoleMessage(),
										angle: 85,
										distance: 80,
										showAfter: 100,
										hideAfter: 2000,
									});
						};
						
						self.selectedTaskId.subscribe(function(item) {
							
							if(item) {
								
								if (item.type == 'RTMARKET') {
									self.showOrHideDateInputs(false);
								} else {
									self.showOrHideDateInputs(true);
								}
								
								if (item.componentType) {
									
									if (item.componentType == "storage") {
										success("��ѡ����һ���ɼ����汨�������");
									} else if (item.componentType == "order") {
										success("��ѡ����һ���ɼ�����������");
									}
								}
							}
							
						});
						self.loadAllUsers = function() {
							//load all
							$.ajax({                        
								  url: '/ls/admin/loadAllUsers.action',
								  success: function(data) {   
									  	self.allUsers(data);

								  }
								});
						};
						self.loadAllUsers();
						
						self.loadAllResources = function() {
							$.ajax({	
								url : '/ls/findAssignedDetailedStores.action',
								success : function(data) {
									self.allStores(data);
								}
							});
						};
						
						self.loadAllResources();
						self.copyJob = function(item, event) {
							
							item.id = null;
							item.lastGrabStart = '';
							item.lastGrabEnd = '';
							item.status = '';
							
							self.copiedJob(item);
							
							success("��Ӧ�������Ѿ�����.");
						};
						
						self.editJob = function(item, event) {
							self.job(item);
							
							if (item.type == 'RTMARKET') {
								self.showZone(true);
							} else {
								self.showZone(false);
							}
							
							self.openEditJobDialog();
						};
						
						self.openEditJobDialog = function(item, event) {
							
							$('#manageJobDialog').dialog({
								modal : true,
								width : 909,
								height : 730,
								open : function(e) {
									changeButtonStyleForPopup(e);
								},
								
								buttons : {
									'�����¼' : function() {
										self.save();
									},
									'�رմ���' : function() {
										closeDialog('manageJobDialog');
									}
								}
								
							});
							
						};
						
						self.deleteJob = function(item, event) {
							var result = window.confirm("ȷ����Ҫɾ��[" + item.dbName + "]?");
							
							if (result) {
								$.ajax({
									url : 'deleteJob.action',
									data : {
										job : JSON.stringify(item)
									},
									success : function(data) {
										handleResponse(data);
										
										self.reloadJobList();
									},
									error : function(XMLHttpRequest, textStatus,
											errorThrown) {
										
										Messenger().post({
											message : XMLHttpRequest,
											showCloseButton : true
										});
									}
								});
							}
						};
						self.startJob = function(item, event) {
							
							$.ajax({
								method : 'post',
								data : {
									job : JSON.stringify(item)
								},
								url : 'startupJob.action',
								success : function(data) {
									
									handleResponse(data);
									
									self.reloadJobList();
									
								},
								error : function(XMLHttpRequest,
										textStatus, errorThrown) {
									Messenger().post({
										message : '��������ʧ��,' + errorThrown,
										type : 'error',
										showCloseButton : true
									});
								}
							});
							
						};
						
						self.restartJob = function(item, event) {
							
							$.ajax({
								method : 'post',
								data : {
									job : JSON.stringify(item)
								},
								url : 'shutDownJob.action',
								success : function(data) {
									if (data && data.type== 'fail') {
										Messenger().post({
											message : data.response.message,
											type : 'error',
											showCloseButton : true
										});
									} else {
										
										$.ajax({
											method : 'post',
											data : {
												job : JSON.stringify(item)
											},
											url : 'startupJob.action',
											success : function(data) {
												
												handleResponse(data);
												
												self.reloadJobList();
												
											},
											error : function(XMLHttpRequest,
													textStatus, errorThrown) {
												Messenger().post({
													message : '��������ʧ��,' + errorThrown,
													type : 'error',
													showCloseButton : true
												});
											}
										});
										
										Messenger().post({
											message : '����<b class="label green">'+ item.dbName +'</b>��������',
											showCloseButton : true
										});
									}
								},
								error : function(XMLHttpRequest,
										textStatus, errorThrown) {
									Messenger().post({
										message : '����	' + errorThrown,
										type : 'error',
										showCloseButton : true
									});
								}
							});
						};
						
						self.stopJob = function(item, event) {
							
							$.ajax({
								method : 'post',
								data : {
									job : JSON.stringify(item)
								},
								url : 'shutDownJob.action',
								success : function(data) {
									if (data && data.type== 'fail') {
										Messenger().post({
											message : data.response.message,
											type : 'error',
											showCloseButton : true
										});
									} else {
										Messenger().post({
											message : '����<b class="label green">'+ item.dbName +'</b>�Ѿ��ɹ��رգ�',
											showCloseButton : true
										});
									}
									self.reloadJobList();
								},
								error : function(XMLHttpRequest,
										textStatus, errorThrown) {
									Messenger().post({
										message : '����	' + errorThrown,
										type : 'error',
										showCloseButton : true
									});
								}
							});
						};
						
						self.copiedJob = ko.observable(new Job());
						self.clearForm = function() {
								
							self.job(self.copiedJob());
							
							self.openEditJobDialog();
						};
						
						self.storeId = ko.observable('');
						self.reloadJobList = function() {
							$.ajax({
								url : 'readJobList.action',
								data : {
									selectedStoreId : self.selectedStoreId(),
									selectedUserId : self.selectedUserId()
								},
								success : function(data) {
										try {
										self.jobList(data);
									} catch(e) {
										Messenger().post({
											message : ('���������б�ʧ�ܣ�' + e),
											showCloseButton : true
										});
									}
								},
								error : function(XMLHttpRequest, textStatus,
										errorThrown) {
								}
							});
						};
						
						self.save = function(item, event) {

							if ($('#jobForm').valid()) {
								$.ajax({
									method : 'post',
									data : {
										job : JSON.stringify(self.job())
									},
									url : 'saveAutomaticJob.action',
									success : function(data) {
										handleResponse(data);
										
										self.reloadJobList();
										
										closeDialog('manageJobDialog');
										
									},
									error : function(XMLHttpRequest,
											textStatus, errorThrown) {
										Messenger().post("�����������ˣ��Ͻ�ȥ��ϵ����Ա�ɡ�");
									}
								});
							} else {

								Messenger().post({
									message : '����Щ����ѡ��û�',
									type : 'error',
									showCloseButton : true
								});
							}
						};

						self.startManually = function() {
							
							self.consoleMessage('');
							
							if (self.selectedTaskId().type == 'RTMARKET' || $('#grabForm').valid()) {
								$.ajax({
									data : {
										manuallyStart : self.manuallyStart(),
										manuallyStop : self.manuallyStop(),
										manuallyDbName : self.selectedTaskId().id
									},
									url : 'startManually.action',
									success : function(data) {
										
											handleResponse(data, 'YES');
										
									},
									error : function(XMLHttpRequest,
											textStatus, errorThrown) {
										Messenger().post("ץȡʧ�ܣ�");
										
										self.consoleMessage("ץȡʧ�ܣ�");
									}
								});
							}
						};
						self.startDateOnClose = function() {

							$('#manuallyStart').valid();
						};

						self.endDateOnClose = function() {
							$('#manuallyStop').valid();
						};
					};

					var $jobContainer = $("#jobsContainer")[0];
					var model = new ConfigurationModel();
					ko.applyBindings(model, $jobContainer);

					$(document).ajaxStart(function() {
						Common.prototype.loadAjaxLoader("��������ִ�У������ĵȺ�");
					}).ajaxStop(function() {
						Common.prototype.closeAjaxLoader();
					});

					$("#manuallyStop-btn").click(
							function() {
								if ($("#manuallyStop").datepicker("widget").is(
										":visible")) {
									$("#manuallyStop").datepicker("hide");
								} else {
									$("#manuallyStop").datepicker("show");
								}
							});
					$("#manuallyStart-btn").click(
							function() {
								if ($("#manuallyStart").datepicker("widget")
										.is(":visible")) {
									$("#manuallyStart").datepicker("hide");
								} else {
									$("#manuallyStart").datepicker("show");
								}
							});
					
				//	$('#jobNameInput').autocomplete({
				//		
				//		 source: function( request, response ) {
				//			 $.ajax({
				//			 	url:  "ls/loadJobNames.action",
				//				dataType: "json",
				//			 	data: { blurryName: request.term },
				//			 	success: function( data ) {
				//			 		response(data);
				//			 	}
				//			  });
				//			},
				//		minLength: 0,
				//		select: function( event, ui ) {
				//			
				//			model.manuallyDbName(ui.item.id);	
				//		}
				//	});
		function handleResponse(response, needToSave) {
			
			if (response) {
				
				if (response.type == 'SUCCESS') {
					Messenger().post({
						message : response.message,
						showCloseButton : true
					});
				} else if (response.type == 'FAIL') {
					Messenger().post({
						message : response.message,
						showCloseButton : true,
						type : 'error'
					});
				}
				
				if (needToSave) {
					model.consoleMessage(response.message);
				}
			}
		}
				});
		
		
	</script>
</body>
</html>
