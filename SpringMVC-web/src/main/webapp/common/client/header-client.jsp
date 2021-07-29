<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<%@ page import="com.example.security.SecurityUtils"%>
<!DOCTYPE html>
<div id="header">
	<h1>
		<a href="#">News</a>
	</h1>
	<form action="#">
		<input type="text" name="s" id="s" value="" />
		<button type="submit">Search</button>
	</form>
	
	<ul>
		<li class="f"><a href="#">Home</a></li>
		<li><a href="about.html">About Us</a></li>
		<li><a href="page.html">Demo Page</a></li>
		<li><a href="contact.html">Contact Page</a></li>
	</ul>
	
</div>
<security:authorize access="!isAuthenticated()">
	<a class="login" href="<c:url value='/login'/>">Login</a>
</security:authorize>
<security:authorize access="isAuthenticated()">
	<a class="login" href="<c:url value='/logout'/>">Logout</a>
	<span class="user-name"><security:authentication property="name"/></span>
</security:authorize>