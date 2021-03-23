<%@page import="pojo.TimeSlot"%>
<%@page import="dao.TimeSlotDAO"%>
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
						aria-controls="collapseOne">Add New TimeSlot</button>
				</h5>
			</div>

			<div id="collapseOne" class="collapse show"
				aria-labelledby="headingOne" data-parent="#accordionExample">
				<div class="card-body">

					<form action="InsertTimeSlotServlet" method="post">

						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputEmail4">Register No</label> <input type="text"
									class="form-control" name="empRegNo"
									placeholder="Enter Register No" required>
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">Name</label> <input type="text"
									class="form-control" name="empName"
									placeholder="Enter Department NO" required>
							</div>
						</div>

						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputEmail4">Type</label> <select name="enterType"
									class="form-control">
									<option value disabled selected>Type</option>
									<option value="dcotot">Allergist</option>
									<option value="nurse">Dermatologists</option>
									<option value="pharmacist">Pharmacist</option>
									<option value="pharmacist">Cardiologists</option>
								</select>
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">Expected Fee LKR</label><br> <input
									type="text" name="doctorFee" class="form-control"
									placeholder="Enter expected fee" required>
							</div>
						</div>

						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputPassword4">Start Time</label> <input
									type="time" class="form-control" name="startTime"
									placeholder="Enter the Start Time" required>
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">End Time</label> <input type="time"
									class="form-control" name="endTime"
									placeholder="Enter the End Time" required>
							</div>
						</div>

						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputPassword4">Effective Date</label> <input
									type="date" class="form-control" name="aptEffectiveDate"
									placeholder="Enter the Effective Date" required>
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">End Date</label> <input type="date"
									class="form-control" name="aptEndDate"
									placeholder="Enter the Effective Date" required>
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
						TimeSlots</button>
				</h5>
			</div>
			<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
				data-parent="#accordionExample">
				<div class="card-body">

					<table class="table table-striped table-dark" id="TABLETIMELSOT">
						<thead>
							<tr>
								<th scope="col">Id</th>
								<th scope="col">Reg No</th>
								<th scope="col">Name</th>
								<th scope="col">Type</th>
								<th scope="col">Fee (LKR)</th>
								<th scope="col">Start Time</th>
								<th scope="col">End Time</th>
								<th scope="col">Start Date</th>
								<th scope="col">End Date</th>
								<th scope="col">Edit</th>
								<th scope="col">Remove</th>
							</tr>
						</thead>
						<tbody>


							<%
								TimeSlotDAO daoObj = new TimeSlotDAO();
							for (TimeSlot i : daoObj.getTimeSlots()) {
							%>

							<tr>
								<th scope="row"><%=i.getAiID()%></th>
								<td><%=i.getEmpRegNo()%></td>
								<td><%=i.getEmpName()%></td>
								<td><%=i.getEnterType()%></td>
								<td><%=i.getDoctorFee()%></td>
								<td><%=i.getStartTime()%></td>
								<td><%=i.getEndTime()%></td>
								<td><%=i.getAptEffectiveDate()%></td>
								<td><%=i.getAptEndDate()%></td>

								<td><a href="#" class="nav-link" data-toggle="modal"
									data-target="#update-out-bus-route"><button type="button"
											class="btn btn-outline-warning edits_btn">Edit</button></td>
								<td><a href="#" class="nav-link" data-toggle="modal"
									data-target="#delete-out-bus-route"><button type="button"
											class="btn btn-outline-danger del_btn">Delete</button></td>
							</tr>
							<%
								}
							%>
						</tbody>


					</table>

					<script
						src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js">
						$("#TABLETIMELSOT")
								.on(
										'click',
										'.edits_btn',
										function() {
											// get the current row
											var currentRow = $(this).closest(
													"tr");

											var Id = currentRow
													.find("td:eq(0)").text();
											var Name = currentRow.find(
													"td:eq(2)").text();
											var Type = currentRow.find(
													"td:eq(4)").text();
											var Fee = currentRow.find(
													"td:eq(5)").text();
											var StartTime = currentRow.find(
													"td:eq(6)").text();
											var EndTime = currentRow.find(
													"td:eq(7)").text();
											var StartDate = currentRow.find(
													"td:eq(8)").text();
											var EndDate = currentRow.find(
													"td:eq(9)").text();

											document.getElementById('Id').value = Id;
											document.getElementById('Name').value = Name;
											document.getElementById("Type").value = Type;
											document.getElementById("Fee").value = Fee;
											document
													.getElementById("StartTime").value = StartTime;
											document.getElementById("EndTime").value = EndTime;
											document
													.getElementById("StartDate").value = StartDate;
											document.getElementById("EndDate").value = EndDate;

										});
					</script>
				</div>
			</div>
		</div>
	</div>
	<div class="modal fade" id="update-out-bus-route">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Want to Edit this timeslot ?</h4>
					<button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>
				<div class="modal-body">

					<form action="UpdateTimeSlotServlet" method="post">

						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputEmail4">Register Id</label> <input type="text"
									class="form-control" name="Id" placeholder="Enter Register No"
									required>
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">Name</label> <input type="text"
									class="form-control" name="empName"
									placeholder="Enter Department NO" required>
							</div>
						</div>

						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputEmail4">Type</label> <select name="enterType"
									class="form-control">
									<option value disabled selected>Type</option>
									<option value="dcotot">Allergist</option>
									<option value="nurse">Dermatologists</option>
									<option value="pharmacist">Pharmacist</option>
									<option value="pharmacist">Cardiologists</option>
								</select>
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">Expected Fee LKR</label><br> <input
									type="text" name="doctorFee" class="form-control"
									placeholder="Enter expected fee" required>
							</div>
						</div>

						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputPassword4">Start Time</label> <input
									type="time" class="form-control" name="startTime"
									placeholder="Enter the Start Time" required>
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">End Time</label> <input type="time"
									class="form-control" name="endTime"
									placeholder="Enter the End Time" required>
							</div>
						</div>

						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputPassword4">Effective Date</label> <input
									type="date" class="form-control" name="aptEffectiveDate"
									placeholder="Enter the Effective Date" required>
							</div>
							<div class="form-group col-md-6">
								<label for="inputPassword4">End Date</label> <input type="date"
									class="form-control" name="aptEndDate"
									placeholder="Enter the Effective Date" required>
							</div>
						</div>


						<input type="submit" class="btn btn-dark btn-lg btn-block"
							data-toggle="modal" data-target="#success-btnx"
							value="Update Timeslot">
					</form>

				</div>

			</div>
		</div>
	</div>

	<div class="modal fade" id="delete-out-bus-route">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">Want to Delete this timeslot ?</h4>
					<button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>
				<div class="modal-body">

					<form action="DeleteTimeSlotServlet" method="post">

						<div class="form-row">
							<div class="form-group col-md-6">
								<label for="inputEmail4">Id</label> <input type="text"
									class="form-control" name="Id" placeholder="Enter ID"
									required>
							</div>
						</div>


						<input type="submit" class="btn btn-dark btn-lg btn-block"
							data-toggle="modal" data-target="#success-btnx"
							value="Delete Timeslot">
					</form>

				</div>

			</div>
		</div>
	</div>
</body>
</html>