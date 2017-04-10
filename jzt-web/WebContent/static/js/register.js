var wait=60;

$(document).ready(function() {
	$('#registertext').addClass("active");
	$('#username_valide').hide();
	$('#phone_valide').hide();
//	$('#input_username').change(function () {
//			
//			});
//	$('#input_email').change(function () {
//		
//		});
	var verifyState = $("#verifyState").text();
	//alert(verifyState);
	if(verifyState==2){
		alert("验证码错误！请重新填写注册信息！");
	}
	
    $('#registerform').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            username: {
                message: '用户名不合法。',
                validators: {
                    notEmpty: {
                        message: '用户名不能为空。'
                    },
                    stringLength: {
                        min: 6,
                        max: 30,
                        message: '用户名必须在6-30个字符之间。'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: '用户名只支持字母、数字及下划线。'
                    }
                }
            },
            email: {
                validators: {
                    notEmpty: {
                        message: 'email地址不能为空。'
                    },
                    emailAddress: {
                        message: '输入的email地址不合法。'
                    },
//                    regexp:{
//                    	regexp:/^(\w-*\.*)+@(\w-?)+(\.\w{2,})+$/,
//                    	message: '输入的email地址不合法。'
//                    },
                }
            },
            phone: {
                
                validators: {
                	notEmpty: {
                        message: '手机号码不能为空'
                    },
                    
//                    stringLength: {
//                       min:11,
//                        max: 11,
//                        message: '请输入11位手机号。'
//                    },
                    regexp: {
                    	regexp: /^1[3|5|8]{1}[0-9]{9}$/,
                        message: '请输入11位合法手机号。'
                    }
                    
                }
            },
//            verfy: {
//                validators: {
//                    notEmpty: {
//                        message: '验证码不能为空。'
//                    },
//                    
//                }
//            },
            password: {
                validators: {
                    notEmpty: {
                        message: '密码不能为空。'
                    },
                    stringLength: {
                        min: 6,
                        max: 30,
                        message: '密码必须在6-30个字符之间。'
                    },
                    identical: {
                        field: 'confirmPassword',
                        message: '密码和确认密码不相同。'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: '用户名只支持字母、数字及下划线。'
                    }
                }
            },
            confirmPassword: {
                validators: {
                    notEmpty: {
                        message: '确认密码不能为空。'
                    },
                    identical: {
                        field: 'password',
                        message: '密码和确认密码不相同。'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: '用户名只支持字母、数字及下划线。'
                    }
                }
            }
        }
    });
     
    
});


function checkUser(){
	var a = $("#input_username").val();
	if (a.length<6 || a.length>30) {
		$('#username_valide').hide();
		return;
	}
	var reg =/^[a-zA-Z0-9_\.]+$/; 
	if (!reg.test(a))
	{
		$('#username_valide').hide();
		return;
	}
		
	//敏感词校验
	if(checkWords(a) != 0){
		$('#username_valide').hide();
		alert("用户名敏感词校验不通过");
		return;
	}
	$.ajax({
	type: "post",
	url: "../user/validateUname",
	data: { username: a},
	success: function (result) {
	var state = result.state;
	if (state==1)
	{
		$("#username_valide").show();
		$("#userblock").addClass("has-feedback has-error");
		$("#userblock").removeClass("has-success");
		$("#userblock i").removeClass("glyphicon-ok");
		$("#userblock i").addClass("glyphicon glyphicon-remove");
		$("#register_submit").attr("disabled",true); 
	}
	else if (state==0)
	{
		$('#username_valide').hide();
		$("#userblock i").addClass("glyphicon glyphicon-ok");
		
	}
	
	else
	{
		alert("bug!!");
	}
	}
	});
}

function checkphone(){
	var a = $("#input_phone").val();

	$('#phone_valide').hide();

	$("#verify").attr("disabled",true); 
	if(/^1[3|5|8]{1}[0-9]{9}$/.test(a))
    {
		$("#verify").attr("disabled",false);
       
     }
	
	
	if(a!=""){
		$.ajax({
			type: "post",
			url: "../user/validatePhone",
			data: { phone: a},
			success: function (result) {
			var state = result.state;
			if (state==1)
			{
				$("#phone_valide").show();
				$("#phoneblock").addClass("has-feedback has-error");
				$("#phoneblock").removeClass("has-success");
				$("#phoneblock i").removeClass("glyphicon-ok");
				$("#phoneblock i").addClass("glyphicon glyphicon-remove");
				$("#register_submit").attr("disabled",true); 
				$("#verify").attr("disabled",true); 
			}
			else if (state==0)
			{
				$('#phone_valide').hide();
				$("#phoneblock i").addClass("glyphicon glyphicon-ok");
				
			}
//			else
//			{
//				alert("bug!!");
//			}
			}
			});
	}
	
}


function getver(){
	var a = $("#input_phone").val();
	
//	time();
	$.ajax({
		type: "post",
		url: "../user/getver",
		data: { phone: a},
		success: function (result) {
		var state = result.state;
		var info = result.info;
		if (state==1)
			{
				alert("验证码发送成功");
				time();
			}
			
			else
			{
				alert(info);
			}
		}
		});
	
	
}

function time() {
//	alert(wait);
    if (wait == 0) {
    	$("#verify").attr("disabled",false);     
    	$("#verify").html("重新获取");
        wait = 60;
    } 
    else { 
    	
    	$("#verno").show();
    	$("#verify").attr("disabled",true); 
    	$("#verify").html(wait + "秒后可重发");
        wait--;
        setTimeout(function() {
            time()
        },
        1000)
    }
}








