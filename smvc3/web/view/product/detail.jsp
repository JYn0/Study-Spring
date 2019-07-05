<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="center_page">
<h1>Product Detail Page</h1>

<h2>ID :${productdetail.id }</h2>
<h2>NAME:${productdetail.name }</h2>
<h2>PRICE :${productdetail.price }</h2>
<h2>REGDATE :${productdetail.regdate }</h2>
<h2>IMG :${productdetail.imgname }</h2>
<a href="productdelete.mc?id=${productdetail.id }">DELETE</a>
<a href="productupdate.mc?id=${productdetail.id }">UPDATE</a>


</div>