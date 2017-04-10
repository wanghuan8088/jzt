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
	     	            var jsonURL = "../product/getAllProvince";
	     	            
     	            	$.getJSON(jsonURL,function(data) {
	     	            	//alert(data);
     	            		
	     	            	mapNavJsonData=data.provinces;
	     	            	parseJsonForMap(mapNavJsonData);
	     	            	initMapEcahrts(ec,mapNavJsonData);
	     	            });
	                }
	              );
	            
	            var mapNavJsonData;
            	var totalNum=0;
            	var maxNum=100;
            	var maxNum2 = 100;
            	var dataArray=new Array();
            	var mpNav_provinceNumMap = {};
            	mpNav_provinceNumMap['other']=0;
	            function parseJsonForMap(mapNavJsonData){
	            	
	            	
	            	var numArray=new Array();
	            	for(var prop in mapNavJsonData){
	            		
	            		if(mapNavJsonData[prop].name!='other'){
	            			var oneData={};
	            			mpNav_provinceNumMap[mapNavJsonData[prop].name]=mapNavJsonData[prop].productNum;
	            			oneData['name']=mapNavJsonData[prop].name;
	            			oneData['value']=mapNavJsonData[prop].productNum;
	            			dataArray.push(oneData);
	            			numArray.push(oneData['value']);
	            			if(mapNavJsonData[prop].productNum > maxNum)
	            				maxNum = mapNavJsonData[prop].productNum;
	            		}
	            	}
	            	
	            	
	            	
	          
	            }
	            function initMapEcahrts(ec,mapNavJsonData){
	            	
	            	var myChart = ec.init(document.getElementById('main')); 
                	var prChart = ec.init(document.getElementById('proMain')); 
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
                	
                	var htmlTemp = $("#productTextArea").text();
                	var ecConfig = require('echarts/config');
                    function eConsole(param) {
                    	var productList = '';
                    	var name = param.name;
                    	$("#product_list_map ul").html('');
                    	$.ajax({
               			 type: "POST",
               	          url: "../product/getProductByProvince",
               	          data: {province:name},
               	          dataType : "json",
               	          async:false,
               	          error: function () {
               	        	  
               	          },
               	          success: function (data) {
               	        	productData = data.products;
                    		for (product in productData){
                    			productList += htmlTemp.temp(productData[product]);
                    		}
                    		if(mpNav_provinceNumMap[param.name] != 0){
                    			$("#map_sx_title").css("display","block");
                        		$("#map_sx_title").html('');
                        		$("#map_sx_title").html(param.name+"&nbsp;有 <strong style='color=#f00'>"+mpNav_provinceNumMap[param.name]+"</strong> 个平台");
                        		$("#product_list_map ul").html(productList);
                        		var height1=$("#product_list_map").parent().height();
                        		$("#product_list_map").parent().height(height1+$("#product_list_map").height());
                    		}
                    		else{
                    			$("#map_sx_title").css("display","none");
                        		$("#map_sx_title").html('');
                    		}
               	          }
               		 	});
                    	
                    	
                    	$.ajax({
                  			 type: "POST",
                  	          url: "../product/getAllCity",
                  	          data: {province:name},
                  	          dataType : "json",
                  	          async:false,
                  	          error: function () {
                  	        	  
                  	          },
                  	          success: function (data) {
                  	        	var prChart = ec.init(document.getElementById('proMain'));
                  	        	cities = data.cities;
                  	        	maxNum2 = 10;
                  	        	var cityArray=new Array();
            	            	for(var prop in cities){
            	            		
            	            		if(cities[prop].name!='other'){
            	            			var oneData={};
            	            			mpNav_provinceNumMap[cities[prop].name]=cities[prop].productNum;
            	            			oneData['name']=cities[prop].name;
            	            			oneData['value']=cities[prop].productNum;
            	            			cityArray.push(oneData);
            	            			
            	            			if(cities[prop].productNum > maxNum2)
            	            				maxNum2 = cities[prop].productNum;
            	            		}
                  	          	}
            	            	
            	            	myOption = {
                                	    title : {
                                	        text: name + '省产品情况图',
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
                                	        max: maxNum2,
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
                                	            data:cityArray
                                	        }
                                	    ]
                                	};
            	            	function cityConsole(param){
            	            		productList = '';
                                	var name = param.name;
                                	$("#product_list_map ul").html('');
                                	$.ajax({
                           			 type: "POST",
                           	          url: "../product/getProductByCity",
                           	          data: {city:name},
                           	          dataType : "json",
                           	          async:false,
                           	          error: function () {
                           	        	  
                           	          },
                           	          success: function (data) {
                           	        	productData = data.products;
                                		for (product in productData){
                                			productList += htmlTemp.temp(productData[product]);
                                		}
                                		if(mpNav_provinceNumMap[param.name] != 0){
                                			$("#map_sx_title").css("display","block");
                                    		$("#map_sx_title").html('');
                                    		$("#map_sx_title").html(param.name+"&nbsp;有 <strong style='color=#f00'>"+mpNav_provinceNumMap[param.name]+"</strong> 个平台");
                                    		$("#product_list_map ul").html(productList);
                                    		var height1=$("#product_list_map").parent().height();
                                    		$("#product_list_map").parent().height(height1+$("#product_list_map").height());
                                		}
                                		else{
                                			$("#map_sx_title").css("display","none");
                                    		$("#map_sx_title").html('');
                                		}
                           	          }
                           		 	});
            	            	}
            	            	myOption.tooltip.formatter = '{b}：{c}'; 
            	            	myOption.series[0].mapType = name; 
            	            	prChart.on(ecConfig.EVENT.CLICK, cityConsole);
            	            	prChart.setOption(myOption,true);
                  		 	}
                    	});
                    	


                    }

                    myChart.on(ecConfig.EVENT.CLICK, eConsole);
                  
                    myChart.setOption(option); 
                    
                    var temp = {};
                    temp.name = "浙江";
                    eConsole(temp);
	            }

	         