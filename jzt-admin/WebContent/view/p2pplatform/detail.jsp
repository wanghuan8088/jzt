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
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> p2p平台管理</a></li>
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

                            <%@ include file="/view/platformcommon/platform.jsp" %>


                            <div class="box box-primary">
                                <div class="box-header with-border">
                                    <h3 class="box-title">平台安全保障</h3>
                                </div>

                                <form role="form">
                                    <!-- text input -->
                                    <div class="form-group">
                                        <label>产品名称</label>
                                        <input type="text" id="" class="form-control" placeholder="请输入 ...">
                                    </div>

                                    <div class="box-footer">
                                        <button type="button" class="btn btn-primary" onClick="submitForm();">提交</button>
                                    </div>
                                </form>

                            </div>

                            <div class="box box-primary">
                                <div class="box-header with-border">
                                    <h3 class="box-title">平台APP</h3>
                                </div>

                                <form role="form">
                                    <!-- text input -->
                                    <div class="form-group">
                                        <label>产品名称</label>
                                        <input type="text" id="" class="form-control" placeholder="请输入 ...">
                                    </div>

                                    <div class="box-footer">
                                        <button type="button" class="btn btn-primary" onClick="submitForm();">提交</button>
                                    </div>
                                </form>

                            </div>

                            <div class="box box-primary">
                                <div class="box-header with-border">
                                    <h3 class="box-title">平台联系方式</h3>
                                </div>

                                <form role="form">
                                    <!-- text input -->
                                    <div class="form-group">
                                        <label>产品名称</label>
                                        <input type="text" id="" class="form-control" placeholder="请输入 ...">
                                    </div>

                                    <div class="box-footer">
                                        <button type="button" class="btn btn-primary" onClick="submitForm();">提交</button>
                                    </div>
                                </form>

                            </div>

                            <div class="box box-primary">
                                <div class="box-header with-border">
                                    <h3 class="box-title">平台标签管理</h3>
                                </div>

                                <form role="form">
                                    <!-- text input -->
                                    <div class="form-group">
                                        <label>产品名称</label>
                                        <input type="text" id="" class="form-control" placeholder="请输入 ...">
                                    </div>

                                    <div class="box-footer">
                                        <button type="button" class="btn btn-primary" onClick="submitForm();">提交</button>
                                    </div>
                                </form>

                            </div>

                            <div class="box box-primary">
                                <div class="box-header with-border">
                                    <h3 class="box-title">平台网站</h3>
                                </div>

                                <form role="form">
                                    <!-- text input -->
                                    <div class="form-group">
                                        <label>产品名称</label>
                                        <input type="text" id="" class="form-control" placeholder="请输入 ...">
                                    </div>

                                    <div class="box-footer">
                                        <button type="button" class="btn btn-primary" onClick="submitForm();">提交</button>
                                    </div>
                                </form>

                            </div>

                            <div class="box box-primary">
                                <div class="box-header with-border">
                                    <h3 class="box-title">平台所属公司的工商信息</h3>
                                </div>

                                <form role="form">
                                    <!-- text input -->
                                    <div class="form-group">
                                        <label>产品名称</label>
                                        <input type="text" id="" class="form-control" placeholder="请输入 ...">
                                    </div>

                                    <div class="box-footer">
                                        <button type="button" class="btn btn-primary" onClick="submitForm();">提交</button>
                                    </div>
                                </form>

                            </div>

                            <div class="box box-primary">
                                <div class="box-header with-border">
                                    <h3 class="box-title">公司组织结构</h3>
                                </div>

                                <form role="form">
                                    <!-- text input -->
                                    <div class="form-group">
                                        <label>产品名称</label>
                                        <input type="text" id="" class="form-control" placeholder="请输入 ...">
                                    </div>

                                    <div class="box-footer">
                                        <button type="button" class="btn btn-primary" onClick="submitForm();">提交</button>
                                    </div>
                                </form>

                            </div>

                            <div class="box box-primary">
                                <div class="box-header with-border">
                                    <h3 class="box-title">公司高管</h3>
                                </div>

                                <form role="form">
                                    <!-- text input -->
                                    <div class="form-group">
                                        <label>产品名称</label>
                                        <input type="text" id="" class="form-control" placeholder="请输入 ...">
                                    </div>

                                    <div class="box-footer">
                                        <button type="button" class="btn btn-primary" onClick="submitForm();">提交</button>
                                    </div>
                                </form>

                            </div>

                            <div class="box box-primary">
                                <div class="box-header with-border">
                                    <h3 class="box-title">公司股东</h3>
                                </div>

                                <form role="form">
                                    <!-- text input -->
                                    <div class="form-group">
                                        <label>产品名称</label>
                                        <input type="text" id="" class="form-control" placeholder="请输入 ...">
                                    </div>

                                    <div class="box-footer">
                                        <button type="button" class="btn btn-primary" onClick="submitForm();">提交</button>
                                    </div>
                                </form>

                            </div>

                            <div class="box box-primary">
                                <div class="box-header with-border">
                                    <h3 class="box-title">web网站认证</h3>
                                </div>

                                <form role="form">
                                    <!-- text input -->
                                    <div class="form-group">
                                        <label>产品名称</label>
                                        <input type="text" id="" class="form-control" placeholder="请输入 ...">
                                    </div>

                                    <div class="box-footer">
                                        <button type="button" class="btn btn-primary" onClick="submitForm();">提交</button>
                                    </div>
                                </form>

                            </div>

                            <div class="box box-primary">
                                <div class="box-header with-border">
                                    <h3 class="box-title">合作伙伴</h3>
                                </div>

                                <form role="form">
                                    <!-- text input -->
                                    <div class="form-group">
                                        <label>产品名称</label>
                                        <input type="text" id="" class="form-control" placeholder="请输入 ...">
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
<script src="/jzt-admin/page/platformcommon/platform.js"></script>
<script>

    $(document).ready(function() {
        var id = <%=id%>;
        fillHeadTitle(id);
    } );
    function fillHeadTitle(id) {

        fillProvinceOption();
        fillStateOption();
        fillCompanyOption();
        $.ajax({
            url: '/jzt-api/rest/1/platform/detail/' + id,
            type: 'GET',
            async: true,
            cache: false,
            processData: false,
            success: function (responseStr) {
                $("section h1").append(responseStr.data.platform.name);
            },
            error: function (responseStr) {
                alert("error:" + JSON.stringify(responseStr));
            }
        });
    }

    function showPlatform() {
        var id = <%=id%>;
        $('.platform').toggle();
        getPlatFormBasicInfo(id);
    }


</script>

</html>
