$(document).ready(function() {
	getAd(1);
	getAd(2);
	getAd(3);
	getAd(4);
	getAd(5);
	getAd(6);
	getAd(7);
	getAd(8);
	getAd(9);
});

function getAd(id) { 
	  
    var programPath=$('#cxt').html();
    //组合Json查询条件，查询分页数据 
    $.ajax({  
        type: 'POST',  
        url: programPath+"/adver/indexCarousel" ,  
        dataType: 'json',  
        data: {type: id},  
        success: function (data) {  
            //返回的数据为JSON字符串  
        	var carList = data.carList;
	  		var adStr='<a href="'+programPath+carList[0].linkUrl+'"><img src="'+carList[0].imgPath+'" width="100%"/></a>';
	  		if(!(window.location.href.indexOf("index/home") > 0 && id == 1)) {
	  			$('#ad'+id).html(adStr);
	  		} else {
	  			$('#ad'+id).hide();
	  		}
        }
    });  
} 