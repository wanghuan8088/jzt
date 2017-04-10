var maxpage;//全局变量  总页数  
var PageSize = 5;//全局变量 每页显示多少条数据
var CurPage = 1;
var type;
$(document).ready(function() {
	
	var a = $("#changename").text();
	if (a.indexOf("（")<=0)
		{
		$("#zhenname").text(a);
		
		
		}
	else{
		var name=a.split("（")[0]; 
		var beforename=a.split("（")[1];
		beforename = "（"+beforename;
		//alert(beforename);
		$("#beforename").text(beforename);
		$("#zhenname").text(name);
	}
	
});

$(document).ready(function() {
	$('#focus_product').hide();
	$('#focus_cancle').hide();
	type="hangye";
	AjaxNews(type,CurPage, PageSize); 
	var url = window.location.href;
	var reg=/pDetail\/(\d*)/;
	var pid = url.match(reg); 
	$.ajax( {  
        type : 'POST',  
        url : '../../user/isFocus',  
        data : {
      	  pId: pid[1]
		  },  
        dataType : 'json',  
        success : function(data) {  
      	  var state = data.state;
      	  if (state==0)
      	  {
      		  $('#focus_product').hide();
      		  $('#focus_cancle').show();
      	  }
      	  else
      	  {
      		  
      		  $('#focus_product').show();
      		  $('#focus_cancle').hide();
      	  }
        }
	});
	

	$('#focus_product').click(function () {
		  // do something...
		var url = window.location.href;
		var reg=/pDetail\/(\d*)/;
		var pid = url.match(reg); 

		$.ajax( {  
	          type : 'POST',  
	          url : '../../user/addFocusproduct',  
	          data : {
	        	  pId: pid[1]
			  },  
	          dataType : 'json',  
	          success : function(data) {  
	        	  var state = data.state;
	        	  if (state==0)
	        	  {
	        		  alert("关注成功！");
	        		  $('#focus_product').hide();
	        		  $('#focus_cancle').show();
	        		  window.location.reload();
	        	  }
	        	  else if (state==1)
	        	  {
	        		  alert("请登陆后再进行操作！");
	        		  window.location.reload();
	        	  }
	        	  else if (state==2)
	        	  {
	        		  alert("用户权限不足！");
	        		  window.location.reload();
	        	  }
	        	  else
	        	  {
	        		  alert("系统被玩坏了TAT");
	        	  }
	          }
		});
	});
	$('#focus_cancle').click(function () {
		  // do something...
		var url = window.location.href;
		var reg=/pDetail\/(\d*)/;
		var pid = url.match(reg); 

		
		$.ajax( {  
	          type : 'POST',  
	          url : '../../user/cancelFocusproduct',  
	          data : {
	        	  pId: pid[1]
			  },  
	          dataType : 'json',  
	          success : function(data) {  
	        	  var state = data.state;
	        	  if (state==0)
	        	  {
	        		  alert("关注取消成功！");
	        		  $('#focus_product').show();
	        		  $('#focus_cancle').hide();
	        		  window.location.reload();
	        	  }
	        	  else if (state==1)
	        	  {
	        		  alert("请重新登陆后再进行操作！");
	        		  window.location.reload();
	        	  }
	        	  else if (state==2)
	        	  {
	        		  alert("用户权限不足！");
	        		  window.location.reload();
	        	  }
	        	  else
	        	  {
	        		  alert("系统被玩坏了TAT");
	        	  }
	        	  
	          }
		});
	});
	AjaxTags();
});


function tab_switch(obj)
{
		type=$(obj).attr('id');
		CurPage = 1;
		AjaxNews(type,CurPage, PageSize);
}
 


function AjaxNews(type,CurPage, PageSize) { 
	var url = window.location.href;
	var index = url.lastIndexOf("/");
	var pid = url.substring(index + 1);
    //清空数据显示 
    $('#tabcontent li').remove();   
  
    var programPath=$('#cxt').html();
    //组合Json查询条件，查询分页数据 
    $.ajax({  
        type: 'POST',  
        url: programPath+"/news/productRelatedNews2" ,  
        dataType: 'json',  
        data: {
        	"pId":pid,
        	"fname":type,
        	"curPage":CurPage,
        	"pageSize":PageSize,
        },  
        success: function (data) {  
            if (data == null) {  
                $('#news_list').html("<li class='list-group-item'><h3>未找到相关新闻！</h3></li>");
                $('#MainContent_AspNetPager_Msg').html("");
            }  
            else if (data != null) {  
                //返回的数据为JSON字符串  
                if (eval(data["newsList"]).length != 0) {  
                    var str = '';  
                    for (var i = 0; i < eval(data["newsList"]).length; i++) {  
                    	var news=eval(data["newsList"]);
                    	news=news[i]; 
                    	if (news["abstracts"]!=null)
                    	{
                    			str+='<tr><td><div class="type-news-title">';
                    			if (news["polarity"]==1)
                                {
                    				str+='<span class="badge pull-left badge-color-pos">正向</span>';
                    			}
                    			else
                    			{
                    				str+='<span class="badge pull-left badge-color-neg">负向</span>';
                    			}
                    			str += '<h4 class="black news-abstracts" style="display: inline"><a href="../../news/'+news["pinyin"]+"/"+news["nid"]+'" target="_blank" title="'+news["title"]+'">'+news["title"]+'</a></h4><p class="gray type-news-abstracts news-abstracts" >'+news["abstracts"]+'</p></div></tr></td>';
                    	}
                    	else
                    	{
                    			str+='<tr><td><div class="type-news-title">';
                    			if (news["polarity"]==1)
                                {
                    				str+='<span class="badge pull-left badge-color-pos">正向</span>';
                    			}
                    			else
                    			{
                    				str+='<span class="badge pull-left badge-color-neg">负向</span>';
                    			}
                    			str += '<h4 class="black news-abstracts" style="display: inline"><a href="../../news/'+news["pinyin"]+"/"+news["nid"]+'" target="_blank" title="'+news["title"]+'">'+news["title"]+'</a></h4><p class="gray type-news-abstracts news-abstracts" ></p></div></tr></td>';
                    	}
                    }  
                    $('#news_list').html(str);  
                  //最大页数  
                    maxpage = data["totalPages"];  
  
                    $('#MainContent_AspNetPager_Msg').html('');//分页链接
                    if (maxpage>1){
                    if (CurPage==1)
                    {
                    	var span = '<li class="disabled"><a href="javascript:void(0)" aria-label="First"><span aria-hidden="true">首页</span></a></li><li class="disabled"><a href="javascript:void(0)" aria-label="Previous" onclick="PageIndexClick(this)" id="PreviousPage"><span aria-hidden="true">&laquo;</span></a></li>';  
                    }
                    else 
                    {
                    	var span = '<li><a href="#" aria-label="First" onclick="PageIndexClick(this)" id="FirstPage"><span aria-hidden="true">首页</span></a></li><li><a href="javascript:void(0)" aria-label="Previous" onclick="PageIndexClick(this)" id="PreviousPage"><span aria-hidden="true">&laquo;</span></a></li>';  
                    }
                    var firstPage = 1;  
                    var pagecount = 0;//循环的次数  
                    if (maxpage > 10) {  
                        pagecount = 10;  
                        if (CurPage >= 10) {  
                            pagecount = CurPage+2;  
                            var firstPage = CurPage - 7;  
                           
                        }  
                        if(pagecount>maxpage){
	                		 pagecount =maxpage;
	                	 }
                        for (var j = firstPage; j <= pagecount ; j++) {  
                            if (j == CurPage) {  
                                span += "<li class='active'><span>"+ j +"</span></li>" ;  ;  
                            } else {  
                                span += "<li><a href='javascript:void(0)' onclick='CurPageSizeClick(" + j + ",this)'>"+ j +"</a></li>" ;  
                            }  
                        } 
//                        if (maxpage > pagecount) {
//                        	span += "<li><a href='javascript:void(0)' onclick='CurPageSizeClick(" + pagecount + ",this)'>"+ pagecount +"</a></li>" ;  
//                        }  
                        if (CurPage==maxpage)
                        {
                        	span += "<li class='disabled'><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li class='disabled'><a href='javascript:void(0)' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
                        }
                        else
                        {
                        	span += "<li><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li><a href='javascript:void(0)' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
                        }
                    } else {  
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
                        	span += "<li class='disabled'><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li class='disabled'><a href='javascript:void(0)' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
                        }
                        else
                        {
                        	span += "<li><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li><a href='javascript:void(0)' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
                        }
                    }  
                    
                    
                    $('#MainContent_AspNetPager_Msg').html(span); }

                }  
                else {  
                	$('#news_list').html("<li class='list-group-item'><h3>未找到相关新闻！</h3></li>");
                	$('#MainContent_AspNetPager_Msg').html("");

                }  
            }   
  
        }
    });  
} 

function AjaxTags() { 

    var programPath=$('#cxt').html();
    //组合Json查询条件，查询分页数据 
    $.ajax({  
        type: 'POST',  
        url: programPath+"/news/tags" ,  
        dataType: 'json',  
        data: {},  
        success: function (data) {  
                //返回的数据为JSON字符串  
                if (eval(data["ftags"]).length != 0) {  
                	var str = '';
                	var ftags=eval(data["ftags"]);
                    for (var i = 0; i < eval(data["ftags"]).length; i++) {  
                    	if(i == 0) {
                    		str += '<li  class="active news-type" role="presentation"><a href="javascript:void(0)" id="'+ftags[i]+'" onclick="tab_switch(this)" aria-controls="'+ftags[i]+'" role="tab" data-toggle="tab">'+ftags[i]+'</a></li>';
                    	} else {
                    		str += '<li  class="news-type" role="presentation"><a href="javascript:void(0)" id="'+ftags[i]+'" onclick="tab_switch(this)" aria-controls="'+ftags[i]+'" role="tab" data-toggle="tab">'+ftags[i]+'</a></li>';
                    	}
                    }  
                    $('#tab_father').html(str);    
                }  
                AjaxNews(ftags[0],1,PageSize);
        }
    });  
} 

//首页、上一页、下一页、尾页点击  
function PageIndexClick(obj) {  
    //id  
    var actiontype = $(obj).attr('id');  
    //首页  
    if (actiontype == 'FirstPage') {  
    	CurPage = 1;  
        AjaxNews(type,CurPage, PageSize); 
    }  
        //上一页  
    else if (actiontype == 'PreviousPage') {  
        if (CurPage > 1) {  
        	CurPage = CurPage - 1;  
        } else {  
        	CurPage = 1;  
        }  
        AjaxNews(type,CurPage, PageSize);
    }  
        //下一页  
    else if (actiontype == 'NextPage') {  
        var size = CurPage + 1;  
        
        if (size <= maxpage) {  
        	CurPage = CurPage + 1; 
        }  
        AjaxNews(type,CurPage, PageSize);
    }  
        //尾页  
    else if (actiontype == 'LastPage') {  
    	CurPage = maxpage;  
        AjaxNews(type,CurPage, PageSize);
    }  
}  
  
//页数点击   
function CurPageSizeClick(CurPage, obj) {  
	AjaxNews(type,CurPage, PageSize); 
}  
