<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/view/header.jsp"%>

      <!-- Sidebar Menu -->
      <ul class="sidebar-menu">
        <li class="header">导航</li>
        <!-- Optionally, you can add icons to the links -->
        <li><a href="/jzt-admin/page/starter.jsp"><i class="fa fa-edit"></i> <span>平台管理</span></a></li>
        <li><a href="/jzt-admin/page/product/list.jsp"><i class="fa fa-circle-o"></i> <span>标的管理</span></a></li>
        <li><a href="/jzt-admin/page/order/list.jsp"><i class="fa fa-th"></i> <span>订单管理</span></a></li>
        <li><a href="/jzt-admin/page/topic/list.jsp"><i class="fa fa-dashboard"></i> <span>公司管理</span></a></li>
        <li class="active"><a href="/jzt-admin/page/user/list.jsp"><i class="fa fa-laptop"></i> <span>用户管理</span></a></li>
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
              用户
        <small>详 细</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> 用户管理</a></li>
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
            
<div class="box box-success accordion">
	    
	    <div class="accordion-heading">
	      <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne">
	        第一步:展开可上传用户头像
	      </a>
	    </div>
	    <div id="collapseOne" class="accordion-body collapse">
	      <div class="accordion-inner">
	      
	        <div class="box-header with-border">
              <h3 class="box-title">第一步:上传用户头像图片</h3>
            </div>
	    
            <div id="imgdivpri" class="row">
            <div id="imgpri">
				<div class="col-md-2 form-group">
	                  <label for="exampleInputFile">用户头像图片</label><br>
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
	              	  <img id="formimage" src="" height="250" width="250" />
	                  <p class="help-block" id="imgname"></p>
	                  <p class="help-block" id="imgtype"></p>
	                  <p class="help-block" id="imgsize"></p>
	            </div>
            </div>
            </div>
            
            
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
                  <label>用户名称</label>
                  <input type="text" id="namef" class="form-control" placeholder="请输入 ...">
                </div>
                <div class="form-group">
                  <label>密码</label>
                  <input type="text" id="passwordf" class="form-control" placeholder="请输入 ...">
                </div>
                <div class="form-group">
                  <label>手机号码</label>
                  <input type="text" id="phonef" class="form-control" placeholder="请输入 ...">
                </div>
                <div class="form-group">
                  <label>性别</label>
                  <select id="sexf" class="form-control"> 
				     <option>女</option> 
				     <option>男</option> 
			     </select>
                </div>
                <div class="form-group">
                  <label>年龄</label>
                  <input type="text" id="agef" class="form-control" placeholder="请输入 ...">
                </div>
                <div class="form-group">
                  <label>位置</label>
                  <input type="text" id="locationf" class="form-control" placeholder="请输入 ...">
                </div>
                <div class="form-group">
                  <label>签名</label>
                  <input type="text" id="signaturef" class="form-control" placeholder="请输入 ...">
                </div>
                
                <div class="form-group">
                  <label>用户备注</label>
                  <input type="text" id="commentf" class="form-control" placeholder="请输入备注 ...">
                </div>
                <div class="form-group">
                  <label>黑名单</label>
                  <select id="blackf" class="form-control"> 
				     <option value="0">白名单</option> 
				     <option value="1">黑名单</option> 
			     </select>
                </div>

              <div class="box-footer">
                <button type="button" class="btn btn-primary" onClick="submitForm();">提交</button>
                <button type="button" class="btn btn-primary" onClick="javascript :history.back(-1);">返回</button>
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



<script>
$(document).ready(function() {
	var id = <%=id%>;
	getData(id)
} );

function copyDiv(){
	var imgdiv = $('body').contents().find('#imgdiv');
	var imgdivCopy = imgdiv.clone(true);
	imgdivCopy.attr('id',"imgdivcopy");
	imgdivCopy.attr('style',"display:block;");
	$('#imgdivpre').append(imgdivCopy);
	return imgdivCopy;
}

function getData(id) {
	var data="{\"id\":"+id+"}";
	$.ajax({
		url: '/woo-api/user/queryDetail',
		type: 'POST',
	    data: "para="+data,
	    async: true,
	    cache: false,
	   // contentType: false,  
	    contentType: 'application/x-www-form-urlencoded',
	    processData: false,
	    success: function (responseStr) {
	    	$("#namef").val(responseStr.data.user.name);
	    	$("#passwordf").val(responseStr.data.user.password);
	    	$("#phonef").val(responseStr.data.user.phone);
	    	$("#sexf").val(responseStr.data.user.sex);
	    	$("#agef").val(responseStr.data.user.age);
	    	$("#commentf").val(responseStr.data.user.comment);
	    	$("#blackf").val(responseStr.data.user.black);
	    	$("#locationf").val(responseStr.data.user.location);
	    	$("#signaturef").val(responseStr.data.user.signature);
	    	
	    	$("#imgdivpri").find("#formimage").attr('src', responseStr.data.user.icon);
	    },  
	    error: function (responseStr) {
	   	 alert("error:" + JSON.stringify(responseStr));
	    }
	});
    
 }

var getImgName = function (){
    var array = "ABCDEFGHIJKMNPQRSTUVWXYZ".split ("");
    var str = "";

    var reg = /^\d$/;
    var now = new Date;
    var m = now.getMonth () + 1;
    var d = now.getDate();
    var hour = now.getHours();
    var minute = now.getMinutes();
    m = reg.test(m) ? "0" + m : m;
    d = reg.test(d) ? "0" + d : d;
    hour = reg.test(hour) ? "0" + hour : hour;
    minute = reg.test(minute) ? "0" + minute : minute;
    str += now.getFullYear().toString() + m.toString() + d.toString() + hour.toString() + minute.toString();
    for ( var i = 0; i < 6; i++)
    {
        str += array[Math.floor (Math.random () * array.length)];
    }
    return str;
};

function uploadFile(object) {
	var imgdiv = $(object).parent().parent().parent();
	imgdiv.find("#formimage").attr('src',"/page/giphy.gif");
	

//$("#formimage"+item).attr('src',"/page/giphy.gif");
var files = imgdiv.find("#imageform_file").prop('files');

//var files = $('#imageform'+item+'_file').prop('files');
var filename = getImgName();//files[0].name;
var filetype = files[0].type;
var filesize = files[0].size;

imgdiv.find("#imageform_key").val(filename);
//$("#imageform_key").val(filename);

$.ajax({
    type : "get",  
    url : "/woo-api/qiniu/getUpToken",
    async : false,  
    success : function(result) {
        //$("#token"+item).val(result.data); 
        imgdiv.find("#token").val(result.data);
    }  
});  

var formData = new FormData(imgdiv.find("#imageform")[0]);
//var formData = new FormData($( "#imageform"+item )[0]);

$.ajax({
     url: 'http://upload.qiniu.com' ,  
     type: 'POST',  
     data: formData,  
     async: true,  
     cache: false,  
     contentType: false,  
     processData: false,  
     success: function (responseStr) {
         //alert("success:" + JSON.stringify(responseStr));
         
         imgdiv.find("#formimage").attr('src',"http://7xwpgg.com1.z0.glb.clouddn.com/" + responseStr.key);
         imgdiv.find("#imgname").text("地址:  http://7xwpgg.com1.z0.glb.clouddn.com/" + responseStr.key); 
         imgdiv.find("#imgtype").text("类型:  " + filetype); 
         imgdiv.find("#imgsize").text("大小:  " + filesize + " bytes"); 
         
     },  
     error: function (responseStr) {
    	 alert("error:" + JSON.stringify(responseStr));
     }
});  

}

function submitForm() {
	var dataf=new Object();
	var id = <%=id%>;
	dataf.id=id;
	dataf.name=$("#namef").val(); 
	dataf.password=$("#passwordf").val(); 
	dataf.phone=$("#phonef").val();
	dataf.sex=$("#sexf").val();
	dataf.age=$("#agef").val();
	dataf.comment=$("#commentf").val();
	dataf.black=$("#blackf").val();
	dataf.location=$("#locationf").val();
	dataf.signature=$("#signaturef").val();
	// 用户头像图片
	dataf.icon=$("#imgpri").find("#formimage").attr('src');
	
	var datafstr=JSON.stringify(dataf);
	var requestData = datafstr;
	
	$.ajax({
	    url: '/woo-api/user/update',
	    type: 'POST',  
	    data: "para="+encodeURIComponent(requestData),  
	    async: true,  
	    cache: false,  
	    contentType: 'application/x-www-form-urlencoded',
	    processData: false,  
	    success: function (responseStr) {
	    	ShowSuccess("保存成功!");
	    },  
	    error: function (responseStr) {
	   	 alert("error:" + JSON.stringify(responseStr));
	    }
	});
}


</script>



</html>
