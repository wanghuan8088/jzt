
	$(function(){
		$("#report_ul").show();
		var totalPageNum=Math.ceil(parseInt($("#total").html())/10);
 	 	var curPage=$("#page").html();
 	 	var size=4;
 	 	var ctx=$("#ctx").html();
 	 	var url=ctx+"/admin/report/reportList?page=";
 	 	
 	 	if ($("#total").html()!='0')
 	 	{initPage(url,totalPageNum,parseInt(curPage),size);}
 	 	else
 	 	{$('.pagination').hide();}
 	 	
 	});
 
 	$("#report_ul").css("display","block");
	