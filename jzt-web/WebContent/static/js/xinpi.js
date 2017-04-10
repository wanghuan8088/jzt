
//字段值键值对
var field = new Dictionary();
field.put("total_turnover", "交易总额");
field.put("borrow_amount", "成交总笔数");
field.put("total_borrower", "借款人数量");
field.put("total_investment", "投资人数量");
field.put("borrow_amount_per_person", "人均累计借款额度");
field.put("avg_borrow_per_trade", "人均借款额度");
field.put("ivestment_amount_per_person", "人均累计投资额度");
field.put("avg_invest_per_trade", "人均投资额度");
field.put("loan_balance", "贷款余额");
field.put("max_borrow", "最大单户借款余额占比");
field.put("topten_borrow", "最大10户借款余额占比");
field.put("avg_repay_period", "平均满标时间");
field.put("total_default_rate", "累计违约率");
field.put("overdue_rate_for_plat", "平台项目逾期率");
field.put("overdue_rate_three_month", "近三月项目逾期率");
field.put("overdue_amount", "借款逾期金额");
field.put("compensatory_amount", "代偿金额");
field.put("overdue_rate", "借贷逾期率");
field.put("bad_debt_rate", "借贷坏账率");
field.put("customer_complaints", "客户投诉情况");
field.put("relevant_information", "已撮合未到期融资项目有关信息");

//字段值键值对
var fieldR = new Dictionary();
fieldR.put("交易总额", "total_turnover");
fieldR.put("成交总笔数", "borrow_amount");
fieldR.put("借款人数量", "total_borrower");
fieldR.put("投资人数量", "total_investment");
fieldR.put("人均累计借款额度", "borrow_amount_per_person");
fieldR.put("人均借款额度", "avg_borrow_per_trade");
fieldR.put("人均累计投资额度", "ivestment_amount_per_person");
fieldR.put("人均投资额度", "avg_invest_per_trade");
fieldR.put("贷款余额", "loan_balance");
fieldR.put("最大单户借款余额占比", "max_borrow");
fieldR.put("最大10户借款余额占比", "topten_borrow");
fieldR.put("平均满标时间", "avg_repay_period");
fieldR.put("累计违约率", "total_default_rate");
fieldR.put("平台项目逾期率", "overdue_rate_for_plat");
fieldR.put("近三月项目逾期率", "overdue_rate_three_month");
fieldR.put("借款逾期金额", "overdue_amount");
fieldR.put("代偿金额", "compensatory_amount");
fieldR.put("借贷逾期率", "overdue_rate");
fieldR.put("借贷坏账率", "bad_debt_rate");
fieldR.put("客户投诉情况", "customer_complaints");
fieldR.put("已撮合未到期融资项目有关信息", "relevant_information");

//单位键值对
var unit = new Dictionary();
unit.put("total_turnover", "万元");
unit.put("borrow_amount", "");
unit.put("total_borrower", "人");
unit.put("total_investment", "人");
unit.put("borrow_amount_per_person", "万元");
unit.put("avg_borrow_per_trade", "万元");
unit.put("ivestment_amount_per_person", "万元");
unit.put("avg_invest_per_trade", "万元均投资额度");
unit.put("loan_balance", "万元");
unit.put("max_borrow", "%");
unit.put("topten_borrow", "%");
unit.put("avg_repay_period", "");
unit.put("total_default_rate", "%");
unit.put("overdue_rate_for_plat", "%");
unit.put("overdue_rate_three_month", "%");
unit.put("overdue_amount", "万元");
unit.put("compensatory_amount", "万元");
unit.put("overdue_rate", "%");
unit.put("bad_debt_rate", "%");
unit.put("customer_complaints", "");
unit.put("relevant_information", "");

var multiselect_data=new Array();
var sort="total_turnover";

var getProCount = 0;
var lastPro = 0;

var programPath;

$(document).ready(function() {
	
	programPath=$('#cxt').html();
	
	$('.multiselect').multiselect({
		onChange: function(option, checked) {
	        // Get selected options.
	        var selectedOptions = $('.multiselect option:selected');
	 
	        if (selectedOptions.length >= 9) {
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
            	$('#remain').text(9-options.length);
                return '请选择至少一项数据 <b class="caret"></b>';
            }
            else {
                var selected = '';
                options.each(function() {
                	selected += $(this).text() + '  |  ';
                	multiselect_data.push(fieldR.get($(this).text()));
                });
                $('#remain').text(9-options.length);
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
          url : '../xinpi/xinpiDetail',  
          data : {
        	  sortData: sortData,
        	  compareData: compareData,
		  },  
          dataType : 'json',  
          success : function(data) {
        	  var state = data.state;
        	  if(state==0)
        	  {
        		  var thead="<th class='text-center'>排名</th>"+"<th class='text-center'>产品名称</th>";
        		  for(var i=0;i<compareData.length;i++)
        		  {
        			  if(sortData==compareData[i])
        				  thead+="<th class='text-center'>"+field.get(compareData[i])+"<img src='"+programPath+"/static/image/down.png' class='arrow-down'></th>";
        			  else
        				  thead+="<th class='text-center'><a href='javascript:void(0)' onclick='sortRefresh(\""+compareData[i]+"\")'>"+field.get(compareData[i])+"</a></th>";
        		  }
        		  thead+="<th class='text-center'>详情</th>";
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
            		  for(var i=0;i<compareData.length;i++)
            		  {
            			  if(sortData==compareData[i])
            				  tbody+="<td class='syn-font'>"+dList[count-1][2+i]+unit.get(compareData[i])+"</td>";
            			  else
            				  tbody+="<td>"+dList[count-1][2+i]+unit.get(compareData[i])+"</td>";
            		  }
            		  tbody+="<td><a href='"+programPath+"/xinpi/danganDetail/"+dList[count-1][0]+"'><span class='glyphicon glyphicon-book'></span></a></td>"+
				      "</tr>";
            	  }
            	  $('#tbody').html("");
            	  $('#tbody').append(tbody);
        	  }
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
  



