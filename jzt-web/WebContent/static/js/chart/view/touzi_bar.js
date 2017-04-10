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
          	  dType: 4,
    		  },  
            dataType : 'json',  
            success : function(data) { 
            	if(data.state==-1)
            		alert("服务器内部错误");
		        var myChart = ec.init(document.getElementById('touzi_bar'));
		        myChart.setOption({
		        	title : {
		                text: '投资人数',
		                x: 'center',
		            },
		            tooltip : {
		                trigger: 'axis'
		            },
		          	dataZoom : {
		                show : true,
		                realtime : true,
		                start : 80,
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
		                        formatter: '{value} 人'
		                    }
		                }
		            ],
		            series : [
		                {
		                    name:'投资人数(人)',
		                    type:'bar',
		                    data:data.dArray,
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