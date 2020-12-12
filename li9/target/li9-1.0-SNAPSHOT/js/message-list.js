$(function () {
    setTimeout(function () {
        $.get("message-list.json",function (data) {
            let tbody = $("tbody");
            for (i in data){
                let message = data[i];
                //message.id
                //message["id"]   这两个等价
                let html = "<tr>" +
                    "<td>" + message.id + "</td>" +
                    "<td>" + message.who + "</td>" +
                    "<td>" + message.when + "</td>" +
                    "<td>" + message.what + "</td>" +
                    "</tr>";
                tbody.append(html);
            }
        })
    },3000);
})