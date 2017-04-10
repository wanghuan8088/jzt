var maxpage;//全局变量  总页数  
var PageSize = 5;//全局变量 每页显示多少条数据
var CurPage = 1;
var type;
var ctx=$('#ctx').html();
var pid=$('#pid').attr("data-pid");
$(document).ready(function() {
	$('#focus_product').hide();
	$('#focus_cancle').hide();
	type="hangye";
	AjaxNews(type,CurPage, PageSize); 
	var url = window.location.href;
	var reg=/pDetail\/(\d*)/;
	
	
	
});


function tab_switch(obj)
{
		type=$(obj).attr('id');
		CurPage = 1;
		AjaxNews(type,CurPage, PageSize);
}
 


function AjaxNews(type,CurPage, PageSize) { 
	var url = window.location.href;
	var reg=/pDetail\/(\d*)/;
	//var pid = url.match(reg); 
    //清空数据显示 
    $('#tabcontent li').remove();   
  
    var programPath=$('#cxt').html();
    var tId=0;
    if (type=="hangye") tId=0;
    else if (type=="zhengce") tId=1;
    else if (type=="pintai") tId=2;
    else if (type=="shuju") tId=3;
    else if (type=="guandian") tId=4;
    else if (type=="baoguang") tId=5;
    else if (type=="licai") tId=6;
    else if (type=="yanjiu") tId=7;
    else if (type=="guowai") tId=8;
    //组合Json查询条件，查询分页数据 
    $.ajax({  
        type: 'POST',  
        url: ctx+"/news/productRelatedNews" ,  
        dataType: 'json',  
        data: {
        	"pId":pid,
        	"tId":tId,
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
                    		if (news["polarity"]==1)
                    		{
                    			str += '<li class="list-group-item " ><div class="row"><div class="type-news-title"><span class="badge pull-left badge-color-pos">正向</span><h4 class="black" style="display: inline"><a href="../news/'+type+"/"+news["nid"]+'" target="_blank" title="'+news["title"]+'">'+news["title"]+'</a></h4><p class="gray type-news-abstracts" >'+news["abstracts"]+'</p></div></div></li>';
                    		}
                    		else
                    		{
                    			str += '<li class="list-group-item " ><div class="row"><div class="type-news-title"><span class="badge pull-left badge-color-neg">负向</span><h4 class="black" style="display: inline"><a href="../news/'+type+"/"+news["nid"]+'" target="_blank" title="'+news["title"]+'">'+news["title"]+'</a></h4><p class="gray type-news-abstracts" >'+news["abstracts"]+'</p></div></div></li>';
                    		}     
                    	}
                    	else
                    	{
                    		if (news["polarity"]==1)
                    		{
                    			str += '<li class="list-group-item " ><div class="row"><div class="type-news-title"><span class="badge pull-left badge-color-pos">正向</span><h4 class="black" style="display: inline"><a href="../news/'+type+"/"+news["nid"]+'" target="_blank" title="'+news["title"]+'">'+news["title"]+'</a></h4></div></div></li>';
                    		}
                    		else
                    		{
                    			str += '<li class="list-group-item " ><div class="row"><div class="type-news-title"><span class="badge pull-left badge-color-neg">负向</span><h4 class="black" style="display: inline"><a href="../news/'+type+"/"+news["nid"]+'" target="_blank" title="'+news["title"]+'">'+news["title"]+'</a></h4></div></div></li>';
                    		}
                    		
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
                        for (var j = firstPage; j <= pagecount ; j++) {  
                            if (j == CurPage) {  
                                span += "<li class='active'><span>"+ j +"</span></li>" ;  ;  
                            } else {  
                                span += "<li><a href='javascript:void(0)' onclick='CurPageSizeClick(" + j + ",this)'>"+ j +"</a></li>" ;  
                            }  
                        } 
                        if (maxpage > pagecount) {
                        	span += "<li><a href='javascript:void(0)' onclick='CurPageSizeClick(" + pagecount + ",this)'>"+ pagecount +"</a></li>" ;  
                        }  
                        if (CurPage==maxpage)
                        {
                        	span += "<li class='disabled'><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li class='disabled'><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
                        }
                        else
                        {
                        	span += "<li><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
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
                        	span += "<li class='disabled'><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li class='disabled'><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
                        }
                        else
                        {
                        	span += "<li><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
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



require.config({
    paths: {
        echarts: '././static/js',
    }
});

require(
	    [
	        'echarts',
	        'echarts/chart/line',
	        'echarts/chart/bar',
	    ],
	    function (ec) {
	    	//--- 折柱 ---
	    	//var pid=pid;
	    	try{
	    		$.ajax( {  
		            type : 'POST',  
		            url : ctx+'/product/pData/showPtrend',  
		            data : {
		          	  pId: pid,
		          	  dType: 1,
		    		  },  
		            dataType : 'json',  
		            success : function(data) { 
		            	if(data.state==-1)
		            		alert("服务器内部错误");
		            	else {
		            		var myChart1 = ec.init(document.getElementById('lilv_chengjiao_bar1'));
		            		
		            		option = {
		            			tooltip : {
		    		                    trigger: 'axis',
		    		                    showDelay: 0             // 显示延迟，添加显示延迟可以避免频繁切换，单位ms
		    		                },
	            				title : {
	            					text: '成交量&利率'
	            						},
	            					tooltip : {
	            						trigger: 'axis',
	            						showDelay: 0,             // 显示延迟，添加显示延迟可以避免频繁切换，单位ms
	        					},
	        		            legend: {
	        		            	data:['利率','成交量(万)']
	        					},
	        		            dataZoom : {
	        		                    y: 250,
	        		                    show : true,
	        		                    realtime: true,
	        		                    start : 95,
	        		                    end : 100
	        		             },
	        		             grid: {
	        		                    x: 80,
	        		                    y: 40,
	        		                    x2:20,
	        		                    y2:25
	        		             },
	        		             xAxis : [
	        		                    {
	        		                        type : 'category',
	        		                        boundaryGap : true,
	        		                        axisTick: {onGap:false},
	        		                        splitLine: {show:false},
	        		                        data : data.tArray
	        		                    }
	        		             ],
	        		             yAxis : [
	        		                    {
	        		                        type : 'value',
	        		                        scale:true,
	        		                        splitArea : {show : true}
	        		                    }
	        		             ],
	        		             series : [
	        		                    {
	        		                        name:'利率(%)',
	        		                        type:'line',
	        		                        data:data.dArray2
	        		                    }
	        		                    
	        		                ]
		            		};
		            		myChart1.setOption(option);
	    		            option2 = {
	    		                tooltip : {
	    		                    trigger: 'axis',
	    		                    showDelay: 0             // 显示延迟，添加显示延迟可以避免频繁切换，单位ms
	    		                },
	    		                legend: {
	    		                    y : -30,
	    		                    data:['利率','成交量(万)']
	    		                },
	    		                dataZoom : {
	    		                    show : true,
	    		                    realtime: true,
	    		                    start : 95,
	    		                    end : 100
	    		                },
	    		                grid: {
	    		                    x: 80,
	    		                    y:5,
	    		                    x2:20,
	    		                    y2:40
	    		                },
	    		                xAxis : [
	    		                    {
	    		                        type : 'category',
	    		                        position:'top',
	    		                        boundaryGap : true,
	    		                        axisLabel:{show:false},
	    		                        axisTick: {onGap:false},
	    		                        splitLine: {show:false},
	    		                        data : data.tArray
	    		                    }
	    		                ],
	    		                yAxis : [
	    		                    {
	    		                        type : 'value',
	    		                        scale:true,
	    		                        splitNumber: 3,
	    		                        
	    		                        axisLabel: {
	    		                        	formatter: '{value} 万元'
	    		                        },
	    		                        splitArea : {show : true}
	    		                    }
	    		                ],
	    		                series : [
	    		                    {
	    		                        name:'成交量(万)',
	    		                        type:'bar',
	    		                        symbol: 'none',
	    		                        data:data.dArray1,
	    		                        markLine : {
	    		                            symbol : 'none',
	    		                            itemStyle : {
	    		                                normal : {
	    		                                    color:'#1e90ff',
	    		                                    label : {
	    		                                        show:false
	    		                                    }
	    		                                }
	    		                            },
	    		                            data : [
	    		                                {type : 'average', name: '平均值'}
	    		                            ]
	    		                        }
	    		                    }
	    		                ]
	    		            };
	    		            myChart2 = ec.init(document.getElementById('lilv_chengjiao_bar2'));
	    		            myChart2.setOption(option2);



	    		            myChart1.connect([myChart2]);
	    		            myChart2.connect([myChart1]);


		            	}
		            },
		            error:function(e){
		            	console.log(e);
		            }
	    		});	    
	    	}catch(err){
	    		console.log(err);
	    	}
	    	
	    }
	  );

