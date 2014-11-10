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
							<h2 class="right">
								<a class="white blue button" href="#" data-bind="click : clearForm"><i class="icon-pencil"></i>为新的帐套配置自动任务</a>
							</h2>
						</div>
						<form id="jobForm">
							<div class="content" data-bind="with : job">
								<div class="row">
									<div class="six columns">
										<div class="row">
											<label>帐套</label> 
											<input type="text" class="addon-postfix" data-bind="value : dbName" />
										</div>
										
									</div>
									<div class="six columns">
									</div>
								</div>
								<hr>
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
										<!-- 
										<a href="#" class="tertiary line" data-bind="click : $root.testUsernamePassword">测试用户名密码</a>
										<a href="#" class="tertiary line gray" data-bind="click : $root.startupJob">启动自动导入任务</a>
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
							<h2>欧尚手动抓取</h2>
						</div>
						<div class="content">
							<form id="grabForm">
								<div class="row">
								<div class="four columns">
										<label>帐套名</label>
										<input type="text" data-bind="value : manuallyDbName" />
									</div>
									<div class="four columns">
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
									<div class="four columns">
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
					<div class="app-wrapper ui-corner-top">
							<div class="blue module ui-corner-top clearfix">
								<h2>欧尚任务中心</h2>
							</div>
							<div class="content">
								<table id="jobListTable" class="clean">						
									<thead>
										<tr>
											<th>帐套名</th>
											<th>任务状态</th>
											
											<th>修改/删除</th>
											<th>启动/停止</th>
										</tr>
									</thead>
									<tbody data-bind="foreach: jobList">
										<tr>
											<td><span data-bind="text: dbName"></span></td>	
											<td><span data-bind="text: status"></span></td>						
											<td><a class=" tiny green button" href="#" data-bind="click : $root.editJob">编辑</a>
												<a class=" tiny red button" href="#" data-bind="click : $root.deleteJob">删除</a>
											</td>
											<td><a class=" tiny green button" href="#" data-bind="click : $root.startJob">启动</a>
												<a class=" tiny red button" href="#" data-bind="click : $root.stopJob">停止</a>
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
					        "sSearch": "搜索"
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
								message : ('<b class="label green">' + item.dbName + '</b> 加载成功!'),
								showCloseButton : true
							});
						};
						self.deleteJob = function(item, event) {
							var result = window.confirm("确定：要删除[" + item.dbName + "]?");
							
							if (result) {
								$.ajax({
									url : '/ls/deleteJob.action',
									data : {
										job : JSON.stringify(item)
									},
									success : function(data) {
										Messenger().post("删除成功！");
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
											message : '任务<b class="label green">'+ item.dbName +'</b>已经成功启动！',
											showCloseButton : true
										});
									}
								},
								error : function(XMLHttpRequest,
										textStatus, errorThrown) {
									Messenger().post({
										message : '启动任务失败,' + errorThrown,
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
											message : '任务<b class="label green">'+ item.dbName +'</b>已经成功关闭！',
											showCloseButton : true
										});
									}
								},
								error : function(XMLHttpRequest,
										textStatus, errorThrown) {
									Messenger().post({
										message : '错误：	' + errorThrown,
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
										Messenger().post("已成功加载任务列表");
									} catch(e) {
										Messenger().post({
											message : ('加载任务列表失败，' + e),
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
											Messenger().post("配置信息已经成功保存！");
										}
										
										
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
										manuallyStop : self.manuallyStop(),
										manuallyDbName : self.manuallyDbName()
									},
									url : '/ls/startManually.action',
									success : function(data) {
										Messenger().post("已成功抓取！");
										if(data) {
											$('#xmlContent').text(data);
											$('#console').show();
										}
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
						
						self.startupJob = function(item, event) {
							
							$.ajax({
								method : 'post',
								data : {
									job : JSON.stringify(self.job())
								},
								url : '/ls/startupJob.action',
								success : function(data) {
									Messenger().post({
										message : '尚未开发的功能！',
										showCloseButton : true
									});
								},
								error : function(XMLHttpRequest,
										textStatus, errorThrown) {
									Messenger().post({
										message : '尚未开发的功能！',
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
						Common.prototype.loadAjaxLoader("操作正在执行，请耐心等候！");
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
