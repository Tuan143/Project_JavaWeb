<%-- 
    Document   : login
    Created on : Feb 19, 2022, 4:00:02 PM
    Author     : Tún ^^
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="css/login.css">
        <script src="js/login.js"></script>
    </head>
    <body>
        <section>
            <div class="container">
                <div class="user signinBx">
                    <div class="imgBx"><img src="https://beedesign.com.vn/wp-content/uploads/2020/08/Thiet-ke-logo-dien-thoai-apple-123-14.jpg" alt="" /></div>
                    <div class="formBx">
                        <form action="login" method="post">
                            <h2>Sign In</h2>
                            <c:if test="${notify ne null}">
                                <div class="alert-danger" role = "alert">${notify}</div>
                            </c:if>
                            <input type="email" name="txtEmail" placeholder="Email" />
                            <input type="password" name="txtPassword" placeholder="Password" />
                            <input type="submit" name="login" value="Login" />
                            <p class="signup">
                                Don't have an account ?
                                <a href="#" onclick="toggleForm();">Sign Up.</a>
                            </p>
                        </form>
                    </div>
                </div>
                <div class="user signupBx">
                    <div class="formBx">
                        <form action="" >
                            <h2>Create an account</h2>
                            <input type="text" name="" placeholder="Username" />
                            <input type="email" name="" placeholder="Email Address" />
                            <input type="password" name="" placeholder="Create Password" />
                            <input type="password" name="" placeholder="Confirm Password" />
                            <input type="text" name="" placeholder="Phone Number" />
                            <input type="text" name="" placeholder="Address" />
                            <input type="submit" name="" value="Sign Up" />
                            <p class="signup">
                                Already have an account ?
                                <a href="#" onclick="toggleForm();">Sign in.</a>
                            </p>
                        </form>
                    </div>
                    <div class="imgBx"><img src="https://kenh14cdn.com/thumb_w/660/203336854389633024/2021/10/22/dscf1124-16325653550902087974601-1634894507412617869306.jpeg" alt="" /></div>
                </div>
            </div>
        </section>
    </body>
</html>
