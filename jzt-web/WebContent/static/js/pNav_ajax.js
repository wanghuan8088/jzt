/**
 * 
 */
$(function(){
	
}
);
var loadFlag=false;

var jsonData;
var jsonURL = "../product/navQuery";

$.getJSON(jsonURL,function(data) {
	//alert(data);
	console.log(data);
	jsonData=data;
	parseJson(jsonData);
	loadFlag=true;
	
});

function parseJson(jsonData){
	String.prototype.temp = function(obj) {
	    return this.replace(/\$\w+\$/gi, function(matchs) {
	        var returns = obj[matchs.replace(/\$/g, "")];		
	        return (returns + "") == "undefined"? "": returns;
	    });
	};
	var htmlList = '';
	var htmlTemp = $("#productTextArea").text();
	//var provinceTemp=$("#provinceTextArea").text();
	
	var provinceArray = new Array();
	var provinceMap = {};
	var provinceNumMap = {};
	provinceMap['other']='';
	provinceNumMap['other']=0;
	var provinceName=[];
	var preProName=null;
	
	jsonData.platList.forEach(function(object) {
		if(object.iconUrl==null){
			object.iconUrl="../static/image/null.png";
		}else{
			object.iconUrl=""+object.iconUrl;
		}
		
		if(object.provinceName==null){
			provinceMap['other']+=htmlTemp.temp(object);
			provinceNumMap['other']+=1;
		}else if(provinceMap[object.provinceName]=='undefined'||provinceMap[object.provinceName]==null){
			provinceMap[object.provinceName]=htmlTemp.temp(object);
			provinceNumMap[object.provinceName]=1;
		}else{
			provinceMap[object.provinceName]+=htmlTemp.temp(object);
			provinceNumMap[object.provinceName]+=1;
		}
	   //htmlList += htmlTemp.temp(object);

	});
	//console.log(htmlList);
	//var x=$("#product_test_list");
	//alert(x);
	//console.log(x.innerHTML);
	$("#productlist").html('');
	for(var prop in provinceMap){
	    if(provinceMap.hasOwnProperty(prop)){
	    	if(provinceNumMap[prop]>0){
	    		var provinceObject={};
		    	provinceObject['provinceName']=prop;
		    	provinceObject['productNum']=provinceNumMap[prop];
		    	
		    	var provinceTemp=$("#provinceTextArea").text();
		    	var provicenHtml=provinceTemp.temp(provinceObject);
		    	
		    	$("#productlist").append(provicenHtml);
		    	$("#productlist .rnav ul:last").html('');
		    	$("#productlist .rnav ul:last").html(provinceMap[prop]);
		    	//console.log(provinceMap[prop]);
	    	}
	    	
	    }
	}
//	$("#product_test_list").html('');
//	$("#product_test_list").html(htmlList);
}


var topLoaderRunning = false;
var $topLoader;
function loadData(){ 

	var width=window.screen.width;
	var height=window.screen.height;
	var topLoaderT;
	var topLoaderL;
	if(height/2-128<0)
		topLoaderT=0;
	else topLoaderT=height/2-256;
	if(document.body.clientWidth/2-128<0)
		topLoaderL=0;
	else topLoaderL=document.body.clientWidth/2-128;


	$("#loadBack").removeAttr("style");
	$("#topLoader").removeAttr("style");
	
	$("body").css({"position":"fixed"});
	if(width<$("body").width())width=$("body").width();
	$("#pNav_content").css("display","none");
	$("#loadBack").css({"position":"relative","background":"#000","height":height+1000,"width":width+1000});
	$("#topLoader").css({"position":"absolute","top":topLoaderT,"left":topLoaderL});
	
	if(!topLoaderRunning){
		$topLoader = $("#topLoader").percentageLoader({width: 256, height: 256, controllable : true, progress : 0, onProgressUpdate : function(val) {
		    $topLoader.setValue(Math.round(val * 100.0));
		  }});
	}else{
		$topLoader.setProgress(0);
		$topLoader.setValue(0);
		topLoaderRunning=false;
	}
	
    if (topLoaderRunning) {
    	
        return;
      }
      topLoaderRunning = true;
      $topLoader.setProgress(0);
      $topLoader.setValue('0%');
      var kb = 0;
      var totalKb = 100;
      var accessFlag=false;
      var animateFunc = function() {
    	if(!loadFlag&&!accessFlag){
    		console.log("1");
    		accessFlag=true;
      		
      	}else{
      		console.log("2");
      		accessFlag=false;
      		kb += Math.round(Math.random()*10);
      	}
        
        if(kb>100) {
        	kb=100;
        }
        $topLoader.setProgress(kb / totalKb);
        $topLoader.setValue(kb.toString() + '%');
        
        if (kb < totalKb) {
          setTimeout(animateFunc, 50);
        } else {
        	
        	console.log("fch finish");
          topLoaderRunning = false;
          $("#loadBack").fadeOut();
	      $("#topLoader").css("display","none");
	      
	      //$("#pNav_content").removeAttr("style");

          $("body").removeAttr("style");
          $("body").css("min-width","960px");
	      $("#topLoader").removeAttr("style").css("display","none");
	      //$("#pNav_content").css("display","block");
        }
      };
      
      setTimeout(animateFunc, 50);
}






$(function(){
	
	var question_jsonURL = "../product/wentipintai";

	$.getJSON(question_jsonURL,function(data) {
		//alert(data);
		//console.log("fch_question");
		var html="";
		data.qstList.forEach(function(object) {
			//console.log(object.id);
			//console.log(object.description);
			html=html+"<li var=\""+object.id+"\">"+object.description+"</li>"
		});
		$("#wenti_ul").append(html);
		//<li var="1">体现困难</li>
		
		
	});
	
	
	$.post("../product/navQuery",{"pState":"-1"},function(wenti_data){
		parseJsonForWenti(wenti_data);
		
	},"json");	
	
//	 $("#wenti_ul").on("click","li",function(){
//		 $(this).parents("ul").children().find(".cur").removeClass("cur");
//		$(this).addClass("cur");
//		var wenti=$(this).attr("var");
//		
//		var param={"pState":wenti};
//		
//		$.post("../product/navQuery",param,function(data){
//			parseJsonForWenti(data);
//			
//		},"json");	
//	 });
	
});

function parseJsonForWenti(wenti_data){
	String.prototype.temp = function(obj) {
	    return this.replace(/\$\w+\$/gi, function(matchs) {
	        var returns = obj[matchs.replace(/\$/g, "")];		
	        return (returns + "") == "undefined"? "": returns;
	    });
	};
	var htmlTemp = $("#productTextArea").text();
	
	
	var wenti_provinceMap = {};
	var wenti_provinceNumMap = {};
	wenti_provinceMap['other']='';
	wenti_provinceNumMap['other']=0;
	
	
	wenti_data.platList.forEach(function(object) {
		//object.iconUrl=""+object.iconUrl;
		if(object.iconUrl==null){
			object.iconUrl="../static/image/null.png";
		}else{
			object.iconUrl=""+object.iconUrl;
		}
		if(object.provinceName==null){
			wenti_provinceMap['other']+=htmlTemp.temp(object);
			wenti_provinceNumMap['other']+=1;
		}else if(wenti_provinceMap[object.provinceName]=='undefined'||wenti_provinceMap[object.provinceName]==null){
			wenti_provinceMap[object.provinceName]=htmlTemp.temp(object);
			wenti_provinceNumMap[object.provinceName]=1;
		}else{
			wenti_provinceMap[object.provinceName]+=htmlTemp.temp(object);
			wenti_provinceNumMap[object.provinceName]+=1;
		}
	   
	});
	
	
	$("#issue_productlist").html('');
	for(var prop in wenti_provinceMap){
	    if(wenti_provinceMap.hasOwnProperty(prop)){
	    	if(wenti_provinceNumMap[prop]>0){
	    		var wenti_provinceObject={};
	    		wenti_provinceObject['provinceName']=prop;
	    		wenti_provinceObject['productNum']=wenti_provinceNumMap[prop];
		    	
		    	var provinceTemp=$("#provinceTextArea").text();
		    	var provicenHtml=provinceTemp.temp(wenti_provinceObject);
		    	
		    	$("#issue_productlist").append(provicenHtml);
		    	$(".rnav ul:last").html('');
		    	$(".rnav ul:last").html(wenti_provinceMap[prop]);
	    	}
	    	
	    }
	}
	
	
	
	

}