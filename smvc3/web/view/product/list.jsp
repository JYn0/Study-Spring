<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
 img{
	width:80px;
	height:100px;
}
</style>

<div class="center_page">
<h1>Product List Page</h1>
<c:forEach var="p" items="${plist }">
	<h4><img src="img/${p.imgname }"><a href="productdetail.mc?id=${p.id }">${p.id } </a>${p.name }</h4>
</c:forEach>
</div>