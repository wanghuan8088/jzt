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
            url : '../pData/showPtrend',  
            data : {
          	  pId: pid,
          	  dType: 3,
    		  },  
            dataType : 'json',  
            success : function(data) { 
            	if(data.state==-1)
            		alert("服务器内部错误");
		        var myChart = ec.init(document.getElementById('tzandjk'));
		        myChart.setOption({
		        	title : {
		                text: '人均投资&借款金额',
		               
		            },
		            tooltip : {
		                trigger: 'axis'
		            },
		            legend: {
		            	data:['人均投资金额(万)','人均贷款金额(万)']
					},
		            dataZoom : {
		                show : true,
		                realtime : true,
		                start : 95,
		                end : 100
		            },
		            xAxis : [
		                {
		                    type : 'category',
		                    boundaryGap : true,
		                    data : data.tArray
		                }
		            ],
		            yAxis : [
		                {
		                    type : 'value',
		                    name:'人均投资金额',
		                  	axisLabel : {
		                        formatter: '{value} 万元'
		                    },
		                    axisLine : { 
				                lineStyle: {
				                	 show: true,
				                    color: '#FFA584',
				                    
				                    width: 2
				                }
		                    }
		                },
		                {
	                        type : 'value',
	                        name:'人均贷款金额',
	                        axisLabel : {
	                            formatter: '{value} 万元'
	                        },
	                        axisLine : { 
				                lineStyle: {
				                	 show: true,
				                    color: '#ABDCFB',
				                    
				                    width: 2
				                }
	                        }
	                    }
		                
		            ],
		            series : [
		                {
		                    name:'人均投资金额(万)',
		                    type:'bar',
		                    data: data.dArray1,
	                        itemStyle:{
	                        	normal: {
	                        		barBorderRadius: [5, 5, 5, 5],
	                        	}
	                        }
		                },
		                {
		                    name:'人均贷款金额(万)',
		                    type:'bar',
		                    data: data.dArray2,
		                    yAxisIndex: 1,
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