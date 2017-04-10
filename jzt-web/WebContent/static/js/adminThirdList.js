
	$(function(){
		$("#news_ul").show();
		var totalPageNum=Math.ceil(parseInt($("#total").html())/10);
 	 	var curPage=$("#page").html();
 	 	var size=4;
 	 	var ctx=$("#ctx").html();
 	 	var url=ctx+"/admin/news/list?page=";
 	 	if(GetArgsFromHref("keyword")!="")
 	 	{
 	 		document.getElementById("keyword").value=decodeURI(GetArgsFromHref("keyword"));
 	 		url=ctx+"/admin/news/list?keyword="+GetArgsFromHref("keyword")+"&page=";
 	 	}
 	 	else if(GetArgsFromHref("type")!="")
 	 	{
 	 		url=ctx+"/admin/news/list?type="+GetArgsFromHref("type")+"&page=";
 	 	}
 	 	if ($("#total").html()!='0')
 	 	{initPage(url,totalPageNum,parseInt(curPage),size);}
 	 	else
 	 	{$('.pagination').hide();}
 	 	
 	});
 
 	$("#news_ul").css("display","block");
	 function search(){
		 	var ctx=$("#ctx").html();
	 		var tmp=ctx+"/admin/news/list?keyword="+$("#keyword").val()+"&page=0";
	 		window.location.href=tmp;
	 	}

	function searchType(obj)
	{
 		var ctx=$("#ctx").html();
 		
 		var tmp=ctx+"/admin/news/list?type="+$(obj).find('span').html();
 		window.location.href=tmp;
 	}