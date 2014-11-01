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
							<h2>欧尚自动化任务配置</h2>
						</div>
						<form id="jobForm">
							<div class="content" data-bind="with : job">
								<div class="row">
									<div class="nine columns">
										<label>任务名称（可选）</label> <input type="text" class="addon-postfix" data-bind="value : name" />
									</div>
									<div class="three columns">
										<label>任务状态</label> <input type="text" class="addon-postfix" data-bind="value : status" />
									</div>

								</div>
								<div class="row">
									<label>存储数据客户端IP</label> <input type="text" class="addon-postfix" data-bind="value : clientIp" />
								</div>
								<div class="row">
									<div class="five columns">
										<label>每天的开始抓取时间</label> <input type="text" class="required" data-bind="value : start" />
									</div>
									<div class="five columns">
										<label>每天的抓取截止时间</label> <input type="text" data-bind="value : stop" />
									</div>
									<div class="two columns">
										<label>间隔(Hour)</label> <input type="text" class="required" data-bind="value : restartInHours" />
									</div>
								</div>
								<div class="row">
									<div class="six columns">
										<label>上一次抓取的开始时间</label> <input type="text" disabled="disabled" data-bind="value : lastGrabStart" />
									</div>
									<div class="six columns">
										<label>上一次抓取的结束时间</label> <input type="text" disabled="disabled" data-bind="value : lastGrabEnd" />
									</div>
								</div>
								<div class="row">
									<div class="six columns">
										<label>登陆用户名</label> <input type="text" class="required" data-bind="value : username" />
									</div>
									<div class="six columns">
										<label>登陆密码</label> <input type="text" class="required" data-bind="value : password" />
									</div>
								</div>
								<div class="row">
									<div class="twelve columns centered">
										<a class="small blue button" href="#" data-bind="click : $root.save">保存</a>
									</div>
								</div>
							</div>
						</form>
					</div>
				</div>
				<div class="six columns">
					<div class="app-wrapper ui-corner-top">
						<div class="blue module ui-corner-top clearfix">
							<h2>欧尚手动抓取</h2>
						</div>
						<div class="content">
							<form id="grabForm">
								<div class="row">
									<div class="six columns">
										<label>开始时间</label> <input type="text" class="required" data-bind="datepicker : {showSecond : true, dateFormat : 'yy-mm-dd',stepHour : 1,stepMinute : 1,stepSecond : 1, onClose : startDateOnClose}, value : manuallyStart" />
									</div>
									<div class="six columns">
										<label>结束时间</label> <input type="text" class="required" data-bind="datepicker : {showSecond : true, dateFormat : 'yy-mm-dd',stepHour : 1,stepMinute : 1,stepSecond : 1, onClose : endDateOnClose}, value : manuallyStop" />
									</div>
								</div>
								<br>
								<div class="row">
									<div class="six columns">
										<a class=" blue button" href="#" data-bind="click : startManually">开始抓取</a>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<s:include value="/jsps/common/footer.jsp" />
	<script src="/ls/js/knockout-jqueryui.min.js"></script>
	<script>
		$(document).ready(function() {
			
			$('#grabForm').validate({});
			$('#jobForm').validate({});
			
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
							
							Messenger().post("已成功加载配置数据。");
						},
						error : function(XMLHttpRequest, textStatus, errorThrown) {
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
								Messenger().post("配置信息已经成功保存！");
							},
							error : function(XMLHttpRequest, textStatus, errorThrown) {
								Messenger().post("啊？！出错了，赶紧去联系管理员吧。");
							}
						});
					} else {
						
						Messenger().post({
							  message: '你有些必填选项没填！',
							  type: 'error',
							  showCloseButton: true
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
								Messenger().post("已成功抓取！");
								self.reloadConfiguration();
								
							},
							error : function(XMLHttpRequest, textStatus, errorThrown) {
								Messenger().post("抓取失败！");
							}
						});
					}
				};
				self.startDateOnClose = function() {

				};

				self.endDateOnClose = function() {

				};
			};

			var model = new ConfigurationModel();
			ko.applyBindings(model);
			
			$(document).ajaxStart(function(){
				 Common.prototype.loadAjaxLoader("操作正在执行，请耐心等候！");
	         }).ajaxStop(function(){
	        	 Common.prototype.closeAjaxLoader();
	         });

		});
	</script>
</body>
</html>
