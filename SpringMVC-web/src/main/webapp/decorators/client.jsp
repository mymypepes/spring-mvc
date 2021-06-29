<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<html>
<head>
<title>News</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" type="text/css" href="<c:url value='/template/client/assets/css/style.css'/>">
<link rel="stylesheet" type="text/css" href="<c:url value='/template/client/css/mystyle.css'/>">
<!-- [if lte IE 6] -->
<%-- <link rel="stylesheet" type="text/css" href="<c:url value='/template/client/assets/css/ie.css'/>">
 --%>
</head>
<body>
	<div id="wrapper">
		<%@ include file="/common/client/header-client.jsp"%>
		<div id="body">
	   			<dec:body/>
	    </div>
	</div>
	<%@ include file="/common/client/footer-client.jsp"%>
	<script type="text/javascript" src="<c:url value='/template/client/assets/js/unitpngfix.js'/>"></script>
</body>
</html>