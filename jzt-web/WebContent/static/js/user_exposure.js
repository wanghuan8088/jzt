
$(document).ready(function() {
	showMyComment(0);
	showMySupport(0);
});

function initPage1(nowPage,totalPages,changeUrl) {
	var currentPage = parseInt(nowPage, 10)+1;
	$(function(){
    	var element = $('#page-component1');//获得数据装配的位置
    	//初始化所需数据
		var options = {
		    bootstrapMajorVersion:3,//版本号。3代表的是第三版本
		    currentPage: currentPage, //当前页数
		    numberOfPages: 5, //显示页码数标个数
		    totalPages:totalPages, //总共的数据所需要的总页数
		    itemTexts: function (type, page, current) {  
		    		//图标的更改显示可以在这里修改。
		    switch (type) {  
		            case "first":  
		                return "<<";  
		            case "prev":  
		                return "<";  
		            case "next":  
		                return ">";  
		            case "last":  
		                return ">>";  
		            case "page":  
		                return  page;  
		        }                 
		    }, 
		    tooltipTitles: function (type, page, current) {
				//如果想要去掉页码数字上面的预览功能，则在此操作。例如：可以直接return。
		        switch (type) {
		            case "first":
		                return "Go to first page";
		            case "prev":
		                return "Go to previous page";
		            case "next":
		                return "Go to next page";
		            case "last":
		                return "Go to last page";
		            case "page":
		                return (page === current) ? "Current page is " + page : "Go to page " + page;
		        }
		    },
		    onPageClicked: function (e, originalEvent, type, page) {  
		         //单击当前页码触发的事件。若需要与后台发生交互事件可在此通过ajax操作。page为目标页数。
		         //console.log(e);
		         //console.log(originalEvent);
		        // console.log(type);
//		    	alert("type:" + type + ",Page:" + page);  
		    	if(currentPage!=page) {
		    		window.location.href=changeUrl+"?page="+(page-1);
		    	}
		    }
		};
		element.bootstrapPaginator(options);	//进行初始化
	});
}

function showMyComment(page) {
	var programPath=$('#cxt').html();
	$.ajax( {  
        type : 'POST',  
        url : '../expo/involved',  
        data : {
      	  type: 1,
      	  page: page
		  },  
        dataType : 'json',  
        success : function(data) {  
        	var htmlStr = "";
        	for(var i=0;i<data.list.length;i++) {
        		htmlStr+='<tr>'+
					      	'<td><a href="'+programPath+'/exposure/detail?eid='+data.list[i].eid+'">'+data.list[i].title+'</a></td>'+
					      	'<td><font class="small">'+getSmpFormatDateByLong(data.list[i].createdDate,true)+'</font></td>'+
					      	'<td><font class="small">您评论了该曝光</font></td>'+
					      '</tr>';
        	}
        	$('#tbody_comment').html(htmlStr);
        	
      	  	initPage2(page,data.totalPages);
        }
	});
}

function initPage2(nowPage,totalPages) {
	var currentPage = parseInt(nowPage, 10)+1;
	$(function(){
    	var element = $('#page-component2');//获得数据装配的位置
    	//初始化所需数据
		var options = {
		    bootstrapMajorVersion:3,//版本号。3代表的是第三版本
		    currentPage: currentPage, //当前页数
		    numberOfPages: 5, //显示页码数标个数
		    totalPages:totalPages, //总共的数据所需要的总页数
		    itemTexts: function (type, page, current) {  
		    		//图标的更改显示可以在这里修改。
		    switch (type) {  
		            case "first":  
		                return "<<";  
		            case "prev":  
		                return "<";  
		            case "next":  
		                return ">";  
		            case "last":  
		                return ">>";  
		            case "page":  
		                return  page;  
		        }                 
		    }, 
		    tooltipTitles: function (type, page, current) {
				//如果想要去掉页码数字上面的预览功能，则在此操作。例如：可以直接return。
		        switch (type) {
		            case "first":
		                return "Go to first page";
		            case "prev":
		                return "Go to previous page";
		            case "next":
		                return "Go to next page";
		            case "last":
		                return "Go to last page";
		            case "page":
		                return (page === current) ? "Current page is " + page : "Go to page " + page;
		        }
		    },
		    onPageClicked: function (e, originalEvent, type, page) {  
		         //单击当前页码触发的事件。若需要与后台发生交互事件可在此通过ajax操作。page为目标页数。
		         //console.log(e);
		         //console.log(originalEvent);
		        // console.log(type);
//		    	alert("type:" + type + ",Page:" + page);  
		    	if(currentPage!=page) {
		    		showMyComment(page-1);
		    	}
		    }
		};
		element.bootstrapPaginator(options);	//进行初始化
	});
}

function showMySupport(page) {
	var programPath=$('#cxt').html();
	$.ajax( {  
        type : 'POST',  
        url : '../expo/involved',  
        data : {
      	  type: 2,
      	  page: page
		  },  
        dataType : 'json',  
        success : function(data) {  
        	var htmlStr = "";
        	for(var i=0;i<data.list.length;i++) {
        		htmlStr+='<tr>'+
					      	'<td><a href="'+programPath+'/exposure/detail?eid='+data.list[i].eid+'">'+data.list[i].title+'</a></td>'+
					      	'<td><font class="small">'+getSmpFormatDateByLong(data.list[i].createdDate,true)+'</font></td>'+
					      	'<td><font class="small">您支持了该曝光</font></td>'+
					      '</tr>';
        	}
        	$('#tbody_support').html(htmlStr);
        	
      	  	initPage3(page,data.totalPages);
        }
	});
}

function initPage3(nowPage,totalPages) {
	var currentPage = parseInt(nowPage, 10)+1;
	$(function(){
    	var element = $('#page-component3');//获得数据装配的位置
    	//初始化所需数据
		var options = {
		    bootstrapMajorVersion:3,//版本号。3代表的是第三版本
		    currentPage: currentPage, //当前页数
		    numberOfPages: 5, //显示页码数标个数
		    totalPages:totalPages, //总共的数据所需要的总页数
		    itemTexts: function (type, page, current) {  
		    		//图标的更改显示可以在这里修改。
		    switch (type) {  
		            case "first":  
		                return "<<";  
		            case "prev":  
		                return "<";  
		            case "next":  
		                return ">";  
		            case "last":  
		                return ">>";  
		            case "page":  
		                return  page;  
		        }                 
		    }, 
		    tooltipTitles: function (type, page, current) {
				//如果想要去掉页码数字上面的预览功能，则在此操作。例如：可以直接return。
		        switch (type) {
		            case "first":
		                return "Go to first page";
		            case "prev":
		                return "Go to previous page";
		            case "next":
		                return "Go to next page";
		            case "last":
		                return "Go to last page";
		            case "page":
		                return (page === current) ? "Current page is " + page : "Go to page " + page;
		        }
		    },
		    onPageClicked: function (e, originalEvent, type, page) {  
		         //单击当前页码触发的事件。若需要与后台发生交互事件可在此通过ajax操作。page为目标页数。
		         //console.log(e);
		         //console.log(originalEvent);
		        // console.log(type);
//		    	alert("type:" + type + ",Page:" + page);  
		    	if(currentPage!=page) {
		    		showMySupport(page-1);
		    	}
		    }
		};
		element.bootstrapPaginator(options);	//进行初始化
	});
}

function closeExposure(eid) {
	//利用对话框返回的值 （true 或者 false）  
    if (confirm("你确定关闭吗？")) {  
    	$.ajax( {  
            type : 'POST',  
            url : '../expo/close',  
            data : {
            	eid: eid,
    		  },  
            dataType : 'json',  
            success : function(data) {  
            	location.reload();
            }
    	});
    }  
}

function modify(url) {
	window.location.href=url; 
}

/** 
*转换日期对象为日期字符串 
* @param date 日期对象 
* @param isFull 是否为完整的日期数据, 
* 为true时, 格式如"2000-03-05 01:05:04" 
* 为false时, 格式如 "2000-03-05" 
* @return 符合要求的日期字符串 
*/ 
function getSmpFormatDate(date, isFull) { 
	var pattern = ""; 
	if (isFull == true || isFull == undefined) { 
		pattern = "yyyy-MM-dd hh:mm:ss"; 
	} else { 
		pattern = "yyyy-MM-dd"; 
	} 
	return getFormatDate(date, pattern); 
} 

//扩展Date的format方法 
Date.prototype.format = function (format) { 
var o = { 
"M+": this.getMonth() + 1, 
"d+": this.getDate(), 
"h+": this.getHours(), 
"m+": this.getMinutes(), 
"s+": this.getSeconds(), 
"q+": Math.floor((this.getMonth() + 3) / 3), 
"S": this.getMilliseconds() 
} 
if (/(y+)/.test(format)) { 
format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length)); 
} 
for (var k in o) { 
if (new RegExp("(" + k + ")").test(format)) { 
format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length)); 
} 
} 
return format; 
} 

/** 
*转换long值为日期字符串 
* @param l long值 
* @param isFull 是否为完整的日期数据, 
* 为true时, 格式如"2000-03-05 01:05:04" 
* 为false时, 格式如 "2000-03-05" 
* @return 符合要求的日期字符串 
*/ 
function getSmpFormatDateByLong(l, isFull) { 
	return getSmpFormatDate(new Date(l), isFull); 
} 

/** 
*转换日期对象为日期字符串 
* @param l long值 
* @param pattern 格式字符串,例如：yyyy-MM-dd hh:mm:ss 
* @return 符合要求的日期字符串 
*/ 
function getFormatDate(date, pattern) { 
	if (date == undefined) { 
		date = new Date(); 
	} 
	if (pattern == undefined) { 
		pattern = "yyyy-MM-dd hh:mm:ss"; 
	} 
	return date.format(pattern); 
} 