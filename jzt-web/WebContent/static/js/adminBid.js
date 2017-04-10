
	$(function(){
		$("#bid_ul").show();
		var totalPageNum=Math.ceil(parseInt($("#total").html())/10);
 	 	var curPage=$("#page").html();
 	 	var size=4;
 	 	var ctx=$("#ctx").html();
 	 	var url=ctx+"/admin/bid/list?page=";
 	 	if(GetArgsFromHref("type")!="")
 	 	{
 	 		url=ctx+"/admin/bid/list?type="+GetArgsFromHref("type")+"&page=";
 	 	}
 	 	if ($("#total").html()!='0')
 	 	{initPage(url,totalPageNum,parseInt(curPage),size);}
 	 	else
 	 	{$('.pagination').hide();}
 	 	
 	});
 
 	$("#bid_ul").css("display","block");

	function searchType(obj)
	{
 		var ctx=$("#ctx").html();
 		
 		var tmp=ctx+"/admin/bid/list?type="+$(obj).find('span').html();
 		window.location.href=tmp;
 	}