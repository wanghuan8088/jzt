//var word_list1 = [
//	                 {text: "车贷", weight: 13},
//	                 {text: "pingan", weight: 10.5},
//	                 {text: "", weight: 9},
//	                 
//	                 {text: "", weight: 9},
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
        url : '../pDetail/newstag/'+urlid,  
        dataType : 'json',  
        success : function(data) {  
        	var state=data.status;
        	if(state==0){
        		 $("#cjandll1").remove();
        		 $("#pjianjie").show();
        	}
        	var word_list=eval(data["taglist"]); 
        	$("#news_words").jQCloud(word_list);
             }
		 });  
	// $("#my_words").jQCloud(word_list);
	
	
});
