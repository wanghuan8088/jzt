$(function(){
	$("#content_ul").show();
		 	var totalPageNum=Math.ceil(parseInt($("#total").html())/10);
	 		//var totalPageNum=${size};
	 	 	var curPage=$("#page").html();
	 	 	var size=4;
	 	 	var ctx=$("#ctx").html();
	 	 	var url=ctx+"/admin/content/hotPlat?page=";
	 	 	if(GetArgsFromHref("keyword")!="")
	 	 	{
	 	 		document.getElementById("keyword").value=decodeURI(GetArgsFromHref("keyword"));
	 	 		url=ctx+"/admin/content/hotPlat?keyword="+GetArgsFromHref("keyword")+"&page=";
	 	 	}
	 	 	if ($("#total").html()!='0')
	 	 	{initPage(url,totalPageNum,parseInt(curPage),size);}
	 	 	else
	 	 	{$('.pagination').hide();}
		 });
function search(){
		var ctx=$("#ctx").html();
		 var tmp=ctx+"/admin/content/hotPlat?keyword="+$("#keyword").val()+"&page=0";
		 window.location.href=tmp;
	}
	 