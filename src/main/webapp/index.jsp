<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <script src="/js/jquery.min.js"></script>
    <script>
        function submit() {
            var params={"username":"张三","password":"pwd","phone":["157156846248","135145625795"],"addresses":[{"street":"XX路","unit":"一单元","floor":5},{"street":"XX路","unit":"二单元","floor":15}]};
            $.ajax({
                url:"/receive/json.action",
                method: 'POST',//只能使用POST接受JSON数据
                contentType: 'application/json', // 这句不加出现415错误:Unsupported Media Type
                data: JSON.stringify(params), // 以json字符串方式传递
                success: function() {
                    console.log("success");
                },
                error: function() {
                    console.log("error");
                }
            });
        }
    </script>
</head>
<body>
<h2>Hello World!</h2>
<button onclick="submit()">提交JSON数据</button>
</body>
</html>
