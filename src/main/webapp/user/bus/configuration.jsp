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
						</div>
						<form id="jobForm">
							<div class="content" data-bind="with : job">
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
										<a class="small blue button" href="#" data-bind="click : $root.save">����������Ϣ</a> <a href="#" class="tertiary line" data-bind="click : $root.testUsernamePassword">�����û�������</a>
										<a href="#" class="tertiary line gray" data-bind="click : $root.startupJob">�����Զ���������</a>
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
									<div class="six columns">
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
									<div class="six columns">
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
				</div>
			</div>

			<div class="row" id="console">
				<label for="xmlContent">Console XML Message</label>
				<textarea id="xmlContent" class="tall" placeholder="This is a tall text area" name="ex-textarea-4"></textarea>
			</div>
		</div>
	</section>

	<s:include value="/jsps/common/footer.jsp" />
	<script src="/ls/js/knockout-jqueryui.min.js"></script>
	<script src="/ls/js/syntaxHighlighter/shCore.js"></script>
	<script src="/ls/js/syntaxHighlighter/shBrushCss.js"></script>
	<script src="/ls/js/syntaxHighlighter/shBrushXml.js"></script>

	<script>
		$(document).ready(
				function() {

					$('#grabForm').validate({});
					$('#jobForm').validate({});
					$('#console').hide();
					var Job = function() {
						var self = this;
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
					};

					var ConfigurationModel = function() {

						var self = this;
						self.job = ko.observable(new Job());
						self.manuallyStart = ko.observable('');
						self.manuallyStop = ko.observable('');

						self.reloadConfiguration = function() {
							$.ajax({
								url : '/ls/readConfiguration.ls',
								success : function(data) {

									self.job(data);

									Messenger().post("�ѳɹ������������ݡ�");
									if (data.mode == 'debug') {
										$('#console').show();
									}
								},
								error : function(XMLHttpRequest, textStatus,
										errorThrown) {
									console.debug(XMLHttpRequest);
								}
							});
						};

						self.reloadConfiguration();

						self.save = function(item, event) {

							if ($('#jobForm').valid()) {
								$.ajax({
									method : 'post',
									data : {
										job : JSON.stringify(self.job())
									},
									url : '/ls/saveAutomaticJob.ls',
									success : function(data) {
										Messenger().post("������Ϣ�Ѿ��ɹ����棡");
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
										manuallyStop : self.manuallyStop()
									},
									url : '/ls/startManually.ls',
									success : function(data) {
										Messenger().post("�ѳɹ�ץȡ��");
										$('#xmlContent').text(data);
										SyntaxHighlighter.highlight();

										self.reloadConfiguration();

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
						
						self.startupJob = function() {
							
							$.ajax({
								method : 'post',
								data : {
									job : JSON.stringify(self.job())
								},
								url : '/ls/startupJob.ls',
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
