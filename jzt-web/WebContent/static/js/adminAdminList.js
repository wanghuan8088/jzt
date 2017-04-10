$(function(){
	
	$("#user_ul").show();
 	var totalPageNum=Math.ceil(parseInt($("#total").html())/10);
	var curPage=$("#page").html();
	var size=4;
	var ctx=$("#ctx").html();
	var url=ctx+"/admin/user/adminlist?page=";
	if ($("#total").html()!='0')
	{initPage(url,totalPageNum,parseInt(curPage),size);}
	else
	{$('.pagination').hide();}
	var url="${ctx}/admin/user/adminlist?page=";

});

function deleteAdmin(id){
	var ctx=$("#ctx").html();
	var url = ctx + "/admin/user/deleteAdmin";
	$.ajax({
		 type: "POST",
         url: url,
         data: {id:id},
         dataType : "json",
         async:false,
         error: function () {
       	  alert("失败");
         },
         success: function (result) {
       	  alert(result.info);
       	window.location.replace(ctx + "/admin/user/adminlist");
         }
	 });
}