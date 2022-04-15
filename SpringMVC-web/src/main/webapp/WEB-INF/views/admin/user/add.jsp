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
				<div class = "col-12" style="margin-bottom: 23px;">
					<div class="col-2" style="display: inline-block;">User Name</div>
					<div class="col-10" style="display: inline;margin-left: -145px;">
						<input type="text" />
					</div>
				</div>
				<div class = "col-12" style="margin-bottom: 23px;">
					<div class="col-2" style="display: inline-block;">Password</div>
					<div class="col-10" style="display: inline;margin-left: -145px;">
						<input type="text" />
					</div>
				</div>
				<div class = "col-12" style="margin-bottom: 23px;">
					<div class="col-2" style="display: inline-block;">Full Name</div>
					<div class="col-10" style="display: inline;margin-left: -145px;">
						<input type="text" />
					</div>
				</div>
				<div class = "col-12" style="margin-bottom: 23px;">
					<div class="col-2" style="display: inline-block;">Address</div>
					<div class="col-10" style="display: inline;margin-left: -145px;">
						<input type="text" />
					</div>
				</div>
				<div class = "col-12" style="margin-bottom: 23px;">
					<div class="col-2" style="display: inline-block;">Email</div>
					<div class="col-10" style="display: inline;margin-left: -145px;">
						<input type="text" />
					</div>
				</div>
				<div class = "col-12" style="margin-bottom:23px;">
					<div class="col-2" style="display: inline-block;">Phone Number</div>
					<div class="col-10" style="display: inline;margin-left: -120px;">
						<input type="text" />
					</div>
				</div>
				<div class = "col-12" style="margin-bottom: 23px;">
					<div class="col-2" style="display: inline-block;">File name</div>
					<div class="col-10"  style="display: inline;margin-left: -145px;">
						<input type="text" />
					</div>
				</div>
				<div class = "col-12" style="margin-bottom: 23px;">
					<div class="col-2" style="display: inline-block;"></div>
					<div class="col-2" style="display: inline-block;">
						<button>Cancel</button>
						<button>Save</button>
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