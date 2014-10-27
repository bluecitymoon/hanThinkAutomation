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
						<div class="content">
							<div class="row">
								<label>存储数据客户端IP</label>
								<input type="text" class="addon-postfix" data-bind = "value : clientIp"/>
							</div>
							<div class="row">
								<div class="six columns">
									<label>每天的开始抓取时间</label>
									<input type="text" class="addon-postfix" data-bind = "value : clientIp"/>
								</div>
								<div class="six columns">
									<label>每天的抓取截止时间</label>
									<input type="text" class="addon-postfix" data-bind = "value : clientIp"/>
								</div>
							</div>
							<div class="row">
								<div class="six columns">
									<label>间隔（小时）</label>
									<input type="text" class="addon-postfix" data-bind = "value : clientIp"/>
								</div>
								<div class="six columns">
									<label>上一次抓取的时间戳</label>
									<input type="text" class="addon-postfix disable" data-bind = "value : clientIp"/>
								</div>
							</div>
							<div class="row">
							<div class="twelve columns centered">
								<a class="small blue button" href="#" data-bind="click : save" >保存</a>
							</div>
						</div>
						</div>
					</div>
				</div>
				<div class="six columns">
					<div class="app-wrapper ui-corner-top">
						<div class="blue module ui-corner-top clearfix">
							<h2>数据采集历史记录</h2>
						</div>
						<div class="content">
							<table class="dataTable">
								<thead>
									<tr>
										<th>#</th>
										<th>zhixn</th>
										<th>Last Name</th>
										<th>Username</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>1</td>
										<td>Mark</td>
										<td>Otto</td>
										<td>@mdo</td>
									</tr>
									<tr>
										<td>2</td>
										<td>Jacob</td>
										<td>Thornton</td>
										<td>@fat</td>
									</tr>
									<tr>
										<td>3</td>
										<td>Larry</td>
										<td>the Bird</td>
										<td>@twitter</td>
									</tr>
								</tbody>
							</table>
							<br>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<s:include value="/jsps/common/footer.jsp" />
	<script src="/ls/js/User.js"></script>
	<script>
		$(document).ready(function() {

			var ConfigurationModel = function() {
				var self = this;
				self.newProblenName = ko.observable();
				self.problems = ko.observableArray([]);
				self.newStepName = ko.observable();
				self.steps = ko.observableArray([]);

			};

			var model = new ConfigurationModel();
			ko.applyBindings(model);
		});
	</script>
</body>
</html>
