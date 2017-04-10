/**
 * 
 */
require.config({
	                paths: {
	                    echarts: '../../static/js',
	                }
	            });
	
	            // Step:4 require echarts and use it in the callback.
	            // Step:4 动态加载echarts然后在回调函数中开始使用，注意保持按需加载结构定义图表路径
	            require(
	                [
	                    'echarts',
	                    'echarts/chart/map',
	                ],
	                function (ec) {
	                	//var mapNavJsonData;
	     	            var jsonURL = "../product/navQuery";
	     	            
     	            	$.getJSON(jsonURL,function(data) {
	     	            	//alert(data);
     	            		
	     	            	mapNavJsonData=data;
	     	            	parseJsonForMap(mapNavJsonData);
	     	            	initMapEcahrts(ec,mapNavJsonData);
	     	            });
	                }
	              );
	            
	            var mapNavJsonData;
	            var mpNav_provinceMap = {};
            	var mpNav_provinceNumMap = {};
            	mpNav_provinceMap['other']='';
            	mpNav_provinceNumMap['other']=0;
            	var totalNum=0;
            	var maxNum=0;
            	var dataArray=new Array();
            	
	            function parseJsonForMap(mapNavJsonData){
	            	String.prototype.temp = function(obj) {
	            	    return this.replace(/\$\w+\$/gi, function(matchs) {
	            	        var returns = obj[matchs.replace(/\$/g, "")];		
	            	        return (returns + "") == "undefined"? "": returns;
	            	    });
	            	};
	            	var htmlTemp = $("#productTextArea").text();
	            	
	            	
	            	mapNavJsonData.platList.forEach(function(object) {
	            		object.iconUrl=""+object.iconUrl;
	            		if(object.provinceName==null){
	            			mpNav_provinceMap['other']+=htmlTemp.temp(object);
	            			mpNav_provinceNumMap['other']+=1;
	            		}else if(mpNav_provinceMap[object.provinceName]=='undefined'||mpNav_provinceMap[object.provinceName]==null){
	            			mpNav_provinceMap[object.provinceName]=htmlTemp.temp(object);
	            			mpNav_provinceNumMap[object.provinceName]=1;
	            		}else{
	            			mpNav_provinceMap[object.provinceName]+=htmlTemp.temp(object);
	            			mpNav_provinceNumMap[object.provinceName]+=1;
	            		}
	            	   
	            	});
	            	
	            	var numArray=new Array();
	            	for(var prop in mpNav_provinceMap){
	            		
	            		if(prop!='other'){
	            			var oneData={};
	            			oneData['name']=prop;
	            			oneData['value']=mpNav_provinceNumMap[prop];
	            			dataArray.push(oneData);
	            			numArray.push(oneData['value']);
	            		}
	            	}
	            	if(mpNav_provinceMap["西藏"]==null||mpNav_provinceMap["西藏"]=="undefined"){
	            		var oneData={};
            			oneData['name']="西藏";
            			oneData['value']=0;
            			dataArray.push(oneData);
	            	}
	            	if(mpNav_provinceMap["青海"]==null||mpNav_provinceMap["青海"]=="undefined"){
	            		var oneData={};
            			oneData['name']="青海";
            			oneData['value']=0;
            			dataArray.push(oneData);
	            	}
	            	totalNum=mapNavJsonData.platList.length;
	            	maxNum=Math.ceil(Math.max.apply(null, numArray)/100)*100+100;
	            	maxNum=100;
	            	
	          
	            }
	            function initMapEcahrts(ec,mapNavJsonData){
	            	
	            	var myChart = ec.init(document.getElementById('main')); 
                	
                	option = {
                    	    title : {
                    	        text: '各省份产品情况图',
                    	        subtext: '',
                    	        x:'center'
                    	    },
                    	    tooltip : {
                    	        trigger: 'item'
                    	    },
                    	    legend: {
                    	        orient: 'vertical',
                    	        x:'left',
                    	        y:'50px',
                    	        data:['']
                    	    },
                    	    dataRange: {
                    	        min: 0,
                    	        max: maxNum,
                    	        x: 'left',
                    	        y: 'bottom',
                    	        text:['高','低'],           // 文本，默认为数值文本
                    	        calculable : true
                    	    },
                    	    toolbox: {
                    	        show: false,
                    	        orient : 'vertical',
                    	        x: 'right',
                    	        y: 'center',
                    	        feature : {
                    	            mark : {show: true},
                    	            dataView : {show: true, readOnly: false},
                    	            restore : {show: true},
                    	            saveAsImage : {show: true}
                    	        }
                    	    },
                    	    roamController: {
                    	        show: false,
                    	        x: 'right',
                    	        mapTypeControl: {
                    	            'china': true
                    	        }
                    	    },
                    	    series : [
                    	        {
                    	            name: '平台数',
                    	            type: 'map',
                    	            mapType: 'china',
                    	            roam: false,
                    	            itemStyle:{
                    	                normal:{label:{show:true}},
                    	                emphasis:{label:{show:true}}
                    	            },
                    	            data:dataArray
                    	        }
                    	    ]
                    	};
                	
                	var ecConfig = require('echarts/config');
                    function eConsole(param) {
                    	
                    	$("#product_list_map ul").html('');
                    	if(mpNav_provinceMap[param.name]!=null&&mpNav_provinceMap[param.name]!='undefined'){
                    		$("#map_sx_title").css("display","block");
                    		$("#map_sx_title").html('');
                    		$("#map_sx_title").html(param.name+"&nbsp;有 <strong style='color=#f00'>"+mpNav_provinceNumMap[param.name]+"</strong> 个平台");
                    		$("#product_list_map ul").html(mpNav_provinceMap[param.name]);
                    		var height1=$("#product_list_map").parent().height();
                    		$("#product_list_map").parent().height(height1+$("#product_list_map").height());
                    	}else{
                    		$("#map_sx_title").css("display","none");
                    		$("#map_sx_title").html('');
                    	}
                    	
//                        switch (param.dataIndex) {
//                            case 0:    //柱子1
//                                window.location.href = "http://blog.sina.com.cn/eul";
//                                break;
//                            case 1:  //柱子2
//                                window.location.href = "http://www.dacai.com/desc/4778";
//                                break;
//                            case 2:  //柱子3
//                                window.location.href = "http://www.dacai.com/desc/4778";
//                                break;
//                            default:
//                                break;
//                               
//                        }


                    }

                    myChart.on(ecConfig.EVENT.CLICK, eConsole);
                    // 为echarts对象加载数据 
                    myChart.setOption(option); 
	            }

	         