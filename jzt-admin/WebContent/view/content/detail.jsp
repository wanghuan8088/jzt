<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/view/header.jsp"%>

      <!-- Sidebar Menu -->
      <ul class="sidebar-menu">
        <li class="header">导航</li>
        <!-- Optionally, you can add icons to the links -->
        <li><a href="/jzt-admin/page/starter.jsp"><i class="fa fa-edit"></i> <span>平台管理</span></a></li>
        <li><a href="/jzt-admin/page/product/list.jsp"><i class="fa fa-circle-o"></i> <span>标的管理</span></a></li>
        <li><a href="/jzt-admin/page/order/list.jsp"><i class="fa fa-th"></i> <span>订单管理</span></a></li>
		<li class="treeview active">
          <a href="#">
            <i class="fa fa-pie-chart"></i>
            <span>公司管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu menu-open" style="display: block;">
            <li class="active"><a href="/jzt-admin/page/topic/list.jsp"><i class="fa fa-table"></i> 文章管理</a></li>
            <li><a href="/jzt-admin/page/topic/category.jsp"><i class="fa fa-table"></i> 分类管理</a></li>
            <li><a href="/jzt-admin/page/topic/scroll.jsp"><i class="fa fa-table"></i> 轮播图片</a></li>
          </ul>
        </li>
        <li><a href="/jzt-admin/page/user/list.jsp"><i class="fa fa-laptop"></i> <span>用户管理</span></a></li>
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
              文章
        <small>修 改</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> 公司管理</a></li>
        <li class="active">修 改</li>
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
              <h3 class="box-title">第一步:上传图片</h3>
            </div>
            
			<div id="imgdivpre" class="row">
	            <div id="imgdiv" style="display:none;" class="col-md-12" >
					<div class="col-md-2 form-group">
		                  <label for="exampleInputFile">文章图片(建议上传750*300比例)</label><br>
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



			<div id="spdivpre" class="row">
	            <div id="spimgdiv" style="display:none;" class="col-md-12" >
					<div class="col-md-2 form-group">
		                  <label for="exampleInputFile">文章视频</label><br>
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
					     <iframe id="formimage" width="500" height="300" src="" frameborder="0" allowfullscreen></iframe>
		            </div>
		            <div class="col-md-4" form-group>
		                  <p class="help-block" id="imgname"></p>
		                  <p class="help-block" id="imgtype"></p>
		                  <p class="help-block" id="imgsize"></p>
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
                  <label>标题</label>
                  <input type="text" id="titlef" class="form-control" placeholder="请输入 ...">
                </div>
                <div class="form-group">
                  <label>副标题</label>
                  <input type="text" id="subtitlef" class="form-control" placeholder="请输入 ...">
                </div>

			      <div class="form-group">
			       <label>类型</label>
			          <select class="form-control" name="mySelect" id="mySelect">
			            <option value="1">精彩视频</option>
			            <option value="2">性性相惜</option>
			            <option value="3">同城交友</option>
			            <option value="4">泡学宝典</option>
			            <option value="5">姐有大长腿</option>
			            <option value="6">奇闻异事</option>
			          </select>
			      </div>

                <!-- textarea -->
				<div class="form-group">
                  <label>内容</label>
                  <textarea class="form-control" id="textf" rows="15" placeholder="请输入 ..."></textarea>
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
$(document).ready(function() {
	var id = <%=id%>;
	getData(id);
	 if ($("#mySelect").val() == 1) {
		 $("#spimgdiv").attr('style',"display:block;");
	 }
} );

$("#mySelect").change(function(){
	 if ($(this).val() == 1) {
		 $("#spimgdiv").attr('style',"display:block;");
	 } else {
		 $("#spimgdiv").attr('style',"display:none;");
	 }
});


function copyDiv(){
	var imgdiv = $('body').contents().find('#imgdiv');
	var imgdivCopy = imgdiv.clone(true);
	imgdivCopy.attr('id',"imgdivcopy");
	imgdivCopy.attr('style',"display:block;");
	$('#imgdivpre').append(imgdivCopy);
	return imgdivCopy;
}
function delDiv(object){ 
	$(object).parent().parent().remove();
}

function getData(id) {
	var data="{\"id\":"+id+",\"page\":1,\"count\":1}";
	$.ajax({
	    url: '/woo-api/topic/queryById',
	    type: 'POST',
	    data: "para="+data,
	    async: true,
	    cache: false,
	   // contentType: false,  
	    contentType: 'application/x-www-form-urlencoded',
	    processData: false,  
	    success: function (responseStr) {
	    	$("#titlef").val(responseStr.data.topic.title);
	    	$("#subtitlef").val(responseStr.data.topic.subTitle);
	    	$("#mySelect").val(responseStr.data.topic.category);
	    	$("#textf").val(responseStr.data.topic.content);
	    	var topicMediaList = responseStr.data.topic.topicMediaList;
	    	var size = topicMediaList.length;
	    	
	    	for (var i=1;i<=size;i++) {
	    		if (topicMediaList[i-1].type==1) {
		    		var imgdivCopy = copyDiv();
		    		imgdivCopy.find("#formimage").attr('src',topicMediaList[i-1].url);
		    		imgdivCopy.find("#orginimage").attr('href',topicMediaList[i-1].url);
	    		}
	    	}
	    	
	    	for (var i=1;i<=size;i++) {
	    		if (topicMediaList[i-1].type==2) {
		    		var spimgdiv = $("#spimgdiv");
		    		spimgdiv.find("#formimage").attr('src',topicMediaList[i-1].url);
		    		spimgdiv.attr('style',"display:block;");
	    		}
	    	}
	    	
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
	var id = <%=id%>;
	dataf.id=id;
	dataf.userId="999";
	dataf.title=$("#titlef").val(); 
	dataf.subTitle=$("#subtitlef").val(); 
	dataf.category=$("#mySelect").val(); 
	dataf.content=$("#textf").val(); 

	var arrayf1=new Array()
	//图片
	$('div[id="imgdivcopy"]').each(function(index){   
		var topicMedia=new Object();
		var image = $(this).find("#formimage").attr('src');
		if (image==null || image=='') {
			return true;
		}
		topicMedia.url=image;
		topicMedia.type=1;
		topicMedia.topicId=id;
		
		arrayf1[index]=topicMedia;
	});
	
	//视频
	var array2f=new Array()
	$('div[id="spimgdiv"]').each(function(index){
		var spMedia=new Object();
		var image = $(this).find("#formimage").attr('src');
		if (image==null || image=='') {
			return true;
		}
		spMedia.url=image;
		spMedia.type=2;
		spMedia.topicId=id;
		
		array2f[index]=spMedia;
	});
	
	var array = arrayf1.concat(array2f);
	dataf.topicMediaList=array;
	
	var datafstr=JSON.stringify(dataf);
	var requestData = datafstr;
	
	$.ajax({
	    url: '/woo-api/topic/update',
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
