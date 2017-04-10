$(document).ready(function() {
    //清空数据显示 
    $('#newsRank li').remove();   
    
    var programPath=$('#cxt').html();

    //组合Json查询条件，查询分页数据 
    $.ajax({  
        type: 'POST',  
        url: programPath+"/news/ranking" ,  
        dataType: 'json',  
        data: {},  
        success: function (data) {  
            if (data == null) {  
                $('#newsRank').html("<li class='list-group-item'>缺少数据</li>");
  
            }  
            else if (data != null) {  
                //返回的数据为JSON字符串  
                if (eval(data["list"]).length != 0) {  
                    var str = '';  
                    for (var i = 0; i < eval(data["list"]).length; i++) {  
                    	var news=eval(data["list"]);
                    	news=news[i]; 
                    	
                        str += '<li class="list-group-item"><span class="badge pull-left badge-color-hot" style= "margin-right: 5px;">'+(parseInt(i)+1)+'</span>';

//                        if (news["polarity"]==1)
//                        {
//                        	str +='<span class="badge pull-left badge-color-pos">正向</span>';
//                        }
//                        else
//                        {
//                        	str +='<span class="badge pull-left badge-color-neg">负向</span>';
//                        }
                        str+='<p class=" black index-hot"><a href="/news/'+news["pinyin"]+"/"+news["nid"]+'" target="_blank" title="'+news["title"]+'">'+news["title"]+'</a></p>';
                        
                    }  
                    $('#newsRank').html(str);    

                }  
                else {  
                	$('#newsRank').html("<li class='list-group-item'><h3>未找到相关新闻！</h3></li>");
                }  
            }   
  
        }
    });  
    
});