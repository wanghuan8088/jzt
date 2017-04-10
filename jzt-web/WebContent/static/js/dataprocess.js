function startprocess(obj)
{
    //清空数据显示 
    $('#log').html("");   
    
    var programPath=$('#cxt').html();
    var processName=$(obj).attr("id");
    //组合Json查询条件，查询分页数据 
    $.ajax({  
        type: 'POST',  
        url: programPath+"/admin/"+processName ,  
        dataType: 'json',  
        data: {},  
        success: function (data) {  
        	var logs=data['logs'];
        	for (var i = 0; i < eval(logs).length; i++)
        	{
        		$('#log').append(logs[i]+"<br>");
        	}
        	var tr="<tr><td>"+data['taskdetail']+"</td><td>";
        	if (data['type']=='0')
        		tr += "增加";
        	else tr += "更新";
        	tr+="</td><td>"+data['updateTime']+"</td><td>"+data['updateNum']+"条</td><td>"+data['result']+"</td></tr>";
        	var tmp=$('#oldtasks').html();
        	$('#oldtasks').html(tr+tmp);
        }
    });  
}

$(function(){
	$("#data_ul").show();
	var totalPageNum=Math.ceil(parseInt($("#total").html())/10);
		//var totalPageNum=${size};
	 	var curPage=$("#page").html();
	 	var size=4;
	 	var ctx=$("#ctx").html();
	 	var url=ctx+"/admin/data/process?";
	 	if(GetArgsFromHref("webid")!="")
	 	{
	 		url=ctx+"/admin/data/process?webid="+GetArgsFromHref("webid")+"&";
	 	}
	 	if(GetArgsFromHref("filter")!="")
	 	{
	 		url=url+"filter="+GetArgsFromHref("filter")+"&status="+GetArgsFromHref("status")+"&";
	 	}
	 	url=url+"page="
	 	if ($("#total").html()!='0')
	 	{initPage(url,totalPageNum,parseInt(curPage),size);}
	 	else
	 	{$('.pagination').hide();}
	 	
	});
	//sArgName表示要获取哪个参数的值 
 function GetArgsFromHref(sArgName) 
 { 
	 var sHref = window.location.href; 
	//CuPlayer.com提示：测试数据 
	//实际情况是用window.location.href得到URL 
	var args = sHref.split("?"); 
	var retval = ""; 
	if(args[0] == sHref) /*参数为空*/ 
	{
		return retval; /*CuPlayer.com提示：无需做任何处理*/ 
	} 
	var str = args[1]; 
	args = str.split("&"); 
	for(var i = 0; i < args.length; i++ ) 
	{ 
	str = args[i]; 
	var arg = str.split("="); 
	if(arg.length <= 1) continue; 
	if(arg[0] == sArgName) retval = arg[1]; 
	} 
	return retval; 
} 

function bottonDisplay(obj)
{
	var ctx=$("#ctx").html();
		
		var tmp=ctx+"/admin/data/process?webid="+$(obj).find('span').html()+"&page=0";
		window.location.href=tmp;
}
function taskType(obj)
{
		var ctx=$("#ctx").html();
		var webid=GetArgsFromHref("webid");
		if (webid=="") webid=1;
		var tmp;
		if ($(obj).find('span').html()!=0)
			tmp=ctx+"/admin/data/process?webid="+webid+"&filter=task&status="+$(obj).find('span').html()+"&page=0";
		else 
			tmp=ctx+"/admin/data/process?webid="+webid+"&page=0";
		window.location.href=tmp;
	}
function opType(obj)
{
		var ctx=$("#ctx").html();
		var webid=GetArgsFromHref("webid");
		if (webid=="") webid=1;
		if ($(obj).find('span').html()!=0)
			tmp=ctx+"/admin/data/process?webid="+webid+"&filter=task&status="+$(obj).find('span').html()+"&page=0";
		else 
			tmp=ctx+"/admin/data/process?webid="+webid+"&page=0";
		window.location.href=tmp;
	}
function errorType(obj)
{
		var ctx=$("#ctx").html();
		var webid=GetArgsFromHref("webid");
		if (webid=="") webid=1;
		if ($(obj).find('span').html()!=4)
			tmp=ctx+"/admin/data/process?webid="+webid+"&filter=errortype&status="+$(obj).find('span').html()+"&page=0";
		else 
			tmp=ctx+"/admin/data/process?webid="+webid+"&page=0";
		window.location.href=tmp;
	}