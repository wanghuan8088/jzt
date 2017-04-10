//var word_list = [
//	                 {text: "车贷", weight: 13},
//	                 {text: "2", weight: 10.5},
//	                 {text: "3", weight: 9},
//	                 {text: "4", weight: 8.5},
//	                 {text: "5", weight: 9},
//	                 {text: "6", weight: 9},
//	                 {text: "7", weight: 5},
//	                
//	            ];

$(document).ready(function() {
	var urlid = $("#mid").text();
	
	
	$.ajax( {  
        type : 'POST',  
        url : ctx+'/product/pDetail/cloudTag/'+urlid,  
        dataType : 'json',  
        success : function(data) {  
        	
        	var word_list=eval(data["tags"]); 
        	
        	$("#my_words").jQCloud(word_list);
        	
             }
		 });  
	// $("#my_words").jQCloud(word_list);
	
	
});
