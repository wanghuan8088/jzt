
$(function(){
	$("#checksss").click(function(){
		var word = $("#exp").val();
		var result = checkWords(word);
		if(result == 1){
			alert("存在敏感词");
		}
		else{
			alert("无敏感词");
		}
		result = replaceWords(word);
		alert("替换后的结果：" + result);
	});
	
	$("#addSensitive").click(function(){
		var word = $("#newWord").val();
		var ctx = $("#ctx").html();
	 	var url = ctx+"/admin/sensitiveWord/add";
	 	$.ajax({
			 type: "POST",
	          url: url,
	          data: {newWord:word},
	          dataType : "json",
	          async:false,
	          error: function () {
	        	  
	          },
	          success: function (result) {
	        	  alert(result.message);
	        	  newUrl = ctx + "/admin/sensitiveWord/list";
	        	  window.location.replace(newUrl); 
	          }
		 });
	});
	
});

var checkWords = function(word){
	var ctx=$("#ctx").html();
 	var url=ctx+"/sensitiveWord/check";
 	var check = 0;
 	$.ajax({
		 type: "POST",
          url: url,
          data: {words:word},
          dataType : "json",
          async:false,
          error: function () {
        	  check = 2;
        	  aler("校验出错");
          },
          success: function (result) {
        	  check = result.code;
	           	if(check == 1){
	           		//alert(result.message);
	           	}
	           
          }
	 });
 	return check;
}

var replaceWords = function(word){
	var ctx=$("#ctx").html();
 	var url=ctx+"/sensitiveWord/replace";
 	var check = 0;
 	var replace = word;
 	$.ajax({
		 type: "POST",
          url: url,
          data: {words:word},
          dataType : "json",
          async:false,
          error: function () {
        	  replace = "出错";
        	  aler("校验出错");
          },
          success: function (result) {
        	  replace = result.result;
        	  check = result.code;
	           	if(check == 1){
	           		//alert(result.message);
	           	}
	           //alert(replaceWords);
	           
          }
	 });
 	return replace;
}

function deleteWord(id){
	var ctx=$("#ctx").html();
 	var url=ctx+"/admin/sensitiveWord/delete";
 	$.ajax({
		 type: "POST",
         url: url,
         data: {id:id},
         dataType : "json",
         async:false,
         error: function () {
       	  
         },
         success: function (result) {
       	  alert(result.message);
       	  newUrl = ctx + "/admin/sensitiveWord/list";
       	  window.location.replace(newUrl); 
         }
	 });
}