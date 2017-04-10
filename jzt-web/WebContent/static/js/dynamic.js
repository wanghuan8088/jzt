
/**
 * 
lilv
	interest_rate_table lilv
	interest_rate_page
	lilv_label

inverstment_amount 人均投资金额
	investment_amount_table
	investment_amount_page
	invers_label
	
borrow_amount 人均借款金额
	borrow_amount_table
	borrow_amount_page
	borrow_label
	
num_investment 投资人数
	num_investment_table
	num_investment_page
	num_inv_lable
	
num_borrower 借款人数
	num_borrower_table
	num_borrower_page
	num_bor_label

loan_bid 借款标数
	loan_bid_table
	loan_bid_page
	loan_lable
	
time_for_full_bid 满标用时
	time_for_full_bid_table
	time_for_full_bid_page
	time_label
	
volumn_weighted_time 时间加权成交量
	volumn_weighted_time_table
	volumn_weighted_time_page
	volumn_label
	
average_loan_period  平均借款期限
	average_loan_period_table
	average_loan_period_page
	average_label
	
 * 
 */

var ctx=$("#ctx").html();

var turnOverTag = 1;
var interestRateTag = 2;
var inverstmentAmountTag = 3;
var borrowAmountTag = 4;
var numInvestmentTag = 5;
var numBorrowerTag = 6;
var loanBidTag = 7;
var timeForFullBidTag = 8;
var volumnWeightedTimeTag = 9;
var averageLoanPeriodTag = 10;
var tableKeys = {};
var pageKeys = {};
var urlKeys = {};
var dataKeys = {};
var dateKeys = {};
tableKeys[turnOverTag] = "#turnover_table";
pageKeys[turnOverTag] = "#turnover_page";
urlKeys[turnOverTag] = ctx+'/platuser/turnover';
dataKeys[turnOverTag] = "turnover";
dateKeys[turnOverTag] = "#turn_label";

tableKeys[interestRateTag] = "#interest_rate_table";
pageKeys[interestRateTag] = "#interest_rate_page";
urlKeys[interestRateTag] = ctx+'/platuser/interest_rate';
dataKeys[interestRateTag] = "interestRate";
dateKeys[interestRateTag] = "#lilv_label";

tableKeys[inverstmentAmountTag] = "#investment_amount_table";
pageKeys[inverstmentAmountTag] = "#investment_amount_page";
urlKeys[inverstmentAmountTag] = ctx+'/platuser/investment_amount';
dataKeys[inverstmentAmountTag] = "investmentAmount";
dateKeys[inverstmentAmountTag] = "#invers_label";

tableKeys[borrowAmountTag] = "#borrow_amount_table";
pageKeys[borrowAmountTag] = "#borrow_amount_page";
urlKeys[borrowAmountTag] = ctx+'/platuser/borrow_amount';
dataKeys[borrowAmountTag] = "borrowAmount";
dateKeys[borrowAmountTag] = "#borrow_label";

tableKeys[numInvestmentTag] = "#num_investment_table";
pageKeys[numInvestmentTag] = "#num_investment_page";
urlKeys[numInvestmentTag] = ctx+'/platuser/num_investment';
dataKeys[numInvestmentTag] = "numInvestment";
dateKeys[numInvestmentTag] = "#num_inv_lable";

tableKeys[numBorrowerTag] = "#num_borrower_table";
pageKeys[numBorrowerTag] = "#num_borrower_page";
urlKeys[numBorrowerTag] = ctx+'/platuser/num_borrower';
dataKeys[numBorrowerTag] = "numBorrower";
dateKeys[numBorrowerTag] = "#num_bor_label";

tableKeys[loanBidTag] = "#loan_bid_table";
pageKeys[loanBidTag] = "#loan_bid_page";
urlKeys[loanBidTag] = ctx+'/platuser/loan_bid';
dataKeys[loanBidTag] = "loanBid";
dateKeys[loanBidTag] = "#loan_lable";
//
tableKeys[timeForFullBidTag] = "#time_for_full_bid_table";
pageKeys[timeForFullBidTag] = "#time_for_full_bid_page";
urlKeys[timeForFullBidTag] = ctx+'/platuser/time_for_full_bid';
dataKeys[timeForFullBidTag] = "timeForFullBid";
dateKeys[timeForFullBidTag] = "#time_label";

tableKeys[volumnWeightedTimeTag] = "#volumn_weighted_time_table";
pageKeys[volumnWeightedTimeTag] = "#volumn_weighted_time_page";
urlKeys[volumnWeightedTimeTag] = ctx+'/platuser/volumn_weighted_time';
dataKeys[volumnWeightedTimeTag] = "volumnWeightedTime";
dateKeys[volumnWeightedTimeTag] = "#volumn_label";

tableKeys[averageLoanPeriodTag] = "#average_loan_period_table";
pageKeys[averageLoanPeriodTag] = "#average_loan_period_page";
urlKeys[averageLoanPeriodTag] = ctx+'/platuser/average_loan_period';
dataKeys[averageLoanPeriodTag] = "averageLoanPeriod";
dateKeys[averageLoanPeriodTag] = "#average_label";


$(function(){
	try{
		//changeMagicNumber();
		var param = {};
		getData(param,true,turnOverTag);

		var i = 2;
		while(i<=10){
			var tag = $(("#data_tab"+i+"_tag"));
			tag.click(function(){
				if($(this).attr("data-init-flag")== '0'){
					getData(param,true,$(this).attr("data-target-tag")-0);
					$(this).attr("data-init-flag",1);
				}
			});
			i++;
		}
		
	}catch(err){}
});

function magic_number(value, elem) { 
	elem.animate({count: value}, { 
        duration: 500, 
        step: function() { 
        	elem.text(String(parseInt(this.count)/100)); 
        }
    }
    ); 
}; 


function changeMagicNumber(){

	$(".magic_num").each(function(){
		var targetValue = $(this).attr("value");	//获得image的原始url
		targetValue = targetValue*100;
		targetValue = parseInt(targetValue);
		magic_number(targetValue,$(this));
	}); 
}


function pageChange(tag,initFlag) { 
	/*
	 * page
	 * size
	 * startDate
	 * endDate
	 */
	if(initFlag  == null)
		initFlag = false;
	if(this.tag != null)
		tag = this.tag;
	var table = $(dateKeys[tag]);
	var pageDiv = $(pageKeys[tag]);
	try{
		var startDate = table.find("input[name=startDate]").val();
		var endDate = table.find("input[name=endDate]").val();

		var current = pageDiv.find(".jPag-current").html();
		if(current == null)
			current = 1;
		//param current startDate endDate
		var param ={};
		param['page'] = current - 1;
		if(startDate != null && startDate !=""){
			param['startDate'] = startDate;
			var startDateTime = new Date(startDate).getTime();
 		}
		if(endDate != null && endDate !=""){
			param['endDate'] = endDate;
			var endDateTime = new Date(endDate).getTime();
 		}
		if(startDateTime > endDateTime){
			alert("请选择正确的日期");
			return;
		}
		
		getData(param,initFlag,tag);
	 	
	}catch(err){
		
	}
 	
}

$(function(){
	$(".tab-content").find(".date_confirm").click(function(){
		var tag = ($(this).parent().parent().parent().parent().parent().attr("data-target-tag"));
		pageChange(tag,true);
	});
});

function getData(param,flag,tag){
	
	var url = urlKeys[tag];
	var page = $(pageKeys[tag]);
	param['pid'] = $("#pid").val();
	$.ajax({
		 type: "POST",
           url: url,
           data: param,
           dataType : "json",
           error: function () {
           },
           success: function (result) {
	           	if(flag == true){
	            	var dataPageCur = result.currentPageNum-0+1;
	            	var dataPageTotal = result.totalPageNum;
	            	if(dataPageTotal==0) dataPageTotal =1;
	            	page.attr("data-page-cur",dataPageCur);
	            	page.attr("data-page-total",dataPageTotal);
	            	initPage(tag);
	           	}
	           	parseJson(tag,result);
           }
	 });
}




function initPage(tag){
	
	var page = $(pageKeys[tag]);
	var dataPageCur = page.attr("data-page-cur");
	var dataPageTotal = page.attr("data-page-total");
	page.paginate({
		callback	:	pageChange,
		count 		: dataPageTotal,
		start 		: dataPageCur,
		display     : 10,
		border					: false,
		text_color  			: '#79B5E3',
		background_color    	: 'none',	
		text_hover_color  		: '#2573AF',
		background_hover_color	: 'none', 
		images		: false,
		mouse		: 'press',
		tag			:tag
	});
}

function parseJson(tag,json){
	var table = $(tableKeys[tag]);
	var list = json.productTrendList;
	var size = list.length;
	i = 0;
	var html = "";
	while(i<size){
		var one = list[i];
		if(one[dataKeys[tag]]==null)
			one[dataKeys[tag]]="";
		html += "<tr><td >"+one.date+"</td><td>"+one[dataKeys[tag]]+"</td>"
		
		i++;
		one = list[i];
		if(i<size && one[dataKeys[tag]]==null)
			one[dataKeys[tag]]="";
		if(i<size)
		html += "<td >"+one.date+"</td><td>"+one[dataKeys[tag]]+"</td>"
		i++
		one = list[i];
		if(i<size && one[dataKeys[tag]]==null)
			one[dataKeys[tag]]="";
		if(i < size)
		html += "<td >"+one.date+"</td><td>"+one[dataKeys[tag]]+"</td></tr>"
		i++;
	}
	$(table).find("tbody").html(html);
}


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






 
  

