/*--------------------------------------------------------------------*\
 * @author UI Engineering
 * Licensed Materials - Property of Werner Enterprises, (C) Copyright 
 *           Werner Enterprises 2013 - All Rights reserved
\*--------------------------------------------------------------------*/

/* jshint ignore:start */

/**
 * jQuery Placeholder
 * ------------------------------------------------------------
 * @url     http://mths.be/placeholder 
 * @version v2.0.7
 * @author  @mathias
 * @about   Polyfill that adds placeholder attribute to older 
 *          browsers. Otherwise does nothing.
 */
	;(function(f,h,$){var a='placeholder' in h.createElement('input'),d='placeholder' in h.createElement('textarea'),i=$.fn,c=$.valHooks,k,j;if(a&&d){j=i.placeholder=function(){return this};j.input=j.textarea=true}else{j=i.placeholder=function(){var l=this;l.filter((a?'textarea':':input')+'[placeholder]').not('.placeholder').bind({'focus.placeholder':b,'blur.placeholder':e}).data('placeholder-enabled',true).trigger('blur.placeholder');return l};j.input=a;j.textarea=d;k={get:function(m){var l=$(m);return l.data('placeholder-enabled')&&l.hasClass('placeholder')?'':m.value},set:function(m,n){var l=$(m);if(!l.data('placeholder-enabled')){return m.value=n}if(n==''){m.value=n;if(m!=h.activeElement){e.call(m)}}else{if(l.hasClass('placeholder')){b.call(m,true,n)||(m.value=n)}else{m.value=n}}return l}};a||(c.input=k);d||(c.textarea=k);$(function(){$(h).delegate('form','submit.placeholder',function(){var l=$('.placeholder',this).each(b);setTimeout(function(){l.each(e)},10)})});$(f).bind('beforeunload.placeholder',function(){$('.placeholder').each(function(){this.value=''})})}function g(m){var l={},n=/^jQuery\d+$/;$.each(m.attributes,function(p,o){if(o.specified&&!n.test(o.name)){l[o.name]=o.value}});return l}function b(m,n){var l=this,o=$(l);if(l.value==o.attr('placeholder')&&o.hasClass('placeholder')){if(o.data('placeholder-password')){o=o.hide().next().show().attr('id',o.removeAttr('id').data('placeholder-id'));if(m===true){return o[0].value=n}o.focus()}else{l.value='';o.removeClass('placeholder');l==h.activeElement&&l.select()}}}function e(){var q,l=this,p=$(l),m=p,o=this.id;if(l.value==''){if(l.type=='password'){if(!p.data('placeholder-textinput')){try{q=p.clone().attr({type:'text'})}catch(n){q=$('<input>').attr($.extend(g(this),{type:'text'}))}q.removeAttr('name').data({'placeholder-password':true,'placeholder-id':o}).bind('focus.placeholder',b);p.data({'placeholder-textinput':q,'placeholder-id':o}).before(q)}p=p.removeAttr('id').hide().prev().attr('id',o).show()}p.addClass('placeholder');p[0].value=p.attr('placeholder')}else{p.removeClass('placeholder')}}}(this,document,jQuery));

	// Invoke the placeholder function.
	$("input, textarea").placeholder();


/**
 * Modernizr (custom build)
 * ------------------------------------------------------------
 * @url     http://modernizr.com/download/#-touch-mq-cssclasses-addtest-teststyles-prefixes-ie8compat-load
 * @version 2.5.3
 */
	;window.Modernizr=function(a,b,c){function x(a){j.cssText=a}function y(a,b){return x(m.join(a+";")+(b||""))}function z(a,b){return typeof a===b}function A(a,b){return!!~(""+a).indexOf(b)}function B(a,b,d){for(var e in a){var f=b[a[e]];if(f!==c)return d===!1?a[e]:z(f,"function")?f.bind(d||b):f}return!1}var d="2.5.3",e={},f=!0,g=b.documentElement,h="modernizr",i=b.createElement(h),j=i.style,k,l={}.toString,m=" -webkit- -moz- -o- -ms- ".split(" "),n={},o={},p={},q=[],r=q.slice,s,t=function(a,c,d,e){var f,i,j,k=b.createElement("div"),l=b.body,m=l?l:b.createElement("body");if(parseInt(d,10))while(d--)j=b.createElement("div"),j.id=e?e[d]:h+(d+1),k.appendChild(j);return f=["&#173;","<style>",a,"</style>"].join(""),k.id=h,(l?k:m).innerHTML+=f,m.appendChild(k),l||(m.style.background="",g.appendChild(m)),i=c(k,a),l?k.parentNode.removeChild(k):m.parentNode.removeChild(m),!!i},u=function(b){var c=a.matchMedia||a.msMatchMedia;if(c)return c(b).matches;var d;return t("@media "+b+" { #"+h+" { position: absolute; } }",function(b){d=(a.getComputedStyle?getComputedStyle(b,null):b.currentStyle)["position"]=="absolute"}),d},v={}.hasOwnProperty,w;!z(v,"undefined")&&!z(v.call,"undefined")?w=function(a,b){return v.call(a,b)}:w=function(a,b){return b in a&&z(a.constructor.prototype[b],"undefined")},Function.prototype.bind||(Function.prototype.bind=function(b){var c=this;if(typeof c!="function")throw new TypeError;var d=r.call(arguments,1),e=function(){if(this instanceof e){var a=function(){};a.prototype=c.prototype;var f=new a,g=c.apply(f,d.concat(r.call(arguments)));return Object(g)===g?g:f}return c.apply(b,d.concat(r.call(arguments)))};return e});var C=function(c,d){var f=c.join(""),g=d.length;t(f,function(c,d){var f=b.styleSheets[b.styleSheets.length-1],h=f?f.cssRules&&f.cssRules[0]?f.cssRules[0].cssText:f.cssText||"":"",i=c.childNodes,j={};while(g--)j[i[g].id]=i[g];e.touch="ontouchstart"in a||a.DocumentTouch&&b instanceof DocumentTouch||(j.touch&&j.touch.offsetTop)===9},g,d)}([,["@media (",m.join("touch-enabled),("),h,")","{#touch{top:9px;position:absolute}}"].join("")],[,"touch"]);n.touch=function(){return e.touch};for(var D in n)w(n,D)&&(s=D.toLowerCase(),e[s]=n[D](),q.push((e[s]?"":"no-")+s));return e.addTest=function(a,b){if(typeof a=="object")for(var d in a)w(a,d)&&e.addTest(d,a[d]);else{a=a.toLowerCase();if(e[a]!==c)return e;b=typeof b=="function"?b():b,g.className+=" "+(b?"":"no-")+a,e[a]=b}return e},x(""),i=k=null,e._version=d,e._prefixes=m,e.mq=u,e.testStyles=t,g.className=g.className.replace(/(^|\s)no-js(\s|$)/,"$1$2")+(f?" js "+q.join(" "):""),e}(this,this.document),function(a,b,c){function d(a){return o.call(a)=="[object Function]"}function e(a){return typeof a=="string"}function f(){}function g(a){return!a||a=="loaded"||a=="complete"||a=="uninitialized"}function h(){var a=p.shift();q=1,a?a.t?m(function(){(a.t=="c"?B.injectCss:B.injectJs)(a.s,0,a.a,a.x,a.e,1)},0):(a(),h()):q=0}function i(a,c,d,e,f,i,j){function k(b){if(!o&&g(l.readyState)&&(u.r=o=1,!q&&h(),l.onload=l.onreadystatechange=null,b)){a!="img"&&m(function(){t.removeChild(l)},50);for(var d in y[c])y[c].hasOwnProperty(d)&&y[c][d].onload()}}var j=j||B.errorTimeout,l={},o=0,r=0,u={t:d,s:c,e:f,a:i,x:j};y[c]===1&&(r=1,y[c]=[],l=b.createElement(a)),a=="object"?l.data=c:(l.src=c,l.type=a),l.width=l.height="0",l.onerror=l.onload=l.onreadystatechange=function(){k.call(this,r)},p.splice(e,0,u),a!="img"&&(r||y[c]===2?(t.insertBefore(l,s?null:n),m(k,j)):y[c].push(l))}function j(a,b,c,d,f){return q=0,b=b||"j",e(a)?i(b=="c"?v:u,a,b,this.i++,c,d,f):(p.splice(this.i++,0,a),p.length==1&&h()),this}function k(){var a=B;return a.loader={load:j,i:0},a}var l=b.documentElement,m=a.setTimeout,n=b.getElementsByTagName("script")[0],o={}.toString,p=[],q=0,r="MozAppearance"in l.style,s=r&&!!b.createRange().compareNode,t=s?l:n.parentNode,l=a.opera&&o.call(a.opera)=="[object Opera]",l=!!b.attachEvent&&!l,u=r?"object":l?"script":"img",v=l?"script":u,w=Array.isArray||function(a){return o.call(a)=="[object Array]"},x=[],y={},z={timeout:function(a,b){return b.length&&(a.timeout=b[0]),a}},A,B;B=function(a){function b(a){var a=a.split("!"),b=x.length,c=a.pop(),d=a.length,c={url:c,origUrl:c,prefixes:a},e,f,g;for(f=0;f<d;f++)g=a[f].split("="),(e=z[g.shift()])&&(c=e(c,g));for(f=0;f<b;f++)c=x[f](c);return c}function g(a,e,f,g,i){var j=b(a),l=j.autoCallback;j.url.split(".").pop().split("?").shift(),j.bypass||(e&&(e=d(e)?e:e[a]||e[g]||e[a.split("/").pop().split("?")[0]]||h),j.instead?j.instead(a,e,f,g,i):(y[j.url]?j.noexec=!0:y[j.url]=1,f.load(j.url,j.forceCSS||!j.forceJS&&"css"==j.url.split(".").pop().split("?").shift()?"c":c,j.noexec,j.attrs,j.timeout),(d(e)||d(l))&&f.load(function(){k(),e&&e(j.origUrl,i,g),l&&l(j.origUrl,i,g),y[j.url]=2})))}function i(a,b){function c(a,c){if(a){if(e(a))c||(j=function(){var a=[].slice.call(arguments);k.apply(this,a),l()}),g(a,j,b,0,h);else if(Object(a)===a)for(n in m=function(){var b=0,c;for(c in a)a.hasOwnProperty(c)&&b++;return b}(),a)a.hasOwnProperty(n)&&(!c&&!--m&&(d(j)?j=function(){var a=[].slice.call(arguments);k.apply(this,a),l()}:j[n]=function(a){return function(){var b=[].slice.call(arguments);a&&a.apply(this,b),l()}}(k[n])),g(a[n],j,b,n,h))}else!c&&l()}var h=!!a.test,i=a.load||a.both,j=a.callback||f,k=j,l=a.complete||f,m,n;c(h?a.yep:a.nope,!!i),i&&c(i)}var j,l,m=this.yepnope.loader;if(e(a))g(a,0,m,0);else if(w(a))for(j=0;j<a.length;j++)l=a[j],e(l)?g(l,0,m,0):w(l)?B(l):Object(l)===l&&i(l,m);else Object(a)===a&&i(a,m)},B.addPrefix=function(a,b){z[a]=b},B.addFilter=function(a){x.push(a)},B.errorTimeout=1e4,b.readyState==null&&b.addEventListener&&(b.readyState="loading",b.addEventListener("DOMContentLoaded",A=function(){b.removeEventListener("DOMContentLoaded",A,0),b.readyState="complete"},0)),a.yepnope=k(),a.yepnope.executeStack=h,a.yepnope.injectJs=function(a,c,d,e,i,j){var k=b.createElement("script"),l,o,e=e||B.errorTimeout;k.src=a;for(o in d)k.setAttribute(o,d[o]);c=j?h:c||f,k.onreadystatechange=k.onload=function(){!l&&g(k.readyState)&&(l=1,c(),k.onload=k.onreadystatechange=null)},m(function(){l||(l=1,c(1))},e),i?k.onload():n.parentNode.insertBefore(k,n)},a.yepnope.injectCss=function(a,c,d,e,g,i){var e=b.createElement("link"),j,c=i?h:c||f;e.href=a,e.rel="stylesheet",e.type="text/css";for(j in d)e.setAttribute(j,d[j]);g||(n.parentNode.insertBefore(e,n),m(c,0))}}(this,document),Modernizr.load=function(){yepnope.apply(window,[].slice.call(arguments,0))},Modernizr.addTest("ie8compat",function(){return!window.addEventListener&&document.documentMode&&document.documentMode===7});


/* jshint ignore:end */

/**
 * Foundation Tooltips Plugin
 * ------------------------------------------------------------
 * @url     http://foundation.zurb.com
 * @version 2.0
 * @author  Zurb
 * @about   Requires Foundation Modernizr custom build to work
 *          correctly.
 */
	;(function($) {
		var settings = {
			bodyHeight : 0,
			targetClass : '.has-tip',
			tooltipClass : '.tooltip',
			tipTemplate : function(selector, content) {
				return '<span data-selector="' + selector + '" class="' + settings.tooltipClass.substring(1) + '">' + content + '<span class="nub"></span></span>';
			}
		},
		methods = {
			init : function(options) {
				return this.each(function() {
					var $body = $('body'),
						self = this;

					if (Modernizr.touch) {
						$body.delegate(settings.targetClass, 'click.tooltip touchstart.tooltip touchend.tooltip', function(e) {
							e.preventDefault();
							var $this = $(this);
							$(settings.tooltipClass).hide();
							methods.showOrCreateTip($this);
						});
						$(settings.tooltipClass).live('click.tooltip touchstart.tooltip touchend.tooltip', function(e) {
							e.preventDefault();
							$(this).fadeOut(150);
						});
					} else {
						$body.delegate(settings.targetClass, 'mouseover.tooltip mouseout.tooltip', function(e) {
							var $this = $(this);
							if (e.type == 'mouseover') {
								methods.showOrCreateTip($this);
							} else if (e.type == 'mouseout') {
								methods.hide($this);
							}
						});
					}

				});
			},
			showOrCreateTip : function($target) {
				var $tip = methods.getTip($target);
				if ($tip && $tip.length > 0) {
					methods.show($target);
				} else {
					methods.create($target);
				}
			},
			getTip : function($target) {
				var selector = methods.selector($target),
					tip = null;
				if (selector) tip = $('span[data-selector=' + selector + ']' + settings.tooltipClass);
				return (tip) ? tip : false;
			},
			selector : function($target) {
				var id = $target.attr('id'),
					dataSelector = $target.data('selector');
				if (id === undefined && dataSelector === undefined) {
					dataSelector = 'tooltip' + Math.random().toString(36).substring(7);
					$target.attr('data-selector', dataSelector);
				}
				return (id) ? id : dataSelector;
			},
			create : function($target) {
				var $tip = $(settings.tipTemplate(methods.selector($target), $target.attr('title')));
				$tip.addClass($target.attr('class')).removeClass(settings.targetClass.substring(1)).appendTo('body');
				if (Modernizr.touch) $tip.append('<span class="tap-to-close">tap to close </span>');
				$target.removeAttr('title');
				methods.show($target);
			},
			reposition : function(target, tip, classes) {
				var width, nub, nubHeight, nubWidth, row, objPos;

				tip.css('visibility', 'hidden').show();

				width = target.data('width');
				nub = tip.children('.nub');
				nubHeight = nub.outerHeight();
				nubWidth = nub.outerWidth();

				objPos = function(obj, top, right, bottom, left, width) {
					return obj.css({
						'top' : top,
						'bottom' : bottom,
						'left' : left,
						'right' : right,
						'width' : (width) ? width : 'auto'
					}).end();
				};

				objPos(tip, (target.offset().top + target.outerHeight() + 10), 'auto', 'auto', target.offset().left, width);
				objPos(nub, -nubHeight, 'auto', 'auto', 10);

				if ($(window).width() < 767) {
					row = target.parents('.row');
					tip.width(row.outerWidth() - 20).css('left', row.offset().left).addClass('tip-override');
					objPos(nub, -nubHeight, 'auto', 'auto', target.offset().left);
				} else {
					if (classes.indexOf('tip-top') > -1) {
						objPos(tip, (target.offset().top - tip.outerHeight() - nubHeight), 'auto', 'auto', target.offset().left, width)
							.removeClass('tip-override');
						objPos(nub, 'auto', 'auto', -nubHeight, 'auto');
					} else if (classes.indexOf('tip-left') > -1) {
						objPos(tip, (target.offset().top + (target.outerHeight() / 2) - nubHeight), 'auto', 'auto', (target.offset().left - tip.outerWidth() - 10), width)
							.removeClass('tip-override');
						objPos(nub, (tip.outerHeight() / 2) - (nubHeight / 2), -nubHeight, 'auto', 'auto');
					} else if (classes.indexOf('tip-right') > -1) {
						objPos(tip, (target.offset().top + (target.outerHeight() / 2) - nubHeight), 'auto', 'auto', (target.offset().left + target.outerWidth() + 10), width)
							.removeClass('tip-override');
						objPos(nub, (tip.outerHeight() / 2) - (nubHeight / 2), 'auto', 'auto', -nubHeight);
					}
				}
				tip.css('visibility', 'visible').hide();
			},
			show : function($target) {
				var $tip = methods.getTip($target);
				methods.reposition($target, $tip, $target.attr('class'));
				$tip.fadeIn(150);
			},
			hide : function($target) {
				var $tip = methods.getTip($target);
				$tip.fadeOut(150);
			},
			reload : function() {
				var $self = $(this);
				return ($self.data('tooltips')) ? $self.tooltips('destroy').tooltips('init') : $self.tooltips('init');
			},
			destroy : function() {
				return this.each(function(){
					$(window).unbind('.tooltip');
					$(settings.targetClass).unbind('.tooltip');
					$(settings.tooltipClass).each(function(i){
						$($(settings.targetClass).get(i)).attr('title', $(this).text());
					}).remove();
				});
			}
		};

		$.fn.tooltips = function( method ) {

			if ( methods[method] ) {
				return methods[ method ].apply( this, Array.prototype.slice.call( arguments, 1 ));
			} else if ( typeof method === 'object' || ! method ) {
				return methods.init.apply( this, arguments );
			} else {
				$.error( 'Method ' +  method + ' does not exist on jQuery.tooltips' );
			}

		};
	})(jQuery);

/* jshint ignore:start */

/**
 * jQuery Throttle / Debounce
 * ------------------------------------------------------------
 * @url     http://benalman.com/projects/jquery-throttle-debounce-plugin/
 * @version 1.1
 * @author  "Cowboy" Ben Alman
 */
	;(function(b,c){var $=b.jQuery||b.Cowboy||(b.Cowboy={}),a;$.throttle=a=function(e,f,j,i){var h,d=0;if(typeof f!=="boolean"){i=j;j=f;f=c}function g(){var o=this,m=+new Date()-d,n=arguments;function l(){d=+new Date();j.apply(o,n)}function k(){h=c}if(i&&!h){l()}h&&clearTimeout(h);if(i===c&&m>e){l()}else{if(f!==true){h=setTimeout(i?k:l,i===c?e-m:e)}}}if($.guid){g.guid=j.guid=j.guid||$.guid++}return g};$.debounce=function(d,e,f){return f===c?a(d,e,false):a(d,f,e!==false)}})(this);

/* jshint ignore:end */

/**
 * Werner Responsive Navigation
 * ------------------------------------------------------------
 * @about   Custom JavaScript module that creates the 
 *          responsive navigation controls for use in the 
 *          Werner Enterprise Theme.
 */
	var ResponsiveNavigation = {

		init: function() {
			this.buildUserMenu();
			this.buildNavMenu();
		},

		// Responsiveness for User Menu
		buildUserMenu: function() {
			$("#brand address").prepend( "<div id='user-mobile'>USER</div>" );
			$("#user-mobile").click(function(){
				if ( $("#nav").is( ":visible" ) ){
					$("#menu-mobile").removeClass( "active" );
					$("#nav").slideToggle(300, function(){
						$("#user-mobile").toggleClass( "active" );
						$("#brand address span").slideToggle();
					});
				} else {
					$("#brand address span").slideToggle();
					$("#user-mobile").toggleClass( "active" );
				}
			});
		},

		// Responsiveness for Navigation Menu
		buildNavMenu: function() {
			$("#nav-wrap").prepend( "<div id='menu-mobile'>MENU</div>" );
			$("#menu-mobile").click(function(){
				if( $("#brand address span").is( ":visible" ) ){
					$("#user-mobile").removeClass( "active" );
					$("#brand address span").slideToggle(300, function(){
						$("#menu-mobile").toggleClass( "active" );
						$("#nav").slideToggle();
					});
				} else {
					$("#nav").slideToggle();
					$("#menu-mobile").toggleClass( "active" );
				}
			});
		}
	}

/**
 * Werner Checkbox and Radio Group Behavior
 * ------------------------------------------------------------
 * @about   Custom JavaScript module that adds and removes 
 *          classes for the .input-radio and .input-checkbox 
 *          labels in the Werner Enterprise Theme .
 */
	var InputGroups = {

		// Initialize
		init: function() {
			this.focusInputs();
			this.highlightCheckedInputs();
			this.toggleCheckboxes();
			this.toggleRadios();
		},

		// Change checkbox and radio background on focus 
		// This requires <label> as the parent element w/ class of "input-radio" or "input-checkbox".
		focusInputs: function() {
			$(document).on("focus", "input[type='radio'], input[type='checkbox']", function(){
				var lbl = $("label[for='" + this.id + "']");
				if ( $(lbl).hasClass("input-checkbox") || $(lbl).hasClass("input-radio") ){
					$(lbl).addClass("input-focus");
				}
			});
			$(document).on("blur", "input[type='radio'], input[type='checkbox']", function(){
				var lbl = $("label[for='" + this.id + "']");
				$(lbl).removeClass("input-focus");
			});
		},

		// Add 'selected' class to label for every selected
		// checkbox or radio on page load.
		highlightCheckedInputs: function() {
			$("input:checked").each(function(){
				var lbl = $("label[for='" + this.id + "']");
				if ( $(lbl).hasClass("input-checkbox") || $(lbl).hasClass("input-radio") ){
					$(lbl).addClass("selected");
				}
			});
		},

		// Toggle checkbox label's 'selected' class.
		toggleCheckboxes: function() {
			$(document).on("click", "input[type='checkbox']", function(){
				var lbl = $("label[for='" + this.id + "']");
				$(lbl).toggleClass("selected");
			});
		},

		// Remove 'selected' class from all labels in radio
		// group, add class to clicked option.
		toggleRadios: function() {
			$(document).on("click", "input[type='radio']", function(){
				var setName = $(this).attr("name");
				$("input[name='" + setName + "']").each(function(){
					var lbl = $("label[for='" + this.id + "']");
					$(lbl).removeClass("selected");
				});
				var lbl = $("label[for='" + this.id + "']");
				$(lbl).addClass("selected");
			});
		}
	};


/**
 * Werner Dialog Helper
 * ------------------------------------------------------------
 * @about   Custom dialog jQuery control to assist in the
 *          creation and management of jQuery dialogs in the
 *          Werner Enterprise Theme.
 *
 * @usage   var myDialog = new DialogHelper({
 *              target: "#removeFileConfirm",
 *              content: content,
 *             	buttons:
 *              [
 *                  {
 *                      text: "Yes",
 *                      click: function(){
 *                          // do stuff here
 *                          myDialog.close();
 *                      }
 *          	    },
 *                  {
 *                      text: "No",
 *                      click: function () {
 *                          myDialog.close();
 *                      }
 *                  }
 *              ],
 *              title: "Please Confirm",
 *              dialogSize: "ui-dialog-small"
 *          });
 *          myDialog.open();
 */
 	var DialogHelper = (function (options) {
		//Expected options: target, buttons, title, dialogSize
		if (!options) {
			alert("DialogHelper: Expected options not found");
			return false;
		}
		if (!options.target) {
			alert("DialogHelper: Target not found");
			return false;
		}

		// Private variables
			// Checks for "#" sign in target.  If not there, adds it.
		var $dialogDiv = $((options.target.charAt(0) === "#" ? "" : "#") + options.target);

		// Reposition the dialog on window resize or scroll
		$(window).resize(function(){
			$dialogDiv.dialog("option", "position", { my: "center", at: "center", of: window });
		});
		$(window).scroll(function(){
			$dialogDiv.dialog("option", "position", { my: "center", at: "center", of: window });
		});

		// Inject dialog content if necessary
		if (options.content) {
			$dialogDiv.html(options.content);
		}

		// Confirmation creation
		$dialogDiv.dialog({
			resizable: false,
			draggable: false,
			autoOpen: false,
			show: { effect: 'fade', duration: 250 },
			hide: { effect: 'fade', duration: 250 },
			modal: true,
			dialogClass: options.dialogSize || "ui-dialog-large",
			title: options.title || "Message",
			buttons: options.buttons,
			beforeClose: options.beforeClose,
			open: function (e) {
				var dialog = $(e.target).parents(".ui-dialog.ui-widget");
				var btns = dialog.find(".ui-dialog-buttonpane").find("button");
				if (btns.length > 0) {
					$(btns[0]).addClass("primary");
				}
				if (btns.length > 1) {
					$(btns[1]).addClass("secondary");
				}
				$(".ui-widget-overlay").hide().fadeTo(800, 0.8);
				$dialogDiv.dialog("option", "position", { my: "center", at: "center", of: window });
			}
		});
			
		// #region Private Methods
		function close() {
			$dialogDiv.dialog("close");
		}

		function content(html) {
			$dialogDiv.html(html);
		}
			
		function open() {
			$dialogDiv.dialog("open");
		}
		
		function autoClose(seconds) {
			var closeTime = (seconds || 2) * 1000;
			setTimeout(function () { close(); }, closeTime);
		}
		// #endregion

		// #region Public Methods
		return {
			autoClose: autoClose,
			close: close,
			content: content,
			open: open
		};
		// #endregion
	});









/* GLOBAL FUNCTIONS */
/* ------------------------------------------------------ */
	function newDatePicker(inputID, btnID){
		$("#" + inputID).datepicker();
		$("#" + btnID).click( function(){
			if ( $("#" + inputID).datepicker("widget").is(":visible") ) {
				$("#" + inputID).datepicker("hide");
			} else {
				$("#" + inputID).datepicker("show");
			}
		});
	}
	function newTimePicker(inputID, btnID){
		$("#" + inputID).timepicker({});
		$("#" + btnID).click( function(){
			if ( $("#" + inputID).datepicker("widget").is(":visible") ) {
				$("#" + inputID).timepicker("hide");
			} else {
				$("#" + inputID).timepicker("show");
			}
		});
	}
	function newDateTimePicker(inputID, btnID){
		inputID = $((inputID.charAt(0) === "#" ? "" : "#") + inputID);
		btnID = $((btnID.charAt(0) === "#" ? "" : "#") + btnID);

		$(inputID).datetimepicker({});
		$(btnID).click( function(){
			if ( $(inputID).datepicker("widget").is(":visible") ) {
				$(inputID).datetimepicker("hide");
			} else {
				$(inputID).datetimepicker("show");
			}
		});
	}

/* WERNER ENTERPRISE THEME */
/* ------------------------------------------------------ */
	$(document).ready(function(){

		ResponsiveNavigation.init();
		InputGroups.init();

	}); // end $(document).ready()


