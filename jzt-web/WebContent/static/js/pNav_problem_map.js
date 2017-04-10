/**
 * 
 */
// 引入主题
var curTheme;
var programPath=$('#cxt').html();
require([programPath+'/static/js/chart/red'], function(tarTheme){
    curTheme = tarTheme;
});

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
	                	//var mapNavJsonData2;
	     	            var jsonURL = "../product/navQuery";
	     	            var parm = {
	     	            	pState: -1,
	     	   		  	};
	     	            
     	            	$.getJSON(jsonURL,parm,function(data) {
	     	            	//alert(data);
     	            		
	     	            	mapNavJsonData2=data;
	     	            	parseJsonForMap2(mapNavJsonData2);
	     	            	initMapEcahrts2(ec,mapNavJsonData2);
	     	            });
	                }
	              );
	            
	            var mapNavJsonData2;
	            var mpNav_provinceMap2 = {};
            	var mpNav_provinceNumMap2 = {};
            	mpNav_provinceMap2['other']='';
            	mpNav_provinceNumMap2['other']=0;
            	var totalNum2=0;
            	var maxNum2=0;
            	var dataArray2=new Array();
            	var lastPro=null;
            	
	            function parseJsonForMap2(mapNavJsonData2){
	            	mapNavJsonData2;
		            mpNav_provinceMap2 = {};
	            	mpNav_provinceNumMap2 = {};
	            	mpNav_provinceMap2['other']='';
	            	mpNav_provinceNumMap2['other']=0;
	            	totalNum2=0;
	            	maxNum2=0;
	            	dataArray2=new Array();
	            	
	            	String.prototype.temp = function(obj) {
	            	    return this.replace(/\$\w+\$/gi, function(matchs) {
	            	        var returns = obj[matchs.replace(/\$/g, "")];		
	            	        return (returns + "") == "undefined"? "": returns;
	            	    });
	            	};
	            	var htmlTemp = $("#productTextArea").text();
	            	
	            	
	            	mapNavJsonData2.platList.forEach(function(object) {
	            		object.iconUrl=""+object.iconUrl;
	            		if(object.provinceName==null){
	            			mpNav_provinceMap2['other']+=htmlTemp.temp(object);
	            			mpNav_provinceNumMap2['other']+=1;
	            		}else if(mpNav_provinceMap2[object.provinceName]=='undefined'||mpNav_provinceMap2[object.provinceName]==null){
	            			mpNav_provinceMap2[object.provinceName]=htmlTemp.temp(object);
	            			mpNav_provinceNumMap2[object.provinceName]=1;
	            		}else{
	            			mpNav_provinceMap2[object.provinceName]+=htmlTemp.temp(object);
	            			mpNav_provinceNumMap2[object.provinceName]+=1;
	            		}
	            	   
	            	});
	            	
	            	var numArray=new Array();
	            	for(var prop in mpNav_provinceMap2){
	            		
	            		if(prop!='other'){
	            			var oneData={};
	            			oneData['name']=prop;
	            			oneData['value']=mpNav_provinceNumMap2[prop];
	            			dataArray2.push(oneData);
	            			numArray.push(oneData['value']);
	            		}
	            	}
	            	if(mpNav_provinceMap2["西藏"]==null||mpNav_provinceMap2["西藏"]=="undefined"){
	            		var oneData={};
            			oneData['name']="西藏";
            			oneData['value']=0;
            			dataArray2.push(oneData);
	            	}
	            	if(mpNav_provinceMap2["青海"]==null||mpNav_provinceMap2["青海"]=="undefined"){
	            		var oneData={};
            			oneData['name']="青海";
            			oneData['value']=0;
            			dataArray2.push(oneData);
	            	}
	            	totalNum2=mapNavJsonData2.platList.length;
	            	maxNum2=Math.ceil(Math.max.apply(null, numArray)/100)*100+100;
	            	maxNum2=100;
	            	
	          
	            }
	            function initMapEcahrts2(ec,mapNavJsonData2){
	            	
	            	var myChart2 = ec.init(document.getElementById('problem_map'),curTheme); 
                	
                	option2 = {
                    	    title : {
                    	        text: '各省份问题平台分布图',
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
                    	            name: '问题平台数',
                    	            type: 'map',
                    	            mapType: 'china',
                    	            roam: false,
                    	            itemStyle:{
                    	                normal:{label:{show:true}},
                    	                emphasis:{label:{show:true}}
                    	            },
                    	            data:dataArray2
                    	        }
                    	    ]
                    	};
                	
                	var ecConfig2 = require('echarts/config');
                    function eConsole2(param) {
                    	lastPro=param.name;
                    	$("#problem_product_list_map ul").html('');
                    	if(mpNav_provinceMap2[param.name]!=null&&mpNav_provinceMap2[param.name]!='undefined'){
                    		$("#problem_map_sx_title").css("display","block");
                    		$("#problem_map_sx_title").html('');
                    		
                    		
                    		if($("#wenti_ul .cur").attr("var")==2)
                     			$("#problem_map_sx_title").html(param.name+"&nbsp;有 <strong style='color=#f00'>"+mpNav_provinceNumMap2[param.name]+"</strong> 个提现困难平台");
                     		if($("#wenti_ul .cur").attr("var")==3)
                     			$("#problem_map_sx_title").html(param.name+"&nbsp;有 <strong style='color=#f00'>"+mpNav_provinceNumMap2[param.name]+"</strong> 个停业平台");
                     		if($("#wenti_ul .cur").attr("var")==4)
                     			$("#problem_map_sx_title").html(param.name+"&nbsp;有 <strong style='color=#f00'>"+mpNav_provinceNumMap2[param.name]+"</strong> 个跑路(失联)平台");
                     		if($("#wenti_ul .cur").attr("var")==5)
                     			$("#problem_map_sx_title").html(param.name+"&nbsp;有 <strong style='color=#f00'>"+mpNav_provinceNumMap2[param.name]+"</strong> 个诈骗平台");
                     		if($("#wenti_ul .cur").attr("var")==6)
                     			$("#problem_map_sx_title").html(param.name+"&nbsp;有 <strong style='color=#f00'>"+mpNav_provinceNumMap2[param.name]+"</strong> 个经侦介入平台");
                     		if($("#wenti_ul .cur").attr("var")==7)
                     			$("#problem_map_sx_title").html(param.name+"&nbsp;有 <strong style='color=#f00'>"+mpNav_provinceNumMap2[param.name]+"</strong> 个主动退出平台");
                     		if($("#wenti_ul .cur").attr("var")==1)
                     			$("#problem_map_sx_title").html(param.name+"&nbsp;有 <strong style='color=#f00'>"+mpNav_provinceNumMap2[param.name]+"</strong> 个问题平台");
                    		$("#problem_product_list_map ul").html(mpNav_provinceMap2[param.name]);
                    		var height1=$("#problem_product_list_map").parent().height();
                    		$("#problem_product_list_map").parent().height(height1);
                    	}else{
                    		$("#problem_map_sx_title").css("display","none");
                    		$("#problem_map_sx_title").html('');
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

                    myChart2.on(ecConfig2.EVENT.CLICK, eConsole2);
                    // 为echarts对象加载数据 
                    myChart2.setOption(option2); 
	            }

	       
	            
	            
	            
 $("#wenti_ul").on("click","li",function(){
	 $(this).parents("ul").children().find(".cur").removeClass("cur");
	$(this).addClass("cur");
	var wenti=$(this).attr("var");
	var param;
	if(wenti != null)
		param={"pState":wenti};
	else
		param={"pState":-1};
	
	$.post("../product/navQuery",param,function(data){
		parseJsonForMap2(data);
		refresh(lastPro);
	},"json");	
 });
 
 function refresh(param) {
 	$("#problem_product_list_map ul").html('');
 	if(mpNav_provinceMap2[param]!=null&&mpNav_provinceMap2[param]!='undefined'){
 		$("#problem_map_sx_title").css("display","block");
 		$("#problem_map_sx_title").html('');
 		if($("#wenti_ul .cur").attr("var")==2)
 			$("#problem_map_sx_title").html(param+"&nbsp;有 <strong style='color=#f00'>"+mpNav_provinceNumMap2[param]+"</strong> 个提现困难平台");
 		if($("#wenti_ul .cur").attr("var")==3)
 			$("#problem_map_sx_title").html(param+"&nbsp;有 <strong style='color=#f00'>"+mpNav_provinceNumMap2[param]+"</strong> 个停业平台");
 		if($("#wenti_ul .cur").attr("var")==4)
 			$("#problem_map_sx_title").html(param+"&nbsp;有 <strong style='color=#f00'>"+mpNav_provinceNumMap2[param]+"</strong> 个跑路(失联)平台");
 		if($("#wenti_ul .cur").attr("var")==5)
 			$("#problem_map_sx_title").html(param+"&nbsp;有 <strong style='color=#f00'>"+mpNav_provinceNumMap2[param]+"</strong> 个诈骗平台");
 		if($("#wenti_ul .cur").attr("var")==6)
 			$("#problem_map_sx_title").html(param+"&nbsp;有 <strong style='color=#f00'>"+mpNav_provinceNumMap2[param]+"</strong> 个经侦介入平台");
 		if($("#wenti_ul .cur").attr("var")==7)
 			$("#problem_map_sx_title").html(param+"&nbsp;有 <strong style='color=#f00'>"+mpNav_provinceNumMap2[param]+"</strong> 个主动退出平台");
 		if($("#wenti_ul .cur").attr("var")==1)
 			$("#problem_map_sx_title").html(param+"&nbsp;有 <strong style='color=#f00'>"+mpNav_provinceNumMap2[param]+"</strong> 个问题平台");
 		$("#problem_product_list_map ul").html(mpNav_provinceMap2[param]);
 		var height1=$("#problem_product_list_map").parent().height();
 		$("#problem_product_list_map").parent().height(height1);
 	}else{
 		$("#problem_map_sx_title").css("display","none");
 		$("#problem_map_sx_title").html('');
 	}
 }