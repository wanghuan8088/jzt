
/*请求函数的ajax*/

function Push() {
	var programPath=$('#cxt').html();
	$('#message_count').html("0");
    $.ajax({
        type: "POST",
        url: programPath+'/user/NumberOfUnread', 
        data: {
        },
        beforeSend: function() {},
        success: function(data) {

            var obj = eval(data);
            if (obj.numberOfUnread != 0) {

                $("#message_count").html(obj.numberOfUnread);
                $("#message_count").show();


            } else {
                $("#message_count").hide();

            }


        }


    });
}
function logout()
	{
	var programPath=$('#cxt').html();
	console.log(programPath); 
		$.ajax( {  
	          type : 'POST',  
	          url : programPath+'/user/logout',  
	          data : {
			  },  
	          dataType : 'json',  
	          success : function(data) {  
	        	  var state = data.state;
	        	  if (state==0)
	        	  {
	        		  //window.location.reload();
	        		  //clearInterval(this);
	        		  window.location.href= programPath+"/index/home";
	        	  }
	          }
		});
	}
 $(document).ready(function() {
	var programPath=$('#cxt').html();
	console.log(programPath);
	
	$('#login_modal').on('show.bs.modal', function (e) {
		  // do something...
		$('#login_help').hide();
		});
	$('#username_login').keyup(function () {
		$('#loginForm').removeClass("has-error");
		$('#login_username_block').removeClass("has-error");
		$('#login_password_block').removeClass("has-error");
		$("#login_help").hide();
	});
	$('#password_login').keyup(function () {
		$('#loginForm').removeClass("has-error");
		$('#login_username_block').removeClass("has-error");
		$('#login_password_block').removeClass("has-error");
		$("#login_help").hide();
	});
	$('#login_submit').click(function () {
		
			var username = $("#username_login").val();
			var password = $("#password_login").val();
			if ((username=="")||(password==""))
			{
				$('#login_help').show();
				$('#login_help').innerHTML="用户名和密码不能为空";
				return;
			}
			$.ajax( {  
		          type : 'POST',  
		          url : programPath+'/user/login',  
		          data : {
						username: username,password:password
				  },  
		          dataType : 'json',  
		          success : function(data) {  
		        	  var state = data.state;
		  			/*0. 成功登录
		  1. 不存在的用户名
		  2. 不正确的密码
		  3. 未激活
		  4. 用户名或密码为空
		  -1.默认值，服务器内部错误*/
		  			if (state==0)
		  			{
		  				var path = window.location.pathname;
		  				if(path.indexOf("register") >= 0 ) 
		  				{ 
		  					window.location.href=programPath+"/user/userIndex"; 
		  				} 
		  				/*第一次读取最新通知*/
//		  				alert("ceshi");
		  				setTimeout(function() {Push();},0);
		  				/*30轮询读取函数*/
		  				t=setInterval(function() {Push();},30000);
		  				$('#login_modal').modal('toggle');
		  				$("#logintext").html("欢迎");
		  				$("#registertext").html("<li class='dropdown'><a href='#' class='dropdown-toggle' data-toggle='dropdown' role='button' aria-expanded='false' id='username'>"+username+"<span class='caret'></span></a><ul class='dropdown-menu' role='menu'><li><a href='"+programPath+"/user/userIndex'>个人主页</a></li><li class='divider'></li><li><a href='javascript:void(0)' onclick='logout()'>退出登录</a></li></ul></li>");
		  				if(data.xinpi == 1) {
		  					$("#xinpirukou").show();
		  				}
		  				$("#notifaction").show();
		  				if(path.indexOf("register") < 0 ) 
		  				{ 
		  					window.location.reload(); 
		  				}
		  				// 
		  			}
		  			else if (state==1)
		  			{
		  				$('#login_help').html("用户名不存在");
		  				$('#loginForm').addClass("has-feedback  has-error");
		  				$('#login_username_block').removeClass("has-success");
		  				$('#login_password_block').removeClass("has-success");
		  				$('#login_username_block').addClass("has-feedback  has-error");
		  				$('#login_password_block').addClass("has-feedback  has-error");
		  				$('#login_help').show();
		  				
		  			}
		  			else if (state==2)
		  			{
		  				
		  				$('#login_help').html("密码不正确");
		  				$('#loginForm').addClass("has-feedback  has-error");
		  				$('#login_username_block').removeClass("has-success");
		  				$('#login_password_block').removeClass("has-success");
		  				$('#login_username_block').addClass("has-feedback  has-error");
		  				$('#login_password_block').addClass("has-feedback  has-error");
		  				$('#login_help').show();
		  			}
		  			else if (state==3)
		  			{
		  				$('#login_help').html("您的用户帐户未激活");
		  				$('#loginForm').addClass("has-feedback  has-error");
		  				$('#login_username_block').removeClass("has-success");
		  				$('#login_password_block').removeClass("has-success");
		  				$('#login_username_block').addClass("has-feedback  has-error");
		  				$('#login_password_block').addClass("has-feedback  has-error");
		  				$('#login_help').show();
		  			}	
		  			else 
		  			{
		  				$('#login_help').html("系统发生了奇怪的问题。");
		  				$('#loginForm').addClass("has-feedback  has-error");
		  				$('#login_username_block').removeClass("has-success");
		  				$('#login_password_block').removeClass("has-success");
		  				$('#login_username_block').addClass("has-feedback  has-error");
		  				$('#login_password_block').addClass("has-feedback  has-error");
		  				$('#login_help').show();
		  			}
		  			
		          },  
		          error: function(data) {  
		            alert("error"); 
		          }  
		        });  
	});


});
