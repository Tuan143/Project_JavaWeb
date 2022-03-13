<%-- 
    Document   : index
    Created on : Feb 19, 2022, 3:11:16 PM
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
        <title>Trang chủ</title>
    </head>
    <body>
        <!--Header-->
        <jsp:include page="Header.jsp"></jsp:include>
            <!--End Header-->

            <div class="container" style="margin-top:30px">
                <!-- Icons Grid -->
                <section class="features-icons bg-light text-center">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-4">
                                <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3">
                                    <div class="features-icons-icon d-flex">
                                        <i class="icon-screen-desktop m-auto text-primary"></i>
                                    </div>
                                    <h3>Fully Responsive</h3>
                                    <p class="lead mb-0">This theme will look great on any device, no matter the size!</p>
                                </div>
                            </div>
                            <div class="col-lg-4">
                                <div class="features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3">
                                    <div class="features-icons-icon d-flex">
                                        <i class="icon-layers m-auto text-primary"></i>
                                    </div>
                                    <h3>Bootstrap 4 Ready</h3>
                                    <p class="lead mb-0">Featuring the latest build of the new Bootstrap 4 framework!</p>
                                </div>
                            </div>
                            <div class="col-lg-4">
                                <div class="features-icons-item mx-auto mb-0 mb-lg-3">
                                    <div class="features-icons-icon d-flex">
                                        <i class="icon-check m-auto text-primary"></i>
                                    </div>
                                    <h3>Easy to Use</h3>
                                    <p class="lead mb-0">Ready to use with your own content, or customize the source files!</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>

            </div>

            <!--Footer-->
        <jsp:include page="Footer.jsp"></jsp:include>
        <!--End footer-->
    </body>
</html>
