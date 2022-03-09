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
			<div>
				<button type="button" class="btn btn-success btn-sm" title="Add User">+</button>
			</div>
			<div class="card">
	           <div class="card-body">
	               <div class="data-tables">
	                   <table id="user-table" class="user-table">
	                       <thead class="text-capitalize">
	                           <tr>
	                               <th class="table-th table-th-no">No.</th>
	                               <th class="table-th w-15-percent">Created By</th>
	                               <th class="table-th w-15-percent">Created Date</th>
	                               <th class="table-th w-15-percent">User Name</th>
	                               <th class="table-th w-15-percent">Update Date</th>
	                               <th class="table-th w-15-percent">Update By</th>
	                               <th class="table-th table-th-action">Action</th>
	                           </tr>
	                       </thead>
	                       <tr>
	                               <td class="table-th table-th-no">1</td>
	                               <td class="table-th w-15-percent">12312y</td>
	                               <td class="table-th w-15-percent">3 Date</td>
	                               <td class="table-th w-15-percent">User32 Name</td>
	                               <td class="table-th w-15-percent">3 Date</td>
	                               <td class="table-th w-15-percent">3 By</td>
	                               <td class="table-th table-th-action">Ac3tion</td>
	                           </tr>
	                   </table>
	                   <ul class = "pagination-sm" id="pagination-user"></ul>
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