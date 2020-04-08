<%--
  Created by IntelliJ IDEA.
  User: Zikai
  Date: 17/03/2020
  Time: 20:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/view/css/bootstrap.min.css" />
    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/view/css/orderListManage.css" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.request.contextPath}/view/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/view/js/jquery-3.2.1.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Project name</a>
        </div>
        <jsp:include page="header.jsp"/>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <jsp:include page="left.jsp"/>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <h2 class="sub-header">订单信息</h2>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>序号</th>
                        <th>名字</th>
                        <th>订单个数</th>
                        <th>订单剩余</th>
                        <th>下单时间</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="orderLists" items="${orderLists}" varStatus="status">
                    <tr>
                        <td>${status.index + 1}</td>
                        <td>${orderLists.customer.name}</td>
                        <td>${orderLists.total}</td>
                        <td>${orderLists.remain}</td>
                        <td>${orderLists.date}</td>
                        <td>
                            <button type="button" class="btn btn-info">
                                <span class="glyphicon glyphicon-file" aria-hidden="true"></span>
                                &ensp;查&ensp;看</button>
                            <button type="button" class="btn btn-warning">
                                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
                                &ensp;修&ensp;改</button>
                            <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#warning">
                                <span class="glyphicon glyphicon-remove-sign" aria-hidden="true"></span>
                                &ensp;删&ensp;除</button>
                        </td>
                    </tr>
                    </c:forEach>
                    <tr>
                        <td>    </td>
                        <td>    </td>
                        <td>    </td>
                        <td>    </td>
                        <td>    </td>
                        <td>
                            <button type="button" class="btn btn-success" data-toggle="modal" data-target="#addOrderList">
                                <span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span>
                                &ensp;添&ensp;加
                            </button>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <jsp:include page="floatWindow/addOrderList.jsp"/>
    <jsp:include page="floatWindow/deleteOrderList.jsp"/>
</div>

</body>
</html>
