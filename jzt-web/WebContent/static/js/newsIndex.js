 var type="hangye";
    $(document).ready(function() { 
    	
    	AjaxHotNews();
    	AjaxTags();
    });
function tab_switch(obj)
{
		type=$(obj).attr('id');
		AjaxNews(type);
}
 


function AjaxHotNews() { 

    //清空数据显示 
    $('#hot_news li').remove();   
  
    var programPath=$('#cxt').html();
    //组合Json查询条件，查询分页数据 
    $.ajax({  
        type: 'POST',  
        url: programPath+"/news/hot" ,  
        dataType: 'json',  
        data: {},  
        success: function (data) {  
            if (data == null) {  
                $('#hot_news').html("<li class='list-group-item'><h3>未找到相关新闻！</h3></li>");
  
            }  
            else if (data != null) {  
                //返回的数据为JSON字符串  
                if (eval(data["list"]).length != 0) {  
                    var str = '';  
                    for (var i = 0; i < eval(data["list"]).length; i++) {  
                    	var news=eval(data["list"]);
                    	news=news[i]; 
                        str += '<li class="list-group-item"><span class="badge pull-left badge-color-hot" style= "margin-right: 5px;">热门</span>';
//                        if (news["polarity"]==1)
//                        {
//                        	str +='<span class="badge pull-left badge-color-pos">正向</span><p class="black index-hot"><a href="/news/'+news["pinyin"]+"/"+news["nid"]+'" target="_blank" title="'+news["title"]+'">'+news["title"]+'</a></p></li>';
//                        }
//                        else
//                        {
//                        	str +='<span class="badge pull-left badge-color-neg">负向</span><p class="black index-hot"><a href="/news/'+news["pinyin"]+"/"+news["nid"]+'" target="_blank" title="'+news["title"]+'">'+news["title"]+'</a></p></li>';
//                        }
                        str +='<p class="black index-hot"><a href="/news/'+news["pinyin"]+"/"+news["nid"]+'" target="_blank" title="'+news["title"]+'">'+news["title"]+'</a></p></li>';
                    }  
                    $('#hot_news').html(str);    

                }  
                else {  
                	$('#hot_news').html("<li class='list-group-item'><h3>未找到相关新闻！</h3></li>");
                }  
            }   
  
        }
    });  
} 



function AjaxTags() { 

    var programPath=$('#cxt').html();
    var firstPinyin=new Array();
    //组合Json查询条件，查询分页数据 
    $.ajax({  
        type: 'POST',  
        url: programPath+"/news/tags" ,  
        dataType: 'json',  
        data: {},  
        success: function (data) {  
                //返回的数据为JSON字符串  
                if (eval(data["tags"]).length != 0) {  
                	var str = '';
                	var tmp = '';
                	var count = 0;
                    for (var i = 0; i < eval(data["tags"]).length ; i++) {  
                    	var tags=eval(data["tags"]);
                    	if(i == 0) {
                    		tmp = tags[i]["fatherName"];
                    		firstPinyin[count] = tags[i];
                    		
                    		str += '<div class="col-md-6 all_padding_left">'+
                			'<div class="partTit_01" id="blk_gntltop_01" data-sudaclick="gn2_tb">'+
		          		      '<div class="pT_name">'+
		          		      	'<span class="titName ptn_26">'+tags[i]["fatherName"]+'</span>'+
		          		      '</div>'+
		          		      '<div class="pT_more">';
                    	}
                    	if(tmp == tags[i]["fatherName"]) {
                    		str +='<a href="javascript:void(0);" onclick="AjaxNewsById('+count+','+tags[i]["id"]+',\''+tags[i]["pinyin"]+'\',\''+tags[i]["name"]+'\')" target="_blank">'+tags[i]["name"]+'</a> | ';
                    	} else {
                    		tmp = tags[i]["fatherName"]
                    		str +='</div>'+
				          		    '</div>'+
				          		    '<div id="father_'+(count++)+'">'+
				          			'</div>'+
				          	    '</div>';
                    		
                    		firstPinyin[count] = tags[i];
                    		if(count%2==0){
                    			str += '<div class="col-md-6 all_padding_left">'+
                    			'<div class="partTit_01" id="blk_gntltop_01" data-sudaclick="gn2_tb">'+
    		          		      '<div class="pT_name">'+
    		          		      	'<span class="titName ptn_26">'+tags[i]["fatherName"]+'</span>'+
    		          		      '</div>'+
    		          		      '<div class="pT_more">'+
    		          		      	'<a href="javascript:void(0);" onclick="AjaxNewsById('+count+','+tags[i]["id"]+',\''+tags[i]["pinyin"]+'\',\''+tags[i]["name"]+'\')" target="_blank">'+tags[i]["name"]+'</a> | ';
                    	
                    			}
                    		else{
                    			str += '<div class="col-md-6 all_padding_right">'+
                    			'<div class="partTit_01" id="blk_gntltop_01" data-sudaclick="gn2_tb">'+
    		          		      '<div class="pT_name">'+
    		          		      	'<span class="titName ptn_26">'+tags[i]["fatherName"]+'</span>'+
    		          		      '</div>'+
    		          		      '<div class="pT_more">'+
    		          		      	'<a href="javascript:void(0);" onclick="AjaxNewsById('+count+','+tags[i]["id"]+',\''+tags[i]["pinyin"]+'\',\''+tags[i]["name"]+'\')" target="_blank">'+tags[i]["name"]+'</a> | ';
                    	
                    			}
                    		}
                    }  
                    str +='</div>'+
		          		    '</div>'+
		          		    '<div id="father_'+(count++)+'">'+
		          			'</div>'+
		          	    '</div>';
                    $('#cataNews').html(str);    
                }  
                else {  
                	$('#cataNews').html("<li class='list-group-item'><h3>未找到相关新闻！</h3></li>");
                }  
  
                for(var i=0;i<firstPinyin.length;i++) {
                	AjaxNewsById(i,firstPinyin[i]["id"],firstPinyin[i]["pinyin"],firstPinyin[i]["name"]);
                }
        }
    });  
} 

function AjaxNewsById(count,tId,pinyin,name) { 
	
    var programPath=$('#cxt').html();
    //组合Json查询条件，查询分页数据 
    $.ajax({  
    	type: 'POST',  
        url: programPath+"/news/newsAjax" ,  
        dataType: 'json',  
        data: {
        	"tId":tId,
        	"curPage":1,
        	"pageSize":5,
        },  
        success: function (data) {  
                //返回的数据为JSON字符串  
                if (eval(data["newsList"]).length != 0) {  
                	var str = '';
                	str += '<div class="Tit_06" id="blk_ndxwup_01">'+
		               		'<div class="t_name"><a href="./'+pinyin+'" target="_blank">'+name+'</a></div>'+
		      		    '</div>'+
		      		    '<table class="table">'+
		      			   '<tbody>';
                	
                	for (var i = 0; i < eval(data["newsList"]).length; i++) {  
                    	var news=eval(data["newsList"]);
                    	news=news[i]; 
                    	if (news["abstracts"]!=null)
                    	{
                    			str+='<tr><td><div class="type-news-title">';
//                    			if (news["polarity"]==1)
//                                {
//                    				str+='<span class="badge pull-left badge-color-pos">正向</span>';
//                    			}
//                    			else
//                    			{
//                    				str+='<span class="badge pull-left badge-color-neg">负向</span>';
//                    			}
                    			str += '<h4 class="black news-title" style="display: inline"><a href="./'+pinyin+"/"+news["nid"]+'" target="_blank" title="'+news["title"]+'">'+news["title"]+'</a></h4><p class="gray type-news-abstracts news-abstracts" >'+news["abstracts"]+'</p></div></tr></td>';
                    	}
                    	else
                    	{
                    			str+='<tr><td><div class="type-news-title">';
//                    			if (news["polarity"]==1)
//                                {
//                    				str+='<span class="badge pull-left badge-color-pos">正向</span>';
//                    			}
//                    			else
//                    			{
//                    				str+='<span class="badge pull-left badge-color-neg">负向</span>';
//                    			}
                    			
                    			str += '<h4 class="black news-title" style="display: inline"><a href="./'+pinyin+"/"+news["nid"]+'" target="_blank" title="'+news["title"]+'">'+news["title"]+'</a></h4><p class="gray type-news-abstracts news-abstracts">曝光台新闻全部来源于民间证据采集</p></div></tr></td>';
                    	}
                    }  
                	str += '</tbody>'+
		      			'</table>';
                    $('#father_'+count).html(str);    
                }  
                else {  
                	$('#father_'+count).html("<li class='list-group-item'><h3>未找到相关新闻！</h3></li>");
                }  
  
        }
    });  
} 

