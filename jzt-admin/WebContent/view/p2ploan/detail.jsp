<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/view/header.jsp"%>

<!-- Sidebar Menu -->
<%@ include file="/view/menu.jsp" %>
<!-- /.sidebar-menu -->
</section>
<!-- /.sidebar -->
</aside>
  
<style>
table.dataTable.display tbody tr.selected {
    background-color: #acbad4;
}
</style>


<!-- 模态框（Modal） -->
<div  class="modal fade"  id="myModal" tabindex="-1" role="dialog"  aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" style="width:1000px;">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">

                </h4>
            </div>
            <div class="modal-body">


            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                </button>
                <button type="button" class="btn btn-primary" onclick='confirmData(this);' >
                    确定
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>


<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            p2p标的
            <small>编 辑</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> p2p标的管理</a></li>
            <li class="active">编 辑</li>
        </ol>
    </section>



    <!-- Main content -->
    <section class="content">
        <div class="row">
            <div class="col-xs-12">

                <div class="box">
                    <!-- /.box-header -->
                    <div class="box-body">

                        <div class="box box-success">


                            <div class="box box-primary">
                                <div class="box-header with-border">
                                    <h3 class="box-title">p2p标的内容编辑</h3>
                                </div>

                                <form role="form">
                                    <!-- text input -->
                                    <div class="form-group">
                                        <label>产品名称</label>
                                        <input type="text" id="name" class="form-control" placeholder="请输入 ...">
                                    </div>
                                    <div class="form-group">
                                        <label>所属p2p平台</label>
                                        <select class="form-control" name="platId" id="platId" onchange="showMsg(this)">
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label>借款金额(以分为单位)</label>
                                        <input type="text" id="amount" class="form-control" placeholder="请输入 ...">
                                    </div>
                                    <div class="form-group">
                                        <label>年化收益</label>
                                        <input type="text" id="interestRate" class="form-control" placeholder="请输入 ...">
                                    </div>
                                    <div class="form-group">
                                        <label>开标时间</label>
                                        <input type="text" id="startTime" class="form-control" placeholder="请输入 ...">
                                    </div>
                                    <div class="form-group">
                                        <label>期限(以天为单位)</label>
                                        <input type="text" id="limitTime" class="form-control" placeholder="请输入 ...">
                                    </div>
                                    <div class="form-group">
                                        <label>进度</label>
                                        <input type="text" id="schedule" class="form-control" placeholder="请输入 ...">
                                    </div>
                                    <div class="form-group">
                                        <label>起息日</label>
                                        <input type="text" id="firstdayInterest" class="form-control" placeholder="请输入 ...">
                                    </div>
                                    <div class="form-group">
                                        <label>还款方式</label>
                                        <input type="text" id="modeOfPayment" class="form-control" placeholder="请输入 ...">
                                    </div>
                                    <div class="form-group">
                                        <label>起购金额</label>
                                        <input type="text" id="purchaseAmount" class="form-control" placeholder="请输入 ...">
                                    </div>
                                    <div class="form-group">
                                        <label>限购金额</label>
                                        <input type="text" id="limitAmount" class="form-control" placeholder="请输入 ...">
                                    </div>
                                    <div class="form-group">
                                        <label>对接产品</label>
                                        <input type="text" id="dockProduct" class="form-control" placeholder="请输入 ...">
                                    </div>
                                    <div class="form-group">
                                        <label>保障方式</label>
                                        <input type="text" id="protectionMeans" class="form-control" placeholder="请输入 ...">
                                    </div>
                                    <div class="form-group">
                                        <label>能否转让</label>
                                        <br><input type="radio" name="isTransfer" value="1">是<br>
                                        <input type="radio" name="isTransfer" value="0">否
                                    </div>
                                    <div class="form-group">
                                        <label>借款状态</label>
                                        <br><input type="radio" name="state" value="1">可借<br>
                                        <input type="radio" name="state" value="0">不可借
                                    </div>
                                    <div class="form-group">
                                        <label>产品链接</label>
                                        <input type="text" id="productUrl" class="form-control" placeholder="请输入 ...">
                                    </div>
                                    <!-- textarea -->
                                    <div class="form-group">
                                        <label>产品说明</label>
                                        <textarea class="form-control" id="des" rows="15" placeholder="请输入 ..."></textarea>
                                    </div>
                                    <div class="form-group">
                                        <label>协议</label>
                                        <input type="text" id="protocol" class="form-control" placeholder="请输入 ...">
                                    </div>

                                    <div class="box-footer">
                                        <button type="button" class="btn btn-primary" onClick="submitForm();">提交</button>
                                    </div>
                                </form>

                            </div>


                        </div>
                        <!-- /.box-body -->
                    </div>
                    <!-- /.box -->
                </div>
                <!-- /.col -->
            </div>
            <!-- /.row -->
        </div>
    </section>
    <!-- /.content -->




</div>
<!-- /.content-wrapper -->

<%@ include file="/view/footer.jsp"%>


<%
    String id = request.getParameter("id");
%>
<script>

    $(document).ready(function() {
        var id = <%=id%>;
        getP2pPlatList();
        getData(id);

    } );

    function getData(id) {

        $.ajax({
            url: '/jzt-api/rest/1/p2ploan/detail/' + id,
            type: 'GET',
            async: true,
            cache: false,
// contentType: false,
//contentType: 'application/x-www-form-urlencoded',
            processData: false,
            success: function (responseStr) {

                $("#name").val(responseStr.data.p2ploan.name);
                var isTransferRadio = $('input:radio[name="isTransfer"]');
                for(var i=0; i<isTransferRadio.length; i++){
                    if(isTransferRadio[i].value == responseStr.data.p2ploan.isTransfer) isTransferRadio[i].checked = true;
                }
                $("#purchaseAmount").val(responseStr.data.p2ploan.purchaseAmount);
                $("#protocol").val(responseStr.data.p2ploan.protocol);
                $("#des").val(responseStr.data.p2ploan.des);
                $("#dockProduct").val(responseStr.data.p2ploan.dockProduct);
                $("#modeOfPayment").val(responseStr.data.p2ploan.modeOfPayment);
                var state = $('input:radio[name="state"]');
                for(var i=0; i<state.length; i++){
                    if(state[i].value == responseStr.data.p2ploan.state) state[i].checked = true;
                }
                $("#interestRate").val(responseStr.data.p2ploan.interestRate);
                $("#protectionMeans").val(responseStr.data.p2ploan.protectionMeans);
                $("#amount").val(responseStr.data.p2ploan.amount);
                $("#limitAmount").val(responseStr.data.p2ploan.limitAmount);
                $("#platId").val(responseStr.data.p2ploan.platId);
                $("#productUrl").val(responseStr.data.p2ploan.productUrl);
                $("#limitTime").val(responseStr.data.p2ploan.limitTime);
                $("#firstdayInterest").val(responseStr.data.p2ploan.firstdayInterest);
                $("#startTime").val(responseStr.data.p2ploan.startTime);
                $("#schedule").val(responseStr.data.p2ploan.schedule);

            },
            error: function (responseStr) {
                alert("error:" + JSON.stringify(responseStr));
            }
        });

    }


    function  getP2pPlatList() {
        $.ajax({
            url: '/jzt-api/rest/1/platform/p2pplat/',
            type: 'GET',
            async: true,
            cache: false,
            processData: false,
            success: function (responseStr) {
                for (var one in responseStr.data.p2pplat)
                {
                    var name = responseStr.data.p2pplat[one].name;
                    var platId = responseStr.data.p2pplat[one].id;
                    $("#platId").append("<option value="+platId+">"+name+"</option>");
                }

            },
            error: function (responseStr) {
                alert("error:" + JSON.stringify(responseStr));
            }
        });
    }

    function submitForm() {

        var data=new Object();
        data.id = <%=id%>;
        data.name = $("#name").val();
        data.isTransfer = $('input:radio[name="isTransfer"]:checked').val();
        data.purchaseAmount =$("#purchaseAmount").val();
        data.protocol =$("#protocol").val();
        data.des =$("#des").val();
        data.dockProduct =$("#dockProduct").val();
        data.modeOfPayment =$("#modeOfPayment").val();
        data.state = $('input:radio[name="state"]:checked').val();
        data.interestRate =$("#interestRate").val();
        data.protectionMeans =$("#protectionMeans").val();
        data.amount =$("#amount").val();
        data.limitAmount =$("#limitAmount").val();
        data.platId =$("#platId").val();
        data.productUrl =$("#productUrl").val();
        data.limitTime =$("#limitTime").val();
        data.firstdayInterest =$("#firstdayInterest").val();
        data.startTime =$("#startTime").val();
        data.schedule =$("#schedule").val();


        var datafstr=JSON.stringify(data);
        var requestData = datafstr;

        $.ajax({
            url: '/jzt-api/rest/1/p2ploan/edit/',
            type: 'POST',
            data: "para="+encodeURIComponent(requestData),
            async: true,
            cache: false,
// contentType: false,
            contentType: 'application/x-www-form-urlencoded',
            processData: false,
            success: function (responseStr) {
                alert("保存成功!");
            },
            error: function (responseStr) {
                alert("error:" + JSON.stringify(responseStr));
            }
        });
    }

</script>

</html>
