<%-- 
    Document   : test
    Created on : Mar 5, 2022, 11:58:50 PM
    Author     : Tún ^^
--%>

<%@page import="java.util.List"%>
<%@page import="entity.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%ArrayList<Product> product = (ArrayList<Product>) request.getAttribute("listProduct"); %>

    </head>
    <body>
        <%for (Product s : product) {%>
    <tr>
        <td><%=s.getId()%></td>
        <td><%=s.getName()%></td>
    </tr>
    <%}%>
</body>
</html>
