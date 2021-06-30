<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<div class="sidebar" data-color="purple" data-background-color="white"
	data-image='<c:url value="/template/admin/assets/images/sidebar-1.jpg"/>'>
	<!--
        Tip 1: You can change the color of the sidebar using: data-color="purple | azure | green | orange | danger"

        Tip 2: you can also add an image using data-image tag
    -->
	<div class="logo">
		<a href="http://www.creative-tim.com" class="simple-text logo-normal">
		    <i class="material-icons">star_border</i>
			MyMyPePes </a>
	</div>
	<div class="sidebar-wrapper">
		<ul class="nav">
			<li class="nav-item active  "><a class="nav-link"
				href="./dashboard.html"> <i class="material-icons">dashboard</i>
					<p>Dashboard</p>
			</a></li>
			<li class="nav-item "><a class="nav-link" href="<c:url value='/admin/user'/>">
					<i class="material-icons">person</i>
					<p>User</p>
			</a></li>
			<li class="nav-item "><a class="nav-link" href="<c:url value='/admin/role'/>">
					<i class="material-icons">people</i>
					<p>Role</p>
			</a></li>
			<li class="nav-item "><a class="nav-link" href="<c:url value='/admin/new'/>">
			        <i class="material-icons">library_books</i>
					<p>News</p>
			</a></li>
			<li class="nav-item "><a class="nav-link" href="<c:url value='/admin/comment'/>">
					<i class="material-icons">comment</i>
					<p>Comment</p>
			</a></li>
			<li class="nav-item "><a class="nav-link" href="<c:url value='/admin/category'/>"> 
			        <i class="material-icons">publics</i>
					<p>Category</p>
			</a></li>
			<!-- <li class="nav-item "><a class="nav-link" href="./map.html">
					<i class="material-icons">location_ons</i>
					<p>Maps</p>
			</a></li> -->
			<li class="nav-item active-pro "><a class="nav-link"
				href="./upgrade.html"> <i class="material-icons">unarchive</i>
					<p>Upgrade to PRO</p>
			</a></li>
		</ul>
	</div>
</div>