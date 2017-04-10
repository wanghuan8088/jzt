var field=['发展指数','流动性','成交量','营收','收益','分散度','品牌','人气','透明度','杠杆'];
var fieldE=['development_rate','mobility','turnover','benefit','revenue','dispersion','brand','popularity','transparency','lever'];

$(document).ready(function() {
	getAllData(fieldE[0]);
});

function getAllData(sortData)
{
	var programPath=$('#ctx').html();
	$.ajax({  
          type : 'POST',  
          url : '../eval/findAll',  
          data : {
        	  sortData: sortData,
		  },  
          dataType : 'json',  
          success : function(data) {  
        	  var state = data.state;
        	  if(state==0)
        	  {
        		  $('#date').html(data.evalDate);
        		  var flag=['<td>','<td>','<td>','<td>','<td>','<td>','<td>','<td>','<td>','<td>'];
        		  var thead="<th class='text-center'>排名</th>"+"<th class='text-center'>产品名称</th>";
        		  for(var i=0;i<field.length;i++)
        		  {
        			  if(sortData==fieldE[i])
        			  {
        				  flag[i]="<td class='syn-font'>";
        				  thead+="<th class='text-center'>"+field[i]+"<img src='../static/image/down.png' class='arrow-down'></th>";
        			  }
        			  else
        				  thead+="<th class='text-center'><a href='javascript:void(0)' onclick='getAllData(\""+fieldE[i]+"\")'>"+field[i]+"</a></th>";
        		  }
        		  thead+="<th class='text-center'>档案</th>";
        		  $('#thead').html("");
        		  $('#thead').append(thead);
        		  var count=0;
        		  var evalList = data.evalList;
        		  var tbody="";
            	  while(count<evalList.length)
            	  {
            		  count++;
            		  tbody+="<tr>"+
				         "<td>"+count+"</td>"+
				         "<td><a href='"+evalList[count-1].webUrl+"'>"+evalList[count-1].pName+"</a></td>";
            		  
            		  if(evalList[count-1].developmentRate==null) tbody+=flag[4]+"-"+"</td>";
            		  else tbody+=flag[4]+evalList[count-1].developmentRate+"</td>";
            		  
            		  if(evalList[count-1].mobility==null) tbody+=flag[4]+"-"+"</td>";
            		  else tbody+=flag[4]+evalList[count-1].mobility+"</td>";
            		  
            		  if(evalList[count-1].turnover==null) tbody+=flag[4]+"-"+"</td>";
            		  else tbody+=flag[4]+evalList[count-1].turnover+"</td>";
            		  
            		  if(evalList[count-1].benefit==null) tbody+=flag[4]+"-"+"</td>";
            		  else tbody+=flag[4]+evalList[count-1].benefit+"</td>";           		  
            		           		  
            		  if(evalList[count-1].revenue==null) tbody+=flag[4]+"-"+"</td>";
            		  else tbody+=flag[4]+evalList[count-1].revenue+"</td>";
            		  
            		  if(evalList[count-1].dispersion==null) tbody+=flag[4]+"-"+"</td>";
            		  else tbody+=flag[4]+evalList[count-1].dispersion+"</td>";
            		  
            		  if(evalList[count-1].brand==null) tbody+=flag[4]+"-"+"</td>";
            		  else tbody+=flag[4]+evalList[count-1].brand+"</td>";
            		  
            		  if(evalList[count-1].popularity==null) tbody+=flag[4]+"-"+"</td>";
            		  else tbody+=flag[4]+evalList[count-1].popularity+"</td>";
            		  
            		  if(evalList[count-1].transparency==null) tbody+=flag[4]+"-"+"</td>";
            		  else tbody+=flag[4]+evalList[count-1].transparency+"</td>";
            		  
            		  if(evalList[count-1].lever==null) tbody+=flag[4]+"-"+"</td>";
            		  else tbody+=flag[4]+evalList[count-1].lever+"</td>";
            	
            		
            		  tbody+="<td><a href='../product/pDetail/"+evalList[count-1].id+"'><span class='glyphicon glyphicon-book'></span></a></td>"+
    			      "</tr>";
            	  }
            	  $('#tbody').html("");
            	  $('#tbody').append(tbody);
        	  }
          }
	});
}