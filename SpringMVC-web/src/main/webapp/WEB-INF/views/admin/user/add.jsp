<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<h3>Add User</h3>
	<div class="card">
		<div class="card-body">
			<div class="row">
				<div class = "col-12 margin-bottom-2-percent">
					<div class="col-2 display-inline-block font-size-17">User Name</div>
					<div class="col-10 display-inline mr-left-7-percent">
						<input type="text" class="input-form" />
					</div>
				</div>
				<div class = "col-12 margin-bottom-2-percent" >
					<div class="col-2 display-inline-block font-size-17">Password</div>
					<div class="col-10 display-inline mr-left-7-percent">
						<input type="password" class="input-form"/>
					</div>
				</div>
				<div class = "col-12 margin-bottom-2-percent">
					<div class="col-2 display-inline-block font-size-17">Full Name</div>
					<div class="col-10 display-inline mr-left-7-percent">
						<input type="text" class="input-form" />
					</div>
				</div>
				<div class = "col-12 margin-bottom-2-percent" >
					<div class="col-2 display-inline-block font-size-17">Address</div>
					<div class="col-10 display-inline mr-left-7-percent">
						<input type="text" class="input-form"/>
					</div>
				</div>
				<div class = "col-12 margin-bottom-2-percent" >
					<div class="col-2 display-inline-block font-size-17">Email</div>
					<div class="col-10 display-inline mr-left-7-percent">
						<input type="email" class="input-form" />
					</div>
				</div>
				<div class = "col-12 margin-bottom-2-percent ">
					<div class="col-2 display-inline-block font-size-17">Phone Number</div>
					<div class="col-10 display-inline mr-left-7-percent">
						<input type="text" class="input-form" />
					</div>
				</div>
				<div class = "col-12 margin-bottom-2-percent">
					<div class="col-2 display-inline-block font-size-17">File name</div>
					<div class="col-10 display-inline mr-left-7-percent">
						<input type="text" class="input-form" />
					</div>
				</div>
				<div class = "col-12 margin-bottom-2-percent" >
					<div class="col-2 display-inline"></div>
					<div class="col-10 display-inline-block mr-left-27">
						<button class="button-cancel">Cancel</button>
						<button class="button-save">Save</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
  	$(document).ready(function (){
  		 var table = $('#user-table').DataTable({
  			"lengthChange": false,
	        "pageLength": 10,
	        "info": false,
	        "autoWidth" : false,
	        "paging": false,
	        "scrollY": '60vh',
	        "scrollCollapse": true
 	    });
  	});
  	</script>
</body>
</html>