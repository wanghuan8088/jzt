/**
 * 
 */
function delBind(){
	alert("fch");
	return false;
}

/**
 * 
 */
//日历控件
$(function(){
	
	$(".form_date").datetimepicker({format: 'yyyy-mm-dd',autoclose:true,language: 'zh-CN',
	    weekStart: 1,
	    todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0}).on('changeDate', function(ev){
		});
	//$(".datetimepicker").css("width","500px");
	$('.table-condensed').css("width","300px");
	
	
});

/**
 * 
 $(document).ready(function(){});
 */



$(function(){
	 $("#provinceId").change(function(){
		var provinceName = $(this).find("option:selected").text();
	    $("#provinceName").val(provinceName);
	 });
});


$(".select_input").each(function(){
	var org=($(this).attr("orgvalue"));
	if(org!=null){
		var target=$(this).find("[value=\""+org+"\"]");
		target.attr("selected","true");
	}
	//alert($(this).find("option:selected").val());
});