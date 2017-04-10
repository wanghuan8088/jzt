
var maxpage;// 全局变量 总页数
var PageSize = 10;// 全局变量 每页显示多少条数据

	$(document).ready(function() { 	
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
	
	$.ajax
	({
		type: 'POST',
		url: '../getcookie',//注意这里url从哪里接
		success: function(data)
		{
			
			AjaxPage2(CurPage, PageSize);
		}
		
	});

	
} 



function AjaxPage2(CurPage, PageSize)
{
	 //清空数据显示Table  
	$('#pitemList').empty(); 
	$('#paging').empty(); 
  
	
	if(CurPage!=null)
	{
		var jiamicurpage=jiami(CurPage);
	}
	else
	{
		var jiamicurpage=null;
	}
	
	if(PageSize!=null)
	{
		var jiamipagesize=jiami(PageSize);
	}
	else
	{
		var jiamipagesize=null;
	}
	
	
	
	$.cookie('CurPageitem', CurPage); 
    //组合Json查询条件，查询分页数据 
	var rate = $("#nianhuashouyi .select-focus").attr("var");				
	var period = $("#touziqixian .select-focus").attr("var");
	var sort = $("#paixu .select-focus").attr("var");
	
	$.ajax( {  
        type : 'POST',  
        url : '../loan/list2',  
        data : {
      	  "rate": rate,
		  "period":period,
		  "sort":sort,
		  
		  "curPage":jiamicurpage,
      	  "pageSize":jiamipagesize
		  },  
        dataType : 'json',  
        success : function(data) {  
        	 if (data == null) {  
                 $('#pitemList').html("<li><h2>未找到相关标的！</h2></li>");
                 $('#paging').empty();                
             }  
        	 else {
        		 if (eval(data["loanList"]).length != 0) {
        			 
        			 var str = '';  
        			 for (var i = 0; i < eval(data["loanList"]).length; i++) {  
                      	var product=eval(data["loanList"]);
                      	product=product[i];
                      	var shouyiint;
                      	var jindu;
                      	shouyiint =product["interestRate"]*100;
                      	shouyiint =shouyiint.toFixed(2);
                      	jindu=product["process"]*100;
                      	jindu =jindu.toFixed(2);
                      	str +="<li  class='list-group-item item'><div class='newtitle'><div class='row biaoBox'><div class='col-md-2 item1'>";
                      	str +="<a class='name'><a href='../pDetail/"+product["pId"]+"'>";
                      	str += "<img src='"+$('#ctx').html()+"/"+product["productLogo"]+"' alt='" +product["productName"]+"' width='124px' height='48px'/></a></div>";
                      	
                      	str +="<div class='col-md-2 item1'><p>项目名称：";
                      	if(product["title"]==null)
                      		{
                      		str +=" "+"</p><p>借款金额：￥"+product["amount"]+"</p></div>";
                           }
                      	
                           else
                        	   {
                        	   str +=product["title"]+"</p><p>借款金额：￥"+product["amount"]+"</p></div>";
                        	   }
                      	str +="<div class='col-md-2 item1'><p class='shouyilv'>年化收益率：</p><p class='shouyi'>"+shouyiint+"%</p></div>";
                         
                      	str +="<div class='col-md-2 item1'><p class='shouyilv'>借款期限: </p><p class='shouyi'>"+product["borrowPeriod"]+"天</p></div>";
                      	
                      	str +="<div class='col-md-2 item1'><p class='shouyilv'>借款进度: "+jindu+ "%"+"</p><div class='progress jindu'>";
                      	str +="<div class='progress-bar progress-bar-info' role='progressbar' aria-valuenow='60' aria-valuemin='0' aria-valuemax='100' 	 style='width:"+jindu+ "%;'>";
                      	str +="</div></div></div>";
                      	
                      	str +="<div class='col-md-2 item2'><p class='lianjie'><a href='"+product["loanUrl"]+"' target='_black"+"'>去投资</a></p>";
                      	
                      	
                      	str +="</div></div></li>";
         		 		}
         		 		$('#pitemList').html(str);  
        		 		
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
        		 	}
        	  		 
        		 else {  
        			 $('#pitemList').html("<li><h2>未找到相关标的！</h2></li>");
                     $('#paging').empty(); 
                 }  
        		}	
        },
        error: function(data)
        {
        	alert("cookie miss!");
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
