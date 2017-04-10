function loginAct() {
    $.ajax({
        url: "/wdzj/front/login",
        type: "POST",
        //async : false,
        datatype: "jsonp",
        success: function (data) {
            if (data == '' || data == null || data == '-1') {
                $("#username").val("");
                $("#username2").text("");
                $("#uid").val("");
                $("#status_head").val("");
                $("#is_plat_user_head").val("");
                $("#groupid_head").val("");
            } else {
                var jsonData = eval('(' + data + ')');
                $.each(jsonData, function (i, item) {
                    var username = decodeURIComponent(item.username);
                    $("#username").val(username);
                    $("#username2").text(username);
                    $("#username2").attr("title", decodeURIComponent(item.username));
                    $("#guanjiaLink").attr("href", "http://guanjia.wangdaizhijia.com/guanjia/regist/reg?username=" + item.username);
                    $("#uid").val(item.uid);
                    $("#status_head").val(item.status);
                    $("#comment_status_head").val(item.commentStatus);
                    $("#is_plat_user_head").val(item.isPlatUser);
                    $("#groupid_head").val(item.groupId);
                });
                $("#fr_1").hide();
                $("#fr_2").show();
                afterLogin();
            }
            if (typeof(afterLoginCheck) != 'undefined') {
                afterLoginCheck();
            }
        }
    });
}

function afterLogin() {
    if ($("p.no_log").length > 0) {
        $("#replyContent").removeAttr("disabled");
        $("#reviewContent").removeAttr("disabled");
        $(".btn_smt").removeAttr("disabled");
        $("p.no_log").hide();
    } else {
        $("p.no_log").show();
    }
    if (typeof(myNavList) != 'undefined') {
        myNavList();
    }
}

function ssoLogin(uid) {

    $.ajax({
        url: "/front/ssoLogin",
        data: {"uid": uid},
        type: "POST",
        async: false,
        success: function (data) {
            alert(data);
            document.write(data);
            //eval("("+data+")");
            //location.reload();
        }
    });
}
$(document).ready(function () {
    /*var interval1=setInterval(function(){
     loginAct();
     clearInterval(interval1);
     },1000);*/
    loginAct();
    var d = new Date();
    var sDt = d.getFullYear() + "" + d.getMonth() + "" + d.getDate() + "" + d.getHours();
    var url = "/wdzj/html/json/exponent.json" + "?v=" + sDt;
    $.ajax({
        url: url,
        type: "GET",
        async: false,
        dataType: 'json',
        success: function (data) {
            if (data == '' || data == null) {

            } else {
                var jsonData = eval(data);
                $("ul.data_info #turnover").html(jsonData.turnover);
                $("ul.data_info #exponent").html(jsonData.exponent);
                $("ul.data_info #outcount").html(jsonData.outcount);
                /*
                 * 姜正峤注释
                 * $.each(jsonData,function(i,item){
                 alert(item.turnover);
                 alert(item.exponent);
                 alert(item.outcount);
                 $("ul.data_info #turnover").html(item.turnover);
                 $("ul.data_info #exponent").html(item.exponent);
                 $("ul.data_info #outcount").html(item.outcount);
                 });
                 * */
            }
        }
    });
    $("#loginBtn").click(function () {
        var userName = $("#loginName").val();
        var passWord = $("#loginPassword").val();
        var code = $("#loginCode").val();
        if (userName == '') {
            shock();
            $("#error").text("用户名不能为空！");
            return;
        }
        if (passWord == '') {
            shock();
            $("#error").text("密码不能为空！");
            return;
        }
        if (code == '') {
            shock();
            $("#error").text("验证码不能为空！");
            return;
        }
        $.ajax({
            url: "/front/checkUser",
            data: {"userName": userName, "passWord": passWord, "code": code},
            type: "POST",
            //async : false,
            datatype: "text",
            success: function (data) {
                var jsonData = eval(data);
                $.each(jsonData, function (i, item) {
                    var error = item.error;
                    if (error == undefined) {
                        ssoLogin(item.uid);
                        //location.reload();
                    } else {
                        shock();
                        $("#kaptchaImage").hide().attr("src", "/kaptcha/code?" + Math.floor(Math.random() * 100)).fadeIn();
                        $("#error").text(error);
                    }
                });
            }
        });


    });
    //$("#kaptchaImage").hide().attr("src",  "/kaptcha/code?" + Math.floor(Math.random()*100)).fadeIn();
    //更换验证码
    $('#change_code').click(function () {
        $("#kaptchaImage").hide().attr("src", "/kaptcha/code?" + Math.floor(Math.random() * 100)).fadeIn();
    });

    //更换验证码
    $('#change_code2').click(function () {
        $("#kaptchaImage").hide().attr("src", "/kaptcha/code?" + Math.floor(Math.random() * 100)).fadeIn();
    });
    /*$("#log").toggle(
     function(){
     if($(".log_wind").is(":hidden")){
     $("#log").attr("style","background:#fff;color:#504f4f;");
     }else{
     $("#log").attr("style","");
     }
     $("#kaptchaImage").hide().attr("src",  "/kaptcha/code?" + Math.floor(Math.random()*100)).fadeIn();
     $(".log_wind").toggle(100);
     },
     function(){
     if($(".log_wind").is(":hidden")){
     $("#log").attr("style","background:#fff;color:#504f4f;");
     }else{
     $("#log").attr("style","");
     }
     $("#kaptchaImage").hide().attr("src",  "/kaptcha/code?" + Math.floor(Math.random()*100)).fadeIn();
     $(".log_wind").toggle(100);
     }
     );

     $("#log").mouseover(function(){
     if($(".log_wind").is(":hidden")){
     $("#kaptchaImage").hide().attr("src",  "/kaptcha/code?" + Math.floor(Math.random()*100)).fadeIn();
     }
     $(".log_wind").show(100);
     $("#log").attr("style","background:#fff;color:#504f4f;");

     });*/

    function stopPropagation(e) {
        if (e.stopPropagation)
            e.stopPropagation();
        else
            e.cancelBubble = true;
    }

    $(document).bind('click', function () {
        //$("#log").attr("style", "");
        $('.log_wind').css('display', 'none');
    });

    $('.log_wind').bind('click', function (e) {
        stopPropagation(e);
    });

    //登录回车处理
    $('#loginName').keydown(function (e) {
        if (e.keyCode == 13) {
            $("#loginBtn").click();
        }
    });
    $('#loginPassword').keydown(function (e) {
        if (e.keyCode == 13) {
            $("#loginBtn").click();
        }
    });
    $('#loginCode').keydown(function (e) {
        if (e.keyCode == 13) {
            $("#loginBtn").click();
        }
    });
    //模拟下拉框
    $(".dropDown_wdzj").each(function (index, el) {
        var o = $(el);
        var i = o.find(".dropBtn");
        var text = o.find(".putIn");
        var ul = o.find("ul");
        o.click(function () {
            ul.toggle();
        });
        text.click(function () {
            ul.toggle();
        });
        ul.find("li").click(function () {
            text.val($(this).text());
            ul.hide();
            return false;
        });
        $(document).click(function (e) {
            if (!$(e.target).parents().hasClass("dropDown")) {
                ul.hide();
            }
        });
    });

});

function loginOut() {
    $.ajax({
        url: "/front/clearCookie",
        type: "POST",
        //async : false,
        datatype: "text",
        success: function (data) {
            location.reload();
        }
    });

}

function shock() {
    var $panel = $("div.log_wind");
    var box_left = $('div.tnav_box').width() - ($("div.log_wind").width()) - 70;
    $panel.css({'left': box_left, 'position': 'absolute'});
    for (var i = 1; 3 >= i; i++) {
        $panel.animate({left: box_left - (40 - 10 * i)}, 120);
        $panel.animate({left: box_left + (40 - 10 * i)}, 120);
    }
}

function jumpLogin() {
    window.location.href = "http://bbs.wangdaizhijia.com/member.php?mod=logging&action=login&referer=" + window.location.href;
}
function jumpRegister() {
    window.location.href = "http://bbs.wangdaizhijia.com/member.php?mod=register&referer=" + window.location.href;
}