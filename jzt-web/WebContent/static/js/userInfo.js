

$(document).ready(function() {
	$('#userInfo').addClass("active");
	$('#birth_datetimepicker').datetimepicker({
		language: 'zh-CN',
        weekStart: 1,
        todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		minView: 2,
		forceParse: 0});
	$('#mdUserInfo').click(function(){
		$('#modUserInfo').bootstrapValidator('validate');
		if ($('.form-group').hasClass('has-error')) {
			return;
		}
		var birthday=$('#birthday').val();
		var sex=$('input[name="sex"]:checked').val();
		var phone=$('#phone').val();
		var userDspName=$('#userDspName').val();
		//敏感词校验
		var check = 0;
		check = checkWords(phone);
		if(check != 0){
			alert("手机号码不通过");
			return;
		}
		check = checkWords(userDspName);
		if(check != 0){
			alert("真实姓名包含敏感词汇，不予通过");
			return;
		}
		$.ajax({
			type: "post",
			url: "../user/modifyProfile",
			data: { 
				birthday: birthday,
				sex:sex,
				phone:phone,
				userDspName:userDspName,
				},
			success: function (result) {
			var state = result.state;
			if (state==1)
			{
				alert("修改失败");
				$('.form-group').removeClass('has-success');
				$('li').removeClass('bv-tab-success');
			}
			else if (state==0)
			{
				alert("修改成功");
				$('.form-group').removeClass('has-success');
				$('li').removeClass('bv-tab-success');
			}
			
			else
			{
				alert("bug!!");
				$('.form-group').removeClass('has-success');
				$('li').removeClass('bv-tab-success');
			}
			}
			});
	});
	$('#modUserInfo').bootstrapValidator({
        message: 'This value is not valid',

        fields: {
        	userDspName: {
                message: '用户名不合法。',
                validators: {
                    regexp: {
                        regexp: /^([\u4e00-\u9fa5]+|([a-zA-Z]+\s?)+)$/,
                        message: '名字的格式有问题哟'
                    }
                }
            },
            sex: {
                validators: {
                    notEmpty: {
                        message: 'The gender is required'
                    }
                }
            },
            phone: {
                validators: {
                	regexp: {
                        regexp: /((\d{11})|^((\d{7,8})|(\d{4}|\d{3})-(\d{7,8})|(\d{4}|\d{3})-(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1})|(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1}))$)/,
                        message: '手机号的格式有问题哟'
                    },
		            stringLength: {
		            	
		                max: 11,
		                message: '手机号的格式有问题哟'
		            },
                }
            }
        }
    });
	
	$('#modPsdBtn').click(function(){
		$('#modPsdForm').bootstrapValidator('validate');
		if ($('.form-group').hasClass('has-error')) {
			return;
		}
		var oldPassword=$('#oldPassword').val();
		var newPassword=$('#newPassword').val();
		$.ajax({
			type: "post",
			url: "../user/modifyPassword",
			data: { 
				oldPwd: oldPassword,
				newPwd:newPassword,
				},
			success: function (result) {
			var state = result.state;
			if (state==0)
			{
				alert("修改成功");
				document.getElementById("oldPassword").value="";
				document.getElementById("newPassword").value="";
				document.getElementById("confirmPassword").value="";
			}
			else if (state==1)
			{
				alert("原密码不正确");
			}
			else if (state==2)
			{
				alert("新密码必须与原密码不同");
			}
			else if (state==3)
			{
				alert("请填写密码");
				$('.form-group').removeClass('has-success');
			}
			else if (state==4)
			{
				alert("请重新登录");
				$('.form-group').removeClass('has-success');
			}
			}
			});
	});
	$('#modPsdForm').bootstrapValidator({
        message: 'This value is not valid',

        fields: {
        	oldPassword: {
                validators: {
                    notEmpty: {
                        message: '密码不能为空。'
                    },
                    stringLength: {
                        min: 6,
                        max: 30,
                        message: '密码必须在6-30个字符之间。'
                    }
                }
            },
            newPassword: {
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
                    }
                }
            },
            confirmPassword: {
                validators: {
                    notEmpty: {
                        message: '确认密码不能为空。'
                    },
                    identical: {
                        field: 'newPassword',
                        message: '密码和确认密码不相同。'
                    }
                }
            }
        }
    });
});