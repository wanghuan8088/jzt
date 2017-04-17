<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String v = request.getParameter("v");
    if (v==null) {v="";}
%>
<ul class="sidebar-menu">
    <li class="header">导航</li>
    <!-- Optionally, you can add icons to the links -->

    <li class="treeview">
        <a href="#">
            <i class="fa fa-user-secret"></i>
            <span>管理员管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>

        <ul  <% if(v.equals("admin_menu")) {%> class="treeview-menu menu-open" style="display: block;" <%}else{ %> class="treeview-menu" <%} %> >
            <li id="admin_menu" <% if(v.equals("admin_menu")) {%> class="active" <%} %> ><a href="/jzt-admin/view/admin/adminList.jsp?v=admin_menu"><i class="fa fa-circle-o"></i> 账户管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 权限管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 日志管理</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-user"></i>
            <span>用户管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul  <% if(v.equals("user_menu")) {%> class="treeview-menu menu-open" style="display: block;" <%}else{ %> class="treeview-menu" <%} %> >
            <li id="user_menu" <% if(v.equals("user_menu")) {%> class="active" <%} %> ><a href="/jzt-admin/view/user/userList.jsp?v=user_menu"><i class="fa fa-circle-o"></i> 用户</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 短信验证码</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 权限管理</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-newspaper-o"></i>
            <span>新闻管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul  <% if(v.equals("news_menu")) {%> class="treeview-menu menu-open" style="display: block;" <%}else{ %> class="treeview-menu" <%} %> >
            <li id="news_menu" <% if(v.equals("news_menu")) {%> class="active" <%} %> ><a href="/jzt-admin/view/news/newsList.jsp?v=news_menu"><i class="fa fa-circle-o"></i> 新闻</a></li>
            <li id="news_type_menu"><a href="#"><i class="fa fa-circle-o"></i> 新闻类别管理</a></li>
        </ul>
    </li>


    <li class="treeview">
        <a href="#">
            <i class="fa fa-tachometer"></i>
            <span>平台运营数据</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu">
            <li><a href="/jzt-admin/view/starter.jsp"><i class="fa fa-circle-o"></i> 平台统计数据管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 平台第三方评级管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 平台每日运营数据管理</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-apple"></i>
            <span>APP内容管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu" >
            <li class="active"><a href="/jzt-admin/view/starter.jsp"><i class="fa fa-circle-o"></i> 轮播广告图管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 推广平台管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 热门新闻管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 热门平台管理</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-area-chart"></i>
            <span>平台访问管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu" >
            <li class="active"><a href="/jzt-admin/view/starter.jsp"><i class="fa fa-circle-o"></i> 每日访问量管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 每周访问量管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 每月访问量管理</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-bolt"></i>
            <span>曝光管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
           <ul  <% if(v.equals("news_menu")) {%> class="treeview-menu menu-open" style="display: block;" <%}else{ %> class="treeview-menu" <%} %> >
            <li id="exposureList_menu" <% if(v.equals("exposureList_menu")) {%> class="active" <%} %> ><a href="/jzt-admin/view/exposure/exposureList.jsp?v=exposureList_menu"><i class="fa fa-circle-o"></i>曝光信息列表</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 曝光信息审核</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-info-circle"></i>
            <span>信息管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu" >
            <li class="active"><a href="/jzt-admin/view/starter.jsp"><i class="fa fa-circle-o"></i> 信息管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 曝光预警</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-file-pdf-o"></i>
            <span>报告管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu" >
            <li class="active"><a href="/jzt-admin/view/starter.jsp"><i class="fa fa-circle-o"></i> 平台报告</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 第三方报告</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-bell-slash-o"></i>
            <span>敏感词管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul <% if(v.equals("sensitiveword_menu")) {%> class="treeview-menu menu-open" style="display: block;" <%}else{ %> class="treeview-menu" <%} %> >
            <li class="active"><a href="/jzt-admin/view/sensitiveword/sensitivewordList.jsp?v=sensitiveword_menu"><i class="fa fa-circle-o"></i> 敏感词管理</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-bank"></i>
            <span>银行平台管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu" >
            <li class="active"><a href="/jzt-admin/view/starter.jsp"><i class="fa fa-circle-o"></i> 银行理财能力</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 银行财务报告</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 银行基本信息</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 理财产品标的</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> 银行类型管理</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-balance-scale"></i>
            <span>P2P平台管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu" >
            <li class="active"><a href="/jzt-admin/view/starter.jsp"><i class="fa fa-circle-o"></i> P2P标的管理</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i> P2P平台管理</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-life-buoy"></i>
            <span>平台辅助管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul <% if(v.equals("state_menu") || v.equals("tag_menu") || v.equals("safeCert_menu")) {%> class="treeview-menu menu-open" style="display: block;" <%}else{ %> class="treeview-menu" <%} %> >
            <li id="state_menu" <% if(v.equals("state_menu")) {%> class="active" <%} %>><a href="/jzt-admin/view/platSupport/stateList.jsp?v=state_menu"><i class="fa fa-circle-o"></i> 平台状态管理</a></li>
            <li id="tag_menu" <% if(v.equals("tag_menu")) {%> class="active" <%} %>><a href="/jzt-admin/view/platSupport/tagList.jsp?v=tag_menu"><i class="fa fa-circle-o"></i> tag汇总管理</a></li>
            <li id="safeCert_menu" <% if(v.equals("safeCert_menu")) {%> class="active" <%} %>><a href="/jzt-admin/view/platSupport/safeCertList.jsp?v=safeCert_menu"><i class="fa fa-circle-o"></i> 安全认证管理</a></li>
        </ul>
    </li>

    <li class="treeview">
        <a href="#">
            <i class="fa fa-map-pin"></i>
            <span>地理位置管理</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
        <ul class="treeview-menu">
            <li class="active"><a href="/jzt-admin/view/position/provinceList.jsp"><i class="fa fa-circle-o"></i> 省份表管理</a></li>
            <li><a href="/jzt-admin/view/position/cityList.jsp"><i class="fa fa-circle-o"></i> 城市管理</a></li>
        </ul>
    </li>

</ul>

<script type="text/javascript">


</script>
