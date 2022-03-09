<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<h3>User Page</h3>
	<div class="row">
		<div class="col-12">
			<div class="card">
				<div class="card-body">
					<h4 class="card-title">User Form</h4>
					<form>
						<div class="row">
							<div class="col-md-6">
								<div class="form-floating mb-3">
									<input type="text" class="form-control" id="tb-fname"
										placeholder="Enter Name here"> <label for="tb-fname">UserName</label>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-floating">
									<input type="password" class="form-control" id="tb-pwd"
										placeholder="Password"> <label for="tb-pwd">Password</label>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-floating mb-3">
									<input type="text" class="form-control" id="tb-fname"
										placeholder="Enter Name here"> <label for="tb-fname">FullName</label>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-floating mb-3">
									<input type="email" class="form-control" id="tb-email"
										placeholder="name@example.com"> 
										<label for="tb-email">Address</label>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-floating mb-3">
									<input type="email" class="form-control" id="tb-email"
										placeholder="name@example.com"> 
										<label for="tb-email">Email</label>
								</div>
							</div>
									<div class="ms-auto mt-3 mt-md-0">
										<button type="submit" class="btn btn-primary text-white"> Add User</button>
										<button class="btn btn-inverse waves-effect waves-light">Cancel</button>
									</div>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>