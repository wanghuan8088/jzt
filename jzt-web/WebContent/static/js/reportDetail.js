$()

$("#add").click(function(){
	var id = $("#id").val();
	var plat =$('input[name="plat"]').val();
	
	 $.ajax({
		 type: "POST",
            url: ctx+'/admin/exposure/bind',
            data: {"id":id,"plat":plat},
            dataType : "json",
            error: function () {
            },
            success: function (result) {
            	
            	var state = result.state;
            	var urls = ctx + '/admin/exposure/delete/' + result.erp.id;  
            	if(state == 1){
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
	


