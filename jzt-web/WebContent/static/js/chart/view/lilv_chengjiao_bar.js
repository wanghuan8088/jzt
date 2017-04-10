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
	    	var url = window.location.href;
	    	var pid=url.split("/")[url.split("/").length-1];
	    	pid=pid.split("#")[0];
	    	$.ajax( {  
	            type : 'POST',  
	            url : '../pData/showPtrend',  
	            data : {
	          	  pId: pid,
	          	  dType: 1,
	    		  },  
	            dataType : 'json',  
	            success : function(data) { 

	            	//alert(data.tArray.length);
	            	if(data.tArray.length==0)
	            		{
	            			$("#cjandll").hide();
	            			// alert("is null");
	            		}


	            	if(data.state==-1) {

	            		alert("服务器内部错误");
	            	}
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
        		            	data:['利率(%)','成交量(万)']
        					},
        		            dataZoom : {
        		                    y: 250,
        		                    show : true,
        		                    realtime: true,
        		                    start : 90,
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
        		                        splitArea : {show : true},
        		                        axisLabel: {
        		                        	formatter: '{value} %'
        		                        },
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
    		                    data:['利率(%)','成交量(万)']
    		                },
    		                dataZoom : {
    		                    show : true,
    		                    realtime: true,
    		                    start : 90,
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
	            }});	    
});

