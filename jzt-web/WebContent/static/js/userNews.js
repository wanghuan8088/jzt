 
var stop=true;//触发开关，防止多次调用事件 
var type="hangye";

function tab_switch(obj)
{
		type=$(obj).attr('id');
		AjaxNews(type);
		stop=true;
}
$(document).ready(function() {

	AjaxTags();
	
});
function AjaxNews(type) { 

    //清空数据显示 
    $('#news_list li').remove();   
  
    var programPath=$('#cxt').html();
    //组合Json查询条件，查询分页数据 
    $.ajax({  
        type: 'POST',  
        url: programPath+"/news/userRelatedNews2" ,  
        dataType: 'json',  
        data: {
        	"fname":type,
        	"curPage":1,
        	"pageSize":10,
        },  
        success: function (data) {  
        	data=data["reList"];
            if (data == null) {  
                $('#news_list').html("<li class='list-group-item'><h3>未找到相关新闻！</h3></li>");
                stop=false;
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
                    		str += '<li class="list-group-item " ><div class="row"><div class="type-news-title">';
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
                	stop=false;
                }  
            }   
  
        }
    });  
} 

$(window).scroll(function() {    
	var programPath=$('#cxt').html();
      //当内容滚动到底部时加载新的内容 100当距离最底部100个像素时开始加载.  
      if ($(this).scrollTop() + $(window).height() + 200 >= $(document).height() && $(this).scrollTop() > 200) {    
            
          if(stop==true){  
              stop=false;  
              var p=$("#page").html(); 
              p=parseInt(p)+1;//当前要加载的页码    
               //加载提示信息  
               $("#news_list").append("<li class='ajaxtips list-group-item '>Loding.....</li>");  
               $.ajax({  
                   type: 'POST',  
                   url: programPath+"/news/userRelatedNews2" ,  
                   dataType: 'json',  
                   data: {
                   	"fname":type,
                   	"curPage":p,
                   	"pageSize":10,
                   }, 
                   fail:function(data)
                   {
                	   $(".ajaxtips").hide(); 
                	   stop=true;
                   },
                   success: function (data) {  
                	   data=data["reList"];
                       if (data == null) {  
                    	   $('#news_list').append("<li class='list-group-item'>已经到底部</li>");
                           $(".ajaxtips").hide();  
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
                            		str += '<li class="list-group-item " ><div class="row"><div class="type-news-title"><span class="badge pull-left badge-color-neg">负向</span><h4 class="black" style="display: inline"><a href="../../news/'+news["pingyin"]+"/"+news["nid"]+'" target="_blank" title="'+news["title"]+'">'+news["title"]+'</a></h4><p class="gray type-news-abstracts" >'+news["abstracts"]+'</p></div></div></li>';
                            	}
                            	else
                            	{
                            		str += '<li class="list-group-item " ><div class="row"><div class="type-news-title"><span class="badge pull-left badge-color-neg">负向</span><h4 class="black" style="display: inline"><a href="../../news/'+news["pingyin"]+"/"+news["nid"]+'" target="_blank" title="'+news["title"]+'">'+news["title"]+'</a></h4></div></div></li>';
                            	}
                               }  
                               $(".ajaxtips").hide();  
                               $('#news_list').append(str);  
                               $("#page").html(p);
                               stop=true;

                           }  
                           else {  
                        	$(".ajaxtips").hide();  
                           	$('#news_list').append("<li class='list-group-item'>已经到底部</li>");
                           }  
                       }   
             
                   }
               });  
         }  
      }    
  });   

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