<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/view/header.jsp" %>

<!-- Sidebar Menu -->
<ul class="sidebar-menu">
    <li class="header">导航</li>
    <!-- Optionally, you can add icons to the links -->

    <li class="treeview">
        <a href="#">
            <i class="fa fa-user-secret"></i>
            <span>管理员管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu" >
            <li class="active"><a href="/view/starter.jsp"><i class="fa fa-circle-o"></i> 账户管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 权限管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 日志管理</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-user"></i>
            <span>用户管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu" >
            <li class="active"><a href="/view/starter.jsp"><i class="fa fa-circle-o"></i> 用户</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 短信验证码</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 权限管理</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-newspaper-o"></i>
            <span>新闻管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu menu-open" style="display: block;">
            <li class="active"><a href="/jzt-admin/view/news/newsList.jsp"><i class="fa fa-circle-o"></i> 新闻</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 新闻类别管理</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-tachometer"></i>
            <span>平台运营数据</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu" >
            <li class="active"><a href="/view/starter.jsp"><i class="fa fa-circle-o"></i> 平台统计数据管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 平台第三方评级管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 平台每日运营数据管理</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-apple"></i>
            <span>APP内容管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu" >
            <li class="active"><a href="/view/starter.jsp"><i class="fa fa-circle-o"></i> 轮播广告图管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 推广平台管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 热门新闻管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 热门平台管理</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-area-chart"></i>
            <span>平台访问管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu" >
            <li class="active"><a href="/view/starter.jsp"><i class="fa fa-circle-o"></i> 每日访问量管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 每周访问量管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 每月访问量管理</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-bolt"></i>
            <span>曝光管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu" >
            <li class="active"><a href="/view/starter.jsp"><i class="fa fa-circle-o"></i> 曝光信息列表</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 曝光信息审核</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-info-circle"></i>
            <span>信息管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu" >
            <li class="active"><a href="/view/starter.jsp"><i class="fa fa-circle-o"></i> 信息管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 曝光预警</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-file-pdf-o"></i>
            <span>报告管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu" >
            <li class="active"><a href="/view/starter.jsp"><i class="fa fa-circle-o"></i> 平台报告</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 第三方报告</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-bell-slash-o"></i>
            <span>敏感词管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu" >
            <li class="active"><a href="/view/starter.jsp"><i class="fa fa-circle-o"></i> 敏感词管理</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-bank"></i>
            <span>银行平台管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu" >
            <li class="active"><a href="/view/starter.jsp"><i class="fa fa-circle-o"></i> 银行理财能力</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 银行财务报告</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 银行基本信息</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 理财产品标的</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 银行类型管理</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-balance-scale"></i>
            <span>P2P平台管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu" >
            <li class="active"><a href="/view/starter.jsp"><i class="fa fa-circle-o"></i> P2P标的管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> P2P平台管理</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-life-buoy"></i>
            <span>平台辅助管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu" >
            <li class="active"><a href="/jzt-admin/view/platSupport/stateList.jsp"><i class="fa fa-circle-o"></i> 平台状态管理</a></li>
            <li><a href="/jzt-admin/view/platSupport/tagList.jsp"><i class="fa fa-circle-o"></i> tag汇总管理</a></li>
            <li><a href="/jzt-admin/view/platSupport/safeCertList.jsp"><i class="fa fa-circle-o"></i> 安全认证管理</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-map-pin"></i>
            <span>地理位置管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu">
            <li class="active"><a href="/view/starter.jsp"><i class="fa fa-circle-o"></i> 省份表管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 城市管理</a></li>
        </ul>
    </li>

</ul>
<!-- /.sidebar-menu -->
</section>
<!-- /.sidebar -->
</aside>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
        <h1>
            Tag
            <small>列表</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Tag管理</a></li>
            <li class="active">Tag</li>
        </ol>
    </section>



    <!-- Main content -->
    <section class="content">
        <div class="row">
            <div class="col-xs-12">

                <div class="box">
                    <!-- /.box-header -->
                    <div class="box-body">

                        <a class="btn btn-primary btn-lg" href="/woo-web/page/article/add.jsp"> 新 增  </a>
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
                                <th>描述</th>
                                <th>创建时间</th>
                                <th>修改时间</th>
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
                { "sWidth": "20%", "aTargets": [ 0 ] },
                { "sWidth": "20%", "aTargets": [ 1 ] },
                { "sWidth": "20%", "aTargets": [ 2 ] },
                { "sWidth": "20%", "aTargets": [ 3 ] },
                {
                    "targets": [3], // 目标列位置，下标从0开始
                    "data": "nid", // 数据列名
                    "render": function(data, type, full) { // 返回自定义内容
                        return "<button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal' onclick='transferData(" + full.nid + ");'>删除</button>";
                    }
                }
            ],

            "ajax": {
                "url": "/jzt-api/rest/v1/platSupport/stateList/0/10",
                "type": "GET",
                "dataSrc": function ( json ) {
                    return json.data.record;
                }
            },

            "columns":[
                { "data": "description" },
                { "data": "updateTime" },
                { "data": "createTime" },
                { "data": "id" }
            ]

        } );

    } );


    function transferData(id) {
        $('#mbid').val(id);
    }

    function deleteData(obj) {
        var id = $('#mbid').val();
        $.ajax({
            url: '/jzt-api/rest/v1/platSupport/deleteState/'+id,
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
