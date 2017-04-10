
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

function AjaxPage(CurPage, PageSize) { 
	
    //清空数据显示Table  
	$('#comment_cnt').empty(); 
	$('#paging').empty(); 
	
	$.cookie('CurPageitem', CurPage); 
    //组合Json查询条件，查询分页数据 
	$.ajax( {  
        type : 'POST',  
        url : '../exposure/commentList',  
        data : {
      	  eid: getQueryString('eid'),
      	  page: CurPage
		  },  
        dataType : 'json',  
        success : function(data) {  
        	$('#comment_cnt').html(data.totalSizes);
        	
        	if (data == null) {  
                $('#comment_ul').html("<li><h4>暂无评论！</h4></li>");
                $('#paging').empty();                
            }  
       	 else {
       		 if (eval(data["commentList"]).length != 0) {
       			var htmlStr = "";
            	for(var i=0;i<data.commentList.length;i++) {
            		htmlStr+='<li>';
            		if (data.commentList[i].avatarUrl != null) {
            			htmlStr+='<a href="#"><img class="img-thumb" src="'+programPath+'/'+data.commentList[i].avatarUrl+'" alt=""/></a>';
            		} else {
            			htmlStr+='<a href="#"><img class="img-thumb" src="'+programPath+'/static/image/user_img_default.png" alt=""/></a>';
            		}
    				htmlStr+='<a href="#" style="margin:5px;font-size:13px;">'+data.commentList[i].username+'</a>'+
    							'<span class="support-style">'+getSmpFormatDateByLong(data.commentList[i].createdDate,true)+'</span>'+
    							'<p>'+replaceWords(data.commentList[i].content)+'</p>'+
    							'<hr style="width:100%;height:1px;border:none;border-top:1px dashed #ADD8E6;" />'+
    						'</li>';
            	}
            	$('#comment_ul').html(htmlStr);
       			 
       			// add paging for platform
       		 	maxpage = parseInt(data["totalPages"]); 
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
       			$('#comment_ul').html("<li><h4>暂无评论！</h4></li>");
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

function addExposure(next) {
	window.location.href=next;
}

function clickSupport(username) {
	if(document.getElementById('username')) {
		if($("#support_span").html().trim() == "支持") {
			$.ajax( {  
		        type : 'POST',  
		        url : '../exposure/clickLike',  
		        data : {
		      	  eid: getQueryString('eid'),
		      	  username: username
				  },  
		        dataType : 'json',  
		        success : function(data) {  
		      	  	$("#support_span").html("已支持");
		      	  	$("#support_cnt").html(parseInt($("#support_cnt").html().trim(), 10)+1);
		        }
			});
		} else if($("#support_span").html().trim() == "已支持") {
			$.ajax( {  
		        type : 'POST',  
		        url : '../exposure/cancelLike',  
		        data : {
		      	  eid: getQueryString('eid'),
		      	  username: username
				  },  
		        dataType : 'json',  
		        success : function(data) {  
		      	  	$("#support_span").html("支持");
		      	  	$("#support_cnt").html(parseInt($("#support_cnt").html().trim(), 10)-1);
		        }
			});
		}
	} else {
    	$("#login_modal").modal("show");
    }
}

function clickDangan(pid) {
	var programPath=$('#cxt').html();
	window.location.href=programPath+'/product/pDetail/'+pid;
}

function getQueryString(name) {
    var reg = new RegExp('(^|&)' + name + '=([^&]*)(&|$)', 'i');
    var r = window.location.search.substr(1).match(reg);
    if (r != null) {
        return unescape(r[2]);
    }
    return null;
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