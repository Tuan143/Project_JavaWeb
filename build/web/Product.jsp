<%-- 
    Document   : Product
    Created on : Feb 28, 2022, 9:06:15 PM
    Author     : Tún ^^
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
                <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
                <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<!--        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css">-->
        <link rel="stylesheet" href="css/product.css">
        <title>Product</title>
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>
            <div class="container">
                <div class="left-slide">
                    <h4 style="margin-top: 10px">Phân loại</h4>
                    <ul class="category-style">
                        <li>
                            <a href="#" data-href="">Apple</a>
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
                <div>
                    <h4>Danh sách sản phẩm</h4>
                    <div class="row">
                    <c:forEach items="${listProduct}" var="product">
                        <div class="col-3">
                            <div class="card" >
                                <img class="card-img-top" src="${product.imageLink}" alt="Iphone13_ProMax">
                                <div class="card-body" style="height: 200px">
                                    <p class="card-title">${product.name}</p>
                                    <p class="card-text" >${product.price}</p>
                                    <a href="#" class="btn btn-primary">Chi tiết sản phẩm</a>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
            <!--Phan trang-->
            <div class="container">
                <ul class="pagination mt-3" style="justify-content: center">
                    <li class="page-item"><a class="page-link" href="#">Previous</a></li>
                    <li class="page-item active"><a class="page-link" href="#">1</a></li>
                    <li class="page-item"><a class="page-link" href="#">2</a></li>
                    <li class="page-item"><a class="page-link" href="#">3</a></li>
                    <li class="page-item"><a class="page-link" href="#">Next</a></li>
                </ul>
            </div>
        </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
