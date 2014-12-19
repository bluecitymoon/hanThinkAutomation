<%@ page contentType="text/html;charset=GBK"%>
<header id="brand" data-bind="with : user">
	<div class="container">
		<div class="row">
			<div class="appname hide-on-phones">��ѯ������ݽ�������</div>
			<address>
				<span>
						��ӭ�㣬<b data-bind="text : name"></b> &nbsp;<a href="/ls/logout" title="�˳�ϵͳ"><i class="icon-power-off small"></i></a>
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