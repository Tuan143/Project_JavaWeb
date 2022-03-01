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
                        <div class="col-3">
                            <div class="card">
                                <img class="card-img-top" src="image/Iphone/iphone_13-_pro-5_4.jpg" alt="Iphone13_ProMax">
                                <div class="card-body">
                                    <h4 class="card-title">Iphone13_ProMax</h4>
                                    <p class="card-text">Giá 30.000.000 VND</p>
                                    <a href="#" class="btn btn-primary">Chi tiết sản phẩm</a>
                                </div>
                            </div>
                        </div>
                        <div class="col-3">
                            <div class="card">
                                <img class="card-img-top" src="image/Iphone/iphone_13-_pro-1_2.webp" alt="Iphone13_Pro">
                                <div class="card-body">
                                    <h4 class="card-title">Iphone13_Pro</h4>
                                    <p class="card-text">Giá 25.000.000 VND</p>
                                    <a href="#" class="btn btn-primary">Chi tiết sản phẩm</a>
                                </div>
                            </div>
                        </div>
                        <div class="col-3">
                            <div class="card">
                                <img class="card-img-top" src="image/Iphone/iphone_12_pro_max_blue.webp" alt="Iphone13">
                                <div class="card-body">
                                    <h4 class="card-title">Iphone13</h4>
                                    <p class="card-text">Giá 20.000.000 VND</p>
                                    <a href="#" class="btn btn-primary">Chi tiết sản phẩm</a>
                                </div>
                            </div>
                        </div>
                        <div class="col-3">
                            <div class="card">
                                <img class="card-img-top" src="image/Iphone/iphone_12_mini_purple.webp" alt="Iphone13_Mini">
                                <div class="card-body">
                                    <h4 class="card-title">Iphone13_Mini</h4>
                                    <p class="card-text">Giá 15.000.000 VND</p>
                                    <a href="#" class="btn btn-primary">Chi tiết sản phẩm</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
