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
            平台每日访问量
            <small>列表</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> 平台每日访问量管理</a></li>
            <li class="active">平台每日访问量管理</li>
        </ol>
    </section>



    <!-- Main content -->
    <section class="content">
        <div class="row">
            <div class="col-xs-12">

                <div class="box">
                    <!-- /.box-header -->
                    <div class="box-body">

                        <a class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal2"> 新 增  </a>
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
                        
                        <!-- 模态框（Modal） -->
                        <div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                            &times;
                                        </button>
                                        <h4 class="modal-title" id="myModalLabel">
                                        新增平台访问量
                                        </h4>
                                    </div>
                                    <div class="modal-body">
                                    	<div class="form-group">
                                    		<label>平台PID</label>
                                    		<input class="form-control" type="text" id="platid" placeholder="输入平台pid"></input>
                                    	</div>
                                    	<div class="form-group">
                                    		<label>平台每日访问量</label>
                                   			<input class="form-control" type="text" id="platpv" placeholder="输入平台每日访问量"></input>
                                        </div>
                                    	<div class="form-group">
                                    		<label>平台每日访问变化量</label>
                                    		<input class="form-control" type="text" id="pvchange" placeholder="输入平台每日访问变化量"></input>
                                    	</div>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                                        </button>
                                        <button type="button" class="btn btn-primary" onclick='addData(this);'>
                                            确定
                                        </button>
                                    </div>
                                </div><!-- /.modal-content -->
                            </div><!-- /.modal -->
                        </div>
                        
                        <!-- 模态框（Modal） -->
                        <div class="modal fade" id="myModal3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                            &times;
                                        </button>
                                        <h4 class="modal-title" id="myModalLabel">
                                        修改平台访问量
                                        </h4>
                                    </div>
                                    <div class="modal-body">
                                    	<input class="form-control" type="hidden" id="platid2" disabled="true"></input>
                                    	<div class="form-group">
                                    		<label>平台PID</label>
                                    		<input class="form-control" type="text" id="platpid2" placeholder="输入平台pid" disabled="true"></input>
                                    	</div>
                                    	<div class="form-group">
                                    		<label>平台每日访问量</label>
                                   			 <input class="form-control" type="text" id="platpv2" placeholder="输入每日访问量"></input>
                                        </div>
                                    	<div class="form-group">
                                    		<label>平台每日访问变化量</label>
                                    		<input class="form-control" type="text" id="pvchange2" placeholder="输入每日访问变化量"></input>
                                    	</div>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                                        </button>
                                        <button type="button" class="btn btn-primary" onclick='updateData(this);'>
                                            确定
                                        </button>
                                    </div>
                                </div><!-- /.modal-content -->
                            </div><!-- /.modal -->
                        </div>

                        <table id="tableobject" class="table table-bordered table-striped" cellspacing="0" width="100%">
                            <thead>
                            <tr>
                                <th>平台PID</th>
                                <th>点击量</th>
                                <th>点击变化量</th>
                                <th>更新时间</th>
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
                { "sWidth": "30%", "aTargets": [ 0 ] },
                { "sWidth": "20%", "aTargets": [ 1 ] },
                { "sWidth": "20%", "aTargets": [ 2 ] },
                { "sWidth": "20%", "aTargets": [ 3 ] },
                {
                    "targets": [0], // 目标列位置，下标从0开始
                    "data": "nid", // 数据列名
                    "render": function(data, type, full) { // 返回自定义内容
                        return "<a href='#' data-toggle='modal' data-target='#myModal3' onclick='transferUpdateData(" + full.id +","+full.pid+","+full.numClick+","+full.numChange+ ");'>"+data+"</a>";
                    }
                },
                {
                    "targets": [4], // 目标列位置，下标从0开始
                    "data": "id", // 数据列名
                    "render": function(data, type, full) { // 返回自定义内容
                        return "<button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal' onclick='transferDelData(" + full.id + ");'>删除</button>";
                    }
                }
            ],

            "ajax": {
                "url": "/jzt-api/rest/v1/everymonthpv/list/0/10",
                "type": "GET",
                "dataSrc": function ( json ) {
                    return json.data.everymonthplatvisit;
                }
            },

            "columns":[
                { "data": "pid" },
                { "data": "numClick" },
                { "data": "numChange" },
                { "data": "updateTime" },
                { "data": "id" }
            ]

        } );

    } );


    function transferDelData(id) {
        $('#mbid').val(id);
    }
    
    function transferUpdateData(id,pid,numClick,numChange) {
        $('#platid2').val(id);
        $('#platpid2').val(pid);
        $('#platpv2').val(numClick);
        $('#pvchange2').val(numChange);
    }

    function deleteData(obj) {
        var id = $('#mbid').val();
        $.ajax({
            url: '/jzt-api/rest/v1/everymonthpv/delete/'+id,
            type: 'GET',
            async: true,
            cache: false,
            processData: false,
            success: function (responseStr) {
                ShowSuccess("删除成功!");
                $('#myModal').modal('hide');
                $('#tableobject').DataTable().clear().draw().ajax.reload();
            },
            error: function (responseStr) {
                alert("error:" + JSON.stringify(responseStr));
            }
        });
    }
    
    function updateData(obj) {

        var data=new Object();
        data.id=$('#platid2').val();;
        data.pid=$("#platpid2").val();
        data.numClick=$("#platpv2").val();
        data.numChange=$("#pvchange2").val();

        var datafstr=JSON.stringify(data);
        var requestData = datafstr;

        $.ajax({
            url: '/jzt-api/rest/1/everymonthpv/modify/',
            type: 'POST',
            data: "para="+encodeURIComponent(requestData),
            async: true,
            cache: false,
            contentType: 'application/x-www-form-urlencoded',
            processData: false,
            success: function (responseStr) {
                ShowSuccess("保存成功!");
                $('#myModal3').modal('hide');
                $('#tableobject').DataTable().clear().draw().ajax.reload();
            },
            error: function (responseStr) {
                alert("error:" + JSON.stringify(responseStr));
            }
        });


    }
    
    function addData(obj) {
    	
    	var data=new Object();
        data.pid=$("#platid").val();
        data.numClick=$("#platpv").val();
        data.numChange=$("#pvchange").val();

    	var datafstr=JSON.stringify(data);
    	var requestData = datafstr;
    	
        $.ajax({
            url: '/jzt-api/rest/v1/everymonthpv/add/',
            type: 'POST',
            data: "para="+encodeURIComponent(requestData),
            async: true,
            cache: false,
            // contentType: false,
            contentType: 'application/x-www-form-urlencoded',
            processData: false,
            success: function (responseStr) {
                ShowSuccess("保存成功!");
                $('#myModal2').modal('hide');
                $("#platid").val("");
                $("#platpv").val("");
                $("#pvchange").val("");
                $('#tableobject').DataTable().clear().draw().ajax.reload();
            },
            error: function (responseStr) {
            	alert("error:" + JSON.stringify(responseStr));
            }
        });
    }


</script>

</html>
