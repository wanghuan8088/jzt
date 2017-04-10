var quanjupagesize = 20;// 全局变量 每页显示多少条数据
var quanjucurprovince;
var quanjucurpage;
var maxpage;// 全局变量 总页数

//字段值键值对
var field = new Dictionary();
field.put("total_turnover", "成交量");
field.put("total_unrepay_amount", "累计待还金额");
field.put("avg_interest_rate", "平均利率");
field.put("total_investment", "累计投资人数");
field.put("avg_repay_period", "平均借款期限");
field.put("ivestment_amount_per_person", "人均投资金额");
field.put("total_borrower", "累计借款人数");
field.put("borrow_amount_per_person", "人均借款金额");
field.put("time_weight_amount", "时间加权成交量");
field.put("borrow_amount", "累计借款标数");
field.put("month_net_income", "近30日资金净流入");
field.put("time_for_full_bid", "平均满标用时");
field.put("accounted_revenue_in_60_days", "未来60日待还");
field.put("capital_lever", "资金杠杆");

//字段值键值对
var fieldR = new Dictionary();
fieldR.put("成交量", "total_turnover");
fieldR.put("累计待还金额", "total_unrepay_amount");
fieldR.put("平均利率", "avg_interest_rate");
fieldR.put("累计投资人数", "total_investment");
fieldR.put("平均借款期限", "avg_repay_period");
fieldR.put("人均投资金额", "ivestment_amount_per_person");
fieldR.put("累计借款人数", "total_borrower");
fieldR.put("人均借款金额", "borrow_amount_per_person");
fieldR.put("时间加权成交量", "time_weight_amount");
fieldR.put("累计借款标数", "borrow_amount");
fieldR.put("近30日资金净流入", "month_net_income");
fieldR.put("平均满标用时", "time_for_full_bid");
fieldR.put("未来60日待还", "accounted_revenue_in_60_days");
fieldR.put("资金杠杆", "capital_lever");

//单位键值对
var unit = new Dictionary();
unit.put("total_turnover", "万元");
unit.put("total_unrepay_amount", "万元");
unit.put("avg_interest_rate", "%");
unit.put("total_investment", "人");
unit.put("avg_repay_period", "月");
unit.put("ivestment_amount_per_person", "万元/人次");
unit.put("total_borrower", "人");
unit.put("borrow_amount_per_person", "万元/人次");
unit.put("time_weight_amount", "");
unit.put("borrow_amount", "");
unit.put("month_net_income", "万元");
unit.put("time_for_full_bid", "");
unit.put("accounted_revenue_in_60_days", "万元");
unit.put("capital_lever", "");

var multiselect_data=new Array();
var sort="total_turnover";

var timeType = "day";

var getProCount = 0;
var lastPro = 0;

var programPath;

$(document).ready(function() {
	
	programPath=$('#cxt').html();
	
	$('.multiselect').multiselect({
		onChange: function(option, checked) {
	        // Get selected options.
	        var selectedOptions = $('.multiselect option:selected');
	 
	        if (selectedOptions.length >= 7) {
	          // Disable all other checkboxes.
	          var nonSelectedOptions = $('.multiselect option').filter(function() {
	            return !$(this).is(':selected');
	          });
	 
	          var dropdown = $('.multiselect').siblings('.multiselect-container');
	          nonSelectedOptions.each(function() {
	            var input = $('input[value="' + $(this).val() + '"]');
	            input.prop('disabled', true);
	            input.parent('li').addClass('disabled');
	          });
	        }
	        else {
	          // Enable all checkboxes.
	          var dropdown = $('.multiselect').siblings('.multiselect-container');
	          $('.multiselect option').each(function() {
	            var input = $('input[value="' + $(this).val() + '"]');
	            input.prop('disabled', false);
	            input.parent('li').addClass('disabled');
	          });
	        }
	    },
        buttonClass: 'btn btn-link',
        buttonText: function(options) {
        	multiselect_data.length=0;
            if (options.length === 0) {
            	$('#remain').text(7-options.length);
                return '请选择至少一项数据 <b class="caret"></b>';
            }
            else {
                var selected = '';
                options.each(function() {
                	selected += $(this).text() + '  |  ';
                	multiselect_data.push(fieldR.get($(this).text()));
                });
                $('#remain').text(7-options.length);
                return selected.substr(0, selected.length -2) + ' <b class="caret"></b>';
            }
        },
        onDropdownHide: function(event) {
        	getData(multiselect_data,sort);
          	if(multiselect_data.length==0)
          		alert("请选择至少一项数据");
        },
    });
	
	getData(multiselect_data,sort);
});

function sortRefresh(sortData)
{
	sort=sortData;
	getData(multiselect_data,sort);
}

//网贷平台
function getData(compareData,sortData)
{
	$.ajax( {  
          type : 'POST',  
          url : '../product/pDataDetail',  
          data : {
        	  sortData: sortData,
        	  compareData: compareData,
        	  type: timeType,
		  },  
          dataType : 'json',  
          success : function(data) {
        	  var state = data.state;
        	  if(state==0)
        	  {
        		  $('#date').html(data.dataDate);
        		  var thead="<th class='text-center'>排名</th>"+"<th class='text-center'>产品名称</th>";
        		  if(sortData=="service_time") {
        			  thead+="<th class='text-center'><a href='javascript:void(0)' onclick='sortRefresh(\"service_time\")'>运营时间</a><img src='"+programPath+"/static/image/down.png' class='arrow-down'></th>";
        		  } else {
        			  thead+="<th class='text-center'><a href='javascript:void(0)' onclick='sortRefresh(\"service_time\")'>运营时间</a></th>";
        		  }
        		  if(sortData=="registered_capital") {
        			  thead+="<th class='text-center'><a href='javascript:void(0)' onclick='sortRefresh(\"registered_capital\")'>注册资金</a><img src='"+programPath+"/static/image/down.png' class='arrow-down'></th>";
        		  }else {
        			  thead+="<th class='text-center'><a href='javascript:void(0)' onclick='sortRefresh(\"registered_capital\")'>注册资金</a></th>";
        		  }
        		  for(var i=0;i<compareData.length;i++)
        		  {
        			  if(sortData==compareData[i])
        				  thead+="<th class='text-center'>"+field.get(compareData[i])+"<img src='"+programPath+"/static/image/down.png' class='arrow-down'></th>";
        			  else
        				  thead+="<th class='text-center'><a href='javascript:void(0)' onclick='sortRefresh(\""+compareData[i]+"\")'>"+field.get(compareData[i])+"</a></th>";
        		  }
        		  thead+="<th class='text-center'>档案</th>";
        		  $('#thead').html("");
        		  $('#thead').append(thead);
        		  var count=0;
        		  var dList = data.dList;
        		  var tbody="";
            	  while(count<dList.length)
            	  {
            		  count++;
            		  tbody+="<tr>"+
				         "<td>"+count+"</td>"+
				         "<td><a href='"+programPath+"/product/pData/"+dList[count-1][0]+"'>"+dList[count-1][1]+"</a></td>";
            		  
            		  var yunyue=dList[count-1][3]%12;
            		  var yunyear=(dList[count-1][3]-yunyue)/12;
            		  if(yunyear==0)
            			  {
            			  if(sortData=="service_time") {
                			  tbody+="<td class='syn-font'>"+dList[count-1][3]+"月</td>";
                		  } else {
                			  tbody+="<td>"+dList[count-1][3]+"月</td>";
                		  }
            			  }
            		  else{
            			  if(yunyue==0){
            				  if(sortData=="service_time") {
                    			  tbody+="<td class='syn-font'>"+yunyear+"年</td>";
                    		  } else {
                    			  tbody+="<td>"+yunyear+"年</td>";
                    		  }
            			  }
            			  else{
            				  if(sortData=="service_time") {
                    			  tbody+="<td class='syn-font'>"+yunyear+"年"+yunyue+"月</td>";
                    		  } else {
                    			  tbody+="<td>"+yunyear+"年"+yunyue+"月</td>";
                    		  }
            			  }
            			 
            		  }
            		  
            		  //alert(dList[count-1][3]);
            		  if(sortData=="registered_capital") {
            			  tbody+="<td class='syn-font'>"+dList[count-1][4]+"万元</td>";
            		  }else {
            			  tbody+="<td>"+dList[count-1][4]+"万元</td>";
            		  }
            		  for(var i=0;i<compareData.length;i++)
            		  {
            			  if(sortData==compareData[i])
            				  tbody+="<td class='syn-font'>"+dList[count-1][5+i]+unit.get(compareData[i])+"</td>";
            			  else
            				  tbody+="<td>"+dList[count-1][5+i]+unit.get(compareData[i])+"</td>";
            		  }
            		  tbody+="<td><a href='"+programPath+"/product/pDetail/"+dList[count-1][0]+"'><span class='glyphicon glyphicon-book'></span></a></td>"+
				      "</tr>";
            	  }
            	  $('#tbody').html("");
            	  $('#tbody').append(tbody);
        	  }
          }
	});
}

function setTimeType(num){
	if(num==1&&timeType!="day") {
		$('#yesterday').addClass('cur');
		$('#week').removeClass('cur');
		$('#month').removeClass('cur');
		timeType = "day";
		getData(multiselect_data,sort);
	} else if(num==2&&timeType!="week") {
		$('#yesterday').removeClass('cur');
		$('#week').addClass('cur');
		$('#month').removeClass('cur');
		timeType = "week";
		getData(multiselect_data,sort);
	} else if(num==3&&timeType!="month") {
		$('#yesterday').removeClass('cur');
		$('#week').removeClass('cur');
		$('#month').addClass('cur');
		timeType = "month";
		getData(multiselect_data,sort);
	}
}



//问题平台 分页
function getDataPro(prov,curpage){
	
	
	
	$.ajax
	({
		type:'POST',
		url: '../product/getcookie',
		success: function(data)
		{
			
			
			getAjaxData(prov,curpage);//调用下面的函获取数据
		}
		
		
	});
	
	
}


//上面进行资格审查，下面才是获取数据
function getAjaxData(prov,curpage)
{
	
	quanjucurprovince=prov;//保存当前省份备用
	
	var jiamipagesize = jiami(quanjupagesize);
	//注意由于curpage可以为空,所以分情况，非空才加密
	if(curpage!=null)
	{
		var jiamicurpage = jiami(curpage);
	}
	else
	{
		var jiamicurpage=curpage;
	}
	
	
	$.ajax( {  
        type : 'POST',  
        url : '../product/pDataWenti',  
        data : {
        	prov: prov,
        	pagesize: jiamipagesize,
        	curpage: jiamicurpage
        	
		  },  
        dataType : 'json',  
        success : function(data) {
        	if(getProCount==0) {
        		$(pro_ul).html('');
    			$(pro_ul).append('<li id="0" class="cur" onclick="getDataPro()">不限</li>');
    			for(var i=0;i<data.pList.length;i++){
    				$(pro_ul).append('<li id="'+data.pList[i].id+'" onclick="getDataPro('+data.pList[i].id+')">'+data.pList[i].name+'</li>');
    			}
    			getProCount++;
        	} else {
        		$('#'+lastPro).removeClass("cur");
        		if(prov==null){
        			$('#0').addClass("cur");
        			lastPro=0;
        		} else {
        			$('#'+prov).addClass("cur");
        			lastPro=prov;
        		}
        	}
			
			var thead_pro="<th class='text-center'>排名</th>"+"<th class='text-center'>产品名称</th>"
					+"<th class='text-center'>城市</th>"+"<th class='text-center'>上线时间</th>"
					+"<th class='text-center'>注册资本</th>"+"<th class='text-center'>产品状态</th>"
			
      		$('#thead_pro').html("");
      		$('#thead_pro').append(thead_pro);
      		
      		var count=0;
      		var qList = data.qList;
      		var tbody_pro="";
      		while(count<qList.length)
      	    {
      		    count++;
      		    tbody_pro+="<tr>"+
			           "<td>"+count+"</td>"+
			           "<td><a href='"+programPath+"/product/pData/"+qList[count-1].pid+"'>"+qList[count-1].productName+"</a></td>"+
			           "<td>"+qList[count-1].city+"</td>"+
			           "<td>"+qList[count-1].startTime+"</td>"+
			           "<td>"+qList[count-1].registeredCapital+"万元</td>";
      		    if(qList[count-1].productState.id==2)
      		    	tbody_pro+="<td><font color='#FF0000'>提现困难</font></td>";
      		    else if(qList[count-1].productState.id==3)
      		    	tbody_pro+="<td><font color='#FF0000'>停业</font></td>";
      		    else if(qList[count-1].productState.id==4)
    		    	tbody_pro+="<td><font color='#FF0000'>跑路</font></td>";
      	    }
          	$('#tbody_pro').html("");
          	$('#tbody_pro').append(tbody_pro);
          	
          	
          	
          	
          	
          	
          	
          	//下面动态显示页码
          	

		 	maxpage = data.totalpages; //全局变量
		 	CurPage = data.curpage; 
		 	quanjucurpage= CurPage;//全局变量
	 			if (CurPage==0)
                {
                	var span = '<li class="disabled"><a href="javascript:void(0)" aria-label="First"><span aria-hidden="true">首页</span></a></li><li class="disabled"><a href="javascript:void(0)" aria-label="Previous"  id="PreviousPage"><span aria-hidden="true">&laquo;</span></a></li>';  
                }
	 			 else 
                {
                    var span = '<li><a href="#" aria-label="First" onclick="PageIndexClick(this)" id="FirstPage"><span aria-hidden="true">首页</span></a></li><li><a href="javascript:void(0)" aria-label="Previous" onclick="PageIndexClick(this)" id="PreviousPage"><span aria-hidden="true">&laquo;</span></a></li>';  
                }
	 			 var firstPage = 1;  //第一页页码
                 var pagecount = 0;//最后一页页码  
                 if(maxpage > 10)
                 {
                	 pagecount = 10;
                	 if(CurPage>8)
                	 {
                		 pagecount = CurPage + 2;
                		 firstPage = CurPage - 7;
                	 }
                	 if(pagecount > maxpage){
                		 pagecount = maxpage;
                	 }
                	 for (var j = firstPage; j <= pagecount ; j++) 
                	 { 
                		 var temp=CurPage + 1;
                            if (j == temp) 
                            {  
                                span += "<li class='active'><span>"+ j +"</span></li>" ;  ;  
                            } 
                            else 
                            {
                            	
                                span += "<li><a href='javascript:void(0)' onclick='getDataPro(" +quanjucurprovince +","+ (j-1) + ")'>"+ j +"</a></li>" ; 
                                
                            }  
                     } 
                	     	 	                	 
                 }
                 else 
                 {  
                        pagecount = maxpage;  
                        for (var j = firstPage; j <= pagecount ; j++) 
                        {
                        	
                        	var temp2=CurPage + 1;
                            if (j == temp2) 
                            {  
                                span += "<li class='active'><span>"+ j +"</span></li>" ;  ;  
                            } 
                            else 
                            {  
                            	span += "<li><a href='javascript:void(0)' onclick='getDataPro(" +quanjucurprovince +","+ (j-1) + ")'>"+ j +"</a></li>" ;  
                            }  
                        } 
                        
                  }
                 
                   
                 
                 if (CurPage==maxpage-1)
                 {
                    span += "<li class='disabled'><a href='javascript:void(0)' aria-label='Next'  id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li class='disabled'><a href='#' aria-label='Last'  id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
                 }
                 else
                 {
                    span += "<li><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
                 }
                 
                 $('#paging').html(span);
	 		       		 		  	
          	
        },
        
        error: function(data)
        {
        	alert("cookie error!");
        }
	});
	
	
	
}










//自定义字典对象
function Dictionary(){
 this.data = new Array();
 
 this.put = function(key,value){
  this.data[key] = value;
 };

 this.get = function(key){
  return this.data[key];
 };

 this.remove = function(key){
  this.data[key] = null;
 };
 
 this.isEmpty = function(){
  return this.data.length == 0;
 };

 this.size = function(){
  return this.data.length;
 };
}








//以下函数是分页用的
//首页、上一页、下一页、尾页点击  
function PageIndexClick(obj) {  
 
    //id  
    var type = $(obj).attr('id');  
    //首页  
    if (type == 'FirstPage') 
    {      
        getDataPro(quanjucurprovince,0);   
    }  
    //上一页  
    else if (type == 'PreviousPage') 
    {      
        getDataPro(quanjucurprovince,quanjucurpage-1);   
    }  
    //下一页  
    else if (type == 'NextPage') 
    {  
        getDataPro(quanjucurprovince,quanjucurpage+1);  
    }  
    //尾页  
    else if (type == 'LastPage') 
    {    
        getDataPro(quanjucurprovince,maxpage-1);  
    }  
}  
  



