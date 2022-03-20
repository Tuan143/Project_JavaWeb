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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css">
        <link rel="stylesheet" href="css/product.css">
        <title>Product</title>
    </head>
    <body>
        <jsp:include page="Header.jsp"></jsp:include>
            <div class="container">
                <div class="left-slide">
                    <h4 style="margin-top: 10px">Phân loại</h4>
                    <ul class="category-style">
                        <li class="${categoryId > 0 ? "" : "active-category"}">
                        <a href="product">Sản Phẩm Nổi Bật</a>
                    </li>
                    <c:forEach items="${listCategory}" var="category">
                        <li class="${categoryId == category.id ? "active-category" : ""}">
                            <a href="category?categoryId=${category.id}">${category.name}</a>
                        </li>
                    </c:forEach>
                </ul>
            </div>
            <div>
                <h4>Danh sách sản phẩm <span class="text-danger">${message}</span></h4>
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
            <c:if test="${maxPage > 1}">
                <div class="container">

                    <ul class="pagination mt-3" style="justify-content: center">

                        <!--Button back page-->
                        <li class="page-item ${pageIndex == 1 ? "d-none" : ""}">
                            <c:if test="${categoryId > 0}">
                                <a class="page-link active" href="category?pageIndex=${backPage}&categoryId=${categoryId}"><--</a>
                            </c:if>
                            <c:if test="${categoryId == 0}">
                                <a class="page-link" href="product?pageIndex=${backPage}"><--</a>
                            </c:if>
                        </li>

                        <!--page number-->
                        <c:forEach begin="1" end="${maxPage}" step="1" var="pageNumber">
                            <li class="page-item ${pageNumber == pageIndex ? "active e-none" : ""}">
                                <c:if test="${categoryId > 0}">
                                    <a class="page-link active" href="category?pageIndex=${pageNumber}&categoryId=${categoryId}">${pageNumber}</a>
                                </c:if>
                                <c:if test="${categoryId == 0}">
                                    <a class="page-link active" href="product?pageIndex=${pageNumber}">${pageNumber}</a>
                                </c:if>
                            </li>
                        </c:forEach>

                        <!--Button next page-->
                        <li class="page-item ${pageIndex == maxPage ? "d-none" : "" }">
                            <c:if test="${categoryId > 0}">
                                <a class="page-link active" href="category?pageIndex=${nextPage}&categoryId=${categoryId}">--></a>
                            </c:if>
                            <c:if test="${categoryId == 0}">
                                <a class="page-link" href="product?pageIndex=${nextPage}">--></a>
                            </c:if>
                        </li>
                    </ul>
                </div>
            </c:if>
        </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
