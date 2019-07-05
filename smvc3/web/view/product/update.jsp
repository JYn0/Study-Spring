<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="center_page">
<h1>Product Update Page</h1>

<form action="productupdateimpl.mc" method="POST">
ID<input type="number" name="id" value="${productupdate.id }"><br>
NAME<input type="text" name="name" value="${productupdate.name }"><br>
PRICE<input type="number" name="price" value="${productupdate.price }"><br>
<%-- REGDATE<input type="date" name="regdate" value="${productupdate.date }"><br> --%>
<%-- IMG<input type="file" name="imgname" value="${productupdate.imgname }"><br> --%>
<input type="submit" value="UPDATE"><br>
</form>

</div>