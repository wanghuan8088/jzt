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
          	  dType: 6,
    		  },  
            dataType : 'json',  
            success : function(data) { 
            	if(data.state==-1)
            		alert("服务器内部错误");
	           	var myChart = ec.init(document.getElementById('jkbs_bar'));
	            myChart.setOption({
	            	title : {
	                    text: '借款标数',
	                    
	                },
	                tooltip : {
	                    trigger: 'axis'
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
	                            formatter: '{value} '
	                        }
	                    }
	                ],
	                series : [
	                    {
	                        name:'借款标数',
	                        type:'bar',
	                        data: data.dArray1,
	                        itemStyle:{
	                        	normal: {
	                        		barBorderRadius: [5, 5, 5, 5],
	                        	}
	                        }
	                    }
	                ]
	            });
	         }
    	});
        
    }
);