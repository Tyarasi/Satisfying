<%-- 
    Document   : logout
    Created on : Jan 20, 2021, 7:27:47 PM
    Author     : Satisfying
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
session.setAttribute("nama_customer", null);
session.invalidate();
response.sendRedirect("../HomeSatisfying.jsp");
%>
