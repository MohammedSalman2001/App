<%--
  Created by IntelliJ IDEA.
  User: salma
  Date: 8/8/2023
  Time: 2:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="assets/bootstrap-5.3.1-dist/css/bootstrap.min.css">
</head>

<body>
<%@include file="header.jsp" %>

<section class="container">
    <div class="row">
        <div class="col-12 col-md-6 col-lg-3">
            <div class="form-group">
                <label for="csId" class="form-label">Customer Id</label>
                    <input type="email" class="form-control" id="csId" aria-describedby="emailHelp">
            </div>
        </div>
        <div class="col-12 col-md-6 col-lg-3">
                <div class="form-group">
                    <label for="csName" class="form-label">Customer Name</label>
                    <input type="email" class="form-control" id="csName" aria-describedby="emailHelp">
                </div>
            </div>
        <div class="col-12 col-md-6 col-lg-3">
            <div class="form-group">
                <label for="csAddress" class="form-label">Customer Address</label>
                <input type="email" class="form-control" id="csAddress" aria-describedby="emailHelp">
            </div>
        </div>
        <div class="col-12 col-md-6 col-lg-3">
            <div class="form-group">
                <label for="csSalary" class="form-label">Customer Salary</label>
                <input type="email" class="form-control" id="csSalary" aria-describedby="emailHelp">
            </div>
        </div>
        <div class="col-12 mt-3">
            <div style="display: flex;justify-content: flex-end">
                <button type="submit" class="btn btn-primary btn-sm">Save Customer</button>
            </div>
        </div>

    </div>

    <div class="row mt-3">
        <table class="table table-hover table-primary">
            <tr>
                <td>#</td>
                <td>Name</td>
                <td>Address</td>
                <td>Salary</td>
                <td>Delete</td>
                <td>update</td>
            </tr>

        </table>
    </div>
</section>

<script src="assets/bootstrap-5.3.1-dist/js/bootstrap.min.js"></script>
</body>
</html>
