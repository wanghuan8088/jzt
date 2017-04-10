var fromDate;
var toDate;
var arrayMonth3;
var newsTypeArr=["","行业","政策","平台","数据","理财","国外","观点","研究"];
$(document).ready(function () {
	$('#'+getQueryString("type")+'-nav').addClass('active');
	$("#data_ul").show();
	getSort();
	getUrlList();
	setMonth();
	setDatepicker();
	setParams();
});

function add() { 
	document.getElementById("add-div").style.display="";//显示
	document.getElementById("result-div").style.display="none";//不显示
	$('html,body').animate({scrollTop:$('#add-div').offset().top}, 500);
} 

function cancel() { 
	document.getElementById("add-div").style.display="none";//不显示
	document.getElementById("result-div").style.display="none";//不显示
} 

function progress() { 
	document.getElementById("add-div").style.display="none";//不显示
	document.getElementById("result-div").style.display="none";//不显示
	$('html,body').animate({scrollTop:$('#progress-div').offset().top}, 500);
} 

function result(id) { 
	document.getElementById("result-div").style.display="";//显示
	document.getElementById("add-div").style.display="none";//不显示
	$('html,body').animate({scrollTop:$('#result-div').offset().top}, 500);
	getRunResult(id);
} 

//获得url中对应参数
function getQueryString(name) {
    var reg = new RegExp('(^|&)' + name + '=([^&]*)(&|$)', 'i');
    var r = window.location.search.substr(1).match(reg);
    if (r != null) {
        return unescape(r[2]);
    }
    return null;
}

function clickFirst() {
	document.location="${ctx}/admin/data/spiderManage?type="+getQueryString("type")+"&sort=created&curPage=0";
}

function clickSort(sort) {
	var programPath=$('#cxt').html();
	document.location=programPath+"/admin/data/spiderManage?type="+getQueryString("type")+"&sort="+sort+"&curPage=0";
}

function getSort() {
	if(getQueryString("sort")=="created")
	{
		$('#created').html("创建时间<img src='/businessfbi/static/image/down.png' style='width:15px'>");
		$('#state').html("<a onclick=\"clickSort('state')\">状态</a>");
	}
	else if(getQueryString("sort")=="state")
	{
		$('#created').html("<a onclick=\"clickSort('created')\">创建时间</a>");
		$('#state').html("状态<img src='/businessfbi/static/image/down.png' style='width:15px'>");
	}
}

function getUrlList(){
	var programPath=$('#cxt').html();
	$.ajax( {  
        type : 'POST',  
        url : programPath+'/admin/data/spiderManage/urlList',  
        data : {
      	  type: getQueryString("type")
		  },  
        dataType : 'json',  
        success : function(data) {  
      	    var urlList = data.urlList;
      	    var tbody="";
      	    for(var i=0;i<urlList.length;i++)
	      	    tbody+="<h3 id='description'>"+urlList[i].urlPath+"</h3>";
      	    $('#url-div').html(tbody);
        }
	});
}

function getRunResult(id){
	var programPath=$('#cxt').html();
	$.ajax( {  
        type : 'POST',  
        url : programPath+'/admin/data/spiderManage/runResult',  
        data : {
        	tId: id
		  },  
        dataType : 'json',  
        success : function(data) {  
        	var tbody="";
        	if(data.runResult==null)
        		tbody+="暂无运行结果";
        	else
        	{
        		tbody="<table class='table'>"+
	 			   "<thead>"+
	 			      "<tr>"+
	 			         "<th>任务编号</th>"+
	 			         "<th>开始时间</th>"+
	 			         "<th>结束时间</th>"+
	 			         "<th>运行时间</th>"+
	 			         "<th>开始爬取编号</th>"+
	 			         "<th>结束爬取编号</th>"+
	 			         "<th>成功数量</th>"+
	 			         "<th>程序异常数量</th>"+
	 			      "</tr>"+
	 			   "</thead>"+
	 			   "<tbody>"+
	 			      "<tr>"+
	 			         "<td>"+data.runResult.id+"</td>"+
	 			         "<td>"+dateFormatUtil(data.runResult.created)+"</td>"+
	 			         "<td>"+dateFormatUtil(data.runResult.created+data.runResult.totalTime)+"</td>"+
	 			         "<td>"+MillisecondToDate(data.runResult.totalTime)+"</td>"+
	 			         "<td>"+data.runResult.oldId+"</td>"+
	 			         "<td>"+data.runResult.newId+"</td>"+
	 			         "<td>"+data.runResult.success+"</td>"+
	 			         "<td>"+data.runResult.error+"</td>"+
	 			      "</tr>"+
	 			   "</tbody>"+
	 			"</table>";
        	}
      	    $('#run-result').html(tbody);
        }
	});
}

/*
时间格式化工具
把Long类型的yyyy-MM-dd日期还原yyyy-MM-dd格式日期 
*/
function dateFormatUtil(longTypeDate){
	var dateTypeDate = "";
	var date = new Date();
	date.setTime(longTypeDate);
	dateTypeDate += date.getFullYear();   //年
	dateTypeDate += "-" + paddNum(date.getMonth()+1); //月 
	dateTypeDate += "-" + paddNum(date.getDate());   //日
	dateTypeDate += " " + paddNum(date.getHours());   //时
	dateTypeDate += ":" + paddNum(date.getMinutes());   //分
	dateTypeDate += ":" + paddNum(date.getSeconds());   //秒
	return dateTypeDate;
}

function MillisecondToDate(msd) {
    var time = parseFloat(msd) / 1000;
    if (null != time && "" != time) {
        if (time > 60 && time < 60 * 60) {
            time = parseInt(time / 60.0) + "分钟" + parseInt((parseFloat(time / 60.0) -
                parseInt(time / 60.0)) * 60) + "秒";
        }
        else if (time >= 60 * 60 && time < 60 * 60 * 24) {
            time = parseInt(time / 3600.0) + "小时" + parseInt((parseFloat(time / 3600.0) -
                parseInt(time / 3600.0)) * 60) + "分钟" +
                parseInt((parseFloat((parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60) -
                parseInt((parseFloat(time / 3600.0) - parseInt(time / 3600.0)) * 60)) * 60) + "秒";
        }
        else {
            time = parseInt(time) + "秒";
        }
    }
    return time;
}

function addTask(){
	var programPath=$('#cxt').html();
	var fromId;
	var toId;
	if(getQueryString("type")=="pingji")
	{
		fromId=document.getElementById('from_month').value;
		toId=document.getElementById('to_month').value;
	}
	else
	{
		fromId=document.getElementById('from_id').value;
		toId=document.getElementById('to_id').value;
	}
	var newestMonth=document.getElementById('newst_month').value;
	var newsType=document.getElementById('category').value;
	if((getQueryString("type")=="dangan"||getQueryString("type")=="xinwen"||getQueryString("type")=="baoguang")&&(fromId==""||toId==""))
		alert("编号不能为空！");
	else
	{
		$.ajax( {  
	        type : 'POST',  
	        url : programPath+'/admin/data/spiderManage/addTask',  
	        data : {
	        	type: getQueryString("type"),
	        	fromId: fromId,
	        	toId: toId,
	        	fromDate: fromDate,
	        	toDate: toDate,
	        	newestMonth: newestMonth,
	        	newsType: newsType,
			  },  
	        dataType : 'json',  
	        success : function(data) {  
	      	    if(data.rspCode==0)
	      	    	window.location.href=window.location.href;
	      	    else
	      	    	alert(data.msg);
	        }
		});
	}
}

function optionTask(id,option){
	var programPath=$('#cxt').html();
	$.ajax( {  
        type : 'POST',  
        url : programPath+'/admin/data/spiderManage/spiderOption',  
        data : {
        	tId: id,
        	option: option
		  },  
        dataType : 'json',  
        success : function(data) {  
        	if(data.rspCode==0)
      	    	window.location.href=window.location.href;
      	    else
      	    	alert(data.msg);
        }
	});
}

function setMonth() { 
	var first=0;
	var myDate = new Date();
	var year = myDate.getFullYear();
	var month = myDate.getMonth()+1;
	var tbody="";
	var nbody="";
	var count=1;
	while(!(year==2013&&month==8))
	{
		count++;
		month--;
		if(month==0)
		{
			month=12;
			year--;
		}
	}
	count++;
	year = myDate.getFullYear();
	month = myDate.getMonth()+1;
	while(count!=1)
	{
		if(first==1)
		{
			tbody+="<option value="+count+" >"+year+"年"+paddNum(month)+"月</option>";
			nbody+="<option value="+year+paddNum(month)+" >"+year+"年"+paddNum(month)+"月</option>";
		}
		else
			first=1;
		count--;
		month--;
		if(month==0)
		{
			month=12;
			year--;
		}
	}
	tbody+="<option value='1' >0000年00月</option>";
	$("#from_month").html(tbody);
	$("#to_month").html(tbody);
	$("#newst_month").html(nbody);
} 

function setMonth3() { 
	var first=0;
	var myDate = new Date();
	var year = myDate.getFullYear();
	var month = myDate.getMonth()+1;
	var count=1;
	while(!(year==2013&&month==8))
	{
		count++;
		month--;
		if(month==0)
		{
			month=12;
			year--;
		}
	}
	count++;
	arrayMonth3 = new Array(count+1); //创建一个数组
	year = myDate.getFullYear();
	month = myDate.getMonth()+1;
	while(count!=1)
	{
		if(first==1)
		{
			arrayMonth3[count]=year+"/"+paddNum(month);
		}
		else
			first=1;
		count--;
		month--;
		if(month==0)
		{
			month=12;
			year--;
		}
	}
	arrayMonth3[count]="0000/00";
} 

function setDatepicker() { 
	var myDate = new Date();
	var year = myDate.getFullYear();
	var month = myDate.getMonth()+1;
	var date =myDate.getDate();
	fromDate=year+paddNum(month)+"01";
	toDate=year+paddNum(month)+paddNum(date);
	
	$('#datepicker span').html(year+"/"+paddNum(month)+"/01" + ' - ' + year+"/"+paddNum(month)+"/"+paddNum(date));
	$('#datepicker').daterangepicker({
	    "showWeekNumbers": true,
	    "autoApply": true,
	    "startDate": paddNum(month)+"/"+"01/"+year,
	    "endDate": paddNum(month)+"/"+paddNum(date)+"/"+year
	}, function(start, end, label) {
		$('#datepicker span').html(start.format('YYYY/MM/DD') + ' - ' + end.format('YYYY/MM/DD'));
		fromDate=start.format('YYYYMMDD');
		toDate=end.format('YYYYMMDD');
	});
} 

//1位补0
var paddNum = function(num){
    num += "";
    return num.replace(/^(\d)$/,"0$1");
};

function setParams() {
	if(getQueryString("type")=="daohang")
	{
//		document.getElementById("none_div").style.display="none";//不显示
		document.getElementById("from_id_div").style.display="none";//不显示
		document.getElementById("to_id_div").style.display="none";//不显示
		document.getElementById("from_month_div").style.display="none";//不显示
		document.getElementById("to_month_div").style.display="none";//不显示
		document.getElementById("newst_month_div").style.display="none";//不显示
		document.getElementById("category_div").style.display="none";//不显示
		document.getElementById("datepicker_div").style.display="none";//不显示
		document.getElementById("chengjiao").style.display="none";//不显示
	}
	else if(getQueryString("type")=="dangan")
	{
		document.getElementById("none_div").style.display="none";//不显示
//		document.getElementById("from_id_div").style.display="none";//不显示
//		document.getElementById("to_id_div").style.display="none";//不显示
		document.getElementById("from_month_div").style.display="none";//不显示
		document.getElementById("to_month_div").style.display="none";//不显示
		document.getElementById("newst_month_div").style.display="none";//不显示
		document.getElementById("category_div").style.display="none";//不显示
		document.getElementById("datepicker_div").style.display="none";//不显示
		document.getElementById("chengjiao").style.display="";//显示
		document.getElementById("spider_bar").style.display="";//显示
		document.getElementById("spider_bar2").style.display="none";//不显示
		document.getElementById("shuju_line").style.display="none";//不显示
		$('#from_id_label').html("开始平台编号");
		$('#to_id_label').html("结束平台编号");
		$('#from-title').html("开始平台编号");
		$('#to-title').html("结束平台编号");
	}
	else if(getQueryString("type")=="wenti")
	{
//		document.getElementById("none_div").style.display="none";//不显示
		document.getElementById("from_id_div").style.display="none";//不显示
		document.getElementById("to_id_div").style.display="none";//不显示
		document.getElementById("from_month_div").style.display="none";//不显示
		document.getElementById("to_month_div").style.display="none";//不显示
		document.getElementById("newst_month_div").style.display="none";//不显示
		document.getElementById("category_div").style.display="none";//不显示
		document.getElementById("datepicker_div").style.display="none";//不显示
		document.getElementById("chengjiao").style.display="none";//不显示
	}
	else if(getQueryString("type")=="wenti2")
	{
//		document.getElementById("none_div").style.display="none";//不显示
		document.getElementById("from_id_div").style.display="none";//不显示
		document.getElementById("to_id_div").style.display="none";//不显示
		document.getElementById("from_month_div").style.display="none";//不显示
		document.getElementById("to_month_div").style.display="none";//不显示
		document.getElementById("newst_month_div").style.display="none";//不显示
		document.getElementById("category_div").style.display="none";//不显示
		document.getElementById("datepicker_div").style.display="none";//不显示
		document.getElementById("chengjiao").style.display="none";//不显示
	}
	else if(getQueryString("type")=="pingji")
	{
		document.getElementById("none_div").style.display="none";//不显示
		document.getElementById("from_id_div").style.display="none";//不显示
		document.getElementById("to_id_div").style.display="none";//不显示
//		document.getElementById("from_month_div").style.display="none";//不显示
//		document.getElementById("to_month_div").style.display="none";//不显示
//		document.getElementById("newst_month_div").style.display="none";//不显示
		document.getElementById("category_div").style.display="none";//不显示
		document.getElementById("datepicker_div").style.display="none";//不显示
		document.getElementById("chengjiao").style.display="";//显示
		document.getElementById("spider_bar").style.display="none";//不显示
		document.getElementById("spider_bar2").style.display="";//显示
		document.getElementById("shuju_line").style.display="none";//不显示
		$('#from-title').html("开始月份");
		$('#to-title').html("结束月份");
	}
	else if(getQueryString("type")=="pingji2")
	{
		document.getElementById("none_div").style.display="none";//不显示
		document.getElementById("from_id_div").style.display="none";//不显示
		document.getElementById("to_id_div").style.display="none";//不显示
		document.getElementById("from_month_div").style.display="none";//不显示
		document.getElementById("to_month_div").style.display="none";//不显示
//		document.getElementById("newst_month_div").style.display="none";//不显示
		document.getElementById("category_div").style.display="none";//不显示
		document.getElementById("datepicker_div").style.display="none";//不显示
		document.getElementById("chengjiao").style.display="none";//不显示
	}
	else if(getQueryString("type")=="shuju")
	{
		document.getElementById("none_div").style.display="none";//不显示
		document.getElementById("from_id_div").style.display="none";//不显示
		document.getElementById("to_id_div").style.display="none";//不显示
		document.getElementById("from_month_div").style.display="none";//不显示
		document.getElementById("to_month_div").style.display="none";//不显示
		document.getElementById("newst_month_div").style.display="none";//不显示
		document.getElementById("category_div").style.display="none";//不显示
//		document.getElementById("datepicker_div").style.display="none";//不显示
		document.getElementById("chengjiao").style.display="";//显示
		document.getElementById("spider_bar").style.display="none";//不显示
		document.getElementById("spider_bar2").style.display="none";//不显示
		document.getElementById("shuju_line").style.display="";//显示
	}
	else if(getQueryString("type")=="xinwen")
	{
		document.getElementById("none_div").style.display="none";//不显示
//		document.getElementById("from_id_div").style.display="none";//不显示
//		document.getElementById("to_id_div").style.display="none";//不显示
		document.getElementById("from_month_div").style.display="none";//不显示
		document.getElementById("to_month_div").style.display="none";//不显示
		document.getElementById("newst_month_div").style.display="none";//不显示
//		document.getElementById("category_div").style.display="none";//不显示
		document.getElementById("datepicker_div").style.display="none";//不显示
		document.getElementById("chengjiao").style.display="none";//不显示
		$('#from_id_label').html("开始页面编号");
		$('#to_id_label').html("结束页面编号");
		$('#from-title').html("开始页面编号");
		$('#to-title').html("结束页面编号");
	}
	else if(getQueryString("type")=="baoguang")
	{
		document.getElementById("none_div").style.display="none";//不显示
//		document.getElementById("from_id_div").style.display="none";//不显示
//		document.getElementById("to_id_div").style.display="none";//不显示
		document.getElementById("from_month_div").style.display="none";//不显示
		document.getElementById("to_month_div").style.display="none";//不显示
		document.getElementById("newst_month_div").style.display="none";//不显示
		document.getElementById("category_div").style.display="none";//不显示
		document.getElementById("datepicker_div").style.display="none";//不显示
		document.getElementById("chengjiao").style.display="none";//不显示
		$('#from_id_label').html("开始页面编号");
		$('#to_id_label').html("结束页面编号");
		$('#from-title').html("开始页面编号");
		$('#to-title').html("结束页面编号");
	}
}

function setFromContent(num,index) {
	if(getQueryString("type")=="pingji")
		$('#from-content'+index).html(arrayMonth3[num]);
}

function setToContent(num,index) {
	if(getQueryString("type")=="pingji")
		$('#to-content'+index).html(arrayMonth3[num]);
}

function setNewestMonth(num,index) {
	$('#newest-month'+index).html(Div(num,100)+"/"+paddNum(num%100));
}

function setNewesType(num,index) {
	$('#newes-type'+index).html(newsTypeArr[num]);
}

function Div(exp1, exp2) {
    var n1 = Math.round(exp1); //四舍五入   
    var n2 = Math.round(exp2); //四舍五入  

    var rslt = n1 / n2; //除  

    if (rslt >= 0) {
        rslt = Math.floor(rslt); //返回小于等于原rslt的最大整数。   
    }
    else {
        rslt = Math.ceil(rslt); //返回大于等于原rslt的最小整数。   
    }

    return rslt;
}