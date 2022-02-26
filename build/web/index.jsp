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
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
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
