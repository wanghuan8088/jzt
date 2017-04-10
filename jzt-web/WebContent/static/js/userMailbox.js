function messagesRead(obj)
{
	var programPath=$('#cxt').html();
	var mid=$(obj).find('.mid').html();
	$.ajax({  
        type: 'POST',  
        url: programPath+"/user/detailWarning" ,  
        dataType: 'json',  
        data: {
        	"wId":mid,
        },  
        success: function (data) {  
        	data=data["mailDetail"];
            if (data == null) {  
                $('#message').html("");
                stop=false;
            }  
            else if (data != null) {  
                //返回的数据为JSON字符串 
                var str = '';  
                var mailDetail=eval(data);
                //alert(mailDetail.ajaxTime);
                str = '<div class="message dark"><div class="header"><h1 id="title">'+mailDetail.content+'</h1><div class="from"><i class="halflings-icon user"></i> <b>系统管理员</b> </div><div class="date"><i class="halflings-icon time"></i> <b>'+mailDetail.ajaxTime+'</b></div><div class="menu"></div></div><div class="content"><p>'+mailDetail.reason+'</p></div></div>	';
                $('#message').html(str);  
                $(obj).find('.label').hide();
                $(obj).removeClass("no-read");
                Push();
                
            }   
  
        }
    });  
}