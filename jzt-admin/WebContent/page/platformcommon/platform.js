/**
 * Created by Javy on 2017/4/18.
 */
function getPlatFormBasicInfo(id) {

    fillProvinceOption();
    fillStateOption();
    fillCompanyOption();
    $.ajax({
        url: '/jzt-api/rest/1/platform/detail/' + id,
        type: 'GET',
        async: true,
        cache: false,
        processData: false,
        success: function (responseStr) {

            $(".platform #id").val(responseStr.data.platform.id);
            $(".platform #name").val(responseStr.data.platform.name);
            $(".platform #type").val(responseStr.data.platform.type);
            $(".platform #nameBefore").val(responseStr.data.platform.nameBefore);
            $(".platform #state").val(responseStr.data.platform.state);
            $(".platform #icon").attr("src",responseStr.data.platform.icon);
            $(".platform #startTime").val(responseStr.data.platform.startTime);
            $(".platform #endTime").val(responseStr.data.platform.endTime);
            $(".platform #province").val(responseStr.data.platform.province);
            $(".platform #company").val(responseStr.data.platform.company);
            fillCityOption();
            $(".platform #city").val(responseStr.data.platform.city);

        },
        error: function (responseStr) {
            alert("error:" + JSON.stringify(responseStr));
        }
    });
}
function fillProvinceOption() {
    $.ajax({
        url: '/jzt-api/province/plist/0/40',
        type: 'GET',
        async: true,
        cache: false,
        processData: false,
        success: function (responseStr) {
            $(".platform #province").empty();
            $(".platform #province").append("<option value=0>请选择</option>");
            for (var one in responseStr.data.province)
            {
                var text = responseStr.data.province[one].name;
                var value = responseStr.data.province[one].id;
                $(".platform #province").append("<option value="+value+">"+text+"</option>");
            }

        },
        error: function (responseStr) {
            alert("error:" + JSON.stringify(responseStr));
        }
    });
}


function fillStateOption() {
    $.ajax({
        url: '/jzt-api/rest/v1/platSupport/stateList/0/10',
        type: 'GET',
        async: false,
        cache: false,
        processData: false,
        success: function (responseStr) {
            $(".platform #state").empty();
            $(".platform #state").append("<option value=0>请选择</option>");
            for (var one in responseStr.data.record)
            {
                var text = responseStr.data.record[one].description;
                var value = responseStr.data.record[one].id;
                $(".platform #state").append("<option value="+value+">"+text+"</option>");
            }

        },
        error: function (responseStr) {
            alert("error:" + JSON.stringify(responseStr));
        }
    });
}
function fillCompanyOption() {
    $.ajax({
        url: '/jzt-api/rest/1/company/list/0/10000',
        type: 'GET',
        async: false,
        cache: false,
        processData: false,
        success: function (responseStr) {
            $(".platform #company").empty();
            $(".platform #company").append("<option value=0>请选择</option>");
            for (var one in responseStr.data.company)
            {
                var text = responseStr.data.company[one].name;
                var value = responseStr.data.company[one].id;
                $(".platform #company").append("<option value="+value+">"+text+"</option>");
            }

        },
        error: function (responseStr) {
            alert("error:" + JSON.stringify(responseStr));
        }
    });
}
function fillCityOption() {
    var provinceId = $('.platform #province').val();
    $.ajax({
        url: '/jzt-api/rest/1/city/' + provinceId,
        type: 'GET',
        async: false,
        cache: false,
        processData: false,
        success: function (responseStr) {
            $(".platform #city").empty();
            $(".platform #city").append("<option value=0>请选择</option>");
            for (var one in responseStr.data.city)
            {
                var text = responseStr.data.city[one].name;
                var value = responseStr.data.city[one].id;
                $(".platform #city").append("<option value="+value+">"+text+"</option>");
            }

        },
        error: function (responseStr) {
            alert("error:" + JSON.stringify(responseStr));
        }
    });
}

$(".platform button").click(function () {
    var data=new Object();
    data.id = $(".platform #id").val();
    data.name = $(".platform #name").val();
    data.type = $(".platform #type").val();
    data.nameBefore = $(".platform #nameBefore").val();
    data.state = $(".platform #state").val();
    data.icon = $(".platform #icon").attr("src");
    data.startTime = $(".platform #startTime").val();
    data.endTime = $(".platform #endTime").val();
    data.province = $(".platform #province").val();
    data.company = $(".platform #company").val();
    data.city = $(".platform #city").val();

    var datafstr=JSON.stringify(data);
    var requestData = datafstr;

    $.ajax({
        url: '/jzt-api/rest/1/platform/edit/',
        type: 'POST',
        data: "para="+encodeURIComponent(requestData),
        async: true,
        cache: false,
        contentType: 'application/x-www-form-urlencoded',
        processData: false,
        success: function (responseStr) {
            alert("保存成功!");
        },
        error: function (responseStr) {
            alert("error:" + JSON.stringify(responseStr));
        }
    });

})