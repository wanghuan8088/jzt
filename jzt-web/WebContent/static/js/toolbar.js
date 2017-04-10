var count=0;
var hintOn=false;
$(document).ready(function() {
//	$(".select_title li").click(function(){
//		alert("xzcx");
//		$(this).parent().find(".select_item").removeClass("select_item");
//		$(this).addClass("select_item");
//	});
//	
	$("#hint-toggle").dropdown('toggle');
	document.getElementById("search-hint").style.visibility="hidden";//隐藏
	$('#key').bind('input propertychange', function() {
		if($('#type').val()==2)
			getHintData(); 
	});
	$('input').keyup(function(event){
		if(event && event.keyCode==13){
			search_submit();
		}
	});
	
//	$(".select_title li").click(function(){
//		alert("xzcx");
//		$(this).parent().find(".select_item").removeClass("select_item");
//		$(this).addClass("select_item");
//	});
	
	
	
});
//$(function(){
//	$(".select_title li").click(function(){
//		alert("2");
//		$(this).parent().find(".select_item").removeClass("select_item");
//		$(this).addClass("select_item");
//	});
//	
//});

function noFocus() {
	if($('#type').val()==2&&hintOn==false)
		document.getElementById("search-hint").style.visibility="hidden";//隐藏
}

function yesFocus() {
	if(count!=0&&$('#type').val()==2)
		document.getElementById("search-hint").style.visibility="visible";//隐藏
}

function hintOver() {
	hintOn=true;
}

function hintOut() {
	hintOn=false;
}

function check() {
	$('#key').focus();
	if($('#type').val()==2)
	{
		document.getElementById("search-hint").style.visibility="visible";//隐藏
		getHintData();
		$('#key').attr('placeholder','请输入平台名称');
	}
	else
	{
		document.getElementById("search-hint").style.visibility="hidden";//隐藏
		$('#key').attr('placeholder','请输入关键字');
	}
}

function getHintData() {
	var programPath=$('#cxt').html();
	$.ajax({  
        type: 'POST',  
        url: programPath+"/search/productHint" ,    
        dataType: 'json',  
        data: {
        	keyword: $('#key').val(),
        	topk: 10,
        },  
        success: function (data) 
        {  
        	count=0;
        	var content='';
        	var list = data['list'];
        	var size = list.length;
        	while(count<size)
        	{
        		var product = list[count];
        		var id = product['id'];
        		var name = product['name'];
        		
        		content+='<li><a href="'+programPath+'/product/pDetail/'+id+'">'+name+'</a></li>';
        		count++;
        		
        	}
        	
        	
        	$('#search-hint').html(content);
        	if(count!=0)
        		document.getElementById("search-hint").style.visibility="visible";//显示
        	else
        		document.getElementById("search-hint").style.visibility="hidden";//隐藏
        }
    });  
}