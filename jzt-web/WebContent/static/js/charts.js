var chart_value;
var chart;
//var p2psubtitle = '<?=$title?>';
/*function initchart(id,name){
    var reply;
    var url = "/wdzj/html/json/chart-data-" + 10 + ".json";
    $.ajax({
        url: url,
        type:"GET",
        async:false,
        dataType: 'json',
        success: function(data){
            reply = data;
        }
    });
    var lenderUnit = "人";
	chart_value = {
		chart: {
            backgroundColor: 'rgba(255, 255, 255, 0)',
			renderTo: 'chartdiv'+id,
			margin: [45, 90, 40, 65],
            width: 575,
            height: 372
			//zoomType: 'xy'
		},
		title: {
			text: '网络借贷平台贷款金额，年利率，借出者统计',
			style: {
				margin: '0 0 0 0' // center it
			}
		},
		subtitle: {
			text: name,
			style: {
				margin: '0 0 0 0' // center it
			}
		},
		xAxis: [{
			categories: []
		}],
		yAxis: [{ // Primary yAxis
			labels: {
				formatter: function() {
					return this.value +'%';
					//return 30 +'%';
				},
				style: {
					color: '#89A54E',
					width: 100
				}
			},
			title: {
				text: '',
				style: {
					color: '#89A54E'
				},
				margin: 30
			},
			min:1,
			opposite: true
			
		}, { // Secondary yAxis
			title: {
				text: '',
				margin: 40,
				style: {
					color: '#4572A7'
				}
			},
			labels: {
				formatter: function() {
					//alert(this.value);
					return this.value  +' 万';	
					//change here
					//return 32 +' 万';	
				},
				style: {
					color: '#4572A7'
				}
			}
			
		}, { // Tertiary yAxis
			title: {
				text: '',
				margin: 40,
				style: {
					color: '#AA4643'
				}
			},
			min: 0, 
			labels: {
				formatter: function() {
                    if(this.value >= 1000){
                        lenderUnit ="千人";
                        return this.value/1000 + lenderUnit;
                    }else{
                        lenderUnit ="人";
                        return this.value + lenderUnit;
                    }
				},
				style: {
					color: '#AA4643'
				}
			},
			opposite: true,
            allowDecimals: this.value >= 1000,
			offset: 40
		}],
		tooltip: {
			formatter: function() {
				var unit = {
					'金额万': '万',
					'利率年': '%',
					'借出者': lenderUnit
				}[this.series.name];
                if(unit == "千人"){
                    return ''+
                        this.y / 1000 +' '+ unit;
                }
				return ''+
					 this.y +' '+ unit;
			}
		},
		legend: {
			layout: 'vertical',
			style: {
				left: '60px',
				bottom: 'auto',
				right: 'auto',
				top: '30px'
			},
			backgroundColor: '#FFFFFF'
		},
		series: [{
			name: '金额万',
			color: '#003399',
			type: 'area',
			yAxis: 1,
			data: [1]		
		
		}, {
			name: '借出者',
			type: 'line',
			color: '#00cc00',
			yAxis: 2,
			data: [0]
		
		}, {
			name: '利率年',
			color: '#ff6600',
			type: 'line',
			min: 1,
			data: [0]
		}]
	};
	
	chart = new Highcharts.Chart(chart_value);
    $.each(reply, function(i, item){
        if(item.platId == id){
	        draw(item.data);
            return;
        }
    });
}

function draw(reply){
	//alert(reply.moneylist);
	chart.xAxis[0].setCategories(reply.datalist,true);
	chart.series[0].setData(reply.moneylist,true);
	chart.series[1].setData(reply.lenderlist,true);
	chart.series[2].setData(reply.ratelist,true);
};*/


/**
 * Spline Chart Template
 */
function getCandlestick(series) {
    return {
        chart: {
			backgroundColor: 'rgba(255, 255, 255, 0)',
            width: 575,
            height: 322
        },
        rangeSelector: {
            enabled:false,			//暂时关闭
            inputEnabled: false   //关闭日期区间的输入
        },
        credits:{
            enabled: false
        },
        scrollbar:{
            enabled:false
        },
        navigator: {
            enabled:false
        },
        title: {
            text: ''
        },
        xAxis:[{
            type: 'date', //定义x轴上日期的显示格式
            gridLineColor:'#dcdcdc',
            labels: {
                formatter: function() { return Highcharts.dateFormat('%m/%d', this.value);},
                align: 'center'
            }
        }],
        yAxis: [{
            title: {
                text: '利率（%）',
                style: {
                    color: '#333333',
                    fontWeight: 'bold'
                }
            },
            gridLineColor:'#dcdcdc',
            height: 100,
            opposite: false
        }, {
            title: {
                text: '成交量',
                style: {
                    color: '#333333',
                    fontWeight: 'bold'
                }
            },
            gridLineColor:'#dcdcdc',
            top: 160,
            height: 130,
            offset: 20
        },{
            title: {
                text: '人气(人)',
                style: {
                    color: '#333333',
                    fontWeight: 'bold'
                }
            },
            gridLineColor:'#dcdcdc',
            top: 160,
            height: 130,
            opposite: false,
            offset: 0
        }],
        tooltip:{
            xDateFormat:"%Y年%m月%d日"
        },
        series:series
    }
}
function getCandlestick1(series) {
    return {
        chart: {
            backgroundColor: 'rgba(255, 255, 255, 0)',
            width: 575,
            height: 322
        },
        rangeSelector: {
            enabled:false,			//暂时关闭
            inputEnabled: false   //关闭日期区间的输入
        },
        credits:{
            enabled: false
        },
        scrollbar:{
            enabled:false
        },
        navigator: {
            enabled:false
        },
        title: {
            text: ''
        },
        xAxis:[{
            type: 'date', //定义x轴上日期的显示格式
            gridLineColor:'#dcdcdc',
            labels: {
                formatter: function() { return Highcharts.dateFormat('%m/%d', this.value);},
                align: 'center'
            }
        }],
        yAxis: [{
            title: {
                text: '利率指数',
                style: {
                    color: '#333333',
                    fontWeight: 'bold'
                }
            },
            gridLineColor:'#dcdcdc',
            height: 100,
            opposite: false
        }, {
            title: {
                text: '成交指数',
                style: {
                    color: '#333333',
                    fontWeight: 'bold'
                }
            },
            gridLineColor:'#dcdcdc',
            top: 160,
            height: 130,
            offset: 20
        },{
            title: {
                text: '人气指数',
                style: {
                    color: '#333333',
                    fontWeight: 'bold'
                }
            },
            gridLineColor:'#dcdcdc',
            top: 160,
            height: 130,
            opposite: false,
            offset: 0
        }],
        tooltip:{
            xDateFormat:"%Y年%m月%d日"
        },
        series:series
    }
}
/**
 * Paser Origin Data to Chart
 */
/*function paserStockData(data){
    var rate = [],money = [],outCount = [];

    for (var i = 0; i < data.length; i++) {
        rate.push([
            data[i][0], // the date
            data[i][4], // open
            data[i][5], // high
            data[i][6], // low
            data[i][7] // close
        ]);
        money.push([
            data[i][0], // the date
            data[i][3] // the exponent
        ]);
        outCount.push([
            data[i][0], // the date
            data[i][2]
        ])
    }

    var groupingUnits = [
        ['week',[1]],
        ['month',[1, 2, 3, 4, 5, 6]]
    ];

    var series=[{
        type: 'candlestick',
        name: '利率',
        data: rate,
        pointArrayMap:['1','2','3','4'],
        dataGrouping: {
            units: groupingUnits
        }
    }, {
        type: 'column',
        name: '成交量',
        data: money,
        yAxis: 1,
        dataGrouping: {
            units: groupingUnits
        },
        color:"#0e7fb4"
    }, {
        type: 'spline',
        name: '人气',
        data: outCount,
        yAxis: 2,
        dataGrouping: {
            units: groupingUnits
        },
        color:"#e6bc8a"
    }];
    return series;
}*/
function paserStockData(data){
    var rate = [],money = [],outCount = [];

    for (var i = 0; i < data.length; i++) {
        rate.push([
            data[i][0], // the date
            data[i][1] // spline
        ]);
        money.push([
            data[i][0], // the date
            data[i][3] // the exponent
        ]);
        outCount.push([
            data[i][0], // the date
            data[i][2]
        ])
    }

    var groupingUnits = [
        ['week',[1]],
        ['month',[1, 2, 3, 4, 5, 6]]
    ];

    var series=[{
        name: '利率',
        data: rate,
        dataGrouping: {
            units: groupingUnits
        },
        color:'#0e7fb4'
    }, {
        type: 'column',
        name: '成交量',
        data: money,
        yAxis: 1,
        dataGrouping: {
            units: groupingUnits
        },
        color:"#0e7fb4"
    }, {
        type: 'spline',
        name: '人气',
        data: outCount,
        yAxis: 2,
        dataGrouping: {
            units: groupingUnits
        },
        color:"#e6bc8a"
    }];
    return series;
}
$(function(){
    Highcharts.setOptions({
        global: {
            useUTC: false
        }
    });
    $.get("/wdzj/html/json/exponent-chart-10.json", function (json) {
        chart_value = json;
        daySpline('0','总交易量');
    });
});
var firstFlag = false;
var zeroData;
function daySpline(id, name){
	if(firstFlag == true) {
		$(".data_dwm li a").removeClass("cur");
		$(".data_dwm li a").eq(0).addClass("cur");
	}
	firstFlag = true;
	
    if(chart_value){
        if(chart_value.length > 1){
            $.each(chart_value, function(i, item){
                if(item.platId == id){
                    var json = paserStockData(item.data);
                    if(id == 0){
                        $("#chartdiv"+id).highcharts('StockChart',getCandlestick1(json));
                    }else{
                        $("#chartdiv"+id).highcharts('StockChart',getCandlestick(json));
                    }
                    return;
                }
            });
        }else{
            if(!zeroData){
                zeroData = [];
                var data = chart_value.day[0].data;
                for(var i = 0; i < data.length; i++){
                    zeroData[i] = [];
                    zeroData[i][0] = data[i][0];
                    for(var j = 1; j < data[i].length; j++){
                        zeroData[i][j] = 0;
                    }
                }
            }
            var json = paserStockData(zeroData);
            if(id == 0){
                $("#chartdiv"+id).highcharts('StockChart',getCandlestick1(json));
            }else{
                $("#chartdiv"+id).highcharts('StockChart',getCandlestick(json));
            }
        }
    }
}
/*

*/
/**
 * Create a Candlestick
 *//*

function weekKLine(id, name){
	$(".data_dwm li a").removeClass("cur");
	$(".data_dwm li a").eq(1).addClass("cur");
	
    if(chart_value){
        $.each(chart_value.week, function (i, item) {
            if (item.platId == id) {
                var json = paserStockData(item.data);
                if(id == 0){
                    $("#chartdiv"+id).highcharts('StockChart',getCandlestick1(json));
                }else{
                    $("#chartdiv"+id).highcharts('StockChart',getCandlestick(json));
                }
                return;
            }
        });
    }
}
*/
/**
 * Create a Candlestick
 *//*

function monthKLine(id, name){
	$(".data_dwm li a").removeClass("cur");
	$(".data_dwm li a").eq(2).addClass("cur");
	
    if(chart_value){
        $.each(chart_value.month, function (i, item) {
            if (item.platId == id) {
                var json = paserStockData(item.data);
                if(id == 0){
                    $("#chartdiv"+id).highcharts('StockChart',getCandlestick1(json));
                }else{
                    $("#chartdiv"+id).highcharts('StockChart',getCandlestick(json));
                }
                return;
            }
        });
    }
}*/
