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
        'echarts/chart/bar',
    ],
    function (ec) {
        //--- 折柱 ---
    	var url = window.location.href;
    	var pid=url.split("/")[url.split("/").length-1];
    	pid=pid.split("#")[0];
    	$.ajax( {  
            type : 'POST',  
            url : '../../product/pData/showPtrend',  
            data : {
          	  pId: pid,
          	  dType: 2,
    		  },  
            dataType : 'json',  
            success : function(data) { 
            	if(data.state==-1)
            		alert("服务器内部错误");
	           	var myChart = ec.init(document.getElementById('richengjiao_bar'));
	            myChart.setOption({
	            	title : {
	                    text: '日投资&日借款',
	                    
	                },
	                tooltip : {
	                    trigger: 'axis'
	                },
	                legend: {
	                    data:['日成交量(万)','日借款量(万)','日差值(万)']
	                },
	              	dataZoom : {
	                    show : true,
	                    realtime : true,
	                    start : 90,
	                    end : 100
	                },
	                xAxis : [
	                    {
	                        type : 'category',
	                        data : data.tArray
	                    }
	                    
	                ],
	                yAxis : [
	                    {
	                        type : 'value',
	                        axisLabel : {
	                            formatter: '{value} 万元'
	                        }
	                    },
	                    {
	                        type : 'value',
	                        axisLabel : {
	                            formatter: '{value} 万元'
	                        }
	                        
	                    }
	                ],
	                series : [
	                    {
	                        name:'日成交量(万)',
	                        type:'bar',
	                        stack: '交易',
	                        data: data.dArray1,
	                        itemStyle:{
	                        	normal: {
	                        		barBorderRadius: [5, 5, 5, 5],
	                        	}
	                        }
	                    },
	                    {
	                        name:'日借款量(万)',
	                        type:'bar',
	                        stack: '交易',
	                        data: data.dArray2,
	                        itemStyle:{
	                        	normal: {
	                        		barBorderRadius: [5, 5, 5, 5],
	                        	}
	                        }
	                    },
	                    {
	                    	name:'日差值(万)',
	                    	type:'line',
//	                    	yAxisIndex: 1,
	                    	data: data.dArray3,	                    	                    	
	                    }
	                    	                  	                    
	                ]
	            });
	         }
    	});
        
    }
);