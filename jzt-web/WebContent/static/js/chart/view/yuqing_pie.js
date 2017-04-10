require.config({
    paths: {
        echarts: '././static/js',
    }
});
var programPath=$('#cxt').html();

// Step:4 require echarts and use it in the callback.
// Step:4 动态加载echarts然后在回调函数中开始使用，注意保持按需加载结构定义图表路径



require(
    [
        'echarts',
        'echarts/chart/pie',
    ],
    function (ec) {
        //--- 折柱 ---
        var myChart = ec.init(document.getElementById('yuqing_pie'));
        
        $.ajax({  
            type: 'POST',  
            url: programPath+"/news/polarity" ,  
            dataType: 'json',  
            data: {
            }, 
            success: function (data) {
            	var pos,neg,mid;
            	pos=data["pos"];
            	neg=data["neg"];
            	mid=data["mid"];
//            	alert(pos+"f"+neg);
            	myChart.setOption({
                    tooltip : {
                        trigger: 'item',
                        formatter: "{a} <br/>{b} :  {d}%"
                    },
                    legend: {
                        x : 'center',
                        data:['正向','中立','负向']
                    },
                    calculable : true,
                    series : [
                        {
                            name:'舆情极向',
                            type:'pie',
                            radius : '55%',
                            center: ['50%', '60%'],
                            data:[
                                {value:63, name:'正向',itemStyle: {normal: {color: '#1A85FF'}}},
                                {value:30, name:'中立',itemStyle: {normal: {color: '#757575'}}},
                                {value:7, name:'负向',itemStyle: {normal: {color: '#FF3B00'}}},
                            ]
                        }
                    ]
                });
            }
        });
        
    }
);