var field=['发展指数','流动性','成交量','营收','收益','分散度','品牌','人气','透明度','杠杆'];
var globalCount=0; 
var oldTTab="#ttab1";
var oldTab="#tab1";
$(document).ready(function() {
	getCarousel();
	getHangqing();
	getTopData();
	AjaxHotNews();
	Ajaxexpourse();
	AjaxRecentNews();
	getTuiGuang();
	Ajaxreport();
});

function getCarousel() { 
  
    var programPath=$('#cxt').html();
    //组合Json查询条件，查询分页数据 
    $.ajax({  
        type: 'POST',  
        url: programPath+"/adver/indexCarousel" ,  
        dataType: 'json',  
        data: {type: 0},  
        success: function (data) {  
            //返回的数据为JSON字符串  
        	var carList = data.carList;
	  		var carousel='<div class="item active">'+
			         '<img src="'+carList[0].imgPath+'" alt="First slide" class="bg-img"/>'+
			         '<div class="carousel-caption">'+carList[0].title+'</div>'+
			      '</div>'+
			      '<div class="item">'+
			         '<img src="'+carList[1].imgPath+'" alt="Second slide" class="bg-img"/>'+
			         '<div class="carousel-caption">'+carList[1].title+'</div>'+
			      '</div>'+
			      '<div class="item">'+
			         '<img src="'+carList[2].imgPath+'" alt="Third slide" class="bg-img"/>'+
			         '<div class="carousel-caption">'+carList[2].title+'</div>'+
			      '</div>';
//			      '<div class="item">'+
//			         '<img src="'+carList[3].imgPath+'" alt="Forth slide" class="bg-img"/>'+
//			         '<div class="carousel-caption">'+carList[3].title+'</div>'+
//			      '</div>';
	      	$('#carousel').html(carousel);
        }
    });  
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
                $('#hot_news').html("<li class='list-group-item1'><h3>未找到相关新闻！</h1></l3>");
  
            }  
            else if (data != null) {  
                //返回的数据为JSON字符串  
                if (eval(data["list"]).length != 0) {  
                    var str = '';  
                    var datehot;
                    for (var i = 0; i < eval(data["list"]).length; i++) {  
                    	var news=eval(data["list"]);
                    	news=news[i]; 
                    	datehot=news["createDate"].substr(0, 10);
                    	str+='<li class="list-group-item1">';
//                    	if (news["polarity"]==1)
//                        {
//            				str+='<span class="badge pull-left badge-color-pos">正</span>';
//            			}
//            			else
//            			{
//            				str+='<span class="badge pull-left badge-color-neg">负</span>';
//            			}
                    	str += '<p class="black type-tag news-row" style="margin-bottom: 0px;width:250px;"><a style="display:inline" href="../news/'+news["pinyin"]+"/"+news["nid"]+'" target="_blank" title="'+news["title"]+'">'+news["title"];
                    	str += '</a></p><span style="float:right;display:inline">'+datehot+'</span></li>';
                        
                    }  
                    $('#hot_news').html(str);    

                }  
                else {  
                	$('#hot_news').html("<li class='list-group-item1'><h3>未找到相关新闻！</h3></li>");
                }  
            }   
  
        }
    });  
} 

function Ajaxexpourse() { 

    //清空数据显示 
    $('#exposurenext li').remove();   
  
    var programPath=$('#cxt').html();
    //组合Json查询条件，查询分页数据 
    $.ajax({  
        type: 'POST',  
        url: programPath+"/visual/exposures" ,  
        dataType: 'json',  
        data: {},  
        success: function (data) {  
            if (data == null) {  
                $('#exposurenext').html("<li class='list-group-item'><h3>未找到相关曝光！</h1></l3>");
  
            }  
            else if (data != null) {  
                //返回的数据为JSON字符串  
                if (eval(data["exposures_list"]).length != 0) {  
                    var str = '';  
 //                   alert(eval(data["exposures_list"]).length);
                    for (var i = 0; i < 5; i++) {  
                    	var news=eval(data["exposures_list"]);
                    	news=news[i]; 
                    	
                    	str+='<li class="list-group-item">';
                    	
                    	str += '<p class="black type-tag news-row" style="margin-bottom: 0px;"><a  href="../exposure/detail?eid='+news["eid"]+'" target="_blank" title="'+news["title"]+'">'+news["title"]+'</a></p></li>';
                        
                    }  
                    $('#exposurenext').html(str);    

                }  
                else {  
                	$('#exposurenext').html("<li class='list-group-item'><h3>未找到相关曝光！</h3></li>");
                }  
            }   
  
        }
    });  
} 

function Ajaxreport() { 

    //清空数据显示 
	
    $('#exposurenext li').remove();   
  
    var programPath=$('#cxt').html();
    //组合Json查询条件，查询分页数据 
    $.ajax({  
        type: 'POST',  
        url: programPath+"/visual/reports" ,  
        dataType: 'json',  
        data: {},  
        success: function (data) {  
            if (data == null) {  
                $('#platreport').html("<li class='list-group-item'><h3>未找到相关报告</h1></l3>");
  
            }  
            else if (data != null) {  
                //返回的数据为JSON字符串  
                if (eval(data["reports_list"]).length != 0) {  
                    var str = '';  
                    var datehot;
                    for (var i = 0; i < 5; i++) {  
                    	var news=eval(data["reports_list"]);
                    	news=news[i]; 
                    	d = new Date(news["createTime"]);
                    	datehot = d.getFullYear() + "-"
								+ ("0" + (d.getMonth() + 1)).slice(-2)
								+ "-" + ("0" + d.getDate()).slice(-2);
                    	//datehot=news["createTime"].substr(0, 9);
                    	str+='<li class="list-group-item1" style="padding-right:2px;">';
                    	
                    	str += '<p class="black type-tag news-row" style="margin-bottom: 0px;width:250px;"><a  href="../report/newReport?id='+news["id"]+'" target="_blank" title="'+news["title"]+'">'+news["title"];
                    	str += '</a></p><span style="float:right;display:inline">'+datehot+'</span></li>';
                        
                    }  
                    $('#platreport').html(str);    

                }  
                else {  
                	$('#platreport').html("<li class='list-group-item'><h3>未找到相关报告！</h3></li>");
                }  
            }   
  
        }
    });  
} 



function AjaxRecentNews() { 
  
    var programPath=$('#cxt').html();
    //组合Json查询条件，查询分页数据 
    $.ajax({  
        type: 'POST',  
        url: programPath+"/news/recentFive" ,  
        dataType: 'json',  
        data: {},  
        success: function (data) {  
            if (data == null) {  
                $('#new_news').html("<li class='list-group-item1'><h3>未找到相关新闻！</h1></l3>");
  
            }  
            else if (data != null) {  
            	data=data["newsList"];
                //返回的数据为JSON字符串  
                if (eval(data).length != 0) {  
                    var str = '';  
                    var datehot;
                    for (var i = 0; i < eval(data).length; i++) {  
                    	var news=eval(data);
                    	news=news[i]; 
                    	datehot=news["createDate"].substr(0, 10);
                    	str+='<li class="list-group-item1" style="width:400px;">';
//                    	if (news["polarity"]==1)
//                        {
//            				str+='<span class="badge pull-left badge-color-pos">正</span>';
//            			}
//            			else
//            			{
//            				str+='<span class="badge pull-left badge-color-neg">负</span>';
//            			}
                        str += '<p class="black type-tag news-row" style="margin-bottom: 0px;width:280px;"><a href="../news/'+news["pinyin"]+"/"+news["nid"]+'" target="_blank" title="'+news["title"]+'">'+news["title"];
                        str += '</a></p><span style="float:right;display:inline">'+datehot+'</span></li>';
                    }  
                    $('#new_news').html(str);    

                }  
                else {  
                	$('#hot_news').html("<li class='list-group-item1'><h3>未找到相关新闻！</h3></li>");
                }  
            }   
  
        }
    });  
} 
function getTopData()
{
	var programPath=$('#cxt').html();
	$.ajax({  
          type : 'POST',  
          url : '../eval/top10',  
          data : {
        	  //sortData: sortData,
		  },  
          dataType : 'json',  
          success : function(data) {   
        	  var state = data.state;
        	  if(state==0)
        	  {
        		  var thead="<th class='text-center'>排名</th>"+"<th class='text-center'>产品名称</th>";
        		  for(var i=0;i<field.length;i++)
        		  {
        			  if(i==0)
        				  thead+="<th class='text-center'>"+field[i]+"<img src='"+programPath+"/static/image/down.png' class='arrow-down'></th>";
        			  else
        				  thead+="<th class='text-center'><span>"+field[i]+"</span></th>";
        		  }
        		  $('#thead').html("");
        		  $('#thead').append(thead);
        		  var count=0;
        		  var evalList = data.evalList;
        		  var tbody="";
            	  while(count<evalList.length)
            	  {
            		  count++;
            		  tbody+="<tr>"+
				         "<td>"+count+"</td>"+
				         "<td><a href='"+evalList[count-1].webUrl+"'>"+evalList[count-1].pName+"</a></td>";
            		  tbody+="<td class='syn-font'>"+evalList[count-1].developmentRate+"</td>";
            		  if(evalList[count-1].mobility==null) tbody+="<td>"+"-"+"</td>";
            		  else tbody+="<td>"+evalList[count-1].mobility+"</td>";
            		  
            		  if(evalList[count-1].turnover==null) tbody+="<td>"+"-"+"</td>";
            		  else tbody+="<td>"+evalList[count-1].turnover+"</td>";
            		
	            		if(evalList[count-1].benefit==null) tbody+="<td>"+"-"+"</td>";
	                	else tbody+="<td>"+evalList[count-1].benefit+"</td>";
	                		
	                	if(evalList[count-1].revenue==null) tbody+="<td>"+"-"+"</td>";
	                    else  tbody+="<td>"+evalList[count-1].revenue+"</td>";
	                    	
	                    if(evalList[count-1].dispersion==null) tbody+="<td>"+"-"+"</td>";
	                    else  tbody+="<td>"+evalList[count-1].dispersion+"</td>";
            		  
	                   if(evalList[count-1].brand==null) tbody+="<td>"+"-"+"</td>";
		                else tbody+="<td>"+evalList[count-1].brand+"</td>";
		                	
		                if(evalList[count-1].popularity==null) tbody+="<td>"+"-"+"</td>";
			             else  tbody+="<td>"+evalList[count-1].popularity+"</td>";
		            		  
			           if(evalList[count-1].transparency==null) tbody+="<td>"+"-"+"</td>";
				        else tbody+="<td>"+evalList[count-1].transparency+"</td>";
			            		    
				      if(evalList[count-1].lever==null) tbody+="<td>"+"-"+"</td>";
		             else tbody+="<td>"+evalList[count-1].lever+"</td>";
		            		
            	
            	  }
            	  $('#tbody').html("");
            	  $('#tbody').append(tbody);
        	  }
          }
	});
}

function getHangqing()
{
	var programPath=$('#cxt').html();
	$.ajax({  
          type : 'POST',  
          url : '../product/hot',  
          data : {},  
          dataType : 'json',  
          success : function(data) {  
    		  var tab="";
    		  var tabContent="";
    		  var hList=data.hotList;
    		  for(var i=0;i<hList.length;i++)
    		  {
    			  if(i==0)
    				  tab+='<li class="active" id="ttab'+(i+1)+'"><a href="#tab'+(i+1)+'" data-toggle="tab" onmouseover="mouseOn('+(i+1)+')" onclick="mouseToClick('+hList[i][0]+')">'+hList[i][1]+'</a></li>';
    			  else
    				  tab+='<li id="ttab'+(i+1)+'"><a href="#tab'+(i+1)+'" data-toggle="tab" onmouseover="mouseOn('+(i+1)+')" onclick="mouseToClick('+hList[i][0]+')">'+hList[i][1]+'</a></li>';
    		  }
    		  $('#myTab').html(tab);
    		  for(var i=0;i<hList.length;i++)
    		  {
    			  if(i==0)
    				  tabContent+='<div class="tab-pane fade in active" id="tab'+(i+1)+'">'+
						 	'<div id="trend_mix'+(i+1)+'1" class="chart-pannel2" style="margin-top:29px"></div>'+
						 	'<div id="trend_mix'+(i+1)+'2" class="chart-pannel3" style="margin-bottom:29px"></div>'+
						  	'<script name="mixScript" src="'+programPath+'/static/js/chart/view/trend_mix.js?trend_mix'+(i+1)+'?'+hList[i][0]+'" type="text/javascript"></script></div>';
    			  else
    				  tabContent+='<div class="tab-pane fade" id="tab'+(i+1)+'">'+
						 	'<div id="trend_mix'+(i+1)+'1" class="chart-pannel2" style="margin-top:29px"></div>'+
						 	'<div id="trend_mix'+(i+1)+'2" class="chart-pannel3" style="margin-bottom:29px"></div>'+
						  	'<script name="mixScript" src="'+programPath+'/static/js/chart/view/trend_mix.js?trend_mix'+(i+1)+'?'+hList[i][0]+'" type="text/javascript"></script></div>';
    		  }
    		  $('#myTabContent').html(tabContent);
          }
	});
}

function mouseOn(i)
{
	$(oldTTab).removeClass("active");
    $("#ttab"+i).addClass("active");
    oldTTab="#ttab"+i;
    $(oldTab).removeClass("in active");
    $("#tab"+i).addClass("in active");
    oldTab="#tab"+i;
}

function mouseToClick(pid)
{
	var programPath=$('#cxt').html();
	window.location.href=programPath+"/product/pData/"+pid; 
}

function getTuiGuang()
{
	var programPath=$('#cxt').html();
	$.ajax({  
          type : 'POST',  
          url : '../product/tuiguang',  
          data : {},  
          dataType : 'json',  
          success : function(data) {  
    		  var tuiguang="";
    		  var pList=data.pList;
    		  for(var i=0;i<pList.length;i++)
    		  {
//    			  tuiguang+='<tr style="height:40px">'+
//				         '<td>'+(i+1)+'</td>'+
//				         '<td><a href="'+pList[i].webUrl+'">'+pList[i].pName+'</a></td>';
//    			  if(pList[i].avgInterestRate == null) {
//    				  tuiguang+='<td>暂无</td>';
//    			  } else {
//    				  tuiguang+='<td>'+pList[i].avgInterestRate+'%</td>';
//    			  }
//    			  tuiguang+='<td class="adv-font">'+pList[i].feature+'</td>'+
//				      '</tr>';
    			  tuiguang+='<li>'+
			  					'<a href="'+pList[i].webUrl+'" target="_blank" style="position:relative;">'+
								'<div class="c_img"><img class="comment-img" src="'+programPath+'/static/image/comment_bg.png" width="100%"/></div>'+
								'<div class="c_angle"><img class="comment-angle" src="'+programPath+'/static/image/comment_angle.png" width="100%"/></div>';
    			  if(pList[i].avgInterestRate == null) {
    				  tuiguang+='<div class="c_lilv">无</div>';
    			  } else {
    				  tuiguang+='<div class="c_lilv">'+pList[i].avgInterestRate+'%</div>';
    			  }
								
				  tuiguang+='<div class="c_words">'+pList[i].pName+'</div>'+
								'<div class="c_adv"><img class="comment-adv" src="'+programPath+'/static/image/comment_adv.png" width="100%"/>'+pList[i].feature+'</div>'+
							'</a>'+
						'</li>';
    		  }
    		  $('#comment-ul').html(tuiguang);
          }
	});
}
