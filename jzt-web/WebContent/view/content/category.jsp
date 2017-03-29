<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/view/header.jsp"%>

      <!-- Sidebar Menu -->
      <ul class="sidebar-menu">
        <li class="header">导航</li>
        <!-- Optionally, you can add icons to the links -->
        <li><a href="/page/starter.jsp"><i class="fa fa-edit"></i> <span>平台管理</span></a></li>
        <li><a href="/page/product/list.jsp"><i class="fa fa-circle-o"></i> <span>标的管理</span></a></li>
        <li><a href="/page/order/list.jsp"><i class="fa fa-th"></i> <span>订单管理</span></a></li>
        
        
		<li class="treeview active">
          <a href="#">
            <i class="fa fa-pie-chart"></i>
            <span>公司管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu menu-open" style="display: block;">
            <li><a href="/page/topic/list.jsp"><i class="fa fa-table"></i> 文章管理</a></li>
            <li class="active"><a href="/page/topic/category.jsp"><i class="fa fa-table"></i> 分类管理</a></li>
            <li><a href="/page/topic/scroll.jsp"><i class="fa fa-table"></i> 轮播图片</a></li>
          </ul>
        </li>

        <li><a href="/page/user/list.jsp"><i class="fa fa-laptop"></i> <span>用户管理</span></a></li>
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
              分类
        <small>列表</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> 分类管理</a></li>
        <li class="active">列表</li>
      </ol>
    </section>



<!-- Main content -->
    <section class="content">

      <div class="row">
        <div class="col-xs-12">

          <div class="box">
            
		  <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">精彩视频</h3>
            </div>
            <div class="box-body">
              <div class="row">
                <div class="col-xs-10">
                  <input type="text" class="form-control" id="category_desc1" value="">
                </div>
                <div class="col-xs-2">
                  <a class="btn btn-app" onClick="setData(1);"><i class="fa fa-save"></i> Save</a>
                </div>
              </div>
            </div>
          </div>
		  <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">性性相惜</h3>
            </div>
            <div class="box-body">
              <div class="row">
                <div class="col-xs-10">
                  <input type="text" class="form-control" id="category_desc2" value="">
                </div>
                <div class="col-xs-2">
                  <a class="btn btn-app" onClick="setData(2);"><i class="fa fa-save"></i> Save</a>
                </div>
              </div>
            </div>
          </div>
		  <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">同城交友</h3>
            </div>
            <div class="box-body">
              <div class="row">
                <div class="col-xs-10">
                  <input type="text" class="form-control" id="category_desc3" value="">
                </div>
                <div class="col-xs-2">
                  <a class="btn btn-app" onClick="setData(3);"><i class="fa fa-save"></i> Save</a>
                </div>
              </div>
            </div>
          </div>
		  <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">泡学宝典</h3>
            </div>
            <div class="box-body">
              <div class="row">
                <div class="col-xs-10">
                  <input type="text" class="form-control" id="category_desc4" value="">
                </div>
                <div class="col-xs-2">
                  <a class="btn btn-app" onClick="setData(4);"><i class="fa fa-save"></i> Save</a>
                </div>
              </div>
            </div>
          </div>
		  <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">姐有大长腿</h3>
            </div>
            <div class="box-body">
              <div class="row">
                <div class="col-xs-10">
                  <input type="text" class="form-control" id="category_desc5" value="">
                </div>
                <div class="col-xs-2">
                  <a class="btn btn-app" onClick="setData(5);"><i class="fa fa-save"></i> Save</a>
                </div>
              </div>
            </div>
          </div>
		  <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">奇闻异事</h3>
            </div>
            <div class="box-body">
              <div class="row">
                <div class="col-xs-10">
                  <input type="text" class="form-control" id="category_desc6" value="">
                </div>
                <div class="col-xs-2">
                  <a class="btn btn-app" onClick="setData(6);"><i class="fa fa-save"></i> Save</a>
                </div>
              </div>
            </div>
          </div>
          

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
	for (var i=1;i<7;i++) {
		getData(i);
	}
    
} );


function getData(id) {
	var data="{\"id\":"+id+"}";
	$.ajax({
	    url: '/woo-api/topic/category',
	    type: 'POST',  
	    data: "para="+data,
	    async: true,
	    cache: false,
	   // contentType: false,  
	    contentType: 'application/x-www-form-urlencoded',
	    processData: false,  
	    success: function (responseStr) {
	    	$("#category_desc"+id).val(responseStr.data.topicCategory[0].description); 
	    },  
	    error: function (responseStr) {
	   	 alert("error:" + JSON.stringify(responseStr));
	    }
	});
    
 }
 
function setData(id,description) {
	var description=$("#category_desc"+id).val();
	var data="{\"id\":"+id+",\"description\":\""+description+"\"}";
	$.ajax({
	    url: '/woo-api/topic/categoryUpdate',
	    type: 'POST',  
	    data: "para="+data,
	    async: true,
	    cache: false,
	   // contentType: false,  
	    contentType: 'application/x-www-form-urlencoded',
	    processData: false,  
	    success: function (responseStr) {
	    	ShowSuccess("保存成功!");
	    },  
	    error: function (responseStr) {
	   	 	alert("error:" + JSON.stringify(responseStr));
	   		ShowFailure("保存失败:" + JSON.stringify(responseStr));
	    }
	});
    
 }
</script>

</html>
