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
								<hr>
								<div class="row">
									<div class="twelve columns centered">
										<a class="small blue button" href="#" data-bind="click : $root.save">保存配置信息</a> 
										<a href="#" class="tertiary line" data-bind="click : $root.testUsernamePassword">测试用户名密码</a> 
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
										<label>开始时间</label>
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
										<label>结束时间</label>
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
										<a class=" blue button" href="#" data-bind="click : startManually">开始抓取</a>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<label for="xmlContent">XML Message</label>
				<div><pre id="xmlContent"class="brush: xml">
				<?xml version="1.0" encoding=\"utf-8\"?>\r\n<soap:Envelope xmlns:xsi=\"http:\/\/www.w3.org\/2001\/XMLSchema-instance\" xmlns:xsd=\"http:\/\/www.w3.org\/2001\/XMLSchema\" xmlns:soap=\"http:\/\/schemas.xmlsoap.org\/soap\/envelope\/\">\r\n  <soap:Body>\r\n    <daorudanju xmlns=\"http:\/\/HanThink.com\/\">\r\n      <dengluming>Admin<\/dengluming>\r\n      <denglumima>E1CCjc7z+m3nmqvYlGnc+LcM8t4=<\/denglumima>\r\n      <zhangtaoming>测试帐套<\/zhangtaoming>\r\n      <danjuxml>\r\n      <![CDATA[\r\n      \t\t<?xml version=\"1.0\" standalone=\"yes\"?>\r\n      \t\t<NewDataSet>\r\n\t\t\t\t<xsdingdanzhubiao>\r\n\t\t\t\t\t<id>235317474<\/id>\r\n\t\t\t\t\t<changbian><\/changbian>\r\n\t\t\t\t\t\t<kehudanhao>4308042<\/kehudanhao>\r\n\t\t\t\t\t\t<riqi>2014-11-04<\/riqi>\r\n\t\t\t\t\t\t<daohuoriqi>2014-11-06<\/daohuoriqi>\r\n\t\t\t\t\t<dizhi><\/dizhi>\r\n\t\t\t\t<\/xsdingdanzhubiao>\r\n\t\t\t\t\t\t<xsdingdanzibiao>\r\n\t\t\t\t\t\t\t<zhubiaoid>235317474<\/zhubiaoid>\r\n\t\t\t\t\t\t\t<huohao>274468<\/huohao>\r\n\t\t\t\t\t\t\t<tiaoxingma><\/tiaoxingma>\r\n\t\t\t\t\t\t\t<shangpinmiaoshu>定海针奥尔良翅中400g<\/shangpinmiaoshu>\r\n\t\t\t\t\t\t\t<shuliang>20.0<\/shuliang>\r\n\t\t\t\t\t\t\t<huansuanlv1><\/huansuanlv1>\r\n\t\t\t\t\t\t\t<xiangshu><\/xiangshu>\r\n\t\t\t\t\t\t\t<hanshuidanjia><\/hanshuidanjia>\r\n\t\t\t\t\t\t\t<hanshuijine><\/hanshuijine>\r\n\t\t\t\t\t\t\t<buhanshuidanjia>22.65<\/buhanshuidanjia>\r\n\t\t\t\t\t\t\t<buhanshuijine>0.0<\/buhanshuijine>\r\n\t\t\t\t\t\t\t<shuilv>17.0<\/shuilv>\r\n\t\t\t\t\t\t<\/xsdingdanzibiao>\r\n\t\t\t\t\t\t<xsdingdanzibiao>\r\n\t\t\t\t\t\t\t<zhubiaoid>235317474<\/zhubiaoid>\r\n\t\t\t\t\t\t\t<huohao>236348<\/huohao>\r\n\t\t\t\t\t\t\t<tiaoxingma><\/tiaoxingma>\r\n\t\t\t\t\t\t\t<shangpinmiaoshu>定海针虾丸250<\/shangpinmiaoshu>\r\n\t\t\t\t\t\t\t<shuliang>40.0<\/shuliang>\r\n\t\t\t\t\t\t\t<huansuanlv1><\/huansuanlv1>\r\n\t\t\t\t\t\t\t<xiangshu><\/xiangshu>\r\n\t\t\t\t\t\t\t<hanshuidanjia><\/hanshuidanjia>\r\n\t\t\t\t\t\t\t<hanshuijine><\/hanshuijine>\r\n\t\t\t\t\t\t\t<buhanshuidanjia>7.125<\/buhanshuidanjia>\r\n\t\t\t\t\t\t\t<buhanshuijine>0.0<\/buhanshuijine>\r\n\t\t\t\t\t\t\t<shuilv>17.0<\/shuilv>\r\n\t\t\t\t\t\t<\/xsdingdanzibiao>\r\n\t\t\t\t\t\t<xsdingdanzibiao>\r\n\t\t\t\t\t\t\t<zhubiaoid>235317474<\/zhubiaoid>\r\n\t\t\t\t\t\t\t<huohao>236383<\/huohao>\r\n\t\t\t\t\t\t\t<tiaoxingma><\/tiaoxingma>\r\n\t\t\t\t\t\t\t<shangpinmiaoshu>定海针贡丸250<\/shangpinmiaoshu>\r\n\t\t\t\t\t\t\t<shuliang>20.0<\/shuliang>\r\n\t\t\t\t\t\t\t<huansuanlv1><\/huansuanlv1>\r\n\t\t\t\t\t\t\t<xiangshu><\/xiangshu>\r\n\t\t\t\t\t\t\t<hanshuidanjia><\/hanshuidanjia>\r\n\t\t\t\t\t\t\t<hanshuijine><\/hanshuijine>\r\n\t\t\t\t\t\t\t<buhanshuidanjia>9.4375<\/buhanshuidanjia>\r\n\t\t\t\t\t\t\t<buhanshuijine>0.0<\/buhanshuijine>\r\n\t\t\t\t\t\t\t<shuilv>17.0<\/shuilv>\r\n\t\t\t\t\t\t<\/xsdingdanzibiao>\r\n\t\t\t<\/NewDataSet>\r\n\t\t]]>\r\n       <\/danjuxml>\r\n    <\/daorudanju>\r\n  <\/soap:Body>\r\n<\/soap:Envelope>
				</pre></div>
			</div>
		</div>
	</section>

	<s:include value="/jsps/common/footer.jsp" />
	<script src="/ls/js/knockout-jqueryui.min.js"></script>
	<script src="/ls/js/syntaxHighlighter/shCore.js"></script>
	<script src="/ls/js/syntaxHighlighter/shBrushCss.js"></script>
	<script src="/ls/js/syntaxHighlighter/shBrushXml.js"></script>
	
	<script>
		$(document).ready(function() {

					$('#grabForm').validate({});
					$('#jobForm').validate({});
					SyntaxHighlighter.all();
					
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
										Messenger().post("配置信息已经成功保存！");
									},
									error : function(XMLHttpRequest,
											textStatus, errorThrown) {
										Messenger().post("啊？！出错了，赶紧去联系管理员吧。");
									}
								});
							} else {

								Messenger().post({
									message : '你有些必填选项没填！',
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
										Messenger().post("已成功抓取！");
										$('#xmlContent').html(data);
										SyntaxHighlighter.highlight();
										
										self.reloadConfiguration();

									},
									error : function(XMLHttpRequest,
											textStatus, errorThrown) {
										Messenger().post("抓取失败！");
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
								message : '尚未开发的功能！',
								type : 'error',
								showCloseButton : true
							});
						};
					};

					var model = new ConfigurationModel();
					ko.applyBindings(model);

					$(document).ajaxStart(function() {
						Common.prototype.loadAjaxLoader("操作正在执行，请耐心等候！");
					}).ajaxStop(function() {
						Common.prototype.closeAjaxLoader();
					});
					
					$("#manuallyStop-btn").click( function(){
					    if ( $("#manuallyStop").datepicker("widget").is(":visible") ) {
					        $("#manuallyStop").datepicker("hide");
					    } else {
					        $("#manuallyStop").datepicker("show");
					    }
					});
					$("#manuallyStart-btn").click( function(){
					    if ( $("#manuallyStart").datepicker("widget").is(":visible") ) {
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
