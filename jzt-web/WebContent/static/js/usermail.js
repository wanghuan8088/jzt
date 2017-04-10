
var maxpage;// 全局变量 总页数
var PageSize = 10;// 全局变量 每页显示多少条数据
var username_data;
var detialpath;


	$(document).ready(function() { 	
		
	var CurPage;
	username_data = $("#username_data").text();
	detialpath =$("#detialpath").text();
//	alert(detialpath);
	
	var _s="close";
	if ($.cookie('CurPagemail')==null)
	{
		$.cookie('CurPagemail', '0'); // 存储 cookie
		CurPage=0;
	}
	else	
	{
		if(_s=="fresh")
		{
			CurPage=$.cookie('CurPagemail');
		}
		else  CurPage=0;
	}
	AjaxPage(CurPage, PageSize);  

});


function AjaxPage(CurPage, PageSize) {
	
	$.ajax
	({
		type: 'POST',
		url: '../product/getcookie',//注意这里url从哪里接
		success: function(data)
		{
			
			AjaxPage2(CurPage, PageSize);
		}
		
	});

	
} 



function AjaxPage2(CurPage, PageSize)
{
	 //清空数据显示Table  
	
	$('#messageslist').empty(); 
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
	

	
	$.cookie('CurPagemail', CurPage); 
	
	$.ajax( {  
        type : 'POST',  
        url : '../user/mailbox',  
        data : {
		  "username":username_data,
		  "curPage":jiamicurpage,
      	  "pageSize":jiamipagesize
		  },  
        dataType : 'json',  
        success : function(data) { 
        	
        	 if (data == null) {  
                 $('#messageslist').html("<li><h3>暂无信息</h3></li>");
                 $('#paging').empty();                
             }  
        	 else {
        		 if (eval(data["List"]).length != 0) {
        			 
        			 var str = '';    		
        			 str += ' <li style="font-size:20px; " >'+
					    	'<span class="from">发件人</span>'+
							'<span class="title">标题</span>'+
							'<span class="from" style="padding-left:50px; ">时间</span>'+
							'</li>';
        			 
        			 for (var i = 0; i < eval(data["List"]).length; i++) {  
                      	var product=eval(data["List"]);
                      	product=product[i];
                    
                      	var i_num = i+1;
                      //	alert(product["isRead"]);
                      //	alert(product["sendTime"]);
                      	if(product["isRead"]==0){
                      		str += '<li class="no-read" onclick="messagesRead(this)">';
                      		str += '<span class="mid" style="display:none">'+product["id"]+'</span>';
                      		str += '<span class="from">系统管理员</span><span class="title">';                      		
                      		str += '<span class="label label-warning">新邮件</span> '+product["content"]+'</span>';
                      		str += '<span class="date"><b><fmt:formatDate value="'+product["mavTime"]+'pattern="yyyy-MM-dd,HH:mm"/>'+product["ajaxTime"]+'</b></span></li>';
				
                      	}
                      	if(product["isRead"]!=0){
                      		str += '<li onclick="messagesRead(this)">';
                      		str += '<span class="mid" style="display:none">'+product["id"]+'</span><span class="from">系统管理员</span><span class="title">'+product["content"]+'</span>';
                      	    str += '<span class="date"><b>'+product["ajaxTime"]+'</b></span></li>';
				
                      	}
                  	
                      	
         		 		}
         		 		$('#messageslist').html(str);  
        		 		
        		 		// add paging for platform
           		 		maxpage = parseInt(data["totalPages"]); 
        		 		if (maxpage>1){
        		 			
        		 			if (CurPage==0)
                            {
                            	var span = '<li class="disabled"><a href="javascript:void(0)" aria-label="First"><span aria-hidden="true"> << </span></a></li><li class="disabled"><a href="javascript:void(0)" aria-label="Previous" onclick="PageIndexClick(this)" id="PreviousPage"><span aria-hidden="true"> < </span></a></li>';  
                            }
        		 			 else 
        	                {
        	                    var span = '<li><a href="#" aria-label="First" onclick="PageIndexClick(this)" id="FirstPage"><span aria-hidden="true"> << </span></a></li><li><a href="javascript:void(0)" aria-label="Previous" onclick="PageIndexClick(this)" id="PreviousPage"><span aria-hidden="true" > < </span></a></li>';  
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
        	                        span += "<li class='disabled'><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'> > </span></a></li><li class='disabled'><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'> >> </span></a></li>";  
        	                     }
        	                     else
        	                     {
        	                        span += "<li><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'> > </span></a></li><li><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'> >> </span></a></li>";  
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
        	                        	span += "<li class='disabled'><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>></span></a></li><li class='disabled'><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'> >> </span></a></li>";  
        	                        }
        	                        else
        	                        {
        	                        	span += "<li><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>></span></a></li><li><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'> >> </span></a></li>";  
        	                        }
        	                    }    
        	                 
        	                 $('#paging').html(span);
        		 		}        		 		
        		 	}
        	  		 
        		 else {  
        			 $('#messageslist').html("<li><h3>暂无信息</h3></li>");
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
    var CurrenPageSize = $.cookie('CurPagemail'); 
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
        if (CurrenPageSize > 0) {  
            CurrenPageSize = CurrenPageSize - 1;  
        } else {  
            CurrenPageSize = 0;  
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
