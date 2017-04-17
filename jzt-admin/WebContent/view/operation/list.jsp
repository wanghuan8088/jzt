<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/view/header.jsp"%>

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
              平台列表
        <small>列表</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> 平台管理</a></li>
        <li class="active">列表</li>
      </ol>
    </section>



<!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-xs-12">

          <div class="box">
            <!-- /.box-header -->
            <div class="box-body">
            
            <a class="btn btn-primary btn-lg" href="/jzt-admin/page/product/add.jsp"> 新 增  </a>
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


                <table id="example" class="table table-bordered table-striped" cellspacing="0" width="100%">
                    <thead>
                    <tr>
                        <th>产品名称</th>
                        <th>借款金额(以分为单位)</th>
                        <th>年化收益</th>
                        <th>修改时间</th>
                        <th>创建时间</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tfoot>
                    <tr>
                        <th>产品名称</th>
                        <th>借款金额(以分为单位)</th>
                        <th>年化收益</th>
                        <th>修改时间</th>
                        <th>创建时间</th>
                        <th>操作</th>
                    </tr>
                    </tfoot>
                    <tbody>
                    <tr>
                        <td>本田歌诗图抵押续贷</td>
                        <td>888888888.88</td>
                        <td>666</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>本田歌诗图抵押续贷</td>
                        <td>888888888.88</td>
                        <td>666</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>

                    <tr>
                        <td>本田歌诗图抵押续贷</td>
                        <td>888888888.88</td>
                        <td>666</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>

                    <tr>
                        <td>本田歌诗图抵押续贷</td>
                        <td>888888888.88</td>
                        <td>666</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>本田歌诗图抵押续贷</td>
                        <td>888888888.88</td>
                        <td>666</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>

                    <tr>
                        <td>本田歌诗图抵押续贷</td>
                        <td>888888888.88</td>
                        <td>666</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>

                    <tr>
                        <td>本田歌诗图抵押续贷</td>
                        <td>888888888.88</td>
                        <td>666</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>本田歌诗图抵押续贷</td>
                        <td>888888888.88</td>
                        <td>666</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>

                    <tr>
                        <td>本田歌诗图抵押续贷</td>
                        <td>888888888.88</td>
                        <td>666</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>
                    <tr>
                        <td>陆金所</td>
                        <td>陆金所</td>
                        <td>上海</td>
                        <td>2017-03-02 21:19:17</td>
                        <td>2017-03-02 21:19:17</td>
                        <td><button type='button' class='btn btn-block btn-danger btn-flat' data-toggle='modal' data-target='#myModal'>删除</button></td>
                    </tr>

                    </tbody>
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
        $('#example').DataTable(
                {



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

                    "searching":false

                }

        );
    } );

</script>

</html>
