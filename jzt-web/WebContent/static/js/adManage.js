var imgWidth,imgHeight;

$(document).ready(function () {
	var modForm = $("#modForm");
	modForm.bind("submit", validateWH);
	$("#content_ul").show();
    function validateWH() {
        var previewImg = document.getElementById("previewImg");
        if(previewImg.naturalWidth!=imgWidth||previewImg.naturalHeight!=imgHeight)
        {
        	alert("图片尺寸不符，请重新选择图片");
            return false;
        }
    }
});

function modify(aid,description,linkUrl,width,height,imgPath) { 
	document.getElementById("mod-div").style.display="";//显示
	document.getElementById("aid").value=aid;
	document.getElementById("description").innerText=description;
	document.getElementById("linkUrl").value=linkUrl;
	document.getElementById("width").innerText=width;
	document.getElementById("height").innerText=height;
	document.getElementById("previewImg").src=imgPath;
	imgWidth=width;
	imgHeight=height;
} 

$(function(){
	$("#btnSelectFaceImage").click(function(){
		$("#fetchFile").click();
	});
});

function readFile(fileBrowser) { 
	if(checkImage(fileBrowser)==false)
		return;
	
	var path;
    path=document.forms["modForm"].fetchFile.value;      //C:\Documents and Settings\hud\����\AddFile.jpg
     
    
    if(window.navigator.userAgent.indexOf("MSIE 9")>=1){ 
    	previewImageIE9(fileBrowser,"previewImgDiv","previewImg");
    }else if(window.navigator.userAgent.indexOf("Firefox")>=1){
    	previewImageFirefox(fileBrowser,"previewImgDiv","previewImg");
    }else{
    	var imageElem=document.getElementById("previewImg");
        var fileQuery=document.forms["modForm"].fetchFile;
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
    var file =fileQuery.files[0];  
    var reader =  new FileReader();  
    reader.onload =  function(e){ 
		var imgObj=document.createElement("img");  
		document.body.insertAdjacentElement("beforeEnd", imgObj); // firefox不行  
		imgObj.style.visibility = "hidden";   
		imgObj.setAttribute("src",e.target.result);
		
    	imageElem.setAttribute("src",e.target.result); 
    } 
    reader.readAsDataURL(file);  
 }
function previewImageFirefox(fileBrowser,previewImgDivId,previewImgId)
{
	var file =fileBrowser.files[0];  
	var reader =  new FileReader();
	reader.onload=function(e){
		var imgPre=document.createElement("img");
		imgPre.style.visibility = "hidden"; 
		imgPre.src=e.target.result;
		
		var imgObj=document.getElementById(previewImgId);
		imgObj.setAttribute("src",e.target.result);
	}
	reader.readAsDataURL(file);
}
function previewImageIE9(fileBrowser,previewImgDivId,previewImgId) 
{ 
	var previewImg=document.getElementById(previewImgId);
	if (fileBrowser.files && fileBrowser.files[0]) 
	{ 
		var reader = new FileReader(); 
		reader.onload = function(evt){previewImg.src = evt.target.result;} 
		reader.readAsDataURL(fileBrowser.files[0]); 
	}

} 