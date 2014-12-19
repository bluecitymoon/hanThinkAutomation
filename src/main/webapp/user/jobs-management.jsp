<%@ page contentType="text/html;charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="zh"> <![endif]-->
<!--[if IE 7]>	<html class="no-js lt-ie9 lt-ie8" lang="zh"> <![endif]-->
<!--[if IE 8]>	<html class="no-js lt-ie9" lang="zh"> <![endif]-->
<!--[if gt IE 8]> <html class="no-js ie9" lang="zh"> <!-->
<html lang="zh">
<!--<![endif]-->
<head>
<!-- Set the viewport width to device width for mobile -->
<meta name="viewport" content="width=device-width" />
<title>��ѯ�������ݽ�������</title>
<link rel="shortcut icon" href="/ls/images/hanxun2.ico" type="image/x-icon" /> 
<link rel="stylesheet" href="/ls/css/syntaxHighlighter/shCore.css">
<link rel="stylesheet" href="/ls/css/syntaxHighlighter/shCoreDefault.css">
<!-- Required CSS Files -->
<link rel="stylesheet" href="/ls/css/style.css">
<link rel="stylesheet" href="/ls/css/style-theme.css" media="print" />
<link rel="stylesheet" href="/ls/css/messenger.css">
<link rel="stylesheet" href="/ls/css/messenger-theme-future.css">
<link rel="stylesheet" href="/ls/css/jquery.dataTables.css">
<script src="/ls/js/jquery-1.10.2.js"></script>
<script src="/ls/js/jquery-ui-1.10.4.custom.js"></script>
<script src="/ls/js/knockout-3.1.0.js"></script>
<script src="/ls/js/jquery.loader.js"></script>
<script src="/ls/js/common.js"></script>
<script src="/ls/js/jquery.validate.js"></script>
<script src="/ls/js/messenger.min.js"></script>
<script src="/ls/js/messenger-theme-future.js"></script>

</head>
<body>
	<header id="brand">
		<div class="container">
			<div class="row">
				<div class="appname hide-on-phones"></div>
			</div>
		</div>
	</header>
	<header id="brand">
	<div class="container">
		<div class="row">
			<div class="appname hide-on-phones">��ѯ�������ݽ�������</div>
			<address>
				<div class="row"><span> <strong></strong>Welcome<a href="#" class="login-secure line">Automation</a>	
					<a href="/ls/logout" title="�˳�ϵͳ"><i class="icon-power-off small"></i></a>
				</div>
				</span>
			</address>
		</div>
	</div>
</header>
	<s:include value="/jsps/common/menu.jsp" />
	<section class="mainbg">
		<div class="container" id="jobsContainer">
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
									<select data-bind="options: $root.allStores,
                      											optionsText: 'name',
                       									    	value: $root.selectedStoreId,
                       									    	optionsValue : 'id',
                       									    	selectedOption : $root.selectedStoreId,
                       									    	optionsCaption: '��ѡ������...'">
									</select>
								</div>
								<div class="six columns"></div>
								<div class="three columns">
									<a class="tiny blue button right" href="#" data-bind="click : $root.clearForm">�½�����</a>
								</div>
							</div>
							<table class="infoTable" id="jobListTable">
									<thead>
										<tr>
											<th class="text-center">����</th>
											<th class="text-center">����</th>
											<th class="text-center">����״̬</th>
											<th class="text-center">����</th>
											<th class="text-center">����/ֹͣ</th>
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
											<td class="text-center">
												<a  href="#" data-bind="click : $root.startJob" title="����"><i class="icon-play-sign small icon-blue"></i></a> 
												<a  href="#" style="margin-left : 15px;" data-bind="click : $root.stopJob" title="ֹͣ"><i class="icon-stop small icon-red"></i></a>
											</td>
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
                       									    optionsValue : 'id',
                       									    selectedOption : $root.selectedTaskId,
                       									    optionsCaption: '��ѡ��...'">
                       					</select>
									</div>
									<div class="four columns">
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
									<div class="four columns">
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
										<label class="required">����</label> 
										<select data-bind="options: $root.allStores,
                      											optionsText: 'name',
                       									    	value: storeId,
                       									    	optionsValue : 'id',
                       									    	selectedOption : storeId,
                       									    	optionsCaption: '��ѡ������...'">
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
									<label class="required">�洢���ݿͻ���IP</label> <input type="text" class="addon-postfix  required" data-bind="value : clientIp" />
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
										<label class="required">�����ӳ�(��)</label> <input type="text" class="required" data-bind="value : delayDays" />
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
									<div class="six columns">
										<label class="required">��½�û���</label> <input type="text" class="required" data-bind="value : username" />
									</div>
									<div class="six columns">
										<label class="required">��½����</label> <input type="text" class="required" data-bind="value : password" />
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
				<p>Copyright &copy; 2009 - 2014 HanThink Technology. All rights reserved.</p>
			</div>
			<div class="four columns"></div>
		</div>
	</div>
</footer>

	<script src="/ls/js/knockout-jqueryui.min.js"></script>
	<script src="/ls/js/jquery.dataTables.js"></script>
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
						self.selectedStoreId = ko.observable('');
						self.selectedUserId = ko.observable('');
						
						self.selectedStoreId.subscribe(function() {
							self.reloadJobList();
						});
						
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
									selectedStoreId : self.selectedStoreId()
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
							if ($('#grabForm').valid()) {
								$.ajax({
									data : {
										manuallyStart : self.manuallyStart(),
										manuallyStop : self.manuallyStop(),
										manuallyDbName : self.selectedTaskId()
									},
									url : 'startManually.action',
									success : function(data) {
										Messenger().post("�ѳɹ�ץȡ��");
										if(data && data.message &&data.mode == 'debug') {
											$('#xmlContent').text(data.message);
											$('#console').show();
										} else {
											handleResponse(data);
										}
										
									},
									error : function(XMLHttpRequest,
											textStatus, errorThrown) {
										Messenger().post("ץȡʧ�ܣ�");
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
					
				});
		
		function handleResponse(response) {
			
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
			}
		}
	</script>
</body>
</html>