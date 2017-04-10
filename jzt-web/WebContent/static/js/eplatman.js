/**
 * 
 */

$(document).ready(function () { 
	$(".select_input").each(function(){
		var org=($(this).attr("orgvalue"));
		if(org!=null){
			var target=$(this).find("[value=\""+org+"\"]");
			target.attr("selected","true");
			
		}
		
		//alert($(this).find("option:selected").val());
	}); 
	
	
	
	
});