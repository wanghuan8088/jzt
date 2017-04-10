
	$(function(){
		$("#prouser_ul").show();
		var totalPageNum=Math.ceil(parseInt($("#total").html())/10);
 	 	var curPage=$("#page").html();
 	 	var size=4;
 	 	var ctx=$("#ctx").html();
 	 	var url=ctx+"/admin/temp/list?page=";
 	 	if(GetArgsFromHref("pname")!="")
 	 	{
 	 		document.getElementById("keyword").value=decodeURI(GetArgsFromHref("pname"));
 	 		url=ctx+"/admin/temp/list?pname="+GetArgsFromHref("pname")+"&page=";
 	 	}
 	 	if ($("#total").html()!='0')
 	 	{initPage(url,totalPageNum,parseInt(curPage),size);}
 	 	else
 	 	{$('.pagination').hide();}
 	 	
 	});
 
 	$("#bid_ul").css("display","block");
 	function search(){
		var ctx=$("#ctx").html();
		 var tmp=ctx+"/admin/temp/list?pname="+$("#keyword").val()+"&page=0";
		 window.location.href=tmp;
	}

	$(document).ready(function () { 
	$(".tagbutton").each(function(){
		var org=($(this).attr("tagvalue"));
		if(org == 1){
			$(this).addClass("btn-primary");
		}
	});
	});
	
	