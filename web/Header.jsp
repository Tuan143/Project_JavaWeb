<%-- 
    Document   : Header
    Created on : Feb 26, 2022, 10:58:56 PM
    Author     : Tún ^^
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
            <a class="navbar-brand" href="index.jsp">Home</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="collapsibleNavbar">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="test">Product</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="product">Link</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Link</a>
                    </li>    
                </ul>
            </div>
            <form class="form-inline" action="/action_page.php">
                <input class="form-control mr-sm-2" type="text" placeholder="Search">
                <button class="btn btn-secondary" type="submit">Search</button>
            </form>
            <c:if test="${accountLogin == null}">
                <a href="login.jsp" class="btn btn-secondary ml-2 mr-2">Đăng Nhập</a>
            </c:if>
            <c:if test="${accountLogin != null}">
                <div class="nav-item dropdown pl-2" >
                    <a class="dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color: white">
                        <c:out  value="${accountLogin.userName}"/>
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                        <a class="dropdown-item" href="profile?info=true">Thông tin cá nhân</a>                                
                        <a class="dropdown-item" href="changePassword.jsp">Đổi mật khẩu</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="login.jsp">Đăng xuất</a>
                    </div>
                </div> 
            </c:if>
        </nav>

        <div class="container">
            <div id="myCarousel" class="carousel slide" data-ride="carousel">

                <!-- Indicators -->
                <ul class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                </ul>

                <!-- The slideshow -->
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="image/22iphone13.png" alt="Iphone" width="100%" height="100%">
                    </div>
                    <div class="carousel-item">
                        <img src="image/sansale-25-2_1.jpg" alt="SanSale" width="100%" height="100%">
                    </div>
                    <div class="carousel-item">
                        <img src="image/zfold_2_-22-2.png" alt="ZFold" width="100%" height="100%">
                    </div>
                </div>

                <!-- Left and right controls -->
                <a class="carousel-control-prev" href="#myCarousel" data-slide="prev">
                    <span class="carousel-control-prev-icon"></span>
                </a>
                <a class="carousel-control-next" href="#myCarousel" data-slide="next">
                    <span class="carousel-control-next-icon"></span>
                </a>
            </div> 
        </div>
    </body>
</html>
