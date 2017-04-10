function tab_switch(id)
{
	if(id==1) {
		$('#index-btn').addClass("active");
		$('#basic-btn').removeClass("active");
		$('#sum-btn').removeClass("active");
		$('#index').addClass("show in");
		$('#basic').removeClass("show in");
		$('#sum').removeClass("show in");
	} else if(id==2) {
		$('#index-btn').removeClass("active");
		$('#basic-btn').addClass("active");
		$('#sum-btn').removeClass("active");
		$('#index').removeClass("show in");
		$('#basic').addClass("show in");
		$('#sum').removeClass("show in");
	} else if(id==3) {
		$('#index-btn').removeClass("active");
		$('#basic-btn').removeClass("active");
		$('#sum-btn').addClass("active");
		$('#index').removeClass("show in");
		$('#basic').removeClass("show in");
		$('#sum').addClass("show in");
	} 
}
$(document).ready(function() {
	var a = document.getElementById("changename").innerHTML;
	if (a.indexOf("（")<=0)
		{
		$("#zhename").text(a);
		}
	else{
		var name=a.split("（")[0]; 
		var beforename=a.split("（")[1];
		beforename = "（"+beforename;
		//alert(beforename);
		$("#yuanname").text(beforename);
		$("#zhename").text(name);
	}
	
});