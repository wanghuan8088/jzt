$(function(){
	$("#add").click(function(){
		var id = $("#id").val();
		var plat =$('input[name="plat"]').val();
		var ctx = $("#ctx").html();
		 $.ajax({
			 type: "POST",
	            url: ctx+'/admin/exposure/bind',
	            data: {"id":id,"plat":plat},
	            dataType : "json",
	            error: function () {
	            },
	            success: function (result) {
	            	
	            	var state = result.state;
	            	 
	            	if(state == 1){
	            		var urls = ctx + '/admin/exposure/delete/' + result.erp.id; 
	            		var html = "<tr><td id = '" + plat + " '>" + plat + "</td><td><a href= " +urls+ ">删除</a></td></tr>";
	            		$("#allPlats").append(html);
	            		
	            	}
	            	else if(state == 0){
	            		alert(result.message);
	            	}else{
	            		alert(result.message);
	            	}
	            }
		 });
		 return false;
	});
	
});

