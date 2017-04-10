/**
 * 
 */


$(function(){
	$("#order_tbody").find("tr").each(function(){
		//console.log($(this).attr("var"));
	});
	
	
	$(".orderTable").on("click",".order_up",function(){
		var thisPreIndex=$(this).parent().parent().attr("index");
		//alert(hotplistSize);
		if(thisPreIndex==1) return;
		
		var prefer=thisPreIndex-1;
		var present=thisPreIndex;
		
		
		$("#"+present+"_td").html(prefer+"");
		$("#"+prefer+"_td").html(present+"");
		$("#"+present+"_td").attr("index",prefer);
		$("#"+prefer+"_td").attr("index",present);
		$("#"+present+"_td").attr("id","x_td");
		$("#"+prefer+"_td").attr("id",present+"_td");
		$("#"+"x_td").attr("id",prefer+"_td");
		
		var html_present=$("#"+present+"_tr").html();
		var html_prefer=$("#"+prefer+"_tr").html();
		$("#"+present+"_tr").html(html_prefer);
		$("#"+prefer+"_tr").html(html_present);
		//alert($(this).parent().parent().attr("id"));
	});
	
	$(".orderTable").on("click",".order_down",function(){
		var thisPreIndex=parseInt($(this).parent().parent().attr("index"));
		if(thisPreIndex==hotplistSize) return;
		
		var next=thisPreIndex+1+"";
		var present=thisPreIndex+"";
		
		var nextId=next+"_td";
		var presentId=present+"_td";
		
		$("#"+present+"_td").html(next+"");
		$("#"+next+"_td").html(present+"");
		$("#"+present+"_td").attr("index",next);
		$("#"+next+"_td").attr("index",present);
		$("#"+present+"_td").attr("id","x_td");
		$("#"+next+"_td").attr("id",present+"_td");
		$("#x_td").attr("id",next+"_td");
		
		
		var html_present=$("#"+present+"_tr").html();
		var html_next=$("#"+next+"_tr").html();
		$("#"+present+"_tr").html(html_next);
		$("#"+next+"_tr").html(html_present);
		
	});
	
	$("#submit_btn").click(function(){
		var newIdOrder=new Array();
		var preIndexOrder=new Array();
		var data={};
		
		var paramId="";
		var paramOrder="";
		
		$("#order_tbody").find("tr").each(function(){
			var newId=$(this).find("td:eq(0)").attr("var");
			var index=$(this).find("td:eq(0)").attr("preIndex");
			var hotId=$(this).find("td:eq(0)").attr("idx");
			
			newIdOrder.push(newId);
			preIndexOrder.push(index);
			//console.log($(this).attr("var"));
			paramId=paramId+" "+hotId;
			paramOrder=paramOrder+" "+index;
		});
		data["newIdOrder"]=newIdOrder;
		data["preIndexOrder"]=preIndexOrder;
		
		var url=$(this).attr("post");
		var target=$(this).attr("target");
		
	//	alert(url) ;
	//	alert(paramOrder) ;
	//	alert(paramId) ;
	
		$.ajax({
        	type : 'POST' ,
        	url : url ,
        	async:false, 
        	data : {
        		"paramId":paramId,"paramOrder":paramOrder
            } ,
        	success: function (data) { 
        	 	if(data['isSuccess']){
        	 		
        	 		location.href = target ;         	 		 
                }else {
                	alert("网络故障!") ;
                }
        	 }
        }) ;
        //location.href=target;
	});
	
});