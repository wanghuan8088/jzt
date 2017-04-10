$(function(){
	$("#exposure_ul").show();
		 	var totalPageNum=Math.ceil(parseInt($("#total").html()));
	 	 	var curPage=$("#page").html();
	 	 	var size=4;
	 	 	var ctx=$("#ctx").html();
	 	 	var url=ctx+"/admin/exposure/list?page=";
	 	 	if(GetArgsFromHref("state")!="")
	 	 	{
//	 	 		document.getElementById("keyword").value=decodeURI(GetArgsFromHref("keyword"));
	 	 		url=ctx+"/admin/exposure/list?state="+GetArgsFromHref("state")+"&page=";
	 	 	}
	 	 	if ($("#total").html()!='1' && $("#total").html()!='0')
	 	 	{initPage(url,totalPageNum,parseInt(curPage),size);}
	 	 	else
	 	 	{$('.pagination').hide();}
		 });


function searchOption(obj){
		var ctx=$("#ctx").html();
		var state = $(obj).find('span').html();
		var tmp=ctx+"/admin/exposure/list?state="+$(obj).find('span').html();
		if(state == -2)
			tmp=ctx+"/admin/exposure/list";
		window.location.href=tmp;
	}