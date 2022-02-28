<%-- 
    Document   : Product
    Created on : Feb 28, 2022, 9:06:15 PM
    Author     : Tún ^^
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
        <link rel="stylesheet" href="css/product.css">
        <title>Product</title>
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>
            <div class="container">
                <div class="row">
                    <div class="col-md-3 left-slide">
                        <h4>Phân loại sản phẩm</h4>
                        <hr>
                        <ul class="category-style">
                            <li>
                                <a href="#">Apple</a>
                            </li>
                            <li>
                                <a href="#">Samsung</a>
                            </li>
                            <li>
                                <a href="#">Xiaomi</a>
                            </li>
                            <li>
                                <a href="#">Oppo</a>
                            </li>
                            <li>
                                <a href="#">Realme</a>
                            </li>
                            <li>
                                <a href="#">Nokia</a>
                            </li>
                        </ul>
                    </div>
                    <div class="col-md-9">
                        <h4>Danh sách sản phẩm</h4>
                        <hr>
                    </div>
                </div>
            </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
