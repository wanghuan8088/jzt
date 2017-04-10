var ctx=$('#ctx').html();
$(function(){
		var ctx=$('#ctx').html();
		var tempId_gudong=1;
		$("#add_gudong").click(function(){
				var html="<tr>"+
					  		"<td tmpvalue=\""+tempId_gudong+"\"><input maxlength=\"200\" name=\"name\" placeholder=\"股东姓名\" /></td>"+
					  		"<td><input maxlength=\"100\" name=\"position\" placeholder=\"股东职位\"/></td>"+
					  		"<td><input maxlength=\"50\" name=\"type\" placeholder=\"股东类型\"/></td>"+
					  		"<td><input maxlength=\"100\" name=\"certificate_type\" placeholder=\"证件类型\"/></td>"+
					  		"<td><input maxlength=\"400\" name=\"certificate\" placeholder=\"证件号\"/></td>"+
					  		"<td><input maxlength=\"160\" name=\"occupies_compared\" placeholder=\"股东占比\"/></td>"+
					  		"<td><input maxlength=\"160\" name=\"registered_capital\" placeholder=\"股东注册资本\"/></td>"+
					  		//"<td><input name=\"des\" placeholder=\"股东简历\"/></td>"+
					  		"<td><textarea maxlength=\"255\" name=\"des\" placeholder=\"股东简历\" rows=\"3\" ></textarea></td>"+
					  		"<td>"+
					  			"<button class=\"btn btn-warning remove_item\"><i class=\"glyphicon glyphicon-trash\"></i>&nbsp;删除</button>"+
					  			"<button class=\"btn btn-primary add_item\" style=\"margin-left:2px;\"><i class=\"glyphicon glyphicon-edit\"></i>&nbsp;保存</button>"+
					  		"</td>"+
					  	"</tr>";
				$("#gudong_tbody").append(html);
				tempId_gudong++;
				//addChange();
		});
			
		$("#gudong_table").on("click",".remove_item",function(){
				//parent.remove();
				try{
					var pid=$('input[name="pid"]').val();
					var parent=$(this).parent().parent();
					var tempid=$(parent).attr("temp-id");
					var id=$(parent).attr("data-id");
					data={
		            	"id":id,
		            	"pid":pid,
		            	"tempid":tempid
		            };
					
					if(id==null&&tempid==null){
						parent.remove();
					}else{
						//ajax 删除高管
						parent.remove();
						 $.ajax({
							 type: "POST",
					            url: ctx+'/platuser/stockholderDelete',
					            data: data,
					            dataType : "json",
					            error: function () {
					            },
					            success: function (result) {
					            	console.log(result);
					            }
						 });
					}
				}catch(err){
					
				}
				return false;
		});
		$("#gudong_table").on("click",".add_item",function(){
				 
				//parent.remove();
				try{
					
					var pid=$('input[name="pid"]').val();
					if(pid==null) return false;
					var parent=$(this).parent().parent();
					var name=$(parent).find("input[name='name']").val();
					var type=$(parent).find("input[name='type']").val();
					var position=$(parent).find("input[name='position']").val();
					var certificate=$(parent).find("input[name='certificate']").val();
					var certificate_type=$(parent).find("input[name='certificate_type']").val();
					var occupies_compared=$(parent).find("input[name='occupies_compared']").val();
					var registered_capital=$(parent).find("input[name='registered_capital']").val();
					//var des=$(parent).find("input[name='des']").val();
					var des=$(parent).find("textarea[name='des']").val();
					
					var data={};
					data["pid"]=pid;
					data["name"]=name;
					data["type"]=type;
					data["certificate"]=certificate;
					data["certificate_type"]=certificate_type;
					data["occupies_compared"]=occupies_compared;
					data["registered_capital"]=registered_capital;
					data["des"]=des;
					data["position"]=position;
					console.log(data);
					$.ajax({ 
						
						type: "POST",
			            url: ctx+'/platuser/stockholderAdd',
			            data: data,
			            dataType : "json",
			            error: function () {
			            },
						success: function (data) {
							console.log(data);
							var state = data.state;
							var stockholder=data.temp_stock_return;
							if (state==0)
							{
								alert("保存失败");
							}
							else if (state==1)
							{
								
								$(parent).find("input[name='name']").remove();
								$(parent).children().eq(0).html(stockholder.name);
								$(parent).find("input[name='position']").remove();
								$(parent).children().eq(1).html(stockholder.position);
								$(parent).find("input[name='type']").remove();
								$(parent).children().eq(2).html(stockholder.type);
								$(parent).find("input[name='certificate_type']").remove();
								$(parent).children().eq(3).html(stockholder.certificateType);
								$(parent).find("input[name='certificate']").remove();
								$(parent).children().eq(4).html(stockholder.certificate);
								$(parent).find("input[name='occupies_compared']").remove();
								$(parent).children().eq(5).html(stockholder.occupiesCompared);
								$(parent).find("input[name='registered_capital']").remove();
								$(parent).children().eq(6).html(stockholder.registeredCapital);
								
								$(parent).find("textarea[name='des']").remove();
								$(parent).children().eq(7).html(stockholder.des);
								
								$(parent).attr("temp-id",stockholder.tempid);
								$(parent).attr("data-id",stockholder.id);
								$('.add_item').hide();

							}
							
							else
							{
								alert("bug!!");
							}
						},
					});
				}catch(err){
					console.log(err);
				}
				return false;
		});
});
$(function(){
	var ctx=$('#ctx').html();
	var tempId_partner=1;
	$("#add_partner").click(function(){
		var html="<tr temp-id='' data-id=''>"+
			  		"<td tmpvalue=\""+tempId_partner+"\"><input maxlength=\"255\" name=\"name\" placeholder=\"合作伙伴名称\"/></td>"+
			  		"<td><select name=\"type\" class=\"form-control select_input\" >"+
					"<option value=\"传统金融机构\">传统金融机构</option>\<option value=\"第三方支付\">第三方支付</option>\<option value=\"风险投资机构\">风险投资机构</option>\<option value=\"其他金融从业公司\">其他金融从业公司</option>\<option value=\"财经信息门户网站\">财经信息门户网站</option>\<option value=\"法律支持\">法律支持</option>\<option value=\"技术支持\">技术支持</option>\<option value=\"研究机构\">研究机构</option>\<option value=\"综合媒体\">综合媒体</option>\<option value=\"相关细分行业公司\">相关细分行业公司</option>\<option value=\"国际组织\">国际组织</option>\<option value=\"其他\">其他</option>\</select></td>"+
			  		"<td>"+
			  			"<button class=\"btn btn-warning remove_item\"><i class=\"glyphicon glyphicon-trash\"></i>&nbsp;删除</button>"+
			  			"<button class=\"btn btn-primary add_item\" style=\"margin-left:2px;\"><span class=\"glyphicon glyphicon-edit\"></span>&nbsp;保存</button>"+
			  		"</td>"+
			  	"</tr>";
		$("#partner_tbody").append(html);
		tempId_partner++;
		//addChange();
	});
	
	$("#partner_table").on("click",".remove_item",function(){
		//parent.remove();
		try{
			
			var pid=$('input[name="pid"]').val();
//			alert(pid);
		;
			var parent=$(this).parent().parent();
			var tempid=$(parent).attr("temp-id");
//			alert(tempid);
			var partner_id=$(parent).attr("data-id");

//			alert(partner_id);
			data={
            	"id":partner_id,
            	"pid":pid,
            	"tempid":tempid
            };
			console.log(data);

				//ajax 删除高管
				parent.remove();
				 $.ajax({
					 type: "POST",
			            url: ctx+'/platuser/partnerDelete',
			            data: data,
			            dataType : "json",
			            error: function () {
			            },
			            success: function (result) {
			            	console.log(result);
			            }
				 });
			
		}catch(err){
			
		}
		return false;
	});
	$("#partner_table").on("click",".add_item",function(){
		 
		//parent.remove();
		try{
			
			var pid=$('input[name="pid"]').val();
			if(pid==null) return false;
			var parent=$(this).parent().parent();
			var name=$(parent).find("input[name='name']").val();
			var type=$(parent).find("select[name='type']").val();
		
			var data={};
			data["pid"]=pid;
			data["name"]=name;
			data["style"]=type;
			try{
				$.ajax({ 
					
					type: "POST",
		            url: ctx+'/platuser/partnerAdd',
		            data: data,
		            dataType : "json",
		            error: function () {
		            },
					success: function (data) {
						 
						console.log(data);
						var state = data.state;
						var partner=data.temp_partner_return;
						if (state==0)
						{
							alert("保存失败");
						}
						else if (state==1)
						{
							
							$(parent).find("input[name='name']").remove();
							$(parent).children().eq(0).html(partner.name);
							$(parent).find("select[name='type']").remove();
							$(parent).children().eq(1).html(partner.style);
							$(parent).attr("temp-id",partner.tempid);
							
							//alert(partner.tempid);
							//alert($(parent).attr("temp-id"));
							$(parent).attr("data-id",partner.id);
							
							$('.add_item').hide();

						}
						
						else
						{
							alert("bug!!");
						}
					},
				});
			}catch(e){
				console.log(e);
			}
			
		}catch(err){
			console.log(err);
		}
		return false;
	});
});
$(function(){
	var ctx=$('#ctx').html();
	var tempId_association=1;
	$("#add_association").click(function(){
		var html="<tr temp-id='' data-id=''>"+
			  		"<td tmpvalue=\""+tempId_association+"\"><input  maxlength=\"50\" name=\"name\" placeholder=\"协会名称\"/></td>"+
			  		"<td>"+
			  			"<button class=\"btn btn-warning remove_item\"><i class=\"glyphicon glyphicon-trash\"></i>&nbsp;删除</button>"+
			  			"<button class=\"btn btn-primary add_item\" style=\"margin-left:2px;\"><i class=\"glyphicon glyphicon-edit\"></i>&nbsp;保存</button>"+
			  		"</td>"+
			  	"</tr>";
		$("#association_tbody").append(html);
		tempId_association++;
		//addChange();
	});
	
	$("#association_table").on("click",".remove_item",function(){
		//parent.remove();
		try{
			
			var pid=$('input[name="pid"]').val();
			//var tempid=$('input[name="tempid"]').val();
			var parent=$(this).parent().parent();
			var tempid=$(parent).attr("temp-id");
			var id=$(parent).attr("data-id");
		
			data={
				"pid":pid,
				"tempid":tempid,
				"id":id
			};
			console.log(data);
			if(tempid==null&&id==null){
				parent.remove();
			}else{
				//ajax 删除高管
				parent.remove();
				 $.ajax({
					 type: "POST",
			            url: ctx+'/platuser/financeDelete',
			            data: data,
			            dataType : "json",
			            error: function () {
			            },
			            success: function (result) {
			            	console.log(result);
			            }
				 });
			}
		}catch(err){
			
		}
		return false;
	});
	$("#association_table").on("click",".add_item",function(){
		 
		//parent.remove();
		try{
			
			var pid=$('input[name="pid"]').val();
			if(pid==null) return false;
			var parent=$(this).parent().parent();
			var name=$(parent).find("input[name='name']").val();
		
			var data={};
			data["pid"]=pid;
			
			data["name"]=name;
			
			$.ajax({ 
				
				type: "POST",
	            url: ctx+'/platuser/financeAdd',
	            data: data,
	            dataType : "json",
	            error: function () {
	            },
				success: function (data) {
					console.log(data);
					var state = data.state;
					var association=data.temp_finance_return;
					if (state==0)
					{
						alert("保存失败");
					}
					else if (state==2)
					{
						alert("重复");
					}
					else if (state==1)
					{
						
						
						
						$(parent).find("input[name='name']").remove();
						$(parent).children().eq(0).html(name);
						$('.add_item').hide();
						//alert(association.tempid);
						$(parent).attr("temp-id",association.tempid);
						$(parent).attr("data-id",association.id);						
						
						

					}
					
					else
					{
						alert("bug!!");
					}
				},
			});
		}catch(err){
			console.log(err);
		}
		return false;
	});
});