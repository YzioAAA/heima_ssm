<%--
  Created by IntelliJ IDEA.
  User: YSK
  Date: 2019/7/29
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>权限</title>
<%--    <link rel="stylesheet" href="css/css.css" />--%>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        html{
            width: 100%;
            height: 100%;
        }
        body{
            /* width: 100%;
            height: 100%; */
            background-image: url("http://localhost:8080/heima_ssm_web/img/center.jpg");
            background-repeat: no-repeat;
            background-size: 100%;
            position: relative;
        }
        .fail{
            width: 400px;
            height: 400px;
            border-radius: 20px;
            background: rgba(255, 255, 255, .3);
            position: absolute;
            top: 175px;
            right: 10%;
        }
        .fa-h1{
            margin-top: 30px;
            text-align: center;
            font-weight: 400;
        }
        .fail p{
            margin-top: 40px;
            text-align: center;

        }
        #login-jump{
            text-decoration: none;
            color: black;
        }

        #login-jump:hover{
            text-decoration: underline;
            color: #1459da;
        }
    </style>
</head>
<body>
<div class="fail" id="loginfail">
    <h1 class="fa-h1">权限不足</h1>
    <p>将会在<span id="timing">05</span>秒后返回主页面</p>
    <p><a href="${pageContext.request.contextPath}/pages/main.jsp" id="login-jump" target="_self">若没有跳转，请点击</a></p>
</div>
<script>
    window.onload = function(){
        //清理计时器
        clearInterval(timeId);
        //获取计时对象
        var timObj = document.getElementById("timing");
        //计时数
        var num = 6;
        //设置定时器，用来计时
        var timeId = setInterval(function(){
            //每过一秒计时数减少一
            num--;
            timObj.innerText="0"+num;
            if(num==0){
                //当计时数为0时，清理定时器，并触发a标签的跳转事件
                clearInterval(timeId);
                document.getElementById("login-jump").click();
            }
        },1000)
    }
</script>
</body>
</html>
