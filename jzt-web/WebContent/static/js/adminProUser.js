$(function(){
	$("#prouser_ul").show();
 	});
$(function(){
 		var totalPageNum=Math.ceil(parseInt($("#total").html())/10);
 		//var totalPageNum=${size};
 	 	var curPage=$("#page").html();
 	 	var size=4;
 	 	var ctx=$("#ctx").html();
 	 	var url=ctx+"/admin/prouser/list?page=";
 	 	if(GetArgsFromHref("keyword")!="")
 	 	{
 	 		document.getElementById("keyword").value=decodeURI(GetArgsFromHref("keyword"));
 	 		url=ctx+"/admin/prouser/list?keyword="+GetArgsFromHref("keyword")+"&type="+GetArgsFromHref("type")+"&page=";
 	 	}
 	 	else if(GetArgsFromHref("state")!="")
 	 	{

 	 		url=ctx+"/admin/prouser/list?state="+GetArgsFromHref("state")+"&page=";
 	 	}
 	 	if ($("#total").html()!='0')
 	 	{initPage(url,totalPageNum,parseInt(curPage),size);}
 	 	else
 	 	{$('.pagination').hide();}
 	 	
 	 	
 	 	
 	});
 	

 	
 	function search(){
 		var ctx=$("#ctx").html();
 		
 		var tmp=ctx+"/admin/prouser/list?keyword="+$("#keyword").val()+"&type="+$("#typeId").html()+"&page=0";
 		window.location.href=tmp;
 	}
 	function operate(type,obj){
 		var ctx=$("#ctx").html();
 		var id=$(obj).parent().find('.uid').html();
 		var tmp="#inputfeedback-info"+id;
 		var feedback_info=$(tmp).val();
 		$.ajax({  
 	        type: 'POST',  
 	        url: ctx+"/admin/prouser/change" ,  
 	        dataType: 'json',  
 	        data: {
 	        	state:type,
 	        	id:id,
 	        	feedback_info:feedback_info
 	        	},  
 	        success: function (data) {  
 	        	var state = data.state;
            	if(state == 1){
            		//状态判断或者直接刷新，还未实现
            		var tmp=ctx+"/admin/prouser/list";
            		window.location.href=tmp;
            	}
            	else{
            		alert("审核失败");
            	}
 	  
 	        }
 	    });  
 	}
 	function searchChange(obj){
 		$("#type").html($(obj).html()+' <span class="caret"></span><span id="typeId"style="display:none">'+$(obj).attr('id')+'</span>');
 	}
 	function searchOption(obj){
 		var ctx=$("#ctx").html();
 		
 		var tmp=ctx+"/admin/prouser/list?state="+$(obj).find('span').html();
 		window.location.href=tmp;
 	}
 	
 	