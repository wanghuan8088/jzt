/**
 * 
 */
$(function(){
	
	//init
	var htmlArray = new Array(27);
	for(var i=0;i<27;i++){
		htmlArray[i]="";
	}
	
	$.grep( productList, function( item ){
		var pAsASCII = item.platPin.charCodeAt(0);
		var pos = 26;
		if(pAsASCII>=65 && pAsASCII<= 90){
			pos = pAsASCII - 65;
		}else{
			pos = 26;
		}
		htmlArray[pos]=htmlArray[pos]+ "<label><input type=\"radio\" name=\"productId\" checked=true value=\""+item.productId+"\"><span>"+item.productName+"</span></label>";
		
	});
	
	for(var i=0;i<26;i++){
		var id = "#plat_"+ String.fromCharCode(i+97) +"_list";
		$(id).html(htmlArray[i]);
	}
	$("#plat_other_list").html(htmlArray[26]);
});




$(document).ready(function() {
	
//	$('#bindin').click(function(){	
//	alert("dkljfalsjdfk");
//	return false;
//	});
$('#bindpp').bootstrapValidator({
    message: 'This value is not valid',
    feedbackIcons: {
        valid: 'glyphicon glyphicon-ok',
        invalid: 'glyphicon glyphicon-remove',
        validating: 'glyphicon glyphicon-refresh'
    },
    fields: {
    	applicantName: {
           
            validators: {
                
                stringLength: {
                   
                    max: 32,
                    message: '超出字符限制'
                },
                
            }
        },
        applicantPosition: {
            
            validators: {
                
                stringLength: {
                   
                    max: 32,
                    message: '超出字符限制'
                },
                
            }
        },
        applicantPhone: {
            
            validators: {
                
                stringLength: {
                   min:11,
                    max: 11,
                    message: '请输入合法手机号'
                },
                
            }
        },
         
    }
});




});