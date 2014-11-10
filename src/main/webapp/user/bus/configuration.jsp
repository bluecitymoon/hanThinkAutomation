<%@ page contentType="text/html;charset=gb2312"%>
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
<title>Configuration</title>
<link rel="stylesheet" href="/ls/css/syntaxHighlighter/shCore.css">
<link rel="stylesheet" href="/ls/css/syntaxHighlighter/shCoreDefault.css">
<s:include value="/jsps/common/head.jsp" />

</head>
<body>
	<header id="brand">
		<div class="container">
			<div class="row">
				<div class="appname hide-on-phones"></div>
			</div>
		</div>
	</header>
	<s:include value="/jsps/common/brand.jsp" />
	<s:include value="/jsps/common/menu.jsp" />
	<section class="mainbg">
		<div class="container">
			<div class="row">
				<div class="six columns">
					<div class="app-wrapper ui-corner-top">
						<div class="blue module ui-corner-top clearfix">
							<h2>ŷ���Զ�����������</h2>
							<h2 class="right">
								<a class="white blue button" href="#" data-bind="click : clearForm"><i class="icon-pencil"></i>Ϊ�µ����������Զ�����</a>
							</h2>
						</div>
						<form id="jobForm">
							<div class="content" data-bind="with : job">
								<div class="row">
									<div class="six columns">
										<div class="row">
											<label>����</label> 
											<input type="text" class="addon-postfix" data-bind="value : dbName" />
										</div>
										
									</div>
									<div class="six columns">
									</div>
								</div>
								<hr>
								<div class="row">
									<div class="nine columns">
										<label>�������ƣ���ѡ��</label> <input type="text" class="addon-postfix" data-bind="value : name" />
									</div>
									<div class="three columns">
										<label>����״̬</label> <input type="text" class="addon-postfix" data-bind="value : status" />
									</div>

								</div>
								<div class="row">
									<label>�洢���ݿͻ���IP</label> <input type="text" class="addon-postfix" data-bind="value : clientIp" />
								</div>
								<div class="row">
									<div class="five columns">
										<label>ÿ��Ŀ�ʼץȡʱ��</label> <input type="text" class="required" data-bind="value : start" />
									</div>
									<div class="five columns">
										<label>ÿ���ץȡ��ֹʱ��</label> <input type="text" data-bind="value : stop" />
									</div>
									<div class="two columns">
										<label>���(Hour)</label> <input type="text" class="required" data-bind="value : restartInHours" />
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
										<label>��½�û���</label> <input type="text" class="required" data-bind="value : username" />
									</div>
									<div class="six columns">
										<label>��½����</label> <input type="text" class="required" data-bind="value : password" />
									</div>
								</div>
								<hr>
								<div class="row">
									<div class="twelve columns centered">
										<a class="small blue button" href="#" data-bind="click : $root.save">����������Ϣ</a> 
										<!-- 
										<a href="#" class="tertiary line" data-bind="click : $root.testUsernamePassword">�����û�������</a>
										<a href="#" class="tertiary line gray" data-bind="click : $root.startupJob">�����Զ���������</a>
										 -->
									</div>
								</div>
							</div>
						</form>
					</div>
				</div>
				<div class="six columns">
					<div class="app-wrapper ui-corner-top">
						<div class="blue module ui-corner-top clearfix">
							<h2>ŷ���ֶ�ץȡ</h2>
						</div>
						<div class="content">
							<form id="grabForm">
								<div class="row">
								<div class="four columns">
										<label>������</label>
										<input type="text" data-bind="value : manuallyDbName" />
									</div>
									<div class="four columns">
										<label>��ʼʱ��</label>
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
										<label>����ʱ��</label>
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
							</form>
						</div>
						
					</div>
					<div class="app-wrapper ui-corner-top">
							<div class="blue module ui-corner-top clearfix">
								<h2>ŷ����������</h2>
							</div>
							<div class="content">
								<table id="jobListTable" class="clean">						
									<thead>
										<tr>
											<th>������</th>
											<th>����״̬</th>
											
											<th>�޸�/ɾ��</th>
											<th>����/ֹͣ</th>
										</tr>
									</thead>
									<tbody data-bind="foreach: jobList">
										<tr>
											<td><span data-bind="text: dbName"></span></td>	
											<td><span data-bind="text: status"></span></td>						
											<td><a class=" tiny green button" href="#" data-bind="click : $root.editJob">�༭</a>
												<a class=" tiny red button" href="#" data-bind="click : $root.deleteJob">ɾ��</a>
											</td>
											<td><a class=" tiny green button" href="#" data-bind="click : $root.startJob">����</a>
												<a class=" tiny red button" href="#" data-bind="click : $root.stopJob">ֹͣ</a>
											</td>
										</tr>
										
									</tbody>
								</table>
								<br>
							</div>
						</div>
				</div>
			</div>

			<div class="row" id="console">
				<label for="xmlContent">Console XML Message</label>
				<textarea id="xmlContent" class="tall" placeholder="This is a tall text area" name="ex-textarea-4"></textarea>
			</div>
		</div>
	</section>

	<!-- Footer -->
<footer role="footer">
	<div class="container">
		<div class="row">
			<div class="eight columns">
				<p>Copyright &copy; 2009 - 2013 HanThink Technology. All rights reserved.</p>
			</div>
			<div class="four columns"></div>
		</div>
	</div>
</footer>

	<script src="/ls/js/knockout-jqueryui.min.js"></script>
	<script src="/ls/js/jquery.dataTables.js"></script>
	<script>
		$(document).ready( function() {

					$('#grabForm').validate({});
					$('#jobForm').validate({});
					$('#console').hide();
					$('#jobListTable').dataTable({
					    "bJQueryUI": false,
					    "sScrollX": "100%",
					    "sPaginationType": "full_numbers",
					    "oLanguage": {
					        "sSearch": "����"
					    }
					});
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
					};

					var ConfigurationModel = function() {

						var self = this;
						
						self.job = ko.observable(new Job());
						self.manuallyStart = ko.observable('');
						self.manuallyStop = ko.observable('');
						self.manuallyDbName = ko.observable('');
						self.jobList = ko.observableArray([]);

						self.editJob = function(item, event) {
							self.job(item);
							
							Messenger().post({
								message : ('<b class="label green">' + item.dbName + '</b> ���سɹ�!'),
								showCloseButton : true
							});
						};
						self.deleteJob = function(item, event) {
							var result = window.confirm("ȷ����Ҫɾ��[" + item.dbName + "]?");
							
							if (result) {
								$.ajax({
									url : '/ls/deleteJob.action',
									data : {
										job : JSON.stringify(item)
									},
									success : function(data) {
										Messenger().post("ɾ���ɹ���");
										self.reloadJobList();
									},
									error : function(XMLHttpRequest, textStatus,
											errorThrown) {
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
								url : '/ls/startupJob.action',
								success : function(data) {
									if (data.message) {
										Messenger().post({
											message : data.message,
											type : 'error',
											showCloseButton : true
										});
									} else {
										Messenger().post({
											message : '����<b class="label green">'+ item.dbName +'</b>�Ѿ��ɹ�������',
											showCloseButton : true
										});
									}
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
								url : '/ls/shutDownJob.action',
								success : function(data) {
									if (data.message) {
										Messenger().post({
											message : data.message,
											type : 'error',
											showCloseButton : true
										});
									} else {
										Messenger().post({
											message : '����<b class="label green">'+ item.dbName +'</b>�Ѿ��ɹ��رգ�',
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
						self.clearForm = function() {
							self.job(new Job());
						};
						
						self.reloadJobList = function() {
							$.ajax({
								url : '/ls/readJobList.action',
								success : function(data) {
										try {
										self.jobList(data);
										Messenger().post("�ѳɹ����������б�");
									} catch(e) {
										Messenger().post({
											message : ('���������б�ʧ�ܣ�' + e),
											showCloseButton : true
										});
									}
								},
								error : function(XMLHttpRequest, textStatus,
										errorThrown) {
									console.debug(XMLHttpRequest);
								}
							});
						};

						self.reloadJobList();
						
						self.save = function(item, event) {

							if ($('#jobForm').valid()) {
								$.ajax({
									method : 'post',
									data : {
										job : JSON.stringify(self.job())
									},
									url : '/ls/saveAutomaticJob.action',
									success : function(data) {
										
										if (data.message) {
											Messenger().post({
												message : data.message,
												type : 'error',
												showCloseButton : true
											});
										} else {
											self.reloadJobList();
											Messenger().post("������Ϣ�Ѿ��ɹ����棡");
										}
										
										
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
										manuallyDbName : self.manuallyDbName()
									},
									url : '/ls/startManually.action',
									success : function(data) {
										Messenger().post("�ѳɹ�ץȡ��");
										if(data) {
											$('#xmlContent').text(data);
											$('#console').show();
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

						self.testUsernamePassword = function() {
							Messenger().post({
								message : '��δ�����Ĺ��ܣ�',
								type : 'error',
								showCloseButton : true
							});
						};
						
						self.startupJob = function(item, event) {
							
							$.ajax({
								method : 'post',
								data : {
									job : JSON.stringify(self.job())
								},
								url : '/ls/startupJob.action',
								success : function(data) {
									Messenger().post({
										message : '��δ�����Ĺ��ܣ�',
										showCloseButton : true
									});
								},
								error : function(XMLHttpRequest,
										textStatus, errorThrown) {
									Messenger().post({
										message : '��δ�����Ĺ��ܣ�',
										type : 'error',
										showCloseButton : true
									});
								}
							});
						};
					};

					var model = new ConfigurationModel();
					ko.applyBindings(model);

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
					//SyntaxHighlighter.all();
				});
	</script>
</body>
</html>
