<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/view/header.jsp"%>
<link rel="stylesheet" href="/page/dist/css/mvpready-admin.css">
      <!-- Sidebar Menu -->
      <ul class="sidebar-menu">
        <li class="header">导航</li>
        <!-- Optionally, you can add icons to the links -->
        <li><a href="/page/starter.jsp"><i class="fa fa-edit"></i> <span>平台管理</span></a></li>
        <li><a href="/page/product/list.jsp"><i class="fa fa-circle-o"></i> <span>标的管理</span></a></li>
        <li class="active"><a href="/page/order/list.jsp"><i class="fa fa-th"></i> <span>订单管理</span></a></li>
        <li><a href="/page/topic/list.jsp"><i class="fa fa-dashboard"></i> <span>公司管理</span></a></li>
        <li><a href="/page/user/list.jsp"><i class="fa fa-laptop"></i> <span>用户管理</span></a></li>
      </ul>
      <!-- /.sidebar-menu -->
    </section>
    <!-- /.sidebar -->
  </aside>
<%  
String id = request.getParameter("id");  
%> 

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
              订单
        <small>详 细</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> 订单管理</a></li>
        <li class="active">详 细</li>
      </ol>
    </section>

<!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-12">

          <div class="box">
            <!-- /.box-header -->
            <div class="box-body">
            
<div class="box box-primary">
			<div class="box box-solid">
	            <div class="box-header with-border">
	
	
<div class="col-md-6" style="font-size: 15px;">
            <div class="well">
              <h4>订单号: <span class="text-primary" id="orderIdf1"></span> &nbsp;&nbsp;&nbsp;
              <button type="button" id="statusf"></button>
              </h4>
                <table class="table">
                  <tbody>
                    <tr>
                      <th>交易号:</th>
                      <td id="chargeIdf"></td>
                    </tr>
                    <tr>
                      <th>标的名称:</th>
                      <td><a href="javascript:;" id="productNamef"></a></td>
                    </tr>
                    <tr>
                      <th>订单价格:</th>
                      <td><i class="fa fa-rmb"></i> <strong class="text-primary" id="productPricef"></strong> 元</td>
                    </tr>
                    <tr>
                      <th>支付方式:</th>
                      <td><img id="paymentf" src='' /></td>
                    </tr>
                    <tr>
                      <th>购买用户:</th>
                      <td><a href="javascript:;" id="userNamef"></a></td>
                    </tr>
                    <tr>
                      <th>省市区:</th>
                      <td><span id="provincef"></span> &nbsp;<span id="cityf"></span> &nbsp;<span id="districtf"></span> &nbsp;</td>
                    </tr>
                    <tr>
                      <th>详细地址:</th>
                      <td id="detailf"></td>
                    </tr>
                    <tr>
                      <th>留言:</th>
                      <td id="messagef"></td>
                    </tr>
                  </tbody>
                </table>
            </div> <!-- /.well -->
</div>
	
	            </div>
          	</div>
                
            <div class="box-header with-border">
              <h3 class="box-title">物流信息</h3>
            </div>
			    <div class="form-group">
			       <label>物流标的</label>
			          <select class="form-control" name="expCode" id="expCode">
			       </select>
			    </div>
                <div class="form-group">
                   <label>物流号</label>
                   <input type="text" id="expNo" class="form-control">
                </div>
                
              <div class="box-footer">
                <button type="button" class="btn btn-primary" onClick="submitForm();">查询</button>
              </div>
              
                <div id="expressDiv">
					<ul class="timeline" id="timeline" style="display:none;">
					    <li class="time-label">
					        <span class="bg-red" id="timetext">
					        </span>
					    </li>
					    <li>
					        <i class="fa fa-envelope bg-blue"></i>
					        <div class="timeline-item" style="background:#d2d6de;" >
					            <span class="time" id="timeleft"><i class="fa fa-clock-o"></i> </span>
					            <div class="timeline-body" id="expresstext">
					            </div>
					        </div>
					    </li>
					</ul>
                </div>
</div>
              
              
            </div>
            <!-- /.box-body -->
          </div>
          <!-- /.box -->
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->
    </section>
    <!-- /.content -->




  </div>
  <!-- /.content-wrapper -->

<%@ include file="/view/footer.jsp"%>

<script>
$(document).ready(function() {
	var id = <%=id%>;
	getData(id);
	addItems();
} );

function copytimeline(){ 
	var timeline = $('body').contents().find('#timeline');
	var timelineCopy = timeline.clone(true);
	timelineCopy.attr('id',"timelinecopy");
	timelineCopy.attr('style',"display:block;");
	$('#expressDiv').append(timelineCopy);
	return timelineCopy;
}

function addItems() {
    $.ajax({  
        url: "/woo-api/order/express",
		type: 'POST',
	    async: true,
	    cache: false,
	    contentType: 'application/x-www-form-urlencoded',
	    processData: false,
        traditional: true,  
        success: function (data) {  
                var jsonObj =data.data.express;
                var optionstring = "";  
                for (var j = 0; j < jsonObj.length; j++) {  
                    optionstring += "<option value=\"" + jsonObj[j].expressCode + "\" >" + jsonObj[j].expressName + "</option>";  
                }  
                $("#expCode").html("<option value='请选择'>请选择...</option> "+optionstring);  
        },  
        error: function (msg) {
            alert("出错了！");
        }  
    });            
};  


function getData(id) {
	var data="{\"id\":"+id+"}";
	$.ajax({
		url: '/woo-api/order/detail',
		type: 'POST',
	    data: "para="+data,
	    async: true,
	    cache: false,
	    contentType: 'application/x-www-form-urlencoded',
	    processData: false,
	    success: function (responseStr) {
	    	var status = responseStr.data.order.status;
	    	var s = "";
	    	if(status == 0) {
	       		 s="未支付";
	       		 $("#statusf").text(s);
	       		 $("#statusf").addClass("btn btn-warning");
	       	 }
	       	 if(status == 1) {
	       		 s="已支付";
	       		 $("#statusf").text(s);
	       		 $("#statusf").addClass("btn btn-primary");
	       	 }
	       	 if(status == 2) {
	       		 s="已发货";
	       		 $("#statusf").text(s);
	       		 $("#statusf").addClass("btn btn-info");
	       	 }
	       	 if(status == 3) {
	       		 s="已完成";
	       		 $("#statusf").text(s);
	       		 $("#statusf").addClass("btn btn-success");
	       	 }
	       	 if(status == 4) {
	       		 s="已关闭";
	       		 $("#statusf").text(s);
	       		 $("#statusf").addClass("btn btn-danger");
	       	 }
	    	
	    	$("#orderIdf1").text(responseStr.data.order.orderId);
	    	$("#orderIdf2").text(responseStr.data.order.orderId);
	    	$("#chargeIdf").text(responseStr.data.order.chargeId);
	    	$("#productNamef").text(responseStr.data.order.productName);
	    	$("#productPricef").text(responseStr.data.order.productPrice/100);
	    	$("#userNamef").text(responseStr.data.order.userName);
	    	$("#provincef").text(responseStr.data.order.province);
	    	$("#cityf").text(responseStr.data.order.city);
	    	$("#districtf").text(responseStr.data.order.district);
	    	$("#detailf").text(responseStr.data.order.detail);
	    	$("#messagef").text(responseStr.data.order.message);
	    	
	    	var payment = responseStr.data.order.payment;
	       	 if(payment == 'wx') {
	       		$("#paymentf").attr('src',"/page/dist/img/pc_wxqrpay.png");
	       	 }
	       	 if(payment == 'alipay') {
	       		$("#paymentf").attr('src',"/page/dist/img/alipaypcnew.png");
	       	 }
	    	
	    },  
	    error: function (responseStr) {
	   	 alert("error:" + JSON.stringify(responseStr));
	    }
	});
    
 }

function submitForm() {
	
	var expCode=$("#expCode").val(); 
	var expNo=$("#expNo").val(); 
	
	$.ajax({
	    url: '/logistics/search',
	    type: 'POST',  
	    data: "expCode="+expCode+"&expNo="+expNo,  
	    async: true,  
	    cache: false,  
	    contentType: 'application/x-www-form-urlencoded',
	    processData: false,  
	    success: function (responseStr) {
	    	//$("#timelinecopy").remove(); 
	    	var timelineCopyorign = $('body').contents().find('#timeline');
	    	$('#expressDiv').children().remove();
	    	$('#expressDiv').append(timelineCopyorign);
	    	
            var jsonObj =jQuery.parseJSON(responseStr.data.track).Traces;
            for (var j = 0; j < jsonObj.length; j++) {  
            	var timelineCopy = copytimeline();
            	timelineCopy.find('#timetext').text(jsonObj[j].AcceptTime);
            	timelineCopy.find('#timeleft').text(jsonObj[j].AcceptTime);
            	timelineCopy.find('#expresstext').text(jsonObj[j].AcceptStation);
            }  
	    	
	    },  
	    error: function (responseStr) {
	   	 alert("error:" + JSON.stringify(responseStr));
	    }
	});
	
}
</script>



</html>
