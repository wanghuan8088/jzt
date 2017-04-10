/**
 * 
 */
//日历控件
$(function(){
	
	$(".form_date").datetimepicker({format: 'yyyy-mm-dd',autoclose:true,language: 'zh-CN',
	    weekStart: 1,
	    todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0}).on('changeDate', function(ev){
		});
	//$(".datetimepicker").css("width","500px");
	$('.table-condensed').css("width","300px");
	
	
});

/**
 * 
 $(document).ready(function(){});
 */

$(document).ready(function() {
	
//	$('#ceshibind').click(function(){	
//	alert("dkljfalsjdfk");
//	return false;
//	});
$('#bindnew').bootstrapValidator({
    message: 'This value is not valid',
    feedbackIcons: {
        valid: 'glyphicon glyphicon-ok',
        invalid: 'glyphicon glyphicon-remove',
        validating: 'glyphicon glyphicon-refresh'
    },
    fields: {
    	productName: {
           
            validators: {
                
                stringLength: {
                   
                    max: 32,
                    message: '超出字符限制'
                },
                
            }
        },
        productUrl: {
            
            validators: {
                
                stringLength: {
                   
                    max: 32,
                    message: '超出字符限制'
                },
                
            }
        },
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
                	
                    max: 11,
                    message: '请输入合法手机号'
                },
                
            }
        },
         
    }
});




});



$(function(){
	 $("#provinceId").change(function(){
		var provinceName = $(this).find("option:selected").text();
	    $("#provinceName").val(provinceName);
	 });
});