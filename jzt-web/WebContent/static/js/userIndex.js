

function tab_switch(obj)
{
		var fname=$(obj).attr('id');
		AjaxNews(fname);
}

$(document).ready(function() {
	$('.focus_product').hide();
	$('.focus_cancle').show();
	
	AjaxTags();
});



function focus_product(obj){
	  // do something...
	var pid=$(obj).parent().parent().find('.pId').html();
	$.ajax( {  
        type : 'POST',  
        url : '../user/addFocusproduct',  
        data : {
      	  pId: pid
		  },  
        dataType : 'json',  
        success : function(data) {  
      	  var state = data.state;
      	  if (state==0)
      	  {
      		  alert("关注成功！");
      		  $(obj).parent().find('.focus_product').hide();
      		  $(obj).parent().find('.focus_cancle').show();
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
}
function focus_cancle(obj)
{
	  // do something...
	var pid=$(obj).parent().parent().find('.pId').html();

	
	$.ajax( {  
        type : 'POST',  
        url : '../user/cancelFocusproduct',  
        data : {
      	  pId: pid
		  },  
        dataType : 'json',  
        success : function(data) {  
      	  var state = data.state;
      	  if (state==0)
      	  {
      		  alert("关注取消成功！");
      		  $(obj).parent().find('.focus_product').show();
    		  $(obj).parent().find('.focus_cancle').hide();
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
}



function AjaxNews(fname) { 

    //清空数据显示 
    $('#tabcontent li').remove();   
  
    var programPath=$('#cxt').html();
    //组合Json查询条件，查询分页数据 
    $.ajax({  
        type: 'POST',  
        url: programPath+"/news/userRelatedNews2" ,  
        dataType: 'json',  
        data: {
        	"fname":fname,
        	"curPage":1,
        	"pageSize":10,
        },  
        success: function (data) {  
        	data=data["reList"];
            if (data == null) {  
                $('#news_list').html("<li class='list-group-item'><h3>未找到相关新闻！</h3></li>");
            }  
            else if (data != null) {  
                //返回的数据为JSON字符串  
                if (eval(data).length != 0) {  
                    var str = '';  
                    for (var i = 0; i < eval(data).length; i++) {  
                    	var news=eval(data);
                    	news=news[i]; 
                    	if (news["abstracts"]!=null)
                    	{
                    		str += '<li class="list-group-item " ><div class="row"><div class="type-news-title">';
                    		if (news["polarity"]==1)
                            {
                				str+='<span class="badge pull-left badge-color-pos">正向</span>';
                			}
                			else
                			{
                				str+='<span class="badge pull-left badge-color-neg">负向</span>';
                			}
                    		str += '<h4 class="black" style="display: inline"><a href="../news/'+news["pinyin"]+"/"+news["nid"]+'" target="_blank" title="'+news["title"]+'">'+news["title"]+'</a></h4><p class="gray type-news-abstracts" >'+news["abstracts"]+'</p></div></div></li>';
                    	}
                    	else
                    	{
                    		str+='<li class="list-group-item " ><div class="row"><div class="type-news-title">';
                    		if (news["polarity"]==1)
                            {
                				str+='<span class="badge pull-left badge-color-pos">正向</span>';
                			}
                			else
                			{
                				str+='<span class="badge pull-left badge-color-neg">负向</span>';
                			}
                    		str += '<h4 class="black" style="display: inline"><a href="../news/'+news["pinyin"]+"/"+news["nid"]+'" target="_blank" title="'+news["title"]+'">'+news["title"]+'</a></h4></div></div></li>';
                    	}
                    }  
                    $('#news_list').html(str);    
                }  
                else {  
                	$('#news_list').html("<li class='list-group-item'>暂无相关新闻</li>");
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
                AjaxNews(ftags[0]);
        }
    });  
} 
