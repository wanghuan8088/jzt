function changePage(pageNum,totalPage)
{
	if(pageNum!=getQueryString("pageNum"))
	{
		if(pageNum=="pre")
		{
			if(getQueryString("pageNum")!=1)
				{
					window.location.href="../search/products?keyword="+getQueryString("keyword")+"&topk="+getQueryString("topk")+"&pageNum="+(parseInt(getQueryString("pageNum"))-1);
				}
				//window.location.href="../search/products?keyword="+getQueryString("keyword")+"&topk="+getQueryString("topk")+"&pageNum="+(parseInt(getQueryString("pageNum"))-1);
		}
		else if(pageNum=="next")
		{
			if(getQueryString("pageNum")!=totalPage)
				window.location.href="../search/products?keyword="+getQueryString("keyword")+"&topk="+getQueryString("topk")+"&pageNum="+(parseInt(getQueryString("pageNum"))+1);
		}
		else if(pageNum=="first")
		{
			if(getQueryString("pageNum")!=1)
				window.location.href="../search/products?keyword="+getQueryString("keyword")+"&topk="+getQueryString("topk")+"&pageNum=1";
		}
		else if(pageNum=="last")
		{
			if(getQueryString("pageNum")!=totalPage)
				window.location.href="../search/products?keyword="+getQueryString("keyword")+"&topk="+getQueryString("topk")+"&pageNum="+totalPage;
		}
		else
			window.location.href="../search/products?keyword="+getQueryString("keyword")+"&topk="+getQueryString("topk")+"&pageNum="+pageNum;
	}
}

function getQueryString(name) { 
	var reg=new RegExp("(^|&)"+name+"=([^&]*)(&|$)","i"); 
	var r=window.location.search.substr(1).match(reg); 
	if(r!=null) 
		return r[2]; 
	return null; 
} 