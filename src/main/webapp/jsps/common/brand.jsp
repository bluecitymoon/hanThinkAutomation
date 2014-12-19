<%@ page contentType="text/html;charset=GBK"%>
<header id="brand" data-bind="with : user">
	<div class="container">
		<div class="row">
			<div class="appname hide-on-phones">汉询软件数据交换中心</div>
			<address>
				<span>
						欢迎你，<b data-bind="text : name"></b> &nbsp;<a href="/ls/logout" title="退出系统"><i class="icon-power-off small"></i></a>
				</span>
				<span> 
					
				</span>
			</address>
		</div>
	</div>
</header>
<script>
	$(document).ready(function() {

		var UserModel = function() {
			var self = this;
			self.user = ko.observable(new User());
			self.loadMe = function() {
				$.ajax({
					url : '/ls/loadMe.action',
					success : function(data) {
						
						if (data && data.id) {
							self.user(data);
						}
					}
				});
			};
			self.loadMe();
		};
		var userModel = new UserModel();
		var $userContainer = $('#brand')[0];
		ko.applyBindings(userModel, $userContainer);
	});
</script>