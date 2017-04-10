var ctx = $("ctx").attr("value");
var projects;//list of projects
var spiders;//list of spiders in selected project
var project;//selected project
var spider;//selected spider
var startspider;//selected spider
var PageSize = 20;//全局变量 每页显示多少条数据
var maxpage;//全局变量  总页数 
var platCurPage = 0;// 平台列表的当前页码
// added by gym
var url_id;//存储链接信息的ID

var url="http://10.214.192.66:6800";
$(document).ready(function () {

	$("#data_ul").show();
	//保存内存数据到数据库
	$.ajax({
        type: "POST",
        url: url+'/persistjobs.json', 
        data: {
        	project:"all"
        },
        success: function(data) {
        	//查看状态
        	status=data["status"];
        	if (status!="ok")
        		alert("爬虫失败");

    	  }
    });
	
	$.ajax({
        type: "GET",
        url: url+'/listprojects.json', 
        data: {
        },
        success: function(data) {
        	//默认是第一个project为显示的内容
        	projects=data["projects"];
        	$('#dropdownMenu1').html(translate(projects[0])+'<span class="caret"></span>');
        	//获取spider的列表
        	$.ajax({
    	        type: "GET",
    	        url: url+'/listspiders.json', 
    	        data: {
    	        	project:projects[0]
    	        },
    	        beforeSend: function() {},
    	        success: function(data) {
    	        	
    	        	spiders=data["spiders"];
    	        	$('#spiderlist').append('<li  id="all"><a onclick="spiderList(this)">全部</a></li>');
    	        	for (var i=0;i<spiders.length;i++)
    	        	{
    	        		$('#spiderlist').append('<li  id="'+spiders[i]+'"><a onclick="spiderList(this)">'+translate(spiders[i])+'</a></li>');
    	        		$('#spiderlist_add').append('<li  id="'+spiders[i]+'"><a class="btn btn-default" onclick="addSpriderDisplay(this)">'+translate(spiders[i])+'</a></li>');
    	        	}
    	        }
    	    });
        	
        	//获取下拉框
        	for(var i=0;i<projects.length;i++)
        	{
        		$('#project').append('<li ><a href="javascript:void(0)" onclick="projectList(this)" >'+translate(projects[i])+'<span style="display:none">'+projects[i]+'</span></a></li>');
        		
        	}
        	project=projects[0];
        	var CurPage;
            $.cookie('SpiderCurPage', '1'); // 读取 cookie  
            CurPage=1;
           
            spider="all";
            AjaxPage(CurPage, PageSize, project, spider);  
        	
        },
        error:function (error)
        {
        	$('#all_project').html("爬虫服务器有问题，请联系程序员！");
        }
    });

	
});

//分页方法  
function AjaxPage(CurPage, PageSize, project, spider) { 

    //清空数据显示Table  
    $('#MainContent_AspNetPager_Msg').html('<li class="disabled"><a href="javascript:void(0)" aria-label="First"><span aria-hidden="true">首页</span></a></li><li class="disabled"><a href="javascript:void(0)" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li><li><a href="javascript:void(0)">1</a></li><li class="disabled"><a href="javascript:void(0)" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li><li class="disabled"><a href="javascript:void(0)" aria-label="Last"><span aria-hidden="true">末页</span></a></li>');  
    $('#CurrentPage').html(CurPage);//页  
    $('#jobs').html("");
    
    //组合Json查询条件，查询分页数据
    var isNullFlag = true;
    //如果没有spider,spider=all
    //获取job列表从内存
	$.ajax({
        type: "GET",
        url: url+'/listjobs.json', 
        data: {
        	project:project
        },
        success: function(data) {
        	
        	
        	if (spider!="all"){
	        	var state=data["running"];
	        	if (state.length!=0) 
	        	{
	        		isNullFlag=false;
	        	for (var i=0;i<state.length;i++)
	        	{
	        		if (state[i]['spider']==spider)
	        		{
	        			$('#jobs').append('<tr><td>'+translate(project)+'<div style="display:none" class="pid">'+project+'</div></td><td>'+translate(state[i]['spider'])+'</td><td class="id">'+state[i]['id']+'</td><td>'+state[i]['start_time']+'</td><td>'+state[i]['end_time']+'</td><td>running</td><td><a target="_Blank" href="'+url+'/logs/'+project+'/'+state[i]['spider']+'/'+state[i]['id']+'.log">Log</a></td><td><a target="_Blank" href="'+url+'/items/'+project+'/'+state[i]['spider']+'/'+state[i]['id']+'.jl">Item</a></td><td><a onclick="cancle(this)">取消</a></td></tr>');
	        		}
	        	}}
	        	state=data["pending"];
	        	if (state.length!=0)
	        	{
	        		isNullFlag=false;
	        	
	        	for (var i=0;i<state.length;i++)
	        	{
	        		if (state[i]['spider']==spider)
	        		{
	        			$('#jobs').append('<tr><td>'+translate(project)+'<div style="display:none" class="pid">'+project+'</div></td><td>'+translate(state[i]['spider'])+'</td><td class="id">'+state[i]['id']+'</td><td>'+state[i]['start_time']+'</td><td>'+state[i]['end_time']+'</td><td>pending</td><td><a target="_Blank" href="'+url+'/logs/'+project+'/'+state[i]['spider']+'/'+state[i]['id']+'.log">Log</a></td><td><a target="_Blank" href="'+url+'/items/'+project+'/'+state[i]['spider']+'/'+state[i]['id']+'.jl">Item</a></td><td><a onclick="cancle(this)">取消</a></td></tr>');
	        		}
	        	}}
        	}
        	else 
        	{
        		var state=data["running"];
        		if (state.length!=0) {isNullFlag=false;
        		for (var i=0;i<state.length;i++)
            	{

            		$('#jobs').append('<tr><td>'+translate(project)+'<div style="display:none" class="pid">'+project+'</div></td><td>'+translate(state[i]['spider'])+'</td><td class="id">'+state[i]['id']+'</td><td>'+state[i]['start_time']+'</td><td>'+state[i]['end_time']+'</td><td>running</td><td><a target="_Blank" href="'+url+'/logs/'+project+'/'+state[i]['spider']+'/'+state[i]['id']+'.log">Log</a></td><td><a target="_Blank" href="'+url+'/items/'+project+'/'+state[i]['spider']+'/'+state[i]['id']+'.jl">Item</a></td><td><a onclick="cancle(this)">取消</a></td></tr>');
            	}}
            	state=data["pending"];
            	if (state.length!=0) {isNullFlag=false;
            	for (var i=0;i<state.length;i++)
            	{

            		$('#jobs').append('<tr><td>'+translate(project)+'<div style="display:none" class="pid">'+project+'</div></td><td>'+translate(state[i]['spider'])+'</td><td class="id">'+state[i]['id']+'</td><td>'+state[i]['start_time']+'</td><td>'+state[i]['end_time']+'</td><td>pending</td><td><a target="_Blank" href="'+url+'/logs/'+project+'/'+state[i]['spider']+'/'+state[i]['id']+'.log">Log</a></td><td><a target="_Blank" href="'+url+'/items/'+project+'/'+state[i]['spider']+'/'+state[i]['id']+'.jl">Item</a></td><td><a onclick="cancle(this)">取消</a></td></tr>');
            	}}
        	}
        }
    });
	//获取job列表从数据库
	$.ajax({
        type: "GET",
        url: url+'/listdbjobs.json', 
        data: {
        	project:project,
        	page_count:PageSize,
        	page_id:CurPage
        },
        success: function(data) {
        	var result_state=data["status"];
        	if (result_state=="ok")
        	{
        	if (spider!="all"){
	        	var state=data["finished"];
	        	if (state.length!=0) {isNullFlag=false;
	        	for (var i=0;i<state.length;i++)
	        	{
	        		if (state[i]['spider']==spider)
	        		{
	        			$('#jobs').append('<tr><td>'+translate(project)+'<div style="display:none" class="pid">'+project+'</div></td><td>'+translate(state[i]['spider'])+'</td><td class="id">'+state[i]['id']+'</td><td>'+state[i]['start_time']+'</td><td>'+state[i]['end_time']+'</td><td>finished</td><td><a target="_Blank" href="'+url+'/logs/'+project+'/'+state[i]['spider']+'/'+state[i]['id']+'.log">Log</a></td><td><a target="_Blank" href="'+url+'/items/'+project+'/'+state[i]['spider']+'/'+state[i]['id']+'.jl" >Item</a></td><td></td></tr>');
	        		}
	        	}}
        	}
        	else 
        	{
        		var state=data["finished"];
        		if (state.length!=0) {isNullFlag=false;
            	for (var i=0;i<state.length;i++)
            	{

            		$('#jobs').append('<tr><td>'+translate(project)+'<div style="display:none" class="pid">'+project+'</div></td><td>'+translate(state[i]['spider'])+'</td><td class="id">'+state[i]['id']+'</td><td>'+state[i]['start_time']+'</td><td>'+state[i]['end_time']+'</td><td>finished</td><td><a target="_Blank" href="'+url+'/logs/'+project+'/'+state[i]['spider']+'/'+state[i]['id']+'.log">Log</a></td><td><a target="_Blank" href="'+url+'/items/'+project+'/'+state[i]['spider']+'/'+state[i]['id']+'.jl" >Item</a></td><td></td></tr>');
            	}}
        	}
        	}
        	//没有数据
        	if (isNullFlag)
        	{
        		$('#jobs').append("<tr><td colspan='9'>未找到相关数据！</td></tr>");
                $('#MainContent_AspNetPager_Msg').hide();
        	}
        	else	
        	{
        		//做分页插件
        		//最大页数  
                maxpage = data["count"]/PageSize;  
                $('#MainContent_AspNetPager_Msg').show();
                $('#MainContent_AspNetPager_Msg').html('');//分页链接
                var span;
                if (maxpage>1){if (CurPage==1)
                {
                	span = '<li class="disabled"><a href="javascript:void(0)" aria-label="First"><span aria-hidden="true">首页</span></a></li><li class="disabled"><a href="javascript:void(0)" aria-label="Previous" onclick="PageIndexClick(this)" id="PreviousPage"><span aria-hidden="true">&laquo;</span></a></li>';  
                }
                else 
                {
                	span = '<li><a href="#" aria-label="First" onclick="PageIndexClick(this)" id="FirstPage"><span aria-hidden="true">首页</span></a></li><li><a href="javascript:void(0)" aria-label="Previous" onclick="PageIndexClick(this)" id="PreviousPage"><span aria-hidden="true">&laquo;</span></a></li>';  
                }
                var firstPage = 1;  
                var pagecount = 0;//循环的次数  
                if (maxpage > 10) {  
                    pagecount = 10;  
                    if (CurPage >= 10) {  
                        pagecount = CurPage+2;  
                        firstPage = CurPage - 7;  
                       
                    }  
                    if(pagecount>maxpage){
                		 pagecount =maxpage;
                	 }
                    for (var j = firstPage; j <= pagecount ; j++) {  
                        if (j == CurPage) {  
                            span += "<li class='active'><span>"+ j +"</span></li>" ;  ;  
                        } else {  
                            span += "<li><a href='javascript:void(0)' onclick='CurPageSizeClick(" + j + ",this)'>"+ j +"</a></li>" ;  
                        }  
                    } 
                    if (CurPage==maxpage)
                    {
                    	span += "<li class='disabled'><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li class='disabled'><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
                    }
                    else
                    {
                    	span += "<li><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
                    }
                } else {  
                    pagecount = maxpage;  
                    for (var j = firstPage; j <= pagecount ; j++) {  
                        if (j == CurPage) {  
                            span += "<li class='active'><span>"+ j +"</span></li>" ;  ;  
                        } else {  
                            span += "<li><a href='javascript:void(0)' onclick='CurPageSizeClick(" + j + ",this)'>"+ j +"</a></li>" ;  
                        }  
                    } 
                    if (CurPage==maxpage)
                    {
                    	span += "<li class='disabled'><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li class='disabled'><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
                    }
                    else
                    {
                    	span += "<li><a href='javascript:void(0)' aria-label='Next' onclick='PageIndexClick(this)' id='NextPage'><span aria-hidden='true'>&raquo;</span></a></li><li><a href='#' aria-label='Last' onclick='PageIndexClick(this)' id='LastPage'><span aria-hidden='true'>末页</span></a></li>";  
                    }
                } 
                
                $('#MainContent_AspNetPager_Msg').html(span);  
             }
             } 
        }
    });
	
} 

//首页、上一页、下一页、尾页点击  
function PageIndexClick(obj) {  

    //当前第几页 
    var CurrenPageSize = $.cookie('SpiderCurPage'); 
    if (CurrenPageSize != '') {  
        CurrenPageSize = parseInt(CurrenPageSize);  
    }  
    //id  
    var type = $(obj).attr('id');  
    //首页  
    if (type == 'FirstPage') {  
        CurrenPageSize = 1;  
        AjaxPage(CurrenPageSize, PageSize, project, spider);   
    }  
        //上一页  
    else if (type == 'PreviousPage') {  
        if (CurrenPageSize > 1) {  
            CurrenPageSize = CurrenPageSize - 1;  
        } else {  
            CurrenPageSize = 1;  
        }  
        AjaxPage(CurrenPageSize, PageSize, project, spider);   
    }  
        //下一页  
    else if (type == 'NextPage') {  
        var size = CurrenPageSize + 1;  
        
        if (size <= maxpage) {  
            CurrenPageSize = CurrenPageSize + 1;
        }  
        AjaxPage(CurrenPageSize, PageSize, project, spider);  
    }  
        //尾页  
    else if (type == 'LastPage') {  
        CurrenPageSize = maxpage;  
        AjaxPage(CurrenPageSize, PageSize, project, spider);  
    }  
}  
  
//页数点击   
function CurPageSizeClick(CurPage, obj) {  
    AjaxPage(CurPage, PageSize, project, spider);  
}  

//翻译器
function translate(eng)
{
	var chi;
	switch (eng)
	{
	// added by gym
	case "enterprise":
		  chi="企业API";
		  break;
	case "jiekuan":
		  chi="标的";
		  break;
	case "toubiao":
		  chi="投标列表";
		  break;
	case "yuqi":
		  chi="逾期";
		  break;
	case "wangjia":
	  chi="网贷之家";
	  break;
	case "p2peye":
	  chi="网贷天眼";
	  break;
	case "weidai":
		  chi="微贷网";
		  break;
	case "daohang":
		  chi="导航";
		  break;
	case "tedian":
		  chi="TAG标签";
		  break;
	case "biaodi":
		  chi="标的详情";
		  break;
	case "biaoren":
		  chi="投标人";
		  break;
	case "wenti":
		  chi="问题平台";
		  break;
	case "wenti2":
		  chi="问题平台补充";
		  break;
	case "pingji":
		  chi="评级";
		  break;
	case "pingji2":
		  chi="评级补充";
		  break;
	case "dangan":
		  chi="档案";
		  break;
	case "baoguang":
		  chi="曝光";
		  break;
	case "shuju":
		  chi="数据";
		  break;
	case "xinwen":
		  chi="新闻";
		  break;
	case "renrendai":
		  chi="人人贷";
		  break;
	case "yirendai":
		  chi="宜人贷";
		  break;
	case "exporterHelper":
		  chi="输出辅助";
		  break;
	case "imageHelper":
		  chi="图片爬虫";
		  break;
	case "investrecord":
		  chi="投资者记录";
		  break;
	case "loanid":
		  chi="标的记录";
		  break;
	case "product":
		  chi="标的信息";
		  break;
	case "wangjia_rating":
		  chi="网贷之家评级辅助";
		  break;
	case "wangjia_news":
		  chi="网贷之家新闻辅助";
		  break;
	case "wangjia_exposure":
		  chi="网贷之家曝光辅助";
		  break;
	case "jiben":
		  chi="联盟接入信批数据";
		  break;
	case "meiri":
		  chi="联盟接入每日数据";
		  break;
	default:
	  chi=eng;
	}
	return chi;
}

//取消任务
function cancle(obj)
{
	var job;
	var project;
	project=$(obj).parent().parent().find(".pid").html();
	job=$(obj).parent().parent().find(".id").html();
	$.ajax({
        type: "POST",
        url: url+'/cancel.json', 
        data: {
        	project:project,
        	job:job
        },
        beforeSend: function() {},
        success: function(data) {
            if (data["status"]=="ok")
            {
            	$(obj).parent().html();
            }
        }


    });
}

//开始任务
function start()
{
	var from_id=$("#from_id").val();
	var to_id=$("#to_id").val();
	var end_time=$('#newst_month option:selected').val();
	var timestamp=$('#newst_month option:selected').val();
	var category=$("#category").val();
	var bid_type="";
	var credit="";
	var start_page_id=$("#start_page_id").val();
	var end_page_id=$("#end_page_id").val();
	var time_from=$("#time_from").val();
	var time_to=$("#time_to").val();
	var plat_status=$("#plat_status").val();
	var jsessionid=$("#jsessionid").val();
	var start_url;//启动URL，从后台启动还是直接对爬虫进行启动
	var cache=$("#cache").val();
	if(project == "enterprise" || project == "aif"){
		// 注意把这里改掉
		start_url = ctx+'/admin/data/spiderManage/addTask';
	}
	else{
		start_url = url+'/schedule.json';
	}
	$.ajax({
        type: "POST",
        url: start_url, 
        data: {
        	// delete here
        	project:project,
        	spider:startspider,
        	from_id:from_id,
        	to_id:to_id,
        	end_time:end_time,
        	timestamp:timestamp,
        	cache:cache,
        	category:category, 
        	bid_type:bid_type,
        	credit:credit,
        	start_page_id:start_page_id,
        	end_page_id:end_page_id,
        	jsessionid:jsessionid,
        	from_date:time_from,
        	to_date:time_to, 
        	url_id:url_id,
        	plat_status:plat_status
        },
        success: function(data) {
            if(data['status']=="ok")
            {
            	$('#jobs').append('<tr><td>'+translate(project)+'<div style="display:none" class="pid">'+project+'</div></td><td>'+translate(startspider)+'</td><td class="id">'+data['jobid']+'</td><td></td><td></td><td>pending</td><td><a target="_Blank" href="'+url+'/logs/'+project+'/'+startspider+'/'+data['jobid']+'.log">Log</a></td><td><a target="_Blank" href="'+url+'/items/'+project+'/'+startspider+'/'+data['jobid']+'.jl">Item</a></td><td><a onclick="cancle(this)">取消</a></td></tr>');
            }
        }


    });
}
function cancel()
{
	$("#add-div").hide();//显示
}
//添加新任务的任务框显示
function add() { 
	$("#add-div").show();//显示
	$('#none_div').show();
	$('#from_to_id_div').hide();
	$('#newst_month_div').hide();
	$('#category_div').hide();
	$('#start_end_page_id_div').hide();
	$('#jsessionid_div').hide();
	$('#from_to_time_div').hide();
	$('#plat_select_div').hide();
	$('#plat_status_div').hide();
} 

//改变project
function projectList(obj)
{

	project=$(obj).find('span').html();
	$('#dropdownMenu1').html(translate(project)+'<span class="caret"></span>');
	if(project=="enterprise"){
		$('#spiderlist_add').parent().removeClass("col-md-12");
		$('#spiderlist_add').parent().addClass("col-md-9");
	}
	//获取spider的列表
	$.ajax({
        type: "GET",
        url: url+'/listspiders.json', 
        data: {
        	project:project
        },
        beforeSend: function() {},
        success: function(data) {
        	spiders=data["spiders"];
        	$('#spiderlist').html("");
        	$('#spiderlist_add').html("");
        	$('#spiderlist').append('<li  id="all"><a onclick="spiderList(this)">全部</a></li>');
        	for (var i=0;i<spiders.length;i++)
        	{
        		
        		$('#spiderlist').append('<li  id="'+spiders[i]+'"><a onclick="spiderList(this)">'+translate(spiders[i])+'</a></li>');
        		$('#spiderlist_add').append('<li  id="'+spiders[i]+'"><a class="btn btn-default" onclick="addSpriderDisplay(this)">'+translate(spiders[i])+'</a></li>');
        	}
        }
    });
	var CurPage=1;
    $.cookie('SpiderCurPage', '1'); // 存储 cookie 
    spider="all";
	AjaxPage(CurPage, PageSize, project, spider);  
	
}

//改变爬虫
function spiderList(obj)
{
	
	spider=$(obj).parent().attr("id");
	$(obj).parent().parent().children(".active").removeClass("active");
	$(obj).parent().addClass("active");
	var CurPage=1;
    $.cookie('SpiderCurPage', '1'); // 存储 cookie 
	AjaxPage(CurPage, PageSize, project, spider);
	
}
//根据爬虫类型显示参数输入
function addSpriderDisplay(obj)
{
	var spider=$(obj).parent().attr("id");
	startspider=spider;
	$(obj).parent().parent().children(".active").removeClass("active");
	$(obj).parent().addClass("active");
	if (spider=='daohang' || spider=='wenti' || spider=='wenti2')
	{addTaskDisplay(1);}
	else if (spider=='dangan' || spider=='tedian' || spider=='biaoren'|| spider=='biaodi' )
	{addTaskDisplay(2);}
	else if (spider=='pingji')
	{addTaskDisplay(3);}
	else if (spider=='pingji2')
	{addTaskDisplay(8);}
	else if (spider=='shuju')
	{addTaskDisplay(12);}
	else if (spider=='xinwen' || spider=='wenti' || spider=='')
	{addTaskDisplay(4);}
	else if (spider=='baoguang' )
	{addTaskDisplay(5);}
	else if (project=='weidai' && spider=='toubiao' )
	{addTaskDisplay(6);}
	else if (spider=='investrecord' )
	{addTaskDisplay(2);}
	else if (spider=='loanid' )
	{addTaskDisplay(6);}
	else if (spider=='product' )
	{addTaskDisplay(7);}
	else if (spider=='jiekuan')
	{addTaskDisplay(9);}
	else if (spider=='yuqi' )
	{addTaskDisplay(10);}
	else if (project=='enterprise' && spider=='toubiao')
	{addTaskDisplay(11);}
	else if (spider=='wangjia_news')
	{addTaskDisplay(5);}
	else if (project=='aif')
	{addTaskDisplay(11);}
	
	
}
//改变任务的显示样式
function addTaskDisplay(type)
{
	$('#none_div').hide();
	$('#from_to_id_div').hide();
	$('#newst_month_div').hide();
	$('#category_div').hide();
	$('#start_end_page_id_div').hide();
	$('#jsessionid_div').hide();
	$('#from_to_time_div').hide();
	$('#plat_select_div').hide();
	$('#plat_status_div').hide();
	$('#cache_div').hide();
	switch(type)
	{
	case 1:
	  $('#none_div').show();
	  break;
	case 2:
	  $('#from_to_id_div').show();
	  break;
	case 3:
	  setMonth();
	  $('#newst_month_div').show();
	  $('#from_to_id_div').show();
	  break;
	case 4:
	  $('#cache_div').show();
	  break;
	case 5:
	  $('#from_to_id_div').show();
	  $('#category_div').show();
	  break;
	case 6:
	  $('#start_end_page_id_div').show();
	  break;
	case 7:
	  $('#start_end_page_id_div').show();
	  $('#jsessionid_div').show();
	  break;
	case 8:
	  setMonth();
	  $('#newst_month_div').show();
	  $('#cache_div').show();
	  break;
	case 9:
	  getPlatInfo();
	  $('#from_to_time_div').show();
	  $('#plat_select_div').show();
	  $('#plat_status_div').show();
	  break;
    case 10:
      getPlatInfo();
	  $('#plat_select_div').show();
	  break;
    case 11:
  	  getPlatInfo();
  	  $('#from_to_time_div').show();
  	  $('#plat_select_div').show();
  	  break;
    case 12:
      $('#from_to_time_div').show();
      break;
	}
}

function setMonth() { 
	var first=0;
	var myDate = new Date();
	var year = myDate.getFullYear();
	var month = myDate.getMonth()+1;
	var tbody="";
	var nbody="";
	var count=1;
	while(!(year==2015&&month==8))
	{
		count++;
		month--;
		if(month==0)
		{
			month=12;
			year--;
		}
	}
	count++;
	year = myDate.getFullYear();
	month = myDate.getMonth()+1;
	while(count!=1)
	{
		if(first==1)
		{
			tbody+="<option value="+count+" >"+year+"年"+paddNum(month)+"月</option>";
			nbody+="<option value="+year+paddNum(month)+" >"+year+"年"+paddNum(month)+"月</option>";
		}
		else
			first=1;
		count--;
		month--;
		if(month==0)
		{
			month=12;
			year--;
		}
	}
	tbody+="<option value='1' >0000年00月</option>";
	$("#newst_month").html(nbody);
} 

//1位补0
var paddNum = function(num){
    num += "";
    return num.replace(/^(\d)$/,"0$1");
};

//从Java后台获得开发接口的平台
function getPlatInfo(){
	// 获得加盟企业信息
	$.ajax({
        type: "GET",
        url: ctx+'/admin/data/spiderManage/listPlat', 
        data: {},
        beforeSend: function() {},
        success: function(data) {
        	plats=data["plats"];
        	console.log(plats);
        	var content_plats = '';
        	for (var i=0;i<plats.length;i++)
        	{
        		content_plats += '<tr><td id="'+plats[i]["id"]+'">'+plats[i]["pname"]+'</td><td> <a type="button" onclick="choosePlat(this)" href="javascript:void(0)" class="btn btn-info btn-block"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span>&nbsp;爬取</a></td></tr>';
        	}
        	$('#platlist_add').html(content_plats);
        }
    });
}


//选择平台
function choosePlat(obj)
{
	url_id = $(obj).parent().parent().children(0).attr("id");
	// alert(url_id);
	$(obj).parent().parent().parent().children().children().children("a").removeClass("btn-danger");
	$(obj).parent().parent().parent().children().children().children("a").addClass("btn-info");
	$(obj).parent().parent().parent().children().children().children("a").html('<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>&nbsp;爬取');
	$(obj).removeClass("btn-info");
	$(obj).addClass("btn-danger");
	$(obj).html('<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>&nbsp;选中');
	
}