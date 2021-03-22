<%@page import="pojo.Staff"%>
<%@page import="dao.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="navBar.jsp"%>
	<div class="accordion" id="accordionExample">
		<div class="card">
			<div class="card-header" id="headingOne">
				<h5 class="mb-0">
					<button class="btn btn-link" type="button" data-toggle="collapse"
						data-target="#collapseOne" aria-expanded="true"
						aria-controls="collapseOne">Add New Staff Member</button>
				</h5>
			</div>

			<div id="collapseOne" class="collapse show"
				aria-labelledby="headingOne" data-parent="#accordionExample">
				<div class="card-body">

					<form action="InsertStaffServler" method="post">

						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputEmail4">Register No</label> <input type="text"
									class="form-control" name="empRegNo"
									placeholder="Enter Register No" required>
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">Department NO</label> <input
									type="text" class="form-control" name="empDepNo"
									placeholder="Enter Department NO" required>
							</div>
						</div>

						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputEmail4">Name</label> <input type="text"
									class="form-control" name="empName"
									placeholder="Enter Employee Name" required>
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">Assigned Designation</label> <input
									type="text" class="form-control" name="empDesignation"
									placeholder="Enter the assigned designation" required>
							</div>
						</div>

						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputEmail4">Type</label> <select name="empType"
									class="form-control">
									<option value disabled selected>Type</option>
									<option value="doctor">Doctor</option>
									<option value="nurse">Nurse</option>
									<option value="pharmacist">Pharmacist</option>
								</select>
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">Gender</label><br> <input
									type="radio" name="empGender" value="male"> Male<input
									type="radio" name="empGender" value="female"> Female<br>
							</div>
						</div>

						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputEmail4">Employee Salary</label> <input
									type="text" class="form-control" name="empSalary"
									placeholder="Enter Employee Salaray" required>
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">Effective Date</label> <input
									type="date" class="form-control" name="empEffectiveDate"
									placeholder="Enter the Effective Date" required>
							</div>
						</div>


						<input type="submit" class="btn btn-dark btn-lg btn-block"
							data-toggle="modal" data-target="#success-btnx"
							value="Insert Staff Member">
					</form>


				</div>
			</div>
		</div>
		<div class="card">
			<div class="card-header" id="headingTwo">
				<h5 class="mb-0">
					<button class="btn btn-link collapsed" type="button"
						data-toggle="collapse" data-target="#collapseTwo"
						aria-expanded="false" aria-controls="collapseTwo">Current
						Staff of the Doctors</button>
				</h5>
			</div>
			<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
				data-parent="#accordionExample">
				<div class="card-body">

					<table class="table table-striped table-dark">
						<thead>
							<tr>
								
								<th scope="col">ID</th>
								<th scope="col">Reg. No</th>
								<th scope="col">Dept. No</th>
								<th scope="col">Name</th>
								<th scope="col">Designation</th>
								<th scope="col">Gender</th>
								<th scope="col">Salary</th>
								<th scope="col">Eff. Date</th>
							</tr>
						</thead>
						<tbody>
							<%
								UserDAO daoObj = new UserDAO();
							for (Staff i : daoObj.getAllDoctors()) {
							%>

							<tr>
								<th scope="row"><%=i.getAiID()%></th>
								<td><%=i.getEmpRegNo()%></td>
								<td><%=i.getEmpDepNo()%></td>
								<td><%=i.getEmpName()%></td>
								<td><%=i.getEmpDesignation()%></td>
								<td><%=i.getEmpGender()%></td>
								<td><%=i.getEmpSalary()%></td>
								<td><%=i.getEmpEffectiveDate()%></td>
							</tr>
							<%
								}
							%>
						</tbody>
					</table>


				</div>
			</div>
		</div>
		<div class="card">
			<div class="card-header" id="headingFour">
				<h5 class="mb-0">
					<button class="btn btn-link collapsed" type="button"
						data-toggle="collapse" data-target="#collapseFour"
						aria-expanded="false" aria-controls="collapseFour">Current
						Staff of the Nurses</button>
				</h5>
			</div>
			<div id="collapseFour" class="collapse" aria-labelledby="headingFour"
				data-parent="#accordionExample">
				<div class="card-body">

					<table class="table table-striped table-dark">
						<thead>
							<tr>
								<th scope="col">ID</th>
								<th scope="col">Reg. No</th>
								<th scope="col">Dept. No</th>
								<th scope="col">Name</th>
								<th scope="col">Designation</th>
								<th scope="col">Gender</th>
								<th scope="col">Salary</th>
								<th scope="col">Eff. Date</th>
							</tr>
						</thead>
						<tbody>
							<%
								UserDAO daoObj2 = new UserDAO();
							for (Staff i : daoObj2.getAllNurse()) {
							%>

							<tr>
								<th scope="row"><%=i.getAiID()%></th>
								<td><%=i.getEmpRegNo()%></td>
								<td><%=i.getEmpDepNo()%></td>
								<td><%=i.getEmpName()%></td>
								<td><%=i.getEmpDesignation()%></td>
								<td><%=i.getEmpGender()%></td>
								<td><%=i.getEmpSalary()%></td>
								<td><%=i.getEmpEffectiveDate()%></td>
							</tr>
							<%
								}
							%>
						</tbody>
					</table>


				</div>
			</div>
		</div>

		<div class="card">
			<div class="card-header" id="headingThree">
				<h5 class="mb-0">
					<button class="btn btn-link collapsed" type="button"
						data-toggle="collapse" data-target="#collapseThree"
						aria-expanded="false" aria-controls="collapseThree">
						Current Staff of the Pharmacists</button>
				</h5>
			</div>
			<div id="collapseThree" class="collapse"
				aria-labelledby="headingThree" data-parent="#accordionExample">
				<div class="card-body">

					<table class="table table-striped table-dark">
						<thead>
							<tr>
								<th scope="col">ID</th>
								<th scope="col">Reg. No</th>
								<th scope="col">Dept. No</th>
								<th scope="col">Name</th>
								<th scope="col">Designation</th>
								<th scope="col">Gender</th>
								<th scope="col">Salary</th>
								<th scope="col">Eff. Date</th>
							</tr>
						</thead>
						<tbody>
							<%
								UserDAO daoObj3 = new UserDAO();
							for (Staff i : daoObj3.getAllPharama()) {
							%>

							<tr>
								<th scope="row"><%=i.getAiID()%></th>
								<td><%=i.getEmpRegNo()%></td>
								<td><%=i.getEmpDepNo()%></td>
								<td><%=i.getEmpName()%></td>
								<td><%=i.getEmpDesignation()%></td>
								<td><%=i.getEmpGender()%></td>
								<td><%=i.getEmpSalary()%></td>
								<td><%=i.getEmpEffectiveDate()%></td>
							</tr>
							<%
								}
							%>
						</tbody>
					</table>




				</div>
			</div>
		</div>
	</div>
</body>
</html>