//$(document).ready(function() {
$(function(){
			$('#imgUpBtnSubmit').click(function(){
				
				$('#uploadImageForm').bootstrapValidator('validate');
				if ($('.form-group').hasClass('has-error')) {
					return;
				}
				var imgUpFetchFile=$('#fetchFile').val();
				var x = document.getElementById("fetchFile");
				if(!x || !x.value) {
					alert("请选择文件");
					$("#imgUpBtnSubmit").removeAttr("disabled");
					return false;
				}
				if(checkImage(x)==false){
					
					$("#imgUpBtnSubmit").removeAttr("disabled");
					
				}
					
				
				$.ajaxFileUpload({ 
					type: "post",
					//url: "../user/modifyProfile",
					url: "../user/updateFigure",
					//url: "${ctx }/user/imageUpload",
					fileElementId : 'fetchFile',

					data: { 
						imgUpFetchFile: 'fetchFile',
						},
					dataType:"json",
					success: function (data, status) {
						
						var state = data.state;
						var imageUrl=data.imgPath;
						//alert(state);
						if (state==1)
						{
							alert("修改失败");
							$('.form-group').removeClass('has-success');
							$('li').removeClass('bv-tab-success');
						}
						else if (state==0)
						{
							alert("修改成功");
							document.getElementById("fetchFile").value="";

							$("#tarImg").attr("src","../"+imageUrl);
							$("#headimg").attr("src","../"+imageUrl);
							//$("#previewImg").attr("src","${ctx }/static/image/avatar.png");
							$("#previewImg").attr("src","../static/image/avatar.png");
							$("#headimg").attr("src","../"+imageUrl);
							$("#previewImg").attr("width","160px");
							$("#previewImg").css("height","160px");
							$("#previewImg").css("width","160px");
							$("#previewImg").css("margin","0");
							$('.form-group').removeClass('has-success');
							$('li').removeClass('bv-tab-success');
						}
						
						else
						{
							alert("bug!!");
						}
						$("#imgUpBtnSubmit").removeAttr("disabled");
					},
                    error: function (data, status, e)//服务器响应失败处理函数
                    {
                        alert(e);
                    }
				});
			});
			$('#uploadImageForm').bootstrapValidator({
		        message: 'This value is not valid',
		        fields: {
		        	fetchFile: {
		                message: '图片格式不正确。',
		                validators: {
		                    regexp: {
		                        regexp: /\.jpg$|\.jpeg$|\.JPG$|\.png$|\.PNG$|\.GIF$|\.gif$/i,
		                        message: '图片格式有问题哟'
		                    }
		                },
						notEmpty: {
					        message: '密码不能为空。'
					    }
		            }
		        }
		    });
			

		});
	

	$(function(){
			$("#btnSelectFaceImage").click(function(){
				$("#fetchFile").click();
			});
		});
		
//		$(function(){
//			$("#imgUpBtnSubmit").bind("click",function (){
//				var x = document.getElementById("fetchFile");
//				if(!x || !x.value) {
//					alert("请选择文件");
//					return false;
//				}
//				
//				return checkImage(x);
//				
//			});
//		});
		
		function readFile(fileBrowser) { 
			if(checkImage(fileBrowser)==false)
				return;
			
			
			var path;
            path=document.forms["uploadImageForm"].fetchFile.value;      //C:\Documents and Settings\hud\����\AddFile.jpg
             
            
            if(window.navigator.userAgent.indexOf("MSIE 9")>=1){ 
	        	previewImageIE9(fileBrowser,"previewImgDiv","previewImg");
	        }else if(window.navigator.userAgent.indexOf("Firefox")>=1){
	        	previewImageFirefox(fileBrowser,"previewImgDiv","previewImg");
	        }else{
	        	var imageElem=document.getElementById("previewImg");
	            var fileQuery=document.forms["uploadImageForm"].fetchFile;
	            var previewImgDiv=document.getElementById("previewImgDiv");
	            preViewImgOther(imageElem,fileQuery,previewImgDiv);
	        } 
            

		}
		
		function checkImage(fileBrowser){
			var x = document.getElementById("fetchFile");
			if(!x || !x.value) {
				
				return false;
			}
			//var patn = /\.jpg$|\.jpeg$|\.gif$/i;
			var patn = /\.jpg$|\.jpeg$|\.JPG$|\.png$|\.PNG$|\.GIF$|\.gif$/i;
			if(!patn.test(x.value)){
				alert("您选择的似乎不是图像文件。");
				return false;
			}
			var size=fileBrowser.files[0].size; 
        	if(size/1024/1024>5)
        	{
        		alert("您的照片超过5M，请选择合适大小的图片");
				return false;
        	}
        	return true;
		}
		
		function preViewImgOther(imageElem,fileQuery,previewImgDiv)
		{ 
			

			var MAXWIDTH = 160; 
			var MAXHEIGHT = 160; 
            var file =fileQuery.files[0];  
 
            var reader =  new FileReader();  
            
            reader.onload =  function(e){ 
            	
            	
    			var imgObj=document.createElement("img");  
    			document.body.insertAdjacentElement("beforeEnd", imgObj); // firefox不行  
    			imgObj.style.visibility = "hidden";   
    			imgObj.setAttribute("src",e.target.result);
    			var imgwidth = imgObj.offsetWidth;  
    			var imgheight = imgObj.offsetHeight; 
    			

            	imageElem.setAttribute("src",e.target.result); 
            	
            		
        		if(imgheight>160&&imgwidth<imgheight){
            		var tmp;
            		try{
            			tmp=imgwidth/imgheight;
            		}catch(e){tmp=1}
            		
            		imageElem.style.marginTop=0;
            		imageElem.height=160;
            		imageElem.style.height=MAXHEIGHT+"px";
            		if(tmp!=0)
            			imageElem.style.width=(160*tmp)+"px";
            		imageElem.style.margin="auto";
            	}else if(imgwidth>160&&imgheight<imgwidth){
            		
            		var tmp;
            		try{
            			tmp=imgwidth/imgheight;
            		}catch(e){tmp=1}
            		
            		imageElem.width=160;
            		imageElem.style.width=MAXHEIGHT+"px";
            		if(tmp!=0)
            			imageElem.style.height=(160/tmp)+"px";
            		
            		imageElem.style.marginTop=(MAXHEIGHT-(160/tmp))/2+1+"px";
            	}else{
            		imageElem.style.marginTop=(MAXHEIGHT-imageElem.height)/3+"px";
            	}
                
            	
            	
            } 
 
            reader.readAsDataURL(file);  
		 }
	function previewImageFirefox(fileBrowser,previewImgDivId,previewImgId)
	{
		var MAXWIDTH = 160; 
		var MAXHEIGHT = 160; 
        var file =fileBrowser.files[0];  
        var reader =  new FileReader();
        reader.onload=function(e){
        	
        	var imgPre=document.createElement("img");
        	imgPre.style.visibility = "hidden"; 
        	imgPre.src=e.target.result;

        	var imgwidth=imgPre.width;
        	var imgheight=imgPre.height;
        	
        	var imgObj=document.getElementById(previewImgId);
        	imgObj.setAttribute("src",e.target.result);
        	
        	if(imgheight>160&&imgwidth<imgheight){
        		var tmp;
        		try{
        			tmp=imgwidth/imgheight;
        		}catch(e){tmp=1}
        		imgObj.style.margin=0;
        		imgObj.height=160;
        		imgObj.style.height=MAXHEIGHT+"px";
        		if(tmp!=0){
        			imgObj.style.width=(160*tmp)+"px";
        			imgObj.width=(160*tmp);
        		}
        		imageElem.style.margin="auto";
        	}else if(imgwidth>160&&imgheight<imgwidth){
        		var tmp;
        		try{
        			tmp=imgwidth/imgheight;
        		}catch(e){tmp=1}
        		
        		imgObj.width=160;
        		imgObj.style.width=MAXHEIGHT+"px";
        		if(tmp!=0){
        			imgObj.style.height=(160/tmp)+"px";
        			imgObj.height=(160/tmp);
        		}
        		imgObj.style.marginTop=(MAXHEIGHT-(160/tmp))/2+1+"px";
        	}
        	
        }
        reader.readAsDataURL(file);
 
        
	}
	function previewImageIE9(fileBrowser,previewImgDivId,previewImgId) 
	{ 
		var previewImgDiv=document.getElementById(previewImgDivId);
		var previewImg=document.getElementById(previewImgId);
		var MAXWIDTH = 160; 
		var MAXHEIGHT = 160; 
		var div = previewImgDiv; 
		if (fileBrowser.files && fileBrowser.files[0]) 
			{ 
				var reader = new FileReader(); 
				reader.onload = function(evt){previewImg.src = evt.target.result;} 
				reader.readAsDataURL(fileBrowser.files[0]); 
			}
			else 
			{ 
				var sFilter='filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src="'; 
				fileBrowser.select(); 
				fileBrowser.blur();
				var src = document.selection.createRange().text; 
				div.innerHTML = "<img id='"+previewImgId+"'>"; 
				var img = document.getElementById(previewImgId);
				//var img = document.getElementById(previewImgId);
				img.filters.item('DXImageTransform.Microsoft.AlphaImageLoader').src = src; 
				var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth, img.offsetHeight); 
				status =('rect:'+rect.top+','+rect.left+','+rect.width+','+rect.height); 
				div.innerHTML = "<div id='"+previewImgDivId+"' style='width:"+rect.width+"px;height:"+rect.height+"px;margin-top:"+rect.top+"px;margin-left:"+rect.left+"px;"+sFilter+src+"\"'></div>"; 
				
			} 

		} 
		
		function clacImgZoomParam( maxWidth, maxHeight, width, height )
		{ 
			var param = {top:0, left:0, width:width, height:height}; 
			if( width>maxWidth || height>maxHeight ) 
			{ 
			rateWidth = width / maxWidth; 
			rateHeight = height / maxHeight; 

			if( rateWidth > rateHeight ) 
			{ 
			param.width = maxWidth; 
			param.height = Math.round(height / rateWidth); 
			}else 
			{ 
			param.width = Math.round(width / rateHeight); 
			param.height = maxHeight; 
			} 
			} 

			param.left = Math.round((maxWidth - param.width) / 2); 
			param.top = Math.round((maxHeight - param.height) / 2); 
			return param; 
		} 
		
		
