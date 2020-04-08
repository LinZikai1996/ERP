<%--
  Created by IntelliJ IDEA.
  User: Zikai
  Date: 08/04/2020
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="modal fade" id="addOrderList" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">添加订单</h4>
            </div>
            <div class="modal-footer">
                <form>
                    <label for="basic-url">Your vanity URL</label>
                    <div class="input-group">
                        <span class="input-group-addon" id="basic-addon3">
                            <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                        </span>
                        <input type="text" class="form-control" id="basic-url" aria-describedby="basic-addon3">
                    </div>
                    <div class="form-group">
                        <label for="CustomerName" style="left: auto">用户姓名</label>
                        <input id="CustomerName" type="text" class="form-control"  placeholder="用户姓名">
                    </div>
                    <div class="form-group">
                        <label for="OrderListTotal" style="left: auto">订单数目</label>
                        <input id="OrderListTotal" type="text" class="form-control"  placeholder="订单数目">
                    </div>
                    <button type="submit" class="btn btn-default">Submit</button>
                </form>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
</body>
</html>
