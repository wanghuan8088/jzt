$(function(){
	$(window).scroll(function(){
		if($(document).scrollTop()<80){
			$(".sidebar").css("top",50-$(document).scrollTop());
		}else if($(document).scrollTop()>80){
			$(".sidebar").css("top",0);
		}

	});
})