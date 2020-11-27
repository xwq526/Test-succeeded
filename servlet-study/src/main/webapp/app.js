function load() {
    // alert("OK");
}

$(function () {//body加载完成再执行方法内的代码
    $("#btn").click(function () {//按钮绑定点击事件，每点击一次，执行方法
        $.ajax({//传入一个json对象
            type: "post",//请求方法
            url: "login.json",//请求的服务路径
            // contentType: "",请求数据的数据类型（头信息Content-Type）
            data: "username=abc&password=123",//表单数据类型的格式
            dataType: "json",//响应数据类型是application/json
            success: function (r) {//响应状态码200时，执行方法
                // alert(JSON.stringify(r))//json对象转字符串
                if(r.success){
                    let data = r.data;
                    let content = '';
                    for(let i in data){
                        content += "<p>"+data[i].title+"</p>";
                    }
                    $("#container").html(content)
                }else{
                    alert("登录失败")
                }
            }
        });
    })
})