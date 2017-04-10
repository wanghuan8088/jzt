var lastType=3;
var lastProv=0;
$(document).ready(function() {
	var programPath=$('#cxt').html();
	
	getAppList(null,null);
});

function getAppList(type,prov){
	
	if((lastType!=null && type==null)||(lastType!=0 && type==0)||(lastType!=1 && type==1)||(lastProv!=prov)||(lastProv!=null&&prov==null)){
		var programPath=$('#cxt').html();
		
		if(prov==null) {
			$(pro_nav).html('');
			$(pro_nav).append('<li id="buxian" class="cur" onclick="getAppList('+type+',null)">不限</li>');
			$.ajax( {  
		        type : 'POST',  
		        url : programPath+'/product/appNavIndex',  
		        data : {
		        	type : type,
				  },  
		        dataType : 'json',  
		        success : function(data) {  
		      	  for (var i=0;i<data.pList.length;i++) {
		      		  $(pro_nav).append('<li id="'+data.pList[i].id+'" onclick="getAppList('+type+',\''+data.pList[i].id+'\')">'+data.pList[i].name+'</li>');
		      	  }
		        }
			});
		}else{
			$('#buxian').removeClass('cur');
			$('#'+lastProv).removeClass('cur');
			$('#'+prov).addClass('cur');
		}
		
		var oldPro = "";
		var appendHtml = "";
		var appCount = 1;
		var appCountArray=new Array();
		
		$.ajax( {  
	        type : 'POST',  
	        url : programPath+'/product/appRelProduct',  
	        data : {
	        	type : type,
	        	prov : prov,
			  },  
	        dataType : 'json',  
	        success : function(data) {  
	        	for (var i=0;i<data.apl.length;i++) {
	        		if(oldPro!=data.apl[i].province){
	        			if(i!=0){
	        				appendHtml+='</ul></div>';
	        				appCountArray.push(appCount);
	        				appCount = 1;
	        			}
	        			appendHtml+='<div class="" var="">'+
								 	  '<hr style="width:100%;height:1px;border:none;border-top:1px dashed #0066CC;" />'+
									  '<div class="til">'+
										  '<div>'+
										  	'<p class="kind_til">'+
										  		data.apl[i].province+
										  	'</p>'+
										  	'<p class="til_num">'+
										  		'(<span id="til'+appCountArray.length+'"></span>)'+
										  	'</p>'+
										  '</div>'+
									  '</div>'+
									  '<ul class="ul_app">';
						appendHtml+='<li class="li_app">'+
							  			'<div class="div_app">';
						if(data.apl[i].appLogo != null) {
							appendHtml+='<img src="'+programPath+"/" +data.apl[i].appLogo+'" alt="" class="img_app"/>';
						} else {
							appendHtml+='<img src="'+programPath+'/static/image/app_logo_default.png" alt="" class="img_app"/>';
						}
						if(data.apl[i].appType==null||data.apl[i].appType==0||data.apl[i].appType==2) {
							appendHtml+='<img src="'+programPath+'/static/image/android_icon.png" alt="" class="icon_app"/>';
						}
						if(data.apl[i].appType==null||data.apl[i].appType==1||data.apl[i].appType==2) {
							appendHtml+='<img src="'+programPath+'/static/image/apple_icon.png" alt="" class="icon_app"/>';
						}
													
						appendHtml+='<br>'+
									'<table border="0">'+
										'<tr>'+
											'<td style="width:85px;">'+
												'<div class="name_div_app">'+
													'<a href="'+data.apl[i].url+'" class="text-overflow" target="_blank">'+data.apl[i].productName+'</a>'+
													'<a class="btn btn-default btn-sm button_app" href="'+data.apl[i].appUrl+'" role="button" target="_blank">官网下载</a>'+
													'<a class="btn btn-default btn-sm button_app" href="'+programPath+'/product/pDetail/'+data.apl[i].pid+'" role="button" target="_blank">查看档案</a>'+
												'</div>'+
											'</td>'+
											'<td style="width:95px;">';
						if(data.apl[i].qrCodeUrl == null) {
							appendHtml+='<img src="'+programPath+'/static/image/qrcode_null.png" alt="" class="qrcode_app"/>';
						} else {
							appendHtml+='<img src="'+programPath+"/" +data.apl[i].qrCodeUrl+'" alt="" class="qrcode_app"/>';
						}
						appendHtml+='</td>'+
									'</tr>'+
								'</table>'+
							'</div>'+	  			
						'</li>';
						oldPro=data.apl[i].province;
	        		}
	        		else {
	        			appendHtml+='<li class="li_app">'+
							  			'<div class="div_app">';
			  			if(data.apl[i].appLogo != null) {
							appendHtml+='<img src="'+programPath+"/" +data.apl[i].appLogo+'" alt="" class="img_app"/>';
						} else {
							appendHtml+='<img src="'+programPath+'/static/image/app_logo_default.png" alt="" class="img_app"/>';
						}
						if(data.apl[i].appType==null||data.apl[i].appType==0||data.apl[i].appType==2) {
							appendHtml+='<img src="'+programPath+'/static/image/android_icon.png" alt="" class="icon_app"/>';
						}
						if(data.apl[i].appType==null||data.apl[i].appType==1||data.apl[i].appType==2) {
							appendHtml+='<img src="'+programPath+'/static/image/apple_icon.png" alt="" class="icon_app"/>';
						}
													
						appendHtml+='<br>'+
									'<table border="0">'+
										'<tr>'+
											'<td style="width:85px;">'+
												'<div class="name_div_app">'+
													'<a href="'+data.apl[i].url+'" class="text-overflow" target="_blank">'+data.apl[i].productName+'</a>'+
													'<a class="btn btn-default btn-sm button_app" href="'+data.apl[i].appUrl+'" role="button" target="_blank">官网下载</a>'+
													'<a class="btn btn-default btn-sm button_app" href="'+programPath+'/product/pDetail/'+data.apl[i].pid+'" role="button" target="_blank">查看档案</a>'+
												'</div>'+
											'</td>'+
											'<td style="width:95px;">';
						if(data.apl[i].qrCodeUrl == null) {
							appendHtml+='<img src="'+programPath+'/static/image/qrcode_null.png" alt="" class="qrcode_app"/>';
						} else {
							appendHtml+='<img src="'+programPath+"/" +data.apl[i].qrCodeUrl+'" alt="" class="qrcode_app"/>';
						}
						appendHtml+='</td>'+
										'</tr>'+
									'</table>'+
								'</div>'+	  			
							'</li>';
	        			appCount++;
	        		}
	        	}
	        	appendHtml+='</ul></div>';
	        	$(applist).html(appendHtml);
	        	
	        	appCountArray.push(appCount);
	        	appCount = 1;
	        	for (var i=0;i<appCountArray.length;i++) {
	        		$('#til'+i).html(appCountArray[i]);
	        	}
	        }
		});
		lastType = type;
		lastProv = prov;
	}
	
}
