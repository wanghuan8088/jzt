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
            报告管理
            <small>列表</small>
        </h1>
        <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> 报告管理</a></li>
            <li class="active">详细信息</li>
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

                            <div class="box-header with-border">
                                <h3 class="box-title">第一步:上传平台首要图片(1)</h3>
                            </div>

                            <div id="imgdivpri" class="row">
                                <div id="imgpri">
                                    <div class="col-md-2 form-group">
                                        <label for="exampleInputFile">平台首要图片(建议上传750*380比例)</label><br>
                                        <form id="imageform" method="post" enctype="multipart/form-data">
                                            <input id="imageform_key" name="key" type="hidden">
                                            <input name="x:jzt" type="hidden" value="jzt">
                                            <input id="token" name="token" type="hidden" value="">
                                            <input id="imageform_file" name="file" type="file" />
                                            <input name="accept" type="hidden" />
                                        </form>
                                        <div class="box-footer">
                                            <button type="button" class="btn btn-primary" onClick="uploadFile(this);">上传</button>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <a href="" data-lightbox="example-1" id="orginimage">
                                            <img id="formimage" src="" width="250" height="250" alt="750*380" />
                                        </a>
                                        <p class="help-block" id="imgname"></p>
                                        <p class="help-block" id="imgtype"></p>
                                        <p class="help-block" id="imgsize"></p>
                                    </div>
                                </div>
                            </div>

                            <div class="box box-primary">
                            <div class="box-header with-border">
                                <h3 class="box-title">第二步:填写内容</h3>
                            </div>

                            <form role="form">
                                <!-- text input -->
                                <div class="form-group">
                                    <label>报告标题</label>
                                    <input type="text" id="title" class="form-control" placeholder="请输入 ...">
                                </div>
                                <div class="form-group">
                                    <label>报告来源</label>
                                    <input type="text" id="source" class="form-control" placeholder="请输入 ...">
                                </div>
                                <div class="form-group">
                                    <label>链接地址</label>
                                    <input type="text" id="link" class="form-control" placeholder="请输入 ...">
                                </div>
                                <div class="form-group">
                                        <label>报告类型</label>
                                        <select class="form-control" name="state" id="type" onchange="showMsg(this)">

                                            <option value="1">平台报告</option>
                                            <option value="2">第三方报告</option>                                                 
                                        </select>
                                 </div>
                                <!-- textarea -->
                                <div class="form-group">
                                    <label>文章内容</label>
                                    <textarea class="form-control" id="content" rows="15" placeholder="请输入 ..."></textarea>
                                </div>

                              
                         <div class="modal fade" id="delModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
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
                        
                        <button type='button' class='btn btn-block btn-primary btn-flat' data-toggle='modal' onclick='addfile();'>新增附件</button>
                        <table id="tableobject" class="table table-bordered table-striped" cellspacing="0" width="100%">
                            <thead>
                            <tr>
                                <th>附件名称</th>
                                <th>创建时间</th>
                                <th>修改时间</th>                 				
                                <th>操作</th>

                            </tr>
                            </thead>
                        </table>
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
        getData(id);
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
               
                
                {
                    "targets": [0], // 目标列位置，下标从0开始
                    "data": "id", // 数据列名
                    "render": function(data, type, full) { // 返回自定义内容
                    	 return "<a href="+full.filename+">"+data+"</a>";
                    }
                },
                {
                    "targets": [3], // 目标列位置，下标从0开始
                    "data": "id", // 数据列名
                    "render": function(data, type, full) { // 返回自定义内容
                        return "<button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#delModal' onclick='transferData(" + full.id + ");'>删除</button>";
                    }
                }
          
            ],

            "ajax": {
            	"url": "/jzt-api/rest/v1/report/"+id,
                "type": "GET",
                "dataSrc": function ( json ) {
                	console.log(json.data.filelist)
                    return json.data.filelist;
                }
            },

            "columns":[
                { "data": "name" },
                { "data": "createTime" },
                { "data": "updateTime" },
                { "data": "id" },
            ]

        } );

    } );

function getData(id) {

$.ajax({
url: '/jzt-api/rest/1/report/' + id,
type: 'GET',
async: true,
cache: false,
// contentType: false,
//contentType: 'application/x-www-form-urlencoded',
processData: false,
success: function (responseStr) {

$("#title").val(responseStr.data.report.title);
$("#source").val(responseStr.data.report.source);
$("#link").val(responseStr.data.report.link);
$("#content").val(responseStr.data.report.content);
$("#type").val(responseStr.data.report.type);

},
error: function (responseStr) {
	
alert("error:" + JSON.stringify(responseStr));
console.log(responseStr);
}
});

}

function submitForm() {
	var id = <%=id%>;
	var data=new Object();
	    data.title=$("#title").val();
	    data.source=$("#source").val();
	    data.link=$("#link").val();
	    data.content=$("#content").val();
	    data.type=$("#type").val();
	    data.id=id;
	    

	var datafstr=JSON.stringify(data);
	var requestData = datafstr;

	$.ajax({
	url: '/jzt-api/rest/1/report/update/',
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


    function transferData(id) {
        $('#mbid').val(id);
    }

    function deleteData(obj) {
        var id = $('#mbid').val();
        $.ajax({
            url: '/jzt-api/rest/v1/report/deletefile/'+id,
            type: 'GET',
            async: true,
            cache: false,
            processData: false,
            success: function (responseStr) {
                ShowSuccess("删除成功!");
                $('#delModal').modal('hide')
                $('#tableobject').DataTable().clear().draw().ajax.reload();
            },
            error: function (responseStr) {
                alert("error:" + JSON.stringify(responseStr));
            }
        });
    }
    
    function addfile()
    {
    	var id = <%=id%>;
    	window.location.href="fileAdd.jsp?rid="+id;
    }


</script>

</html>
