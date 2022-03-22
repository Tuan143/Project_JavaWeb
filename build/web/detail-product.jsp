<%-- 
    Document   : detail-product
    Created on : Mar 20, 2022, 10:48:22 PM
    Author     : Tún ^^
--%>

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
        <link rel="stylesheet" href="css/detail-product.css">

        <title>Chi tiết sản phẩm</title>
    </head>
    <body>
        <div id="fb-root"></div>
        <script async defer crossorigin="anonymous" src="https://connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v13.0" nonce="8vk7XYNM"></script>
        <jsp:include page="Header.jsp"></jsp:include>

            <div class="container">
                <div class="mt-3 mb-3">
                    <p><a href="#">Trang chủ</a> / Chi tiết sản phẩm</p>
                </div>
                <hr>
                <div class="row">
                    <!--Image-->
                    <div class="col-5 imgage-slide">
                        <div id="custCarousel" class="carousel slide" data-ride="carousel" align="center">
                            <!-- slides -->
                            <div class="carousel-inner">
                                <div class="carousel-item active"> <img src="https://i.imgur.com/weXVL8M.jpg" alt="Hills"> </div>
                                <div class="carousel-item"> <img src="https://i.imgur.com/Rpxx6wU.jpg" alt="Hills"> </div>
                                <div class="carousel-item"> <img src="https://i.imgur.com/83fandJ.jpg" alt="Hills"> </div>
                                <div class="carousel-item"> <img src="https://i.imgur.com/JiQ9Ppv.jpg" alt="Hills"> </div>
                            </div> <!-- Left right --> <a class="carousel-control-prev" href="#custCarousel" data-slide="prev"> <span class="carousel-control-prev-icon"></span> </a> <a class="carousel-control-next" href="#custCarousel" data-slide="next"> <span class="carousel-control-next-icon"></span> </a> <!-- Thumbnails -->
                            <ol class="carousel-indicators list-inline">
                                <li class="list-inline-item active"> <a id="carousel-selector-0" class="selected" data-slide-to="0" data-target="#custCarousel"> <img src="https://i.imgur.com/weXVL8M.jpg" class="img-fluid"> </a> </li>
                                <li class="list-inline-item"> <a id="carousel-selector-1" data-slide-to="1" data-target="#custCarousel"> <img src="https://i.imgur.com/Rpxx6wU.jpg" class="img-fluid"> </a> </li>
                                <li class="list-inline-item"> <a id="carousel-selector-2" data-slide-to="2" data-target="#custCarousel"> <img src="https://i.imgur.com/83fandJ.jpg" class="img-fluid"> </a> </li>
                                <li class="list-inline-item"> <a id="carousel-selector-2" data-slide-to="3" data-target="#custCarousel"> <img src="https://i.imgur.com/JiQ9Ppv.jpg" class="img-fluid"> </a> </li>
                            </ol>
                        </div>
                    </div>

                    <!--Infomation-->
                    <div class="col-7">
                        <div>
                            <h3>Tên sản phẩm</h3>
                            <p>Giá thị trường</p>
                            <div class="row">
                                <div class="col-4">
                                    <div class="input-group mb-4" style="width: 200px;">
                                        <span class="input-group-btn ">
                                            <button type="button" class="quantity-left-minus btn"  data-type="minus" data-field="">
                                                <i class="fas fa-minus"></i>
                                            </button>
                                        </span>
                                        <input type="number" id="quantity" name="quantity" class="form-control input-number" value="1" min="1" max="100" required>
                                        <input type="text" name="productId" value="${product.id}" hidden>
                                    <span class="input-group-btn ml-1">
                                        <button type="button" class="quantity-right-plus btn" data-type="plus" data-field="">
                                            <i class="fas fa-plus"></i>
                                        </button>
                                    </span>
                                </div>
                            </div>

                            <div class="col-8">
                                <button class="btn btn-warning">Thêm vào giỏ hàng</button>
                            </div>
                            <a href="#" class="fast-order btn btn-warning">
                                <div style="width: 300px;">
                                    <h4 class="text-white">Đặt hàng nhanh</h4>
                                    <span class="text-white">Điền thông tin ngắn gọn</span>
                                </div>
                            </a>
                        </div>
                    </div>
                </div>

            </div>
            <div>
                <ul class="nav nav-tabs">
                    <li class="nav-item">
                        <a class="nav-link active" data-toggle="tab" href="#home">Mô tả sản phẩm</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" data-toggle="tab" href="#menu1">Thông tin bổ sung</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" data-toggle="tab" href="#menu2">Đánh giá sản phẩm</a>
                    </li>
                </ul>

                <!-- Tab panes -->
                <div class="tab-content">
                    <div id="home" class="container tab-pane active"><br>
                        <h3>HOME</h3>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                    </div>
                    <div id="menu1" class="container tab-pane fade"><br>
                        <h3>Menu 1</h3>
                        <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                    </div>
                    <div id="menu2" class="container tab-pane fade"><br>
                        <div class="fb-comments" data-href="https://developers.facebook.com/docs/plugins/comments#configurator" data-width="" data-numposts="5"></div>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
