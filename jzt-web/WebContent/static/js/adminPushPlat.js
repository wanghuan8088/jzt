  	$(function(){

  		$("#content_ul").show();
	 	var totalPageNum=Math.ceil(parseInt($("#total").html())/10);
 		//var totalPageNum=${size};
 	 	var curPage=$("#page").html();
 	 	var size=4;
 	 	var ctx=$("#ctx").html();
 	 	var url=ctx+"/admin/content/pushPlat?page=";
 	 	if(GetArgsFromHref("keyword")!="")
 	 	{
 	 		document.getElementById("keyword").value=decodeURI(GetArgsFromHref("keyword"));
 	 		url=ctx+"/admin/content/pushPlat?keyword="+GetArgsFromHref("keyword")+"&page=";
 	 	}
 	 	if ($("#total").html()!='0')
 	 	{initPage(url,totalPageNum,parseInt(curPage),size);}
 	 	else
 	 	{$('.pagination').hide();}
	 });
function search(){
	var ctx=$("#ctx").html();
	 var tmp=ctx+"/admin/content/pushPlat?keyword="+$("#keyword").val()+"&page=0";
	 window.location.href=tmp;
}

function editAdWord(){
	var ctx=$("#ctx").html();
	var name = $("#name").val();
	var feature = $("#word").val();
	var url = ctx + "/admin/ad/editAdWord"
	$.ajax({
		 type: "POST",
         url: url,
         data: {name:name,feature:feature},
         dataType : "json",
         async:false,
         error: function () {
       	  alert("修改失败");
         },
         success: function (result) {
       	  alert(result.info);
       	  window.location.replace(ctx + "/admin/content/pushPlat"); 
         }
	 });
}