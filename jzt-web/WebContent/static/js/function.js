function newslistshow(type_id) {
    $("#type_id").val(type_id);
    //  姜正峤注释修改
    //	$("#typePageForm").submit();
    //window.location.href = "/news-"+type_id+"-1.html";
    window.open("/news-" + type_id + "-1.html", "_blank");
}
//判断提交搜索框
function CheckSearchKey(obj, str) {
    if (document.getElementById(obj).value == ""
        || document.getElementById(obj).value == document
            .getElementById(obj).defaultValue) {
        document.getElementById(obj).focus();
        return false;
    }

}

// 设为首页
function SetHome(obj, vrl) {
    vrl = "http://www.wangdaizhijia.com/";
    try {
        obj.style.behavior = 'url(#default#homepage)';
        obj.setHomePage(vrl);
    } catch (e) {
        if (window.netscape) {
            try {
                netscape.security.PrivilegeManager
                    .enablePrivilege("UniversalXPConnect");
            } catch (e) {
                alert("此操作被浏览器拒绝！\n请在浏览器地址栏输入“about:config”并回车\n然后将 [signed.applets.codebase_principal_support]的值设置为'true',双击即可。");
            }
            var prefs = Components.classes['@mozilla.org/preferences-service;1']
                .getService(Components.interfaces.nsIPrefBranch);
            prefs.setCharPref('browser.startup.homepage', vrl);
        } else {
            alert("请检查您是否安装了以下软件——360安全卫士、金山卫士、QQ电脑管家、金山毒霸。如已安装，请参考软件中的浏览器设置主页的方法进行设置。");
            //alert("您的浏览器不支持，请按照下面步骤操作：1.打开浏览器设置。2.点击设置网页。3.输入：" + vrl + "点击确定。");
        }
    }
}

// 加入收藏
function AddFavorite(type) {
    /*
     * if(type){ var sURL = "http://www.wangdaizhijia.com/"; }else{
     *  }
     */
    var sURL = window.location.href;

    var sTitle = "网贷之家";
    try {
        window.external.addFavorite(sURL, sTitle);
    } catch (e) {
        try {
            window.sidebar.addPanel(sTitle, sURL, "");
        } catch (e) {
            alert("加入收藏失败，请使用Ctrl+D进行添加");
        }
    }
}
// 收藏
function AddNewsFavorite(title) {
    var sURL = window.location.href;

    var sTitle = "网贷之家-" + title;
    try {
        window.external.addFavorite(sURL, sTitle);
    } catch (e) {
        try {
            window.sidebar.addPanel(sTitle, sURL, "");
        } catch (e) {
            alert("加入收藏失败，请使用Ctrl+D进行添加");
        }
    }
}
// 评级检索用
function p2pPlatSearch() {
    var search = $("#sel1").val();
    //var sel2 = $("#sel2").val();
    //var sel3 = $("#sel3").val();
    //window.open("http://www.touzhijia.com/indexs.jsp?sGrade="+sel1+"&inOverall="+sel2+"&inTime="+sel3, '_blank', 'height=800,width=1200,toolbar=yes,menubar=yes,scrollbars=yes, resizable=yes,location=yes, status=yes');
    var param = '';
    if (search == "1") {
        param = '?grade=1&overall=2';
    } else if (search == "2") {
        param = '?grade=1';
    } else if (search == "3") {
        param = '?overall=1';
    }
    window.open("http://www.touzhijia.com/platform" + param, '_blank');
}
// 判断字符长度////////////////////////////////
function onCharsChange(varField, n, inputName) {
    // 替换全角数字字符
    // FormatBidPrice(varField);
    var leftChars = getLeftChars(varField, n);
    if (leftChars >= 0) {
        OutMsg(inputName, inputName + "Div", n + "字以内，还可以写" + leftChars + " 字");
        return true;
    } else {
        var len = document.getElementById(inputName).value.length + leftChars;
        document.getElementById(inputName).value = document
            .getElementById(inputName).value.substring(0, len);
        leftChars = getLeftChars(document.getElementById(inputName), n);
        if (leftChars >= 0) {
            OutMsg(inputName, inputName + "Div", n + "字以内，还可以写" + leftChars
            + " 字");
        }
        return false;
    }
}
function getLeftChars(varField, cap) {
    var counter = 0;
    var leftchars = cap - varField.value.length;
    return (leftchars);
}
var leftchars;
function getReplyNum(varField, n, inputName) {
    var str = /^[\u4E00-\u9FA5\uF900-\uFA2D]*$/;
    var isch;
    if (str.test(document.getElementById(varField).value)) {
        isch = 2;
    } else {
        isch = 1;
    }
    if (null == leftchars) {
        leftchars = n - isch;
    } else {
        leftchars = leftchars - isch;
    }
    if (leftchars >= 0) {
        document.getElementById(inputName).innerHTML = "你还可以输入 " + leftchars
        + " 字";
        return true;
    } else {
        document.getElementById(varField).value = document
            .getElementById(varField).value.substring(0, n);
        return false;
    }
}
function addViewCount() {
    var newsid = $("#newsId").val();
    var uid = $("#uid").val();
    var username = $("#username").val();
    $.ajax({
        url: "/front_news-update-hits",
        data: {
            "newsId": newsid,
            "uid": uid,
            "username": username
        },
        type: "POST",
        async: false,
        dataType: "text",
        success: function (data) {
            //$("#hits").text(data.hits);
            $("#recommend").text(data);
        }
    });
}
var recommend_flag = true;
function recommend() {
    var newsid = $("#newsId").val();
    if (recommend_flag) {
        $.ajax({
            url: "/front_news-update-recommend",
            data: {"newsId": newsid},
            type: "POST",
            async: false,
            dataType: "text",
            success: function (data) {
                $("#recommend").text(data);
                $("#recommend").attr("href", "javascript:void(0);");
                recommend_flag = false;
            }
        });
    }
}
function newsReply() {

    var commentStatus = $("#comment_status_head").val();
    if (commentStatus == -1) {
        alert("您被禁止进行评论！");
        return false;
    }
    if (commentStatus == 0) {
        alert("新手用户无法评论，请认证手机或者提升论坛级别！");
        return false;
    }
    var newsid = $("#newsId").val();
    var replycontent = $("#replyContent").val();
    var uid = $("#uid").val();
    var username = $("#username").val();
    if (replycontent == '') {
        alert('评论内容不能为空！');
        return;
    }
    $.ajax({
        url: "/front_news-reply-add",
        data: {
            "newsId": newsid,
            "replyContent": replycontent,
            "uid": uid,
            "username": username
        },
        type: "POST",
        async: false,
        datatype: "text",
        success: function (data) {
            if (data == "1") {
                alert("评论成功！");
                setCookie(COOKIE_CANGBAOTU + "_" + uid + "_" + SOURCE, 1);
                $("#replyContent").val("");
                window.location.reload();
            } else if (data == "0") {
                alert("您被禁止进行评论！");
            } else {
                alert("评论失败！");
            }
        }
    });
}
function getReplyList(news_id, current_page) {
    $.ajax({
        url: "/front_news-reply-list",
        data: {newsId: news_id, currentPage: current_page},
        type: "POST",
        async: false,
        datatype: "text",
        success: function (data) {
            data = data.replace(/[\r\n]/g, " ");
            var jsondata = eval('(' + data + ')');
            var commentDiv = $("div.o_comment");
            var reviewContent = '';
            $.each(jsondata, function (i, item) {
                if (item.reviewList.length > 0) {
                    $.each(item.reviewList, function (i, review) {
                        reviewContent += "<ul>";
                        reviewContent += "<li class=\"cmt_pic\"><a href=\"http://bbs.wangdaizhijia.com/?" + review.replyUserId + "\" target=\"_blank\"><img src=" + (review.replyUserName == '平台人员' ? "\"http://bbs.wangdaizhijia.com/uc_server/images/noavatar_middle.gif\"" : getUserFace(review.replyUserId, 'm')) + " onerror=\"javascript:this.src='" + getOnErrorUserFace("m") + "'\" width=\"38\" height=\"38\" /><label>" + review.replyUserName + "</label></a></li>";
                        reviewContent += "<li class=\"cmt_con\"><p class=\"cmt_time\">评论时间：" + review.replyDate + "<span>" + (item.rowCount - (item.page - 1) * 5 - i) + "楼</span></p>";
                        reviewContent += "<p>" + review.replyContent + "</p></li>"
                        reviewContent += "</ul>";
                        if (review.replyUserId == $("#uid").val()) {
                            HASREPLY = true;
                        }
                    });
                    var pg = new showPages('getReplyList', item.page, item.rowCount, news_id);
                    pg.pageCount = item.pageCount;
                    reviewContent += pg.getHtml();
                } else {
                    reviewContent += "<span>暂无记录！</span>";
                }
            });
            commentDiv.html(reviewContent);
        }
    });
}
function checkUserLogin(disabledObj, disabledObj2, showObj) {
    if ($("#uid").val() == '') {
        $("#" + disabledObj).attr("disabled", "disabled");
        $("." + disabledObj2).attr("disabled", "disabled");
        $("." + showObj).show();
    } else {
        $("#" + disabledObj).remove("disabled");
        $("." + disabledObj2).remove("disabled");
        $("." + showObj).hide();
    }
}

//档案加关注
function platFocus(platId) {

    checkBBSUserLogin(platId);
}

function checkFocus() {
    var uid = $("#uid").val();
    var username = $("#username").val();
    var platId = $("#platId").val();
    if (uid != '' && username != '') {
        $.ajax({
            url: "/front_check-platfocus",
            data: {
                "platId": platId,
                "uid": uid
            },
            type: "POST",
            async: false,
            datatype: "text",
            success: function (data) {
                if (data == "true") {
                    $("#focusBtn").attr("disabled", "disabled");
                }
            }
        });
    }
}

function checkBBSUserLogin(platId) {
    var username = $("#username").val();
    var uid = $("#uid").val();
    if (uid == '' || username == '') {
        //window.location.href =$("#referUrl").val();
        window.scroll(0, 0);
        $("#kaptchaImage").hide().attr("src", "/kaptcha/code?" + Math.floor(Math.random() * 100)).fadeIn();
        $('.log_wind').show();
    } else {
        $.ajax({
            url: "/front_platfocus",
            data: {
                "platId": platId,
                "uid": uid
            },
            type: "POST",
            async: false,
            datatype: "text",
            success: function (data) {
                if (data == "true") {
                    alert("关注成功!");
                    $("#focusBtn").attr("disabled", "disabled");
                } else {
                    alert("您已经关注该平台!");
                }
            }
        });
    }

}


function thirdPaymentReply() {
    var paymentId = $("#paymentId").val();
    var replycontent = $("#replyContent").val();
    var uid = $("#uid").val();
    var username = $("#username").val();
    if (replycontent == '') {
        alert('评论内容不能为空！');
        return;
    }
    $.ajax({
        url: "/front_third-payment-reply-add",
        data: {
            "paymentId": paymentId,
            "replyContent": replycontent,
            "uid": uid,
            "username": username
        },
        type: "POST",
        async: false,
        datatype: "text",
        success: function (data) {
            if (data == "1") {
                alert("评论成功，请等待管理员审核！");
                $("#replyContent").val("");
            } else {
                alert("评论失败！");
            }
        }
    });
}
function supplierReply() {
    var supplierId = $("#supplierId").val();
    var replycontent = $("#replyContent").val();
    var uid = $("#uid").val();
    var username = $("#username").val();
    if (replycontent == '') {
        alert('评论内容不能为空！');
        return;
    }
    $.ajax({
        url: "/front_supplier-reply-add",
        data: {
            "supplierId": supplierId,
            "replyContent": replycontent,
            "uid": uid,
            "username": username
        },
        type: "POST",
        async: false,
        datatype: "text",
        success: function (data) {
            if (data == "1") {
                alert("评论成功，请等待管理员审核！");
                $("#replyContent").val("");
            } else {
                alert("评论失败！");
            }
        }
    });
}

function getCommonRight() {
    var news_type_id = $("#news_type_id").val();
    $.ajax({
        url: "/front_get-common-right",
        type: "POST",
        //async:false,
        dataType: "text",
        data: {"typeId": news_type_id},
        success: function (data) {
            var jsondata = eval(data);
            $.each(jsondata, function (i, item) {
                if (item.creditList.length > 0) {
                    var $bd = $(".sideRight .box .specialBd").eq(0);
                        $("div.topLine",$bd).html("<div class='picZhuan'><a href='"+item.creditList[0].htmlFileUrl+"'><img src='/wdzj"+item.creditList[0].picUrl+"' /></a></div><h2 class='title'><a target='_blank' href='"+item.creditList[0].htmlFileUrl+"' title='"+item.creditList[0].shortTitle+"'>"+item.creditList[0].shortTitle+"</a></h2><p class='gray'>"+item.creditList[0].summary+" </p>"+"<a class='more' target='_blank' href='"+item.creditList[0].htmlFileUrl+"'>[详细]</a>");
                        var $ul = $("ul.list",$bd);
                        if (item.creditList.length>1) $ul.empty();
                    $.each(item.creditList, function(i, credit){
                        if(i > 0){
                                $ul.append("<li><a title=\""+credit.title+"\" target=\"_blank\" href=\""
                                                +credit.htmlFileUrl+"\">"+credit.title+"</a></li>");
                        }
                    });
                } else {

                }
                if (item.linkList.length > 0) {
                    var $bd = $(".sideRight .box .specialBd").eq(0);
                    var $div = $("div.con", $bd);
                    if (item.linkList.length > 0) $div.empty();
                    $.each(item.linkList, function (i, link) {
                        $div.append("<a title=\"" + link.shortTitle + "\" " + (link.redFlg == 1 ? "class=red" : "") + " target=\"_blank\" href=\""
                        + link.htmlFileUrl + "\">" + link.shortTitle + "</a>");
                    });
                } else {

                }
                if (item.discussZtList.length > 0) {
                    var $bd = $(".sideRight .box .specialBd").eq(1);
                    $("div.topLine", $bd).html("<div class='pic'><a target='_blank' title='" + item.discussZtList[0].shortTitle + "' href='" + item.discussZtList[0].specialUrl + "'><img src='/wdzj" + item.discussZtList[0].picUrl9 + "'></a></div>"
                    + "<h2 class='title'><a target='_blank' title='" + item.discussZtList[0].shortTitle + "' href='" + item.discussZtList[0].specialUrl + "'>" + item.discussZtList[0].shortTitle + "</a></h2>"
                    + "<p class='gray'>" + item.discussZtList[0].summary + " </p>" + "<a class='more' target='_blank' href='" + item.discussZtList[0].specialUrl + "'>[详细]</a>");
                    var $ul = $("ul.list", $bd);
                    if (item.discussZtList.length > 1) $ul.empty();
                    $.each(item.discussZtList, function (i, discuss) {
                        if (i > 0) {
                            $ul.append("<li>·<a title=\"" + discuss.title + "\" target=\"_blank\" href=\""
                            + discuss.specialUrl + "\">" + discuss.title + "</a></li>");
                        }
                    });
                } else {

                }
                if (item.dialogZtList.length > 0) {
                    var $bd = $(".sideRight .box .specialBd").eq(2);
                    $("ul.videoUl", $bd).html("<li><a style='height:auto;' target='_blank' title='" + item.dialogZtList[0].shortTitle + "' href='" + item.dialogZtList[0].specialUrl + "'><img height=100 width=140 src='/wdzj" + item.dialogZtList[0].picUrl7 + "'  alt='" + item.dialogZtList[0].shortTitle + "'></a><a target='_blank' href='" + item.dialogZtList[0].specialUrl + "'>" + item.dialogZtList[0].shortTitle + "</a></li>");
                    $("ul.videoUl", $bd).append("<li><a style='height:auto;' target='_blank' title='" + item.dialogZtList[1].shortTitle + "' href='" + item.dialogZtList[1].specialUrl + "'><img height=100 width=140 src='/wdzj" + item.dialogZtList[1].picUrl7 + "'  alt='" + item.dialogZtList[1].shortTitle + "'></a><a target='_blank' href='" + item.dialogZtList[1].specialUrl + "'>" + item.dialogZtList[1].shortTitle + "</a></li>");
                    var $ul = $("ul.list", $bd);
                    if (item.dialogZtList.length > 2) $ul.empty();
                    $.each(item.dialogZtList, function (i, dialog) {
                        if (i > 1) {
                            $ul.append("<li><i class='icon'></i><a title=\"" + dialog.title + "\" target=\"_blank\" href=\""
                            + dialog.specialUrl + "\">" + dialog.title + "</a></li>");
                        }
                    });
                } else {

                }
                if (item.hotZtList.length > 0) {
                    var $bd = $(".sideRight .box .specialBd").eq(3);
                    $("div.pic", $bd).html("<a target='_blank' title='" + item.hotZtList[0].shortTitle + "' href='" + item.hotZtList[0].htmlFileUrl + "'><img src='/wdzj" + item.hotZtList[0].picUrl.replace("s_.", "s_10.") + "' alt='" + item.hotZtList[0].shortTitle + "'></a>");
                    var $ul = $("ul.list", $bd);
                    if (item.hotZtList.length > 1) $ul.empty();
                    $.each(item.hotZtList, function (i, hot) {
                        if (i > 0) {
                            $ul.append("<li>·<a title=\"" + hot.title + "\" " + (hot.redFlg == 1 ? "class=red" : "") + " target=\"_blank\" href=\""
                            + hot.htmlFileUrl + "\">" + hot.title + "</a></li>");
                        }
                    });
                } else {

                }
                if (item.day2HitList.length > 0) {
                    $("div.bd.t1 ul").empty();
                    $.each(item.day2HitList, function (i, news) {
                        var title = news.title.length > 20 ? news.title.substring(0, 20) : news.title;
                        $("div.bd.t1 ul").append("<li>" + (i < 3 ? "<i class='t" + (i + 1) + "'>" + (i + 1) + "</i>" : "<i>" + (i + 1) + "</i>") + "<a target=\"_blank\" href=\"" + news.htmlFileUrl + "\">" + title + "</a></li>");
                    });
                } else {

                }
                if (item.day2CmdList.length > 0) {
                    $("div.bd.t2 ul").empty();
                    $.each(item.day2CmdList, function (i, news) {
                        var title = news.title.length > 20 ? news.title.substring(0, 20) : news.title;
                        $("div.bd.t2 ul").append("<li>" + (i < 3 ? "<i class='t" + (i + 1) + "'>" + (i + 1) + "</i>" : "<i>" + (i + 1) + "</i>") + "<a target=\"_blank\" href=\"" + news.htmlFileUrl + "\">" + title + "</a></li>");
                    });
                } else {

                }
                if (item.weekHitList.length > 0) {
                    $("div.bd.w1 ul").empty();
                    $.each(item.weekHitList, function (i, news) {
                        var title = news.title.length > 20 ? news.title.substring(0, 20) : news.title;
                        $("div.bd.w1 ul").append("<li>" + (i < 3 ? "<i class='t" + (i + 1) + "'>" + (i + 1) + "</i>" : "<i>" + (i + 1) + "</i>") + "<a target=\"_blank\" href=\"" + news.htmlFileUrl + "\">" + title + "</a></li>");
                    });
                } else {

                }
                if (item.weekCmdList.length > 0) {
                    $("div.bd.w2 ul").empty();
                    $.each(item.weekCmdList, function (i, news) {
                        var title = news.title.length > 20 ? news.title.substring(0, 20) : news.title;
                        $("div.bd.w2 ul").append("<li>" + (i < 3 ? "<i class='t" + (i + 1) + "'>" + (i + 1) + "</i>" : "<i>" + (i + 1) + "</i>") + "<a target=\"_blank\" href=\"" + news.htmlFileUrl + "\">" + title + "</a></li>");
                    });
                } else {

                }
            });
        }
    });
}

var imgContent = [];
var tleContent = [];
var bottomLoad = false;
function getNewsBottom() {
    if (bottomLoad == false) {
        bottomLoad = true;
        $.ajax({
            url: "/front_news-bottom-list",
            type: "POST",
            //async: false,
            dataType: "text",
            success: function (data) {
                var jsondata = eval(data);
                $.each(jsondata, function (j, item) {
                    for (var idx = 0; idx < 7; idx++) {
                        imgContent[idx] = '';
                        tleContent[idx] = '';
                        if (item.imgNewsMap[idx]) {
                            $.each(item.imgNewsMap[idx], function (i, news) {
                                if (i < 2) {
                                    imgContent[idx] += "<a href=\"" + news.htmlFileUrl + "\"><img width=\"215\" height=\"140\" alt=\"" + news.shortTitle + "\" src=\"/wdzj" + news.picUrl.replace("s_.", "s_5.") + "\"></a>"
                                    + "<p></p><h2><a href=\"" + news.htmlFileUrl + "\">" + news.shortTitle + "</a></h2>";
                                }
                            });
                        }
                        if (item.tleNewsMap[idx]) {
                            $.each(item.tleNewsMap[idx], function (i, news) {
                                if (i == 0) {
                                    tleContent[idx] += "<h2><a class=\"cB\" href=\"" + news.htmlFileUrl + "\">" + news.title + "</a></h2>"
                                    + "<p>" + news.summary + "</p>";
                                } else {
                                    if (i == 1) {
                                        tleContent[idx] += "<ul>";
                                    } else if (item.tleNewsMap[idx].length > 4 && i == 4) {
                                        tleContent[idx] += "</ul><ul>";
                                    }
                                    tleContent[idx] += "<li><a href=\"" + news.htmlFileUrl + "\">" + news.title + "</a></li>";
                                    if (item.tleNewsMap[idx].length - 1 == i) {
                                        tleContent[idx] += "</ul>";
                                    }
                                }
                            });
                        } else {
                            tleContent[idx] = "<span>暂无记录！</span>";
                        }
                        $("div.imgNews").eq(idx).html(imgContent[idx]);
                        $("div.mainNews").eq(idx).html(tleContent[idx]);
                    }
                });
            }
        });
    }
}

function getUserFace(uid, size) {
    var imgpath = "http://bbs.wangdaizhijia.com/uc_server/data/avatar";
    var size_file = '';
    var type = '';
    if (size == 'm') {
        size_file = 'middle';
    } else if (size == 's') {
        size_file = 'small';
    } else {
        size_file = 'big';
    }
    var imgtypedir = get_avatar(uid, size_file, type);
    var faceurl = imgpath + "/" + imgtypedir;
    return faceurl;
}
function getOnErrorUserFace(size) {
    var size_file = '';
    if (size == 'm') {
        size_file = 'middle';
    } else if (size == 's') {
        size_file = 'small';
    } else {
        size_file = 'big';
    }
    return "http://bbs.wangdaizhijia.com/uc_server/images/noavatar_"
        + size_file + ".gif";
}
function get_avatar(uid, size, type) {
    var innersize = '';
    if (size == 'big' || size == 'middle' || size == 'small') {
        innersize = size;
    } else {
        innersize = 'middle';
    }
    var inneruid = leftAddZero(uid + "", 9);
    var dir1 = inneruid.substr(0, 3);
    var dir2 = inneruid.substr(3, 2);
    var dir3 = inneruid.substr(5, 2);
    var typeadd = (type == 'real') ? '_real' : '';
    return dir1 + '/' + dir2 + '/' + dir3 + '/' + inneruid.substr(-2) + typeadd
        + "_avatar_" + innersize + ".jpg";
}
function my_file_exists(file) {
    var x;
    try {
        if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera,
            // Safari
            x = new XMLHttpRequest();
        } else {// code for IE6, IE5
            x = new ActiveXObject("Microsoft.XMLHTTP");
        }
        x.open("GET", file, false);
        x.send();
        return x.status == 200;
    } catch (e) {
    }
    return false;
}
function leftAddZero(str, length) {
    if (str.length < length) {
        str = "0" + str;
        return leftAddZero(str, length);
    } else {
        return str;
    }
}


//到期还本息
function calcDQHBX(amount, time, rate, bonus) {
    //var result=(1/(1-(bonus/100)))*amount*(1+(rate/100)*(time/12));
    var result = amount * (1 + (rate / 100) * (time / 12)) + amount * (bonus / 100);
    return result;
}
//按月还本息
function calcAYHBX(amount, time, rate, bonus) {
    //月利率
    rate = rate / (100 * 12);
    //var result=((1/(1-(bonus/100)))*amount*rate*Math.pow((1+rate),time))/(Math.pow((1+rate),time)-1);
    var result = (amount * rate * Math.pow((1 + rate), time)) / (Math.pow((1 + rate), time) - 1);
    result = result * time + amount * (bonus / 100);
    return result;
}
//按季还本息
function calcAJHBX(amount, time, rate, bonus) {
    var size = time / 3;
    var result = 0;
    //amount=(1/(1-(bonus/100)))*amount;
    //月利率
    rate = rate / (100 * 12);
    for (var i = 0; i < size; i++) {
        //每一轮的前两个月还款利息
        var tmpA = amount * (1 - ((3 * i) / time)) * rate * 2;
        //每一轮的最后一个月还款金
        var tmpB = amount * (1 - ((3 * i) / time)) * rate + (3 / time) * amount;
        result += tmpA + tmpB;
    }
    result += amount * (bonus / 100);
    return result;
}
//到期还本息(日)
function calcDQHBXR(amount, time, rate, bonus) {
    //var result=(1/(1-(bonus/100)))*amount*(1+(rate/100)*(time/365));
    var result = amount * (1 + (rate / 100) * (time / 365)) + amount * (bonus / 100);
    return result;
}
function calc() {
    $("#sumAmount").text("0");
    $("#interest").text("0");
    if ($("#amount").val() == "") {
        alert("请输入投资金额!");
        return false;
    }
    if ($("#deadline").val() == "") {
        alert("请输入投入时长!");
        return false;
    }
    if ($("#interestRate").val() == "") {
        alert("请输入年化利率!");
        return false;
    }
    if ($("#repaymentType").val() == "") {
        alert("请选择还款方式!");
        return false;
    }
    var amount = parseInt($("#amount").val()); //金额
    var deadline = parseInt($("#deadline").val()); //月
    var interestRate = $("#interestRate").val();//利率
    var creditRate = $("#creditRate").val();//奖励
    var repaymentType = $("#rePayWaySelect1").val();
    var sumAmount = 0;
    var interest = 0;

    if ($("#amount").val() == "") {
        amount = 0;
    }

    if (creditRate == "") {
        creditRate = 0;
    }
    if (parseInt(creditRate) >= 100) {
        alert("奖励比率不能超过100!");
        $("#creditRate").val("");
        return false;
    }
    //creditRate=parseInt(creditRate);
    var result = "";
    var unitVal = $("#unitSelect").children('option:selected').val();
    if (unitVal == "1") {
        if (repaymentType == '1' && $("#interestRate").val() != "" && $("#deadline").val() != "") {
            result = calcDQHBX(amount, deadline, interestRate, creditRate);
        } else if (repaymentType == "2" && $("#interestRate").val() != "" && $("#deadline").val() != "") {
            result = calcAYHBX(amount, deadline, interestRate, creditRate);
        } else if (repaymentType == "3" && $("#interestRate").val() != "" && $("#deadline").val() != "") {
            if (deadline % 3 > 0) {
                alert("当还款方式为【按季还本息时】投入时长必须为3的整数倍!");
                return false;
            }
            result = calcAJHBX(amount, deadline, interestRate, creditRate);
        }
    } else {
        result = calcDQHBXR(amount, deadline, interestRate, creditRate);
    }
    $("#sumAmount").text(result.toFixed(2));
    $("#interest").text((result - amount).toFixed(2));
}

function cancelCalc() {
    $("#amount").val('');
    $("#deadline").val('');
    $("#interestRate").val('');
    $("#creditRate").val('');
    $("#repaymentType").val("0");
    $("#sumAmount").text('0');
    $("#interest").text('0');
}