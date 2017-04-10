var maxpage;//全局变量  总页数  
$(document).ready(function() { 	
    var CurPage;
    if ($.cookie('CurPageS')==null)
    {
    	$.cookie('CurPageS', '1'); // 存储 cookie 
    	CurPage=1;
    }
    else	
    {
    	CurPage=$.cookie('CurPageS');
    }
    AjaxPage(CurPage);  
    
});
//分页方法  
function AjaxPage(CurPage) { 
    var programPath=$('#cxt').html();
    $.cookie('CurPageS', CurPage);
    //清空数据显示Table  
    $('#nList li').remove();  
    $('#MainContent_AspNetPager_Msg').html('<li class="disabled"><a href="javascript:void(0)" aria-label="First"><span aria-hidden="true">首页</span></a></li><li class="disabled"><a href="javascript:void(0)" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li><li><a href="javascript:void(0)">1</a></li><li class="disabled"><a href="javascript:void(0)" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li><li class="disabled"><a href="javascript:void(0)" aria-label="Last"><span aria-hidden="true">末页</span></a></li>');  
    $('#CurrentPage').html(CurPage);//页  
  
    var keyword = $.getUrlParam('keyword');
    //组合Json查询条件，查询分页数据 
    $.ajax({  
        type: 'POST',  
        url: programPath+"/search/news" ,  
        dataType: 'json',  
        data: {
        	"keyword":keyword,
        	"pageNum":CurPage
        },  
        success: function (data) {  
            //if (data == null) {
        	if (data["isnull"]== 1) {
                $('#nList').html("<li><h1>未找到相关新闻！</h1></li>");
                $('#MainContent_AspNetPager_Msg').remove();
                
            }  
            //else if (data != null) {
            else{
                //返回的数据为JSON字符串  
                if (eval(data["newsList"]).length != 0) {  
                    var str = '';  
                    for (var i = 0; i < eval(data["newsList"]).length; i++) {  
                    	var news=eval(data["newsList"]);
                    	news=news[i];
                    	var type="hangye";
                    	if (news["type"]==0) {type="hangye";}
                        else if (news["type"]==1) {type="zhengce";}
                        else if (news["type"]==2) {type="pintai";}
                        else if (news["type"]==3) {type="shuju";}
                        else if (news["type"]==4) {type="guandian";}
                        else if (news["type"]==5) {type="baoguang";}
                        else if (news["type"]==6) {type="licai";}
                        else if (news["type"]==7) {type="yanjiu";}
                        else if (news["type"]==8) {type="guowai";}
                    	str += "<li class='nList_li'><h4 class='black nList_title'><strong><a target='_blank' href=../news/"+type+"/"+news["nid"]+">"+news["title"]+"</a></strong></h4><p class='nList_time'>";
                    	if (news["author"]!="") str +="作者："+news["author"]+" ";
                    	else str +="作者：未知 ";
                    	str +="发布时间："+news["createDate"]+"</p>";
                    	if (news["abstracts"]!="") str +="<p class='gray nList_abstract'>摘要："+news["abstracts"]+"</p>";
                    	else str +="<p class='gray nList_abstract'></p>";
                    	str +="</li>";
                    } 
                    $('#nList').html(str);    
                    //最大页数  
                    maxpage = data["totalPage"];  
  
                    $('#MainContent_AspNetPager_Msg').html('');//分页链接 
                    if (maxpage>1){if (CurPage==1)
                    {
                    	var span = '<li class="disabled"><a href="javascript:void(0)" aria-label="First"><span aria-hidden="true">首页</span></a></li><li class="disabled"><a href="javascript:void(0)" aria-label="Previous" onclick="PageIndexClick(this)" id="PreviousPage"><span aria-hidden="true">&laquo;</span></a></li>';  
                    }
                    else 
                    {
                    	var span = '<li><a href="#" aria-label="First" onclick="PageIndexClick(this)" id="FirstPage"><span aria-hidden="true">首页</span></a></li><li><a href="javascript:void(0)" aria-label="Previous" onclick="PageIndexClick(this)" id="PreviousPage"><span aria-hidden="true">&laquo;</span></a></li>';  
                    }
                    var firstPage = 1;  
                    var pagecount = 0;//循环的次数  
                    if (maxpage > 10) 
                    {  
                        pagecount = 10;  
                        if (CurPage >= 10) { 
                        	
                        	if(CurPage<=(maxpage-2))
                        	{
                        		pagecount = CurPage+2;  
                                firstPage = CurPage - 7; 
                        	}
                        	else
                        	{
                        		pagecount = maxpage;
                        		firstPage = maxpage-9;
                        	}
                             
                        }  
                        for (var j = firstPage; j <= pagecount ; j++) {  
                            if (j == CurPage) {  
                                span += "<li class='active'><span>"+ j +"</span></li>" ;  ;  
                            } else {  
                                span += "<li><a href='javascript:void(0)' onclick='CurPageSizeClick(" + j + ",this)'>"+ j +"</a></li>" ;  
                            }  
                        } 
                        //if (maxpage > pagecount) {
                        //	span += "<li><a href='javascript:void(0)' onclick='CurPageSizeClick(" + pagecount + ",this)'>"+ pagecount +"</a></li>" ;  
                        //}  
                        if (CurPage==maxpage)
                        {
                        	span += "<li class='disabled'><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li class='disabled'><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
                        }
                        else
                        {
                        	span += "<li><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
                        }
                    } 
                    else 
                    {  
                        pagecount = maxpage;  
                        for (var j = firstPage; j <= pagecount ; j++) {  
                            if (j == CurPage) {  
                                span += "<li class='active'><span>"+ j +"</span></li>" ;  ;  
                            } else {  
                                span += "<li><a href='javascript:void(0)' onclick='CurPageSizeClick(" + j + ",this)'>"+ j +"</a></li>" ;  
                            }  
                        } 
                        if (CurPage==maxpage)
                        {
                        	span += "<li class='disabled'><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li class='disabled'><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
                        }
                        else
                        {
                        	span += "<li><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
                        }
                    } 
                    $('#MainContent_AspNetPager_Msg').html(span);  }
                }  
                else {  
                	$('#nList').html("<li><h1>未找到相关新闻！</h1></li>");
                    $('#MainContent_AspNetPager_Msg').remove();  
                }  
            }   
  
        }
    });  
} 
//首页、上一页、下一页、尾页点击  
function PageIndexClick(obj) {  
    //当前第几页 
    var CurrenPageSize = $.cookie('CurPageS'); 
    if (CurrenPageSize != '') {  
        CurrenPageSize = parseInt(CurrenPageSize);  
    }  
    //id  
    var type = $(obj).attr('id');  
    //首页  
    if (type == 'FirstPage') {  
        CurrenPageSize = 1;  
        AjaxPage(CurrenPageSize);   
    }  
        //上一页  
    else if (type == 'PreviousPage') {  
        if (CurrenPageSize > 1) {  
            CurrenPageSize = CurrenPageSize - 1;  
        } else {  
            CurrenPageSize = 1;  
        }  
        AjaxPage(CurrenPageSize);   
    }  
        //下一页  
    else if (type == 'NextPage') {  
        var size = CurrenPageSize + 1;  
        
        if (size <= maxpage) {  
            CurrenPageSize = CurrenPageSize + 1;
        }  
        AjaxPage(CurrenPageSize);  
    }  
        //尾页  
    else if (type == 'LastPage') {  
        CurrenPageSize = maxpage;  
        AjaxPage(CurrenPageSize);  
    }  
}  
  
//页数点击   
function CurPageSizeClick(CurPage, obj) {  
    AjaxPage(CurPage);  
} 