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
        'echarts/chart/radar',
    ],
    function (ec) {
        //--- 折柱 ---
    	var sc=document.getElementsByTagName('script'); 
    	var paramsArr=sc[sc.length-1].src.split('?')[1].split('&');
    	var name=decodeURI(paramsArr[0]);
    	paramsArr.shift();
        var myChart = ec.init(document.getElementById('radar'));
        myChart.setOption({
            title : {
		        text: '',
		    },
		    tooltip : {
		        trigger: 'axis'
		    },
		    legend: {
		    	show : false,
		        x : 'center',
		        data:name
		    },
		    toolbox: {
		        show : false,
		        feature : {
		            mark : {show: true},
		            dataView : {show: true, readOnly: false},
		            restore : {show: true},
		            saveAsImage : {show: true}
		        }
		    },
		    calculable : true,
		    polar : [
		        {
		            indicator : [
		                {text : '成交', max  : 100},
		                {text : '透明', max  : 100},
		                
		                {text : '分散', max  : 100},
		                {text : '人气', max  : 100},
		                {text : '流动', max  : 100},
		                
		                {text : '杠杆', max  : 100},
		            ],
		            radius : 80
		        }
		    ],
		    series : [
		        {
		            name: '评级情况',
		            type: 'radar',
		            itemStyle: {
		                normal: {
		                    areaStyle: {
		                        type: 'default'
		                    }
		                }
		            },
		            data : [
		                {
		                    value : paramsArr,
		                    name : name
		                },
		            ]
		        }
		    ],
		    color : ['#FFA919']
        });
    }
);