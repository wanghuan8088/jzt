var def;
var sort;
var path;

$(function(){
	$(".rank-more li").click(function(){
		//alert("fgsg");
		$(this).parent().find(".select-focus-rank").removeClass("select-focus-rank");
		$(this).addClass("select-focus-rank");
		sort = $(".select-focus-rank").attr("var");
		//alert(sort);
		getrank();
});


	
});

$(document).ready(function() {

	
	path = $('#rankpath').html();
	def = $('#def').html();
	if(def==1)
		$("#dayrank").addClass("select-focus-rank");
	if(def==2)
		$("#weekrank").addClass("select-focus-rank");
	if(def==3)
		$("#monthrank").addClass("select-focus-rank");

	sort = $(".select-focus-rank").attr("var");
//	alert(sort);
	getrank();

		
});

function getrank() {
//	
//	$('#rank-tbody tr').remove();
//	var str='';
//	
//	for (var i = 0; i < 50; i++) {  
//		 var temp = i+1;
//		 str += '<tr class="table-center ranktop">';
//		 
//		 if(i==0)
//			 str +='<td ><span class="t1">&nbsp;1&nbsp;</span></td>';
//		 else if(i==1)
//			 str +='<td ><span class="t2">&nbsp;2&nbsp;</span></td>';
//		 else if(i==2)
//			 str +='<td ><span class="t3">&nbsp;3&nbsp;</span></td>';
//		 else
//			 str +='<td ><span>&nbsp;'+temp+'&nbsp;</span></td>';
//		 
//		 str +='<td ><a href="'+path+'/product/pDetail/21078" target="_blank" >陆金所</td>'+
//		 	'<td >上海</td>'+
//		 	'<td >国资</td>'+
//	        '<td >5000万</td>'+
//		 	'<td >12%</td>'+
//		 	'<td >5000</td>'+
//		 	'<td ><p class="glyphicon glyphicon-arrow-down" style="color:#2eb0ef;"></p>3000</td>'+
//		 	'</tr>';
//	}
//	
//	$('#rank-tbody').html(str);
	
	$.ajax( {  
		  type : 'POST',  
		  url : path+'/rank/top_fifty_click',  
		  data : {
			  "sort":sort,
			  },  
		  dataType : 'json',  
		  success : function(data) {  
		  	 if (data == null) {  
		                          
		       }  
		  	 else {
		  		 	 $('#rank-tbody tr').remove();
		  		 	 var str='';
					 for (var i = 0; i < eval(data["platformList"]).length; i++) {  
					       	var product=eval(data["platformList"]);
					       	product=product[i];
					       	
					        var temp = i+1;
							 str += '<tr class="table-center ranktop">';
							 
							 if(i==0)
								 str +='<td ><span class="t1">&nbsp;1&nbsp;</span></td>';
							 else if(i==1)
								 str +='<td ><span class="t2">&nbsp;2&nbsp;</span></td>';
							 else if(i==2)
								 str +='<td ><span class="t3">&nbsp;3&nbsp;</span></td>';
							 else
								 str +='<td ><span>&nbsp;'+temp+'&nbsp;</span></td>';
							 
							 str +='<td ><a href="'+path+'/product/pDetail/'+product["pId"]+'" target="_blank" >'+product["productName"]+'</td>'+
							 	   '<td >'+product["location"]+'</td>';
							 var ds = "";
							 if(product["startTime"]!=undefined&& product["startTime"]!=null){
								 d = new Date(product["startTime"]);
								 ds = d.getFullYear() + "-"
										+ ("0" + (d.getMonth() + 1)).slice(-2)
										+ "-" + ("0" + d.getDate()).slice(-2);
							 }
							 
							 str +='<td >'+ds+'</td>';
							 
//							 if(product["tagBgFt"]==1)
//							 	 str += '<td >风投系</td>';
//							 else if(product["tagBgYh"]==1)
//								 str += '<td >银行系</td>';
//							 else if(product["tagBgGz"]==1)
//								 str += '<td >国资系</td>';
//							 else if(product["tagBgSs"]==1)
//								 str += '<td >上市公司系</td>';
//							 else if(product["tagBgMy"]==1)
//								 str += '<td >民营系</td>';
//							 else
							 //公司背景
								 str += '<td >-</td>';
							 
							 str += '<td >'+product["registeredCapital"]+'万元</td>';
							 
//							 if(product["avgInterestRate"]==null) str +='<td >-</td>';
//							 else '<td >'+product["avgInterestRate"]+'%</td>';
							 //平均收益
							 str +='<td >-</td>'
								 
								 
							 str +=	'<td >'+product["numClick"]+'</td>';
							 
							 if(product["numClickChange"]==0)
							 	 str +='<td >==</td>';
							 else if (product["numClickChange"]<0){
								 var abs=-product["numClickChange"];
								 str +='<td ><p class="glyphicon glyphicon-arrow-down" style="color:#2eb0ef;"></p>'+abs+'</td>';
							 }
							 else if (product["numClickChange"]>0){
								 str +='<td ><p class="glyphicon glyphicon-arrow-up" style="color:red;"></p>'+product["numClickChange"]+'</td>';
							 }
								 
							 str +='</tr>';
							 if(i>49){
						       		i=eval(data["platformList"]).length;
						       	}
					 }
					 $('#rank-tbody').html(str); 
					 
		  		 
		  	 }	
		  },
	  
});
 
	


} 
   