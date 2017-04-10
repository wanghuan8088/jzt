/**
 * 
 */


var sousuo = function(data,keyword){
	var keyword = $.trim(keyword);
	var h = '';
	if(keyword.length>0){
		//var matcher = new RegExp( "^" + v ,"i");
		var matcher = new RegExp( keyword ,"i");
		var arr = $.grep( data, function( item ){
			console.log(item.platPin);
			return matcher.test( item.platName ) || matcher.test( item.platPin );
		});
		if(arr.length>0){
			for(var i=0;i<arr.length;i++){
				var thcol = new RegExp( keyword ,"ig");
				name = arr[i].platName.replace(thcol,"<i>"+keyword+"</i>");
				h+='<li><a href="#" dataid="'+arr[i].platId+'">'+name+'</a></li>';
			}	
		}else{
			h+='<li><a href="#" dataid="-1" style="text-align:center;">无查询结果</a></li>';
		}
	}
	return h;
};