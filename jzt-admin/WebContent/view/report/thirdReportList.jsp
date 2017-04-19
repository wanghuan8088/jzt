<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/view/header.jsp" %>

<!-- Sidebar Menu -->
<%@ include file="/view/menu.jsp" %>
<!-- /.sidebar-menu -->
</section>
<!-- /.sidebar -->
</aside>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            第三方报告
            <small>列表</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> 报告管理</a></li>
            <li class="active">第三方报告</li>
        </ol>
    </section>



    <!-- Main content -->
    <section class="content">
        <div class="row">
            <div class="col-xs-12">

                <div class="box">
                    <!-- /.box-header -->
                    <div class="box-body">

                        <a class="btn btn-primary btn-lg" href="/jzt-admin/view/report/reportAdd.jsp"> 新 增  </a>
                        <br><br>

                        <!-- 模态框（Modal） -->
                        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                            &times;
                                        </button>
                                        <h4 class="modal-title" id="myModalLabel">

                                        </h4>
                                    </div>
                                    <div class="modal-body">
                                        确定删除吗
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                                        </button>
                                        <button type="button" class="btn btn-primary" onclick='deleteData(this);' id="mbid">
                                            确定
                                        </button>
                                    </div>
                                </div><!-- /.modal-content -->
                            </div><!-- /.modal -->
                        </div>

                        <table id="tableobject" class="table table-bordered table-striped" cellspacing="0" width="100%">
                            <thead>
                            <tr>
                                <th>报告标题</th>
                                <th>报告来源</th>
                                <th>链接地址</th>
                                <th>创建时间</th>
                                <th>修改时间</th>
                  				<th>收藏数</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                        </table>
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

        $('#tableobject').DataTable( {

            "oLanguage": {
                "sLengthMenu": "每页显示 _MENU_ 条记录",
                "sInfo": "从 _START_ 到 _END_ /共 _TOTAL_ 条数据",
                "sInfoEmpty": "没有数据",
                "sInfoFiltered": "(从 _MAX_ 条数据中检索)",
                "oPaginate": {
                    "sFirst": "首页",
                    "sPrevious": "前一页",
                    "sNext": "后一页",
                    "sLast": "尾页"
                },
                "sZeroRecords": "没有检索到数据",
                "sProcessing":   "加载中...",
                "sLoadingRecords": "加载中..."
            },

            "searching":false,
            "aoColumnDefs": [
                { "sWidth": "40%", "aTargets": [ 0 ] },
                { "sWidth": "10%", "aTargets": [ 1 ] },
                { "sWidth": "10%", "aTargets": [ 2 ] },
                { "sWidth": "10%", "aTargets": [ 3 ] },
                { "sWidth": "10%", "aTargets": [ 4 ] },
                { "sWidth": "10%", "aTargets": [ 5 ] },
                { "sWidth": "10%", "aTargets": [ 6 ] },
                {
                    "targets": [0], // 目标列位置，下标从0开始
                    "data": "id", // 数据列名
                    "render": function(data, type, full) { // 返回自定义内容
                    	return "<a href='/jzt-admin/view/report/reportDetail.jsp?id=" + full.id + "'>"+data+"</a>";
                    }
                },
                {
                    "targets": [6], // 目标列位置，下标从0开始
                    "data": "id", // 数据列名
                    "render": function(data, type, full) { // 返回自定义内容
                        return "<button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal' onclick='transferData(" + full.id + ");'>删除</button>";
                    }
                }
            ],

            "ajax": {
                "url": "/jzt-api/rest/v1/report/listthird/0/10",
                "type": "GET",
                "dataSrc": function ( json ) {
                	console.log(json.data.report)
                    return json.data.report;
                }
            },

            "columns":[
                { "data": "title" },
                { "data": "source" },
                { "data": "link" },
                { "data": "createTime" },
                { "data": "updateTime" },
                { "data": "favorites" },
                { "data": "eid" }
            ]

        } );

    } );


    function transferData(id) {
        $('#mbid').val(id);
    }

    function deleteData(obj) {
        var id = $('#mbid').val();
        $.ajax({
            url: '/jzt-api/rest/v1/report/delete/'+id,
            type: 'GET',
            async: true,
            cache: false,
            processData: false,
            success: function (responseStr) {
                ShowSuccess("删除成功!");
                $('#myModal').modal('hide')
                $('#tableobject').DataTable().clear().draw().ajax.reload();
            },
            error: function (responseStr) {
                alert("error:" + JSON.stringify(responseStr));
            }
        });
    }


</script>

</html>
