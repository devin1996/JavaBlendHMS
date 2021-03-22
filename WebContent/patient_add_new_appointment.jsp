<%@page import="dao.AppointmentDAO"%>
<%@page import="pojo.Appointment"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HMS</title>
</head>
<body>
	<jsp:include page="navBarPatiernt.jsp" />
	<div class="accordion" id="accordionExample">
		<div class="card">
			<div class="card-header" id="headingOne">
				<h5 class="mb-0">
					<button class="btn btn-link" type="button" data-toggle="collapse"
						data-target="#collapseOne" aria-expanded="true"
						aria-controls="collapseOne">Add New Appointment</button>
				</h5>
			</div>

			<div id="collapseOne" class="collapse show"
				aria-labelledby="headingOne" data-parent="#accordionExample">
				<div class="card-body">

					<form action="AppointmentServlet" method="post">

						<div class="form-row">

							<div class="form-group col-md-6">
								<label for="inputPassword4">Preferred Name</label> <input type="text"
									class="form-control" name="docName"
									placeholder="Enter your preferred name" required>
							</div>
							<div class="form-group col-md-6">
								<label for="inputEmail4">Type</label> <select name="enterType"
									class="form-control">
									<option value disabled selected>Type</option>
									<option value="Allergist">Allergist</option>
									<option value="Dermatologists">Dermatologists</option>
									<option value="Pharmacist">Pharmacist</option>
									<option value="Cardiologists">Cardiologists</option>
								</select>
							</div>

						</div>

						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputPassword4">Time</label> <input type="time"
									class="form-control" name="patTime"
									placeholder="Enter the expected Time" required>
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">Date</label> <input
									type="date" class="form-control" name="patDate"
									placeholder="Enter the expected Date" required>
							</div>
						</div>

						<input type="submit" class="btn btn-dark btn-lg btn-block"
							data-toggle="modal" data-target="#success-btnx"
							value="Insert Timeslot">
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
						Appointments</button>
				</h5>
			</div>
			<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
				data-parent="#accordionExample">
				<div class="card-body">

					<table class="table table-striped table-dark">
						<thead>
							<tr>
								<th scope="col">Channel Id</th>
								<th scope="col">Number</th>
								<th scope="col">Type</th>
								<th scope="col">Time</th>
								<th scope="col">Date</th>
								<th scope="col">State</th>
							</tr>
						</thead>
						<tbody>


							<%
							String number = (String) session.getAttribute("patnumber");
								AppointmentDAO daoObj = new AppointmentDAO();
							for (Appointment i : daoObj.getApts()) {
								
							%>

							<tr>
								<th scope="row"><%=i.getId()%></th>
								<td><%=i.getPatnumber()%></td>
								<td><%=i.getEnterType()%></td>
								<td><%=i.getPatTime()%></td>
								<td><%=i.getPatDate()%></td>
								<td><%=i.getDocName()%></td>
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