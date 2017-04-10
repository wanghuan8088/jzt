function getQueryString(name) { 
	var reg=new RegExp("(^|&)"+name+"=([^&]*)(&|$)","i"); 
	var r=window.location.search.substr(1).match(reg); 
	if(r!=null) 
		return unescape(r[2]); 
	return null; 
} 

var maxpage;// 全局变量 总页数
var PageSize = 10;// 全局变量 每页显示多少条数据

	$(document).ready(function() { 	
	var CurPage;
	var _s="close";
	if ($.cookie('CurPagedangan')==null)
	{
		$.cookie('CurPagedangan', '0'); // 存储 cookie
		CurPage=0;
	}
	else	
	{
		if(_s=="fresh")
		{
			CurPage=$.cookie('CurPagedangan');
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
	  $(document).ready(function(){
		  $(".product-select li").click(function(){
			  $.cookie('CurPagedangan', '0'); 
			  CurPage=$.cookie('CurPagedangan');
				AjaxPage(CurPage, PageSize);  
			}); 
	  });
});

function AjaxPage(CurPage, PageSize) {
	
	$.ajax
	({
		type:'POST',
		url:'../product/getcookie',
		success: function(data)
		{
			
			AjaxPage2(CurPage, PageSize);
		}
	});

	
} 





function AjaxPage2(CurPage, PageSize)
{
	//清空数据显示Table  
	$('#pList').empty(); 
	$('#paging').empty(); 
  
	$.cookie('CurPagedangan', CurPage); 
    //组合Json查询条件，查询分页数据 
	var year = $("#year .select-focus").attr("var");				
	var province = $("#province .select-focus").attr("var");
	var zhucezijin = $("#zhucezijin .select-focus").attr("var");
	var pingjunshouyi = $("#pingjunshouyi .select-focus").attr("var");
	var toubiaobaozhang = $("#toubiaobaozhang .select-focus").attr("var");
	var baozhangmoshi = $("#baozhangmoshi .select-focus").attr("var");
	
	//为了反爬传往后台的CurPage PageSize 两个参数需要加密
	//////////////////////////////////
	var CurPage_jiami = jiami(CurPage);
	var PageSize_jiami = jiami(PageSize);
	
	///////////////////////////////////
	
	$.ajax( {  
        type : 'POST',  
        url : '../product/dangan2',  
        data : {
      	  "online": year,
		  "prov":province,
		  "capital":zhucezijin,
		  "rate":pingjunshouyi,
		  "security":toubiaobaozhang,
		  "mode":baozhangmoshi,
		  //"curPage":CurPage,
		  "curPage":CurPage_jiami,
      	  //"pageSize":PageSize
		  "pageSize":PageSize_jiami
		  },  
        dataType : 'json',  
        success : function(data) {  
        	 if (data == null) {  
                 $('#productList').html("<li><h2>未找到相关平台！</h2></li>");
                 $('#paging').empty();                
             }  
        	 else {
        		 if (eval(data["arhList"]).length != 0) {
        			 
        			 var str = '';  
                     for (var i = 0; i < eval(data["arhList"]).length; i++) {  
                     	var product=eval(data["arhList"]);
                     	
                     	product=product[i];
                     	
                     	//add information for p2p platform
                     	str += "<li  class='list-group-item item'><div class='title'><div class='nameBox'>" ;
                     	str += "<img src='"+$('#ctx').html()+"/"+product["logoUrl"]+"' alt='" +product["productName"]+"' width='124px' height='48px'/>";
                   
                     	str +="<span class='name'><a href='pDetail/"+product["pid"]+"'>"+product["productName"]+"</a></span>";
                     	 
                     	str +="<span class='indexNum pattr'>";
                       	if (product["developmentRate"]!=null) 
                       	{
                       			str += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;综合指数：<i class='pattrv'>"+product["developmentRate"]+"</i><span class='tags'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
                       			if (product["totalRank"]!=null)
                       			{
                       				str += "<span class='month'></span>月 排名第<span>&nbsp;</span><span class='pattrv'>"+product["totalRank"]+"</span>位</span>";
                       			}
                       			
                       	}
                       	str +="</span></div></div>";
                       
                       	str +="<div class='con'>";
                       	str +="<p><span>平均收益：";
                        if(product["avgInterestRate"]==null) str +="- </span>";
                        else str += "<strong>"+product["avgInterestRate"]+"%</strong></span>";                       	
                        str +="<span>投资金额：";
                        if(product["totalInvestmentAmount"]==null) str +="- </span>";
                        else str += "<strong>"+product["totalInvestmentAmount"]+"</strong></span>";                        
                        str +="<span>借款标数：";
                        if(product["borrowAmount"]==null) str +="- </span></p>";
                        else str += "<strong>"+product["borrowAmount"]+"标</strong></span></p>";
                        
                        str +="<p><span>上线时间：<strong>"+product["startTime"]+"</strong></span>";
                        str +="<span>注册资本：<strong>"+product["registeredCapital"]+"万元</strong></span>";
                        str +="<span>注册地：<strong>"+product["location"]+"</strong></span></p>";
                        
                        str +="<p class='more'><a href='"+product["webUrl"]+"' target='_blank'>前往官网&gt;&gt;</a></p></div>"
                        
                       	str +="</li>";
        		 		}
        		 		$('#productList').html(str);  
        		 		
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
        	                 if(maxpage > 12){
        	                	 pagecount = 12;
        	                	 if(CurPage>10){
        	                		 pagecount = CurPage + 2;
        	                		 firstPage = CurPage - 9;
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
        		 	}
        	  		 
        		 else {  
        			 $('#productList').html("<li><h2>未找到相关平台！</h2></li>");
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
    var CurrenPageSize = $.cookie('CurPagedangan'); 
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
