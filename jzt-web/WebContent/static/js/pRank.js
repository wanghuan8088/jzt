
var sort;
var path;
$(function(){
	$(".product-select-rank li").click(function(){
		//alert("fgsg");
		$(this).parent().find(".select-focus-rank").removeClass("select-focus-rank");
		$(this).addClass("select-focus-rank");
		sort = $("#timerank .select-focus-rank").attr("var");
		//alert(sort);
		getrank();
});


	
});

$(document).ready(function() {

	sort = $("#timerank .select-focus-rank").attr("var");
	path = $('#rankpath').html();
	//alert(sort);
	getrank();
	//	$('#pRankL li').remove();   
	//    $('#pRankR li').remove(); 
		
});

function getrank() {
	
//
//	$('#pRankL li').remove();   
//	$('#pRankR li').remove(); 
//	
//	var strl ='';
//	var strr ='';	
//
//	strl +='<li><i class="t1">1</i><a href="'+path+'/product/pDetail/'+'21078'+'" target="_blank" >'+'陆金所'+'</a></li>';
//	strl +='<li><i class="t2">2</i><a href="'+path+'/product/pDetail/'+'21078'+'" target="_blank" >'+'陆金所'+'</a></li>';
//	strl +='<li><i class="t3">3</i><a href="'+path+'/product/pDetail/'+'21078'+'" target="_blank" >'+'陆金所'+'</a></li>';
//	
//	 for (var i = 3; i < 5; i++) {  
//		 var temp = i+1;
//	       	strl +='<li><i>'+temp+'</i><a href="'+path+'/product/pDetail/'+'21078'+'" target="_blank" >'+'陆金所'+'</a></li>';   	
//		 }
//	
//	 for (var i = 5; i < 10; i++) {  
//		 var temp1 = i+1;
//       	strr +='<li><i>'+temp1+'</i><a href="'+path+'/product/pDetail/'+'21078'+'" target="_blank" >'+'陆金所'+'</a></li>';   	
//	 }
//	 
//	 $('#pRankL').html(strl); 
//	 $('#pRankR').html(strr);
//	
	//change the more url to tell where next to 
	var strmore='';
	strmore += '<a href="'+path+'/rank/clickRank?def='+sort+'">更多...</a>';
	$('#more').html(strmore); 
	
	
	$.ajax( {  
        type : 'POST',  
        url : path+'/rank/top_ten_click',  
        data : {
		  "sort":sort,
		  },  
        dataType : 'json',  
        success : function(data) {  
        	 if (data == null) {  
                                
             }  
        	 else {
        		 $('#pRankL li').remove();   
        		 $('#pRankR li').remove();
        		 var strl ='';
        		 var strr ='';	
				 for (var i = 0; i < eval(data["platformList"]).length; i++) {  
					// alert(eval(data["platformList"]).length);
				       	var product=eval(data["platformList"]);
				       	product=product[i];
				       	if(i==0){
				       		strl +='<li><i class="t1">1</i><a href="'+path+'/product/pDetail/'+product["pId"]+'" target="_blank" >'+product["productName"]+'</a></li>';
				       	}
				       						       	
				       	if(i==1){
				       		strl +='<li><i class="t2">2</i><a href="'+path+'/product/pDetail/'+product["pId"]+'" target="_blank" >'+product["productName"]+'</a></li>';
				       	}
				       		
				       	if(i==2){
				       		strl +='<li><i class="t3">3</i><a href="'+path+'/product/pDetail/'+product["pId"]+'" target="_blank" >'+product["productName"]+'</a></li>';
				       	}
				       		
				       	if(i>2){
				       		if(i<5){
				       			var temp = i+1;
						       	strl +='<li><i>'+temp+'</i><a href="'+path+'/product/pDetail/'+product["pId"]+'" target="_blank" >'+product["productName"]+'</a></li>'; 
				       		}
				       		
				       	}
				       	if(i>=5){
				       		if(i<10){
				       			var temp1 = i+1;
					           	strr +='<li><i>'+temp1+'</i><a href="'+path+'/product/pDetail/'+product["pId"]+'" target="_blank" >'+product["productName"]+'</a></li>'; 
				       		}
				       		
				       	}
				       		
				       	
				       	
				 }
				 $('#pRankL').html(strl); 
				 $('#pRankR').html(strr);
        		 
        	 }	
        },
        
	});

} 
   