
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
	$('#datalist').empty(); 
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
	
	$.ajax( {  
        type : 'POST',  
        url : '../user/productdata',  
        data : {
		  "username":username_data,
		  "curPage":jiamicurpage,
      	  "pageSize":jiamipagesize
		  },  
        dataType : 'json',  
        success : function(data) { 
        	
        	 if (data == null) {  
                 $('#datalist').html("暂无自选平台！");
                 $('#paging').empty();                
             }  
        	 else {
        		 if (eval(data["List"]).length != 0) {
        			 
        			 var str = '';  
        			 str += '<tr  class= "text-center">'+
					    	'<th class=" text-center"></th>'+
							'<th class=" text-center">名称</th>'+
							'<th class=" text-center">成交量</th>'+
							'<th class=" text-center">平均利率</th>'+
							'<th class=" text-center">投资人数</th>'+
							'<th class=" text-center">平均借款期限</th>'+
							'<th class=" text-center">借款人数</th>'+
							'<th class=" text-center">累计待还金额</th>'+
							'<th class=" text-center">档案</th>'+
							'<th class=" text-center">关注</th>'+
						'</tr>';	
        			 for (var i = 0; i < eval(data["List"]).length; i++) {  
                      	var product=eval(data["List"]);
                      	product=product[i];
                      	var shouyiint;
                      	var jindu;
                      	
                      	shouyiint =product["interestRate"]*100;
                      	shouyiint =shouyiint.toFixed(2);
                      	jindu=product["process"]*100;
                      	jindu =jindu.toFixed(2);
                      	var i_num = i+1;
                      	
                      	str += '<tr><td class="pId" style="display:none">'+product["pId"]+'</td>';
                      	str += '<td>'+i_num+'</td>';
                      	str += '<td><a href="'+product["webUrl"]+'">'+product["productName"]+'</a></td>';
                      	str += '<td><fmt:formatNumber type="number"  pattern="0.00" minFractionDigits="2" ></fmt:formatNumber>'+product["totalTurnover"]+'万元</td>';
                      	str += '<td><fmt:formatNumber type="number"  pattern="0.00" maxFractionDigits="2"/>'+ product["avgInterestRate"]+' %</td>';
                      	str += '<td><fmt:formatNumber type="number"  pattern="0" maxFractionDigits="0"/>'+product["noInvestment"]+'人</td>';
                      	str += '<td><fmt:formatNumber type="number"  pattern="0" maxFractionDigits="0"/>'+product["avgRepayPeriod"]+'月</td>';
						str += '<td><fmt:formatNumber type="number"  pattern="0" maxFractionDigits="0"/>'+product["totalBorrower"]+'人</td>';
						str += '<td><fmt:formatNumber type="number"  pattern="0.00" maxFractionDigits="2"/>'+product["totalUnrepayAmount"]+'万元</td>';
                      	str += '<td id="product_view"><a href="'+detialpath+'/product/pDetail/'+product["pId"]+'"><span class="glyphicon glyphicon-book" aria-hidden="true"></span></a></td>';
                      	str += '<td id="product_focus">'+
							'<a href="javascript:void(0)" class="focus_cancle" onclick="focus_cancle(this)"><span class="glyphicon glyphicon-minus-sign"></span></a>'+
							'<a href="javascript:void(0)" class="focus_product" style="display:none;" onclick="focus_product(this)"><span class="glyphicon glyphicon-plus-sign"></span></a>'+
							'</td></tr>';
                      	
                      	
         		 		}
         		 		$('#datalist').html(str);  
        		 		
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
        			 $('#datalist').html("咱无自选平台！");
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
