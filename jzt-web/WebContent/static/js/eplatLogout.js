/**
 * 
 */


function logout(){
	var ctx=$("ctx").attr("value");
	$.ajax( {  
          type : 'POST',  
          url : ctx+'/user/logout',  
          data : {
		  },  
          dataType : 'json',  
          success : function(data) {  
          }
	});
	window.location.href= ctx+"/index/home";
}