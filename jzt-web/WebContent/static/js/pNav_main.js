//收藏选项 的 悬浮效果
	$(function(){
		
//		var mn_lay = $("#mn_lay");
//		var TimeoutId=0;
//		
//		var showbool = true;
//		//正常平台悬浮
//		$(document).ready(function(){
//			$(".product_tab_content .til_cn a").hover(
//					function(){
//						var platName=$.trim($(this).attr("pname"));
//						var pId=$.trim($(this).attr("pid"));
//						var platUrl=$(this).attr("href");
//						var dangAnUrl=$(this).attr("purl");
//						$("#pId").val(pId);
//						$("#platUrlHidden").val(platUrl);
//						$("#findda").attr("href","pDetail/"+dangAnUrl);
//						window.clearTimeout(TimeoutId);
//						var p = $(this).offset();
//						
//						mn_lay.css({"position":"absolute","left":(p.left+10)+"px","top":(p.top+19)+"px","display":"block"});
//						showbool=true;
//					},
//					function(){
//						
//						TimeoutId = window.setTimeout(function(){
//							if(showbool){mn_lay.hide();showbool=false;}
//						},2000);
//						
//					}
//				);
//		});
//	
//		
//		mn_lay.hover(
//				function(){showbool = true;},
//				function(){$(this).hide();showbool = false;}
//			);
		//加入收藏
		$("#setsc").click(function(){
			
			var pId=$("#pId").val();

			if(pId!='undefined'&&pId!=null){
				
				 $.ajax({
		                url:"../user/addFocusproduct",
		                data:{"pId":pId},
		                type:"POST",
		                datatype:"json",
		                success: function(data){
		                	console.log(data);
		                	if(data.state=='1'){
		                		alert('请您先登录！');  
		                	}
		                	else if(data.state=='2'){
		                        alert('请您先注册！');  
		                    }else if(data.state=='0'){
		                    	alert("关注成功！");
		                    }
		                }
		            });
			}else{
				alert("暂时不能收藏！");
			}
			
			
		});
	});
	
	
	 //条件查询 产品列表 未完成
	  $(function(){
		  $(".product_sx_ul2 li,.product_sx_ul em").click(function(){
				$(this).parents("li").find(".cur").removeClass("cur");
				$(this).addClass("cur");
			});
		  $(document).ready(function(){
			  $("#product_year_list li").click(function(){
				  	
					var year=$(this).attr("var");
					
					var type=$("#product_type_sx .cur").attr("var");
					
					var param={"year":year,"type":type};
					
					queryPlat(param); 
				}); 
		  });
	  });

/**
 * 筛选导航条 的 悬浮效果
 */
$(function(){
	
//		var sx_pane=$(".product_sx_pane");
//		var sx_pane_width=sx_pane.width();
//		var or_product_Nav_tab_width=$("#product_Nav_tab").width();
//		var or_sx_pane_width=or_product_Nav_tab_width;
//		
//		
//		
//		
//		var showb = false;
//		var scroll_tag=false;
//		var nav_po = $(".fix");	//select bar fixed 
//		var tabHd= $(".fix2");	//tab bar	fixed2
//		nav_po.removeAttr("style");
//		tabHd.removeAttr("style");
//		var div_top;
//		var hdH ;  //tab bar
//		var hdHeight ;
//		
//		var div = $('<div class="sx_bx">');
//		var showTag=false;
//		
//		
//		var i=0;
//		$(window).scroll(function(){
//			i++;
//			div_top = nav_po.offset().top;
//			hdH = tabHd.offset().top;
//			hdHeight = hdH+nav_po.height()+tabHd.height(); //tab bar top and height of select bar and tab 
//			$("body").append(div);
//			
//			var top_tabHd = $(window).scrollTop();//scroll height
//			//console.log("scroll height "+": "+top_tabHd);
//			//if(top_tabHd >= hdHeight && $(".nav-tabs li.active").index() == 0){
//			if($(window).scrollTop() >= hdHeight){
//				console.log("show div");
//				nav_po.addClass("fixed");
//				if(!showb){
//					nav_po.css("top",-nav_po.height()+"px");
//				}
//				tabHd.addClass("fixed2");
//				
//				tabHd.css("width",or_product_Nav_tab_width);
//				nav_po.css("width",or_sx_pane_width);
//				sx_pane_width=sx_pane.width();
//				div.css({"left":nav_po.position().left+sx_pane_width-45}).show();
//				scroll_tag=true;
//				
//				
//			}else {
//				console.log("$(window).scrollTop() >= hdHeight "+(top_tabHd >= hdHeight ));
//				console.log("hdHeight "+hdHeight);
//				console.log("$(window).scrollTop() ",top_tabHd);
//				if(showTag){
//					if($(window).scrollTop() <= $(".fix2").offset().top){
//						nav_po.removeClass("fixed").removeAttr("style");
//						tabHd.removeClass("fixed2").removeAttr("style");
//						div.hide().removeAttr("style");
//						showTag = false;
//					}
//					return;
//				}else if($(window).scrollTop() <= $(".fix2").offset().top){
//					nav_po.removeClass("fixed").removeAttr("style");
//					tabHd.removeClass("fixed2").removeAttr("style");
//					div.hide();
//					showTag = false;
//					return;
//				}
//				
//				
//			
//			}
//		});
//		
//		div.click(function(){
//			var sxHeight=$("#nav_sx").height();
//			var sfHeigth=$("#sf_nav").height();
//			if(showTag){
//				
//				//nav_po.animate({"top":"-142px"},"fast");
//				//tabHd.animate({"top":"-45px"},"fast");
//				nav_po.animate({"top":-10-sxHeight+"px"},"fast");
//				tabHd.animate({"top":-sxHeight+"px"},"fast");
//				div.animate({"top":"0"},"fast");
//				showTag=false;
//			}else{
//				nav_po.animate({"top":"41px"},"fast");
//				tabHd.animate({"top":"0px"},"fast");
//				//div.animate({"top":183+sfHeigth+"px"},"fast");
//				div.animate({"top":sxHeight+52+"px"},"fast");
//				showTag=true;
//			}
//		});
//		
//		
//		$(window).resize(function(){
//			
//			var newWidth=$("#productlist").width;
//			sx_pane.css("width",newWidth);
//			sx_pane_width=sx_pane.width();
//			or_product_Nav_tab_width=$("#product_Nav_tab").width();
//			or_sx_pane_width=or_product_Nav_tab_width;
//			div.css({"left":nav_po.position().left+sx_pane_width-45});
//		});
//		$("#productlist").resize(function(){
//		
//			var newWidth=$("#productlist").width();
//	
//			sx_pane.css("width",newWidth);
//			sx_pane_width=sx_pane.width();
//			or_product_Nav_tab_width=$("#product_Nav_tab").width();
//			or_sx_pane_width=or_product_Nav_tab_width;
//			div.css({"left":nav_po.position().left+sx_pane_width-45});
//		});
});
  
//静态页面搜索
$(function(){
		//JSON数据
		var jsonURL = "../product/nav_search.json";
		$.getJSON(jsonURL,function(data) {
			//alert(data);
			$("#product_sel_box #navKeyWords").each(function(index, element) {
				//自动完成
				auto_wc(element,data);
	        });
		});
		
		//获取id
		var getid = function(id,name,eq){
			//alert(id);
			
			if(id == -1){
				//$(".nshaix").hide();
				//$(".nothing").show();
				return false;
			}else{
				//$(".nshaix").show();
				//$(".nothing").hide();
			}
			
			$(".rnav .til_cn a[clas=cur]").removeAttr("style");
			$(".navcn1 .rnav .til_cn a").each(function(index,element){
				
				var t = $(this).text();
				t=t.toLowerCase();
				name=name.toLowerCase();
				
				if(t==name||t.indexOf(name)>=0){
					
					$(this).css({"color":"#a40001","font-weight":"bold","font-size":"14px"}).attr("clas","cur");
					
					$("html,body").stop().animate({"scrollTop":($(this).parents(".rnav").find(".kind_til").offset().top-195)+"px"},300);
					return false;
				}
			});
		};
		//搜索按钮
		$("#product_sel_box #nav_sel_button").click(function(){
			var eq = $(this).index("#product_sel_box #navKeyWords");
	
			var thisul = $(".autoulsj:eq("+eq+") .cur");
			var id = $(this).attr("dataid");
			
			var name = thisul.text();
			$("#product_sel_box:eq("+eq+") #navKeyWords").val(name);
			if($.trim(name)!=""){getid(id,name,eq);}
		});
		
		//auto-complete
		var auto_wc = function(obj,data){
			
			var sbc = true;
			var o = $(obj);
			var ul = $("<ul class='autoulsj'>");
			var li = $("<li>");
			var a = $("<a href='#'>");
			var gn = {
				show : function(){ul.show();},
				hide : function(){ul.hide();},
				add : function(){$(obj).parents("#product_sel_box").append(ul);}
			};
			var po = o.offset();
			o.val("");
			ul.css({
				//"left":po.left,
				//"top":po.top+o.innerHeight()+1,
				"width":o.innerWidth()+5
			});
			ul.on("mouseover",function(){sbc = false;});
			ul.on("mouseout",function(){sbc = true;});
			gn.add();
			//获得焦点
			o.focus(function(){
				var t = $(this);
				var leng = t.val().length;
				if(leng>0){gn.show();};
			});
			//失去焦点
			o.blur(function(){
				var t = $(this);
				var leng = t.length;
				if(sbc){gn.hide();};
			});
			$("#product_sel_box form").attr("onsubmit","return false;");
			o.on("keydown",function(e){
				if(e.which == 13||e.which == "13"){
					var thisul = $(".autoulsj:visible .cur");
					var eq = $(".autoulsj:visible").index(".autoulsj");
					var id = thisul.attr("dataid");
					var name = thisul.text();
					if(id>=0){o.val(name);}
					o.focus();
					
					getid(id,name,eq);
					o.next().attr("dataid",id);
					gn.hide();
				}
			});
			o.on("keyup",function(e){
				var t = $(this);
				var v = t.val();
				var leng = t.val().length;
				if(leng>0){gn.show()}
				else{gn.hide()};
				var h = sousuo(data,v);
				ul.html(h);
				var thisul = $(".autoulsj:visible a");
				thisul.eq(0).addClass("cur");
				var dataid = $.trim(thisul.eq(0).attr("dataid"));
				if(dataid.length>0){o.next().attr("dataid",dataid);}
				else{o.next().attr("dataid","-1");}
				thisul.on("click",function(){
					var eq = $(".autoulsj:visible").index(".autoulsj");
					var id = $(this).attr("dataid");
					var name = $(this).text();
					
					if(id>=0){o.val(name);}
					
					o.focus();
					getid(id,name,eq);
					o.next().attr("dataid",id);
					gn.hide();
					return false;
				});
				thisul.on("mouseover",function(){
					thisul.attr("class","");
					$(this).addClass("cur");
					o.next().attr("dataid",$(this).attr("dataid"));
				});
			});
			//返回搜索值
			var sousuo = function(d,v){
				var v = $.trim(v);
				
				var h = '';
				if(v.length>0){
					//var matcher = new RegExp( "^" + v ,"i");
					var matcher = new RegExp( v ,"i");
					var arr = $.grep( d, function( item ){
						//return matcher.test( item.pname ) || matcher.test( item.platPin );
						return matcher.test( item.pname );
					});
					if(arr.length>0){
						for(var i=0;i<arr.length;i++){
							var thcol = new RegExp( v ,"ig");
							name = arr[i].pname.replace(thcol,"<i>"+v+"</i>");
							h+='<li><a href="#" dataid="'+arr[i].pid+'">'+name+'</a></li>';
						}	
					}else{
						h+='<li><a href="#" dataid="-1" style="text-align:center;">无查询结果</a></li>';
					}
				}
				return h;
			};
		};
	});

//省份点击的滑动效果
$(function(){
		$(".sf_pos li").click(function(){selectpt($(this).text())});
		function selectpt(text){
			var a_text = $.trim(text);
			var sfHeigth=$("#sf_nav").height();
			$(".kind_til").each(function(index, element) {
				if($(this).text().indexOf(a_text)>=0){
					//console.log("scroll "+$(this).offset().top+" "+sfHeigth);
					$("html,body").stop().animate({"scrollTop":($(this).offset().top-195-sfHeigth)+"px"},300);
					return false;
				}
			});
		};
});

/**
 * 点击返回顶部
 */
$(function(){
	var topDiv=$(".top");
	topDiv.hide();
	var show = false;
	var tabHd= $("#product_Nav_tab");	//tab bar	fixed2
	var nav_po=$(".tab-pane");
	var navpane=$("#product_NavPane");
	
	//topDiv.css({"left":nav_po.position().left+nav_po.width()});
	
	$(window).scroll(function(){
		topDiv.css("right",0);
		var top_tabHd = $(window).scrollTop();//scroll height

		var hdH = tabHd.offset().top;  //tab bar
		var hdHeight = hdH+tabHd.height(); //tab bar top and height of select bar and tab 
		
		if(top_tabHd<hdHeight){
			topDiv.hide();
		}else{
			
			topDiv.show();
		}
	});
	$(window).resize(function(){
	
		topDiv.css("right",0);
	});
});

function queryPlat(param){
	
	$.post("../product/navQuery",param,function(data){
		console.log(data);
		parseJson(data);
		
	},"json");	
}


(function($,h,c){var a=$([]),e=$.resize=$.extend($.resize,{}),i,k="setTimeout",j="resize",d=j+"-special-event",b="delay",f="throttleWindow";e[b]=250;e[f]=true;$.event.special[j]={setup:function(){if(!e[f]&&this[k]){return false}var l=$(this);a=a.add(l);$.data(this,d,{w:l.width(),h:l.height()});if(a.length===1){g()}},teardown:function(){if(!e[f]&&this[k]){return false}var l=$(this);a=a.not(l);l.removeData(d);if(!a.length){clearTimeout(i)}},add:function(l){if(!e[f]&&this[k]){return false}var n;function m(s,o,p){var q=$(this),r=$.data(this,d);r.w=o!==c?o:q.width();r.h=p!==c?p:q.height();n.apply(this,arguments)}if($.isFunction(l)){n=l;return m}else{n=l.handler;l.handler=m}}};function g(){i=h[k](function(){a.each(function(){var n=$(this),m=n.width(),l=n.height(),o=$.data(this,d);if(m!==o.w||l!==o.h){n.trigger(j,[o.w=m,o.h=l])}});g()},e[b])}})(jQuery,this); 
		
//		function platHover(x){
//			var mn_lay_mod = $("#mn_lay");
//			var platName=$.trim($(x).attr("pname"));
//			var pId=$.trim($(x).attr("pid"));
//			var platUrl=$(x).attr("href");
//			var dangAnUrl=$(x).attr("purl");
//			$("#pId").val(pId);
//			$("#platUrlHidden").val(platUrl);
//			$("#findda").attr("href","pDetail/"+dangAnUrl);
//			window.clearTimeout(0);
//			var p = $(x).offset();
//			
//			mn_lay_mod.css({"position":"absolute","left":(p.left+10)+"px","top":(p.top+19)+"px","display":"block"});
//			showbool=true;
//		}
//		function platOver(){
//			var mn_lay_mod = $("#mn_lay");
//			TimeoutId = window.setTimeout(function(){
//				if(showbool){
//					mn_lay_mod.hide();
//					showbool=false;
//				}
//				
//			},2000);
//			
//		}


$(function(){
	
});

	