<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="dao.AppointmentDAO"%>
<%@page import="pojo.Appointment"%>
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
						aria-controls="collapseOne">Current Appointments</button>
				</h5>
			</div>

			<div id="collapseOne" class="collapse show"
				aria-labelledby="headingOne" data-parent="#accordionExample">
				<div class="card-body">

					<table class="table table-striped table-dark">
						<thead>
							<tr>
								<th scope="col">Channel Id</th>
								<th scope="col">Name</th>
								<th scope="col">Number</th>
								<th scope="col">Type</th>
								<th scope="col">Time</th>
								<th scope="col">Date</th>
								<th scope="col">State</th>
							</tr>
						</thead>
						<tbody>


							<%
								AppointmentDAO daoObj = new AppointmentDAO();
							for (Appointment i : daoObj.getApts()) {
							%>

							<tr>
								<th scope="row"><%=i.getId()%></th>
								<td><%=i.getPatname()%></td>
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