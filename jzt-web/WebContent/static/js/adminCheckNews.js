$(function(){
		$("#news_ul").show();
		var totalPageNum=Math.ceil(parseInt($("#total").html())/10);
 		//var totalPageNum=${size};
 	 	var curPage=$("#page").html();
 	 	var size=4;
 	 	var ctx=$("#ctx").html();
 	 	var url=ctx+"/admin/news/checkNews?page=";
 	 	if(GetArgsFromHref("keyword")!="")
 	 	{
 	 		document.getElementById("keyword").value=decodeURI(GetArgsFromHref("keyword"));
 	 		url=ctx+"/admin/news/checkNews?keyword="+GetArgsFromHref("keyword")+"&page=";
 	 	}
 	 	else if(GetArgsFromHref("state")!="")
 	 	{
 	 		url=ctx+"/admin/news/checkNews?state="+GetArgsFromHref("state")+"&page=";
 	 	}
 	 	if ($("#total").html()!='0')
 	 	{initPage(url,totalPageNum,parseInt(curPage),size);}
 	 	else
 	 	{$('.pagination').hide();}
 	 	
 	});
 
 	$(".edit_news_btn").click(function(){
 		var href=($(this).children().attr("href"));
 		//console.log()
 	});
 	function search(){
 		var ctx=$("#ctx").html();
 		var tmp=ctx+"/admin/news/checkNews?keyword="+$("#keyword").val()+"&page=0";
 		window.location.href=tmp;
 	}

	function searchType(obj)
	{
 		var ctx=$("#ctx").html();
 		
 		var tmp=ctx+"/admin/news/checkNews?state="+$(obj).find('span').html();
 		window.location.href=tmp;
 	}