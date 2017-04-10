/**
 * 
 */

//href="${ctx }/platuser/enter.view"
function eplat_enter(){
	isLogin();
}

var ctx=$("ctx").attr("value");

function isLogin(){
	$.ajax({
		 type: "POST",
         url: ctx+'/platuser/whetherlogin',
         contentType: "application/x-www-form-urlencoded; charset=utf-8",
         dataType : "json",
         error: function (e) {
       	  console.log(e);
       	  return false;
         },
         success: function (result) {
       	  	if(result.islogin == 0){
       	  		$('#login_modal').modal('toggle');
       	  	}else{
       	  		location.href=ctx+"/platuser/enter.view";
       	  	}
       	  		
         }
	 });
}

function infodis_enter(){
	isLogin2();
}

function isLogin2(){
	$.ajax({
		 type: "POST",
         url: ctx+'/platuser/whetherlogin',
         contentType: "application/x-www-form-urlencoded; charset=utf-8",
         dataType : "json",
         error: function (e) {
       	  console.log(e);
       	  return false;
         },
         success: function (result) {
       	  	if(result.islogin == 0){
       	  		$('#login_modal').modal('toggle');
       	  	}else{
       	  		location.href=ctx+"/xinpi/xinpiIndex";
       	  	}
       	  		
         }
	 });
}