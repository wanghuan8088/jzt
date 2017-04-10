
var maxpage;// 全局变量 总页数
var PageSize = 10;// 全局变量 每页显示多少条数据
var programPath;
var keyword="";

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


function AjaxPage(CurPage, PageSize) { 

	if(document.getElementById("keyword").value == null)
		keyword="";
	else 
		keyword=document.getElementById("keyword").value;
    //清空数据显示Table  
	$('#tReports').empty(); 
	$('#paging').empty(); 
	
	$.cookie('CurPageitem', CurPage); 
    //组合Json查询条件，查询分页数据 
	$.ajax( {  
        type : 'POST',  
        url : 'reportList',  
        data : {
      	  	page: CurPage,
      	  	keyword: keyword,
		  },  
        dataType : 'json',  
        success : function(data) {  
        	if (data == null) {  
                 $('#tReports').html("<tr><td><h2>未找到相关报告</h2></td><td></td><td></td><td></td><td></td></tr>");
                 $('#paging').empty();                
             }  
        	 else {
        		 if (eval(data["reports"]).length != 0) {
        			 var str = '';  
        			 for (var i = 0; i < eval(data["reports"]).length; i++) {  
                      	var report=eval(data["reports"]);
                      	report=report[i];
                      	str += '<tr>'+
							      	'<td class="table-style"><a href="'+programPath+'/report/newReport?id='+report["id"]+'">'+report["title"]+'</a></td>'+
							      	'<td class="table-style"><font class="small">'
							      	+getFormatDateByLong(report["createdDate"], "yyyy-MM-dd")+''+
							      		'</font>'+
							      	'</td>'+
							      	'<td class="table-style"><font class="small">'+
							      			''+getFormatDateByLong(oReport["updateTime"], "yyyy-MM-dd hh:mm")+''+
							      		'</font>'+
							      	'</td>'+
							      '</tr>';
     		 		  }
     		 		  $('#tReports').html(str);  
        			 
        			// add paging for platform
        		 	maxpage = parseInt(data["totalPage"]); 
     		 		if (maxpage>1){
     		 			
     		 			if (CurPage==0)
                         {
                         	var span = '<li class="disabled"><a href="javascript:void(0)" aria-label="First"><span aria-hidden="true">首页</span></a></li><li class="disabled"><a href="javascript:void(0)" aria-label="Previous" onclick="PageIndexClick(this)" id="PreviousPage"><span aria-hidden="true">&laquo;</span></a></li>';  
                         }
     		 			 else 
     	                {
     	                    var span = '<li><a href="#" aria-label="First" onclick="PageIndexClick(this)" id="FirstPage"><span aria-hidden="true">首页</span></a></li><li><a href="javascript:void(0)" aria-label="Previous" onclick="PageIndexClick(this)" id="PreviousPage"><span aria-hidden="true">&laquo;</span></a></li>';  
     	                }
     		 			 var firstPage = 1;  
     	                 var pagecount = 0;//循环的次数  
     	                 if(maxpage > 10){
     	                	 pagecount = 10;
     	                	 if(CurPage>8){
     	                		 pagecount = CurPage + 2;
     	                		 firstPage = CurPage - 7;
     	                	 }
     	                	 if(pagecount > maxpage){
     	                		 pagecount = maxpage;
     	                	 }
     	                	 for (var j = firstPage; j <= pagecount ; j++) { 
     	                		 var temp=CurPage + 1;
     	                            if (j == temp) {  
     	                                span += "<li class='active'><span>"+ j +"</span></li>" ;  ;  
     	                            } else {
     	                            	var m=j-1;
     	                                span += "<li><a href='javascript:void(0)' onclick='CurPageSizeClick(" + m + ",this)'>"+ j +"</a></li>" ;  
     	                            }  
     	                     } 
     	                	 if (CurPage==maxpage-1)
     	                     {
     	                        span += "<li class='disabled'><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li class='disabled'><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
     	                     }
     	                     else
     	                     {
     	                        span += "<li><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
     	                     }    	 	                	 
     	                 }
     	                 else {  
     	                        pagecount = maxpage;  
     	                        for (var j = firstPage; j <= pagecount ; j++) {
     	                        	var t=j-1;
     	                        	var temp2=CurPage + 1;
     	                            if (j == temp2) {  
     	                                span += "<li class='active'><span>"+ j +"</span></li>" ;  ;  
     	                            } else {  
     	                                span += "<li><a href='javascript:void(0)' onclick='CurPageSizeClick(" + t + ",this)'>"+ j +"</a></li>" ;  
     	                            }  
     	                        } 
     	                        if (CurPage==maxpage-1)
     	                        {
     	                        	span += "<li class='disabled'><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li class='disabled'><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
     	                        }
     	                        else
     	                        {
     	                        	span += "<li><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
     	                        }
     	                    }    
     	                 
     	                 $('#paging').html(span);
        		 }
        	  		 
        		 else {  
                     $('#paging').empty(); 
                 }  
        		}
        		 else {
        			 $('#tReports').html("<tr><td><h2>未找到相关报告！</h2></td><td></td><td></td><td></td><td></td></tr>");
                     $('#paging').empty();    
        		 }
        	 }
        }
	});
} 

//首页、上一页、下一页、尾页点击  
function PageIndexClick(obj) {  
    //当前第几页 
//    var tId=$('#tId').html();
    var CurrenPageSize = $.cookie('CurPageitem'); 
    if (CurrenPageSize != '') {  
        CurrenPageSize = parseInt(CurrenPageSize);  
    }  
    //id  
    var type = $(obj).attr('id');  
    //首页  
    if (type == 'FirstPage') {  
        CurrenPageSize = 0;  
        AjaxPage(CurrenPageSize, PageSize);   
    }  
        //上一页  
    else if (type == 'PreviousPage') {  
        if (CurrenPageSize > 1) {  
            CurrenPageSize = CurrenPageSize - 1;  
        } else {  
            CurrenPageSize = 1;  
        }  
        AjaxPage(CurrenPageSize, PageSize);   
    }  
        //下一页  
    else if (type == 'NextPage') {  
        var size = CurrenPageSize + 1;  
        
        if (size < maxpage) {  
            CurrenPageSize = CurrenPageSize + 1;
        }  
        AjaxPage(CurrenPageSize, PageSize);  
    }  
        //尾页  
    else if (type == 'LastPage') {  
        CurrenPageSize = maxpage-1;  
        AjaxPage(CurrenPageSize, PageSize);  
    }  
}  
  
//页数点击   
function CurPageSizeClick(CurPage, obj) {  
    AjaxPage(CurPage, PageSize);  
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