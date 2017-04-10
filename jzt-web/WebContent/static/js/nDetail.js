 
    $(document).ready(function() { 
    	AjaxRelateP();
    	
    });
    
    function AjaxRelateP() { 

        //清空数据显示 
        $('#news_relate_product span').remove();   
      
        var programPath=$('#cxt').html();
    	var nid = $('#nId').html();
        //组合Json查询条件，查询分页数据 
        $.ajax({  
            type: 'POST',  
            url: programPath+"/news/newsRelatedProduct" ,  
            dataType: 'json',  
            data: {nId:nid},  
            success: function (data) {  
                if (data == null) {  
                    $('#news_relate_product').remove();
      
                }  
                else if (data != null) {  
                	data=data["proList"];
                    //返回的数据为JSON字符串  
                    if (eval(data).length != 0) {  
                        var str = '<ul class="list-inline">';  
                        for (var i = 0; i < eval(data).length; i++) {  
                        	var product=eval(data);
                        	product=product[i]; 
                        	str += ' <li><a href="'+programPath+'/product/pDetail/'+product[0]+'"><span class="glyphicon glyphicon-tag"></span> '+product[1]+'</a></li>  ';
             
                        }  
                        str += '</ul>';
                        $('#news_relate_product').append(str);    

                    }  
                    else {  
                    	$('#news_relate_product').remove();
                    }  
                }   
      
            }
        });  
    } 