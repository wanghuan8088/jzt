<%--
  Created by IntelliJ IDEA.
  User: Javy
  Date: 2017/4/18
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="box box-primary box-platform" >
    <div class="box-header with-border" onclick="showPlatform()">
        <h3 class="box-title">平台基本信息</h3>
    </div>

    <form role="form " class="platform" style="display: none">
        <!-- text input -->
        <div class="form-group">
            <label>平台id</label>
            <input type="text" id="id" class=" form-control" readonly="true">
        </div>
        <div class="form-group">
            <label>平台类型</label>
            <input type="text" id="type" class=" form-control" placeholder="请输入 ...">
        </div>
        <div class="form-group">
            <label>平台名称</label>
            <input type="text" id="name" class=" form-control" placeholder="请输入 ...">
        </div>
        <div class="form-group">
            <label>曾用名</label>
            <input type="text" id="nameBefore" class=" form-control" placeholder="请输入 ...">
        </div>
        <div class="form-group">
            <label>平台状态</label>
            <select class="form-control" name="state" id="state"  onchange="showMsg(this)">
            </select>
        </div>
        <div class="">
            <label>平台图标</label><br>
            <img id="icon" class="" width="150">
        </div>
        <div class="form-group">
            <label>上线时间</label>
            <input type="text" id="startTime" class=" form-control" placeholder="请输入 ...">
        </div>
        <div class="form-group">
            <label>跑路企业倒闭时间</label>
            <input type="text" id="endTime" class=" form-control" placeholder="请输入 ...">
        </div>
        <div class="form-group">
            <label>省份</label>
            <select class="form-control" name="province" id="province"  onchange="fillCityOption(this)">
            </select>
        </div>
        <div class="form-group">
            <label>城市</label>
            <select class="form-control" name="city" id="city"  onchange="showMsg(this)">
            </select>
        </div>
        <div class="form-group">
            <label>所属公司</label>
            <select class="form-control" name="company" id="company"  onchange="showMsg(this)">
            </select>
        </div>
        <div class="box-footer">
            <button type="button" class="btn btn-primary" >提交</button>
        </div>
    </form>

</div>
