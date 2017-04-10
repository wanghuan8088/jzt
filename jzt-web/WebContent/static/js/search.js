function search_submit()
{
	var keyword=$('#key').val();
	var topk=$('#topk').val();
	var programPath=$('#cxt').html();
	var pageNum=$('#pageNum').val();
	if (keyword!="")
	{
		if($('#type').val()==2)
		{

			window.location.href=programPath+"/search/products?keyword="+keyword+"&topk="+topk+"&pageNum="+pageNum; 
		}
		else if($('#type').val()==1)
		{
			$.cookie('CurPageS', '1'); 
			window.location.href=programPath+"/search/searchN?keyword="+keyword; 
		}
	}
}