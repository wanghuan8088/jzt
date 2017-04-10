require.config({
    paths: {
        //echarts: '../../static/js',
    	echarts: '../static/js',
        }
    });

   
    require(
        [
            'echarts',
            'echarts/chart/bar',
        ],
    function (ec) {
    	$.ajax({  
	            type : 'GET',  
	            url : '../product/nav/pintaiData',  
	            dataType : 'json',  
	            success : function(data) { 
	            	initPlatLineEcahrts(ec,data.dataList,data.dateList);
	            }
    	})
    	
    }
  );
function initPlatLineEcahrts(ec,dataList,dateList){
	var platChart = ec.init(document.getElementById('plat_charts')); 
	option = {
		    title : {
		    	 text: '平台上线情况柱状图',
		    },
		    tooltip : {
		        trigger: 'axis'
		    },
		    legend: {
		    	data:['注册平台数']
		    },
		    dataZoom : {
                show : true,
                realtime : true,
                start : 80,
                end : 100
            },
		    toolbox: {
		        show : false,
		        feature : {
		            mark : {show: true},
		            dataView : {show: true, readOnly: false},
		            magicType : {show: true, type: ['line', 'bar']},
		            restore : {show: true},
		            saveAsImage : {show: true}
		        }
		    },
		    calculable : true,
		    xAxis : [
		        {
		            type : 'category',
		            data : dateList
		        }
		    ],
		    yAxis : [
		        {
		            type : 'value'
		        }
		    ],
		    series : [
		        {
		            name:'注册平台数',
		            type:'bar',
		            data:dataList,
		            markPoint : {
		                data : [
		                    {type : 'max', name: '最大值'},
		                    {type : 'min', name: '最小值'}
		                ]
		            },
		            markLine : {
		                data : [
		                    {type : 'average', name: '平均值'}
		                ]
		            }
		        }
		    ]
		};
		                    
	
		                    
	
	var ecConfig = require('echarts/config');
    function eConsole(param) {


    }

    platChart.on(ecConfig.EVENT.CLICK, eConsole);
    // 为echarts对象加载数据 
    platChart.setOption(option); 
}