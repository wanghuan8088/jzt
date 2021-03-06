<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/view/header.jsp"%>

      <!-- Sidebar Menu -->
      <ul class="sidebar-menu">
        <li class="header">导航</li>
        <!-- Optionally, you can add icons to the links -->
        <li><a href="/jzt-admin/page/starter.jsp"><i class="fa fa-edit"></i> <span>平台管理</span></a></li>
        <li class="active"><a href="/jzt-admin/page/product/list.jsp"><i class="fa fa-circle-o"></i> <span>标的管理</span></a></li>
        <li><a href="/jzt-admin/page/order/list.jsp"><i class="fa fa-th"></i> <span>订单管理</span></a></li>
        <li><a href="/jzt-admin/page/topic/list.jsp"><i class="fa fa-dashboard"></i> <span>公司管理</span></a></li>
        <li><a href="/jzt-admin/page/user/list.jsp"><i class="fa fa-laptop"></i> <span>用户管理</span></a></li>
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
              标的
        <small>新 增</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> 标的管理</a></li>
        <li class="active">新 增</li>
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
              <h3 class="box-title">第一步:上传标的图片</h3>
            </div>

            <div id="imgdivpre" class="row">
	            <div id="imgdiv" style="display:none;" class="col-md-12" >
					<div class="col-md-2 form-group">
		                  <label for="exampleInputFile">标的图片(建议上传750*612比例)</label><br>
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
		            <div class="col-md-2" form-group>
		            	  <a href="" data-lightbox="example-1" id="orginimage">
								<img id="formimage" src="" width="250" height="250" alt="750*380" /> 
		              	  </a>
		            </div>
		            <div class="col-md-4" form-group>
		                  <p class="help-block" id="imgname"></p>
		                  <p class="help-block" id="imgtype"></p>
		                  <p class="help-block" id="imgsize"></p>
		            </div>
		            <div class="col-md-4" form-group>
		                  <img src="/jzt-admin/page/dist/img/cancelImage.png" style="cursor:pointer" width="100" height="100" alt="删除" onclick="delDiv(this);" />
		            </div>
	            </div>
            </div>
            <img src="/jzt-admin/page/dist/img/upload.png" style="cursor:pointer" onclick="copyDiv();" />
            
            
            
<div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">第二步:填写内容</h3>
            </div>

 <form role="form">
                <!-- text input -->
                <div class="form-group">
                  <label>标的名称</label>
                  <input type="text" id="namef" class="form-control" placeholder="请输入 ...">
                </div>
                
		      <div class="form-group">
		       <label>分类</label>
		          <select class="form-control" name="mySelect" id="categoryf">
		            <option value="1">互金系</option>
		            <option value="2">银行系</option>
		          </select>
		      </div>

	 <div class="form-group">
		 <label>还款方式</label>
		 <select class="form-control" name="mySelect" id="categoryf">
			 <option value="1">等额本息</option>
			 <option value="2">等额本金</option>
		 </select>
	 </div>
                
                <div class="form-group">
				<div class="row">
	                <div class="col-xs-6">
	                  <label>借款金额(以分为单位)</label>
	                  <div class="input-group">
	                  	  <span class="input-group-addon"><i class="fa fa-rmb"></i></span>
		                  <input type="text" id="pricef" class="form-control" value="0" onkeyup="checkNum(this)" style="text-align: right;" placeholder="请输入数字 ...">
		                  <span class="input-group-addon">元</span>
	                  </div>
	                </div>
	                <div class="col-xs-6">
	                  <label>利率</label>
	                  <div class="input-group">
	                  	  <span class="input-group-addon"><i class="fa fa-rmb"></i></span>
		                  <input type="text" id="marketPricef" class="form-control" value="0" onkeyup="checkNum(this)" style="text-align: right;" placeholder="请输入数字 ...">
		                  <span class="input-group-addon">元</span>
	                  </div>
	                </div>
              	</div>
                </div>

	 <div class="form-group">
		 <div class="row">
			 <div class="col-xs-6">
				 <label>起购金额</label>
				 <div class="input-group">
					 <span class="input-group-addon"><i class="fa fa-rmb"></i></span>
					 <input type="text" id="pricef" class="form-control" value="0" onkeyup="checkNum(this)" style="text-align: right;" placeholder="请输入数字 ...">
					 <span class="input-group-addon">元</span>
				 </div>
			 </div>
			 <div class="col-xs-6">
				 <label>限购金额</label>
				 <div class="input-group">
					 <span class="input-group-addon"><i class="fa fa-rmb"></i></span>
					 <input type="text" id="marketPricef" class="form-control" value="0" onkeyup="checkNum(this)" style="text-align: right;" placeholder="请输入数字 ...">
					 <span class="input-group-addon">元</span>
				 </div>
			 </div>
		 </div>
	 </div>



                <div class="form-group">
				<div class="row">
		              <div class="col-xs-6">
		                  <label>借款状态</label>
		                  <select multiple="" id="colorf" class="form-control">
		                    <option>本息还清</option>
		                    <option>本金未还清</option>
		                    <option>预期</option>
		                  </select>
	                  </div>
	                  <div class="col-xs-6">
		                  <label>其他借款状态</label>
		                  <input type="text" id="color2f" class="form-control" placeholder="请输入 ...">
	                  </div>
                </div>
                </div>
                
                <div class="form-group">
				<div class="row">
	                <div class="col-xs-6">
	                  <label>期限(以天为单位)</label>
	                  <input type="text" id="salesf" class="form-control" placeholder="请输入数字 ...">
	                </div>
	                <div class="col-xs-6">
	                  <label>起息日</label>
	                  <input type="text" id="realSalesf" class="form-control" placeholder="请输入数字 ...">
	                </div>
              	</div>
                </div>
                
                <div class="form-group">
                  <label>产品说明</label>
                  <input type="text" id="promotesf" class="form-control" placeholder="请输入 ...">
                </div>
                <div class="form-group">
                  <label>产品链接</label>
                  <input type="text" id="stockf" class="form-control" placeholder="请输入数字 ...">
                </div>
                <div class="form-group">
                  <label>协议</label>
                  <input type="text" id="attributesf" class="form-control" placeholder="请输入 ...">
                </div>

                <!-- textarea -->
				<div class="form-group">
                  <label>标的描述</label>
                  <textarea class="form-control" id="descriptionf" rows="15" placeholder="请输入 ..."></textarea>
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
    </section>
    <!-- /.content -->




  </div>
  <!-- /.content-wrapper -->

<%@ include file="/view/footer.jsp"%>

<script>

function checkNum(obj) {
    //检查是否是非数字值  
    if (isNaN(obj.value)) {  
        obj.value = "";  
    }  
    if (obj != null) {  
        //检查小数点后是否对于两位
        if (obj.value.toString().split(".").length > 1 && obj.value.toString().split(".")[1].length > 2) {  
            alert("小数点后多于两位！");  
            obj.value = "";  
        }  
    }  
}

function copyDiv(){ 
	var imgdiv = $('body').contents().find('#imgdiv');
	var imgdivCopy = imgdiv.clone(true);
	imgdivCopy.attr('id',"imgdivcopy");
	imgdivCopy.attr('style',"display:block;");
	$('#imgdivpre').append(imgdivCopy);
}
function delDiv(object){ 
	$(object).parent().parent().remove();
}
function copyDivDetail(){ 
	var imgdiv = $('body').contents().find('#imgdivdetail');
	var imgdivCopy = imgdiv.clone(true);
	imgdivCopy.attr('id',"imgdivdetailcopy");
	imgdivCopy.attr('style',"display:block;");
	$('#imgdivpredetail').append(imgdivCopy);
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
         imgdiv.find("#orginimage").attr('href',"http://7xwpgg.com1.z0.glb.clouddn.com/" + responseStr.key);
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
	dataf.name=$("#namef").val(); 
	dataf.category=$("#categoryf").val(); 
	dataf.price=$("#pricef").val()*100; 
	dataf.marketPrice=$("#marketPricef").val()*100;
	var color = "";
	if ($("#colorf").val() != null) {
		color = $("#colorf").val() + "," + $("#color2f").val();
	} else {
		color = $("#color2f").val();
	}
	dataf.colorList = color;
	dataf.sales=$("#salesf").val(); 
	dataf.realSales=$("#realSalesf").val(); 
	dataf.stock=$("#stockf").val(); 
	dataf.promotes=$("#promotesf").val(); 
	dataf.attributes=$("#attributesf").val(); 
	dataf.description=$("#descriptionf").val(); 
	//标的首要图片
	dataf.primaryImage=$("#imgpri").find("#formimage").attr('src');
	
	// 标的图片
	var arrayf=new Array()
	$('div[id="imgdivcopy"]').each(function(index){
		var productMedia=new Object();
		var image = $(this).find("#formimage").attr('src');
		if (image==null || image=='') {
			return true;
		}
		productMedia.url=image;
		productMedia.type=0;
		arrayf[index]=productMedia;
	});
	dataf.productMediaList=arrayf;
	
	//标的详情图片
	var array1f=new Array()
	$('div[id="imgdivdetailcopy"]').each(function(index){
		var productDetailMedia=new Object();
		var image = $(this).find("#formimage").attr('src');
		if (image==null || image=='') {
			return true;
		}
		productDetailMedia.url=image;
		productDetailMedia.type=1;
		array1f[index]=productDetailMedia;
	});
	dataf.productDetailMedia=array1f;
	
	var datafstr=JSON.stringify(dataf);
	var requestData = datafstr;
	
	$.ajax({
	    url: '/woo-api/product/save',
	    type: 'POST',  
	    data: "para="+encodeURIComponent(requestData),  
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
	    }
	});
	
	
}


</script>



</html>
