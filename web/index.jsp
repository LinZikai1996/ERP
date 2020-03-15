<%--
  Created by IntelliJ IDEA.
  User: linzikai
  Date: 2020/3/7
  Time: 下午3:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
    index file
    <form id="center-right-loginform" action="administrator/login" method="post">
        <div class="form-group">
            <label for="InputstudentNumber">用户学号</label>
            <input type="text" class="form-control" id="InputstudentNumber" placeholder="请输入学号" name="administratorName">
        </div>
        <div class="form-group">
            <label for="InputPassword">用户密码</label>
            <input type="password" class="form-control" id="InputPassword" placeholder="请输入密码" name="password">
        </div>
        <br />
        <center><button type="submit" class="btn btn-success form-control">登录</button></center>
        <br /><br />
        <center><p class="help-block" id="messageText">欢迎使用</p></center>
    </form>
</h1>

</body>
</html>
