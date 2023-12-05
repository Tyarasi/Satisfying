<%-- 
    Document   : logout
    Created on : Jan 26, 2021, 3:20:00 PM
    Author     : Satisfying
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
session.setAttribute("nama_customer", null);
session.invalidate();
response.sendRedirect("/Satisfying2/faces/LoginSatisfying.jsp");
%>  
