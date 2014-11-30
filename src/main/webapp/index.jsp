<%@ page contentType="text/html;charset=GBK"%>
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
<title>汉询软件数据交换中心</title>
<link rel="shortcut icon" href="/ls/images/hanxun2.ico" type="image/x-icon" /> 
<link rel="stylesheet" href="/ls/css/syntaxHighlighter/shCore.css">
<link rel="stylesheet" href="/ls/css/syntaxHighlighter/shCoreDefault.css">
<!-- Required CSS Files -->
<link rel="stylesheet" href="/ls/css/style.css">
<link rel="stylesheet" href="/ls/css/style-theme.css" media="print" />
<link rel="stylesheet" href="/ls/css/messenger.css">
<link rel="stylesheet" href="/ls/css/messenger-theme-flat.css">
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
			<div class="appname hide-on-phones">汉询软件数据交换中心</div>
			<address>
				<span> <strong></strong>Welcome<a href="#" class="login-secure line">Automation</a>
				</span>
			</address>
		</div>
	</div>
</header>
	<div id="nav-wrap">
<nav class="site-nav" id="nav">
	<div class="row">
		<ul id="dropdown">
			<li class="active" ><a title="" href="/ls/conf.action"><span id="configuration">Configuration</span></a></li>
		</ul>
	</div>
</nav>
</div>
	<section class="mainbg">
		<div class="container">
			<div class="row">
				<div id="moduleTabs" class="app-wrapper ui-corner-top">
				<nav class="blue module-nav ui-corner-top clearfix">
					<section class="moduleNavigation">
						<ul>
							<li class="corner"><a href="#tabs-1"><span>自动任务中心</span></a></li>
							<li><a href="#tabs-2"><span>手动同步</span></a></li>
						</ul>
					</section>
				</nav>
				<div id="tabs-1">

					<div class="content">
							<div class="app-wrapper ui-corner-top">
								<div class="green module ui-corner-top clearfix">
									<h2>
										自动任务列表
									</h2>
								</div>
								<div class="content">
									<table class="display compact" id="jobListTable">
									<thead>
										<tr>
											<th class="text-center">任务</th>
											<th class="text-center">帐套</th>
											<th class="text-center">任务状态</th>

											<th class="text-center">修改/删除</th>
											<th class="text-center">启动/停止</th>
										</tr>
									</thead>
									<tbody data-bind="foreach: jobList">
										<tr>
											<td class="text-center"><span data-bind="text: name"></span></td>
											<td class="text-center"><span data-bind="text: dbName"></span></td>
											<td class="text-center"><span data-bind="text: status"></span></td>
											<td class="text-center"><a class=" tiny green button" href="#" data-bind="click : $root.editJob">编辑</a> <a class=" tiny red button" href="#" data-bind="click : $root.deleteJob">删除</a></td>
											<td class="text-center"><a class=" tiny green button" href="#" data-bind="click : $root.startJob">启动</a> <a class=" tiny red button" href="#" data-bind="click : $root.stopJob">停止</a></td>
										</tr>

									</tbody>
								</table>
								</div>
							</div>

							<br>
					 <div class="app-wrapper ui-corner-top"  data-bind="with : job">
						<div class="module ui-corner-top clearfix">
							<h2><span data-bind="text: dbName"></span></h2>
							<h2 class="right">
								<a class="blue button" href="#" data-bind="click : $root.clearForm"><i class="icon-pencil"></i>为新的帐套配置自动任务</a>
							</h2>
						</div>
						<form id="jobForm">
							<div class="content">
								<div class="row">
									<div class="six columns">
										<div class="row">
											<label class="required">帐套</label> 
											<input type="text" class="addon-postfix required" data-bind="value : dbName" />
										</div>
										
									</div>
									<div class="six columns">
									</div>
								</div>
								<hr>
								<div class="row">
									<div class="nine columns">
										<label class="required">任务名称</label> <input type="text" class="addon-postfix  required" data-bind="value : name" />
									</div>
									<div class="three columns">
										<label>任务状态</label> <input type="text" class="addon-postfix" disabled="disabled" data-bind="value : status" />
									</div>

								</div>
								<div class="row">
									<label class="required">存储数据客户端IP</label> <input type="text" class="addon-postfix  required" data-bind="value : clientIp" />
								</div>
								<div class="row">
									<div class="four columns">
										<label class="required">每天的开始抓取时间 (最小 00:00)</label> <input type="text" class="required" data-bind="value : start" />
									</div>
									<div class="four columns">
										<label class="required">每天的抓取截止时间(最大23:59)</label> <input type="text" class="required" data-bind="value : stop" />
									</div>
									<div class="two columns">
										<label class="required">间隔(时)</label> <input type="text" class="required" data-bind="value : restartInHours" />
									</div>
									<div class="two columns">
										<label class="required">客户系统数据延迟(天)</label> <input type="text" class="required" data-bind="value : delayDays" />
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
										<label class="required">登陆用户名</label> <input type="text" class="required" data-bind="value : username" />
									</div>
									<div class="six columns">
										<label class="required">登陆密码</label> <input type="text" class="required" data-bind="value : password" />
									</div>
								</div>
								<hr>
								<div class="row">
									<div class="twelve columns centered">
										<a class="small blue button" href="#" data-bind="click : $root.save">保存配置信息</a> 
									</div>
								</div>
							</div>
						</form>
					</div>
					 </div>

				</div>
				<div id="tabs-2">

					<div class="content">
					 <form id="grabForm">
								<div class="row">
								<div class="four columns">
										<label>帐套名</label>
										<input type="text" id="jobNameInput" />
									</div>
									<div class="four columns">
										<label>开始日期</label>
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
										<label>结束日期</label>
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
				<p>Copyright &copy; 2009 - 2014 HanThink Technology. All rights reserved.</p>
			</div>
			<div class="four columns"></div>
		</div>
	</div>
</footer>

	<script src="/ls/js/knockout-jqueryui.min.js"></script>
	<script src="/ls/js/jquery.dataTables.js"></script>
	<script>
		$(document).ready( function() {
			$("#moduleTabs").tabs();
			$('#console').hide();
			
			$('#jobListTable').dataTable({
			    "paging":   false,
		        "ordering": false,
		        "info":     false,
		        "searching" : false
			});
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
								url : '/ls/startupJob.action',
								success : function(data) {
									
									handleResponse(data);
									
									self.reloadJobList();
									
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
									if (data && data.type== 'fail') {
										Messenger().post({
											message : data.response.message,
											type : 'error',
											showCloseButton : true
										});
									} else {
										Messenger().post({
											message : '任务<b class="label green">'+ item.dbName +'</b>已经成功关闭！',
											showCloseButton : true
										});
									}
									self.reloadJobList();
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
							var job = new Job();
							self.job(job);
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
										handleResponse(data);
										
										self.reloadJobList();
										
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
										if(data && data.message &&data.mode == 'debug') {
											$('#xmlContent').text(data.message);
											$('#console').show();
										} else {
											handleResponse(data);
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
					
					$('#jobNameInput').autocomplete({
						
						 source: function( request, response ) {
							 $.ajax({
							 	url:  "ls/loadJobNames.action",
								dataType: "json",
							 	data: { blurryName: request.term },
							 	success: function( data ) {
							 		response(data);
							 	}
							  });
							},
						minLength: 0,
						select: function( event, ui ) {
							
							model.manuallyDbName(ui.item.id);	
						}
					});
					
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
