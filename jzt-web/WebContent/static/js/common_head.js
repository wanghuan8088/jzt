$(function(){
    init();
})
//搜索
var platData_head,ul_head = $("<ul class='autoul'></ul>");
var flg = true;

function init() {
	$("#plat_form1").append(ul_head);
	$("#keyword_plat_head").keydown(function(){
		ul_head.empty();
	});
	$("#keyword_plat_head").keyup(function(){
        ul_head.empty();
		if($("#keyword_plat_head").val().length>0) {
			ul_head.show();
		} else {
			ul_head.hide();
		}
		if(!platData_head){
			platData_head = getPlatData_head();
		}
		ul_head.append(search_ul(platData_head, $(this).val()));
		ul_head.css({
			"width":$(this).innerWidth()
		});
	});
	$("#keyword_plat_head").focus(function(){
		if($("#keyword_plat_head").val().length>0) {
			ul_head.show();
		} else {
			ul_head.hide();
		}
	});
	$("#keyword_plat_head").blur(function(){
		if(flg){
			ul_head.hide();
		}
	});
	ul_head.mouseover(function(){
		flg = false;
	});
	ul_head.mouseout(function(){
		flg = true;
	});
	
	$("#plat_form1").show();
	$("#plat_form2").show();
	$("#news_form1").hide();
	$("#news_form2").hide();
	$("#tiezi_form1").hide();
	$("#tiezi_form2").hide();
	$("#wenda_form1").hide();
	$("#wenda_form2").hide();
	$("#baike_form1").hide();
	$("#baike_form2").hide();
	platData_head = getPlatData_head();
}

var search_ul = function(data, value) {
	var value = $.trim(value);
	var h = '';
	if (null !=value && value.length > 0) {
		var matcher = new RegExp(value, "i");
		var arr = $.grep(data, function(item) {
			return matcher.test(item.platName)
				|| matcher.test(item.platPin)
                || matcher.test(item.allPlatPin)
                || matcher.test(item.platUrl);
		});
		if (arr.length > 0) {
			for (var i = 0; i < arr.length; i++) {
				var thcol = new RegExp(value, "ig");
				name = arr[i].platName.replace(thcol, "<i>" + value
					+ "</i>");
				h += '<li><a target="_blank" href="/dangan/'+arr[i].platPin+'/">'
					+ name + '</a></li>';
			}
		} else {
			h = '<li><a href="#" style="text-align:center;">无查询结果</a></li>';
			ul_head.html("");
		}
	}
	return h;
};

function getPlatData_head(){
	var result;
	$.ajax({
		url: "/wdzj/html/json/dangan_search.json",
		type:"GET",
		async:false,
		dataType: 'json',
		success: function(data){
			result = data;
		}
	});
	return result;
}
	
function enterIn_head(evt){
	var evt=evt?evt:(window.event?window.event:null);//兼容IE和FF
	if (evt.keyCode== 13){
		search_head();
		return false;
	}
}

function search_plat_head(type, value) {
	//var value = $(obj).val();
	//$(obj).val(0)
	window.open("http://www.wangdaizhijia.com/dangan.html?" + type + "=" + value); 
}

function changetype(obj, search_type) {
	$("#search_type").val(search_type);
	
	var search_tab = $(".search-tab li");
	var search_panel = $(".search-panel .ipt-search");
	var val = ["请输入平台简拼或关键字","","","",""];
    search_tab.removeClass("curr");
	/*search_tab.onclick(function(){
		var i = $(this).index();
		search_tab.removeClass("cur");
		$(this).addClass("cur");
		search_panel.attr("placeholder",val[i]);
	});*/

	//平台
	if("1" == search_type) {
		$("#plat_form1").show();
		$("#news_form1").hide();
		$("#tiezi_form1").hide();
		$("#wenda_form1").hide();
		$("#baike_form1").hide();
		$("#plat_form2").show();
		$("#news_form2").hide();
		$("#tiezi_form2").hide();
		$("#wenda_form2").hide();
		$("#baike_form2").hide();
		search_tab.removeClass("cur");
		$(obj).addClass("cur");
		search_panel.attr("placeholder",val[search_type-1]);
	}
	//新闻
	else if("2" == search_type) {
		$("#plat_form1").hide();
		$("#news_form1").show();
		$("#tiezi_form1").hide();
		$("#wenda_form1").hide();
		$("#baike_form1").hide();
		$("#plat_form2").hide();
		$("#news_form2").show();
		$("#tiezi_form2").hide();
		$("#wenda_form2").hide();
		$("#baike_form2").hide();
		search_tab.removeClass("cur");
		$(obj).addClass("cur");
		search_panel.attr("placeholder",val[search_type-1]);
	}
	//帖子
	else if("3" == search_type) {
		$("#plat_form1").hide();
		$("#news_form1").hide();
		$("#tiezi_form1").show();
		$("#wenda_form1").hide();
		$("#baike_form1").hide();
		$("#plat_form2").hide();
		$("#news_form2").hide();
		$("#tiezi_form2").show();
		$("#wenda_form2").hide();
		$("#baike_form2").hide();
		search_tab.removeClass("cur");
		$(obj).addClass("cur");
		search_panel.attr("placeholder",val[search_type-1]);
	}
	//问答
	else if("4" == search_type) {
		$("#plat_form1").hide();
		$("#news_form1").hide();
		$("#tiezi_form1").hide();
		$("#wenda_form1").show();
		$("#baike_form1").hide();
		$("#plat_form2").hide();
		$("#news_form2").hide();
		$("#tiezi_form2").hide();
		$("#wenda_form2").show();
		$("#baike_form2").hide();
		search_tab.removeClass("cur");
		$(obj).addClass("cur");
		search_panel.attr("placeholder",val[search_type-1]);
	}
	//百科
	else {
		$("#plat_form1").hide();
		$("#news_form1").hide();
		$("#tiezi_form1").hide();
		$("#wenda_form1").hide();
		$("#baike_form1").show();
		$("#plat_form2").hide();
		$("#news_form2").hide();
		$("#tiezi_form2").hide();
		$("#wenda_form2").hide();
		$("#baike_form2").show();
		search_tab.removeClass("cur");
		$(obj).addClass("cur");
		search_panel.attr("placeholder",val[search_type-1]);
	}
}

function search_head() {
	var search_type = $("#search_type").val();
	//平台
	if("1" == search_type) {
		//var platData_head = getPlatData();
		var lis = search_ul(platData_head, $("#keyword_plat_head").val());
		if(lis && $(lis).length > 0){
			var url = $(lis).eq(0).find("a").attr("href");
			window.open(url);
		}
	}
	//新闻
	else if("2" == search_type) {
		var type = 1;
		if($(".dropDown input").val() == "内容") type = 2;
		var key = $("#keyword_head").val();
		window.open("http://www.wangdaizhijia.com/front_search-list?type=" + encodeURI(encodeURI(type)) + "&key=" + encodeURI(encodeURI(key)));
	}
	//帖子
	else if("3" == search_type) {
		document.tiezi_form.action = "http://bbs.wangdaizhijia.com/search.php?searchsubmit=yes";
		document.charset='gbk';
		document.tiezi_form.submit();
	}
	//问答
	else if("4" == search_type) {
		document.wenda_form.action = "http://www.wangdaizhijia.com/wenda/question/search.html";
		document.wenda_form.submit();
	}
	//百科
	else if("5" == search_type) {
		var key = $("#keyword_head_baike").val();
		window.open("http://baike.wangdaizhijia.com/index.php?search-fulltext-title-"+ encodeURI(encodeURI(key)) +"--all-0-within-time-desc-1");
	}
}
