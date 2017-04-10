require.config({
    paths: {
        echarts: '././static/js',
    }
});

// Step:4 require echarts and use it in the callback.
// Step:4 动态加载echarts然后在回调函数中开始使用，注意保持按需加载结构定义图表路径
require(
    [
        'echarts',
        'echarts/chart/line',
    ],
    function (ec) {
        //--- 折柱 ---
    	var url = window.location.href;
    	var pid;
    	$.ajax( {  
            type : 'POST',  
            url : '../product/pData/showPtrend',  
            data : {
          	  pId: 21071,
          	  dType: 1,
    		  },  
            dataType : 'json',  
            success : function(data) { 
            	if(data.state==-1)
            		alert("服务器内部错误");
	           	var myChart = ec.init(document.getElementById('chengjiaoliang_bar'));
	            myChart.setOption({
	            	title : {
    					text: '成交量(万元)'
    						},
	                tooltip : {
	                    trigger: 'axis'
	                },
	                color:['#87CEFA'],
	              	dataZoom : {
	                    show : true,
	                    realtime : true,
	                    start : 95,
	                    end : 100
	                },
	                xAxis : [
	                    {
	                        type : 'category',
	                        data : data.tArray,
	                        splitLine: {show:false},
	                    }
	                ],
	                yAxis : [
	                    {
	                        type : 'value',
	                        axisLabel : {
	                            formatter: '{value} '
	                        }
	                    }
	                ],
	                series : [
	                    {
	                        name:'成交量',
	                        type:'line',
	                        data: data.dArray1,
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
	            });
	         }
    	});
        
    }
);
$(function(){
	$(".lilvrank li").click(function(){
		var pid;
		pid=$(this).attr("var");
		require(
			    [
			        'echarts',
			        'echarts/chart/line',
			    ],
			    function (ec) {
			        //--- 折柱 ---
			    	var url = window.location.href;
			    	
			    	$.ajax( {  
			            type : 'POST',  
			            url : '../product/pData/showPtrend',  
			            data : {
			          	  pId: pid,
			          	  dType: 1,
			    		  },  
			            dataType : 'json',  
			            success : function(data) { 
			            	if(data.state==-1)
			            		alert("服务器内部错误");
				           	var myChart = ec.init(document.getElementById('chengjiaoliang_bar'));
				            myChart.setOption({
				            	title : {
			    					text: '成交量(万元)'
			    						},
				                tooltip : {
				                    trigger: 'axis'
				                },
				                color:['#87CEFA'],
				              	dataZoom : {
				                    show : true,
				                    realtime : true,
				                    start : 95,
				                    end : 100
				                },
				                xAxis : [
				                    {
				                        type : 'category',
				                        data : data.tArray,
				                        splitLine: {show:false},
				                    }
				                ],
				                yAxis : [
				                    {
				                        type : 'value',
				                        axisLabel : {
				                            formatter: '{value} '
				                        }
				                    }
				                ],
				                series : [
				                    {
				                        name:'成交量',
				                        type:'line',
				                        data: data.dArray1,
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
				            });
				         }
			    	});
			        
			    }
			);
		
		
		
	});
});
