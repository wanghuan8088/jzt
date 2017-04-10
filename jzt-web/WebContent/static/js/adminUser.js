
 	$(function(){
 		$("#user_ul").show();
 		var totalPageNum=Math.ceil(parseInt($("#total").html())/10);
 		//var totalPageNum=${size};
 	 	var curPage=$("#page").html();
 	 	var size=4;
 	 	var ctx=$("#ctx").html();
 	 	var url=ctx+"/admin/user/list?page=";
 	 	if(GetArgsFromHref("keyword")!="")
 	 	{
 	 		document.getElementById("keyword").value=decodeURI(GetArgsFromHref("keyword"));
 	 		url=ctx+"/admin/user/list?keyword="+GetArgsFromHref("keyword")+"&type="+GetArgsFromHref("type")+"&page=";
 	 	}
 	 	else if(GetArgsFromHref("state")!="")
 	 	{

 	 		url=ctx+"/admin/user/list?state="+GetArgsFromHref("state")+"&page=";
 	 	}
 	 	if ($("#total").html()!='0')
 	 	{initPage(url,totalPageNum,parseInt(curPage),size);}
 	 	else
 	 	{$('.pagination').hide();}
 	 	
 	 	
 	 	
 	});
 	

 	
 	function search(){
 		var ctx=$("#ctx").html();
 		
 		var tmp=ctx+"/admin/user/list?keyword="+$("#keyword").val()+"&type="+$("#typeId").html()+"&page=0";
 		window.location.href=tmp;
 	}
 	function searchChange(obj){
 		$("#type").html($(obj).html()+' <span class="caret"></span><span id="typeId"style="display:none">'+$(obj).attr('id')+'</span>');
 	}
 	function searchOption(obj){
 		var ctx=$("#ctx").html();
 		var state = $(obj).find('span').html();
 		var tmp=ctx+"/admin/user/list?state="+$(obj).find('span').html();
 		if(state == 2)
 			tmp=ctx+"/admin/user/list";
 		window.location.href=tmp;
 	}
 	
 	