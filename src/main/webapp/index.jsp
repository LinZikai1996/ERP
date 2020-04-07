<%--
  Created by IntelliJ IDEA.
  User: linzikai
  Date: 2020/3/7
  Time: 下午3:14
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>sign in</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/view/css/bootstrap.min.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/view/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/view/js/bootstrap.min.js"></script>

    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/view/css/index.css" rel="stylesheet">

</head>

<body>

    <div class="container">

        <form class="form-signin" action="${pageContext.request.contextPath}/administrator/login.do" method="post">
            <h2 class="form-signin-heading">Please sign in</h2>
            <label for="administratorName" class="sr-only">Administrator</label>
            <input name="administratorName" type="text" id="administratorName" class="form-control" placeholder="administrator" required autofocus>
            <label for="inputPassword" class="sr-only">Password</label>
            <input name="password" type="password" id="inputPassword" class="form-control" placeholder="password" required>
            <div class="checkbox">
                <label>
                    <input type="checkbox" value="remember-me"> Remember me
                </label>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        </form>
    </div>
</body>
</html>
