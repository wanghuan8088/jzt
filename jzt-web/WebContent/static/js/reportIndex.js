
var maxpage;// 全局变量 总页数
var PageSize = 10;// 全局变量 每页显示多少条数据
var programPath;
var keyword="";


var ourReportNum=5;
var thirdReportNum=5;

$(document).ready(function() { 	
	programPath=$('#cxt').html();
	
	var CurPage;
	var _s="close";
	if ($.cookie('CurPageitem')==null)
	{
		$.cookie('CurPageitem', '0'); // 存储 cookie
		CurPage=0;
	}
	else	
	{
		if(_s=="fresh")
		{
			CurPage=$.cookie('CurPageitem');
		}
		else  CurPage=0;
	}
	AjaxPage(CurPage, PageSize);  

});

	$(function(){
		  $(".product-select li").click(function(){
				$(this).parent().find(".select-focus").removeClass("select-focus");
				$(this).addClass("select-focus");
			});
		  $(".product-select2 li").click(function(){
				$(this).parent().find(".select-focus").removeClass("select-focus");
				$(this).addClass("select-focus");
			});
		  $(document).ready(function(){
			  $(".product-select li").click(function(){
				  $.cookie('CurPageitem', '0'); 
				  CurPage=$.cookie('CurPageitem');
					AjaxPage(CurPage, PageSize);  
				}); 
			  $(".product-select2 li").click(function(){
				  $.cookie('CurPageitem', '0'); 
				  CurPage=$.cookie('CurPageitem');
					AjaxPage(CurPage, PageSize);  
				}); 
		  });
	});

	
	function addExposure(next) {
		window.location.href=next;
	}

	function searchChange(changeUrl) {
		AjaxPage(0, PageSize);  
	}




function AjaxPage(CurPage, PageSize) { //对于报告列表来说这两个参数没用，服务器返回的是两方的前五个报告

	if(document.getElementById("keyword").value == null)
		keyword="";
	else 
		keyword=document.getElementById("keyword").value;
    //清空数据显示Table  
	$('#tOurReports').empty(); 
	$('#tThirdReports').empty();
	
	$.cookie('CurPageitem', CurPage); 
    //组合Json查询条件，查询分页数据 
	$.ajax( {  
        type : 'POST',  
        url : 'index',  
        data : {
      	  	page: CurPage,
      	  	keyword: keyword,
		  },  
        dataType : 'json',  
        success : function(data) {  
        	if (data == null) {  
                 $('#tOurReports').html("<tr><td><h2>未找到相关报告！</h2></td><td></td><td></td><td></td><td></td></tr>");
                 $('#tThirdReports').html("<tr><td><h2>未找到相关报告！</h2></td><td></td><td></td><td></td><td></td></tr>");
                
             }  
        	 else {
        		 if (eval(data["reports"]).length != 0) {
        			 var str = ''; 
        			 var oReports=eval(data["reports"]); 
        			 for (var i = 0; i < eval(data["reports"]).length; i++) {  
                      	
                      	oReport=oReports[i];
                      	str += '<tr>'+
							      	'<td class="table-style"><a href="'+programPath+'/report/newReport?id='+oReport["id"]+'">'+oReport["title"]+'</a></td>'+
							      	'<td class="table-style"><font class="small">'
							      	+getFormatDateByLong(oReport["createdDate"], "yyyy-MM-dd")+''+
							      		'</font>'+
							      	'</td>'+
							      	'<td class="table-style"><font class="small">'+
							      			''+getFormatDateByLong(oReport["updateTime"], "yyyy-MM-dd hh:mm")+''+
							      		'</font>'+
							      	'</td>'+
							      '</tr>';
     		 		  }
     		 		  $('#tOurReports').html(str);  
     		 	}
        		 else {
        			 $('#tOurReports').html("<tr><td><h2>未找到相关报告！</h2></td><td></td><td></td><td></td><td></td></tr>");
  
        		 }


        		 if (eval(data["thirds"]).length != 0) {
        			 var str = '';  
        			 for (var i = 0; i < eval(data["thirds"]).length; i++) {  

                      	var tReports=eval(data["thirds"]);
                      	tReport=tReports[i];
                      	str += '<tr>'+
							      	'<td class="table-style"><a href="'+programPath+'/report/newReport?id='+tReport["id"]+'">'+tReport["title"]+'</a></td>'+
							      	'<td class="table-style"><font class="small">'
							      	+getFormatDateByLong(tReport["createdDate"], "yyyy-MM-dd")+''+
							      		'</font>'+
							      	'</td>'+
							      	'<td class="table-style"><font class="small">'+tReport["lastCommenter"]+'<br>'+
							      			''+getFormatDateByLong(tReport["updateTime"], "yyyy-MM-dd hh:mm")+''+
							      		'</font>'+
							      	'</td>'+
							      '</tr>';
     		 		  }
     		 		  $('#tThirdReports').html(str);  
     		 	}
        		 else {
        			 $('#tThirdReports').html("<tr><td><h2>未找到相关报告！</h2></td><td></td><td></td><td></td><td></td></tr>");
    
        		 }
        	 }
        }
	});
} 


//扩展Date的format方法 
Date.prototype.format = function (format) { 
var o = { 
"M+": this.getMonth() + 1, 
"d+": this.getDate(), 
"h+": this.getHours(), 
"m+": this.getMinutes(), 
"s+": this.getSeconds(), 
"q+": Math.floor((this.getMonth() + 3) / 3), 
"S": this.getMilliseconds() 
} 
if (/(y+)/.test(format)) { 
format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length)); 
} 
for (var k in o) { 
if (new RegExp("(" + k + ")").test(format)) { 
format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length)); 
} 
} 
return format; 
} 
/** 
*转换日期对象为日期字符串 
* @param date 日期对象 
* @param isFull 是否为完整的日期数据, 
* 为true时, 格式如"2000-03-05 01:05:04" 
* 为false时, 格式如 "2000-03-05" 
* @return 符合要求的日期字符串 
*/ 
function getSmpFormatDate(date, isFull) { 
var pattern = ""; 
if (isFull == true || isFull == undefined) { 
pattern = "yyyy-MM-dd hh:mm:ss"; 
} else { 
pattern = "yyyy-MM-dd"; 
} 
return getFormatDate(date, pattern); 
} 
/** 
*转换当前日期对象为日期字符串 
* @param date 日期对象 
* @param isFull 是否为完整的日期数据, 
* 为true时, 格式如"2000-03-05 01:05:04" 
* 为false时, 格式如 "2000-03-05" 
* @return 符合要求的日期字符串 
*/ 
function getSmpFormatNowDate(isFull) { 
return getSmpFormatDate(new Date(), isFull); 
} 
/** 
*转换long值为日期字符串 
* @param l long值 
* @param isFull 是否为完整的日期数据, 
* 为true时, 格式如"2000-03-05 01:05:04" 
* 为false时, 格式如 "2000-03-05" 
* @return 符合要求的日期字符串 
*/ 
function getSmpFormatDateByLong(l, isFull) { 
return getSmpFormatDate(new Date(l), isFull); 
} 
/** 
*转换long值为日期字符串 
* @param l long值 
* @param pattern 格式字符串,例如：yyyy-MM-dd hh:mm:ss 
* @return 符合要求的日期字符串 
*/ 
function getFormatDateByLong(l, pattern) { 
return getFormatDate(new Date(l), pattern); 
} 
/** 
*转换日期对象为日期字符串 
* @param l long值 
* @param pattern 格式字符串,例如：yyyy-MM-dd hh:mm:ss 
* @return 符合要求的日期字符串 
*/ 
function getFormatDate(date, pattern) { 
if (date == undefined) { 
date = new Date(); 
} 
if (pattern == undefined) { 
pattern = "yyyy-MM-dd hh:mm:ss"; 
} 
return date.format(pattern); 
} 