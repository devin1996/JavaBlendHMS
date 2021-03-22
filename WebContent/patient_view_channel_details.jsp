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
	<%@include file="navBarPatiernt.jsp"%>

	<div class="card-body">

		<table class="table table-striped table-dark">
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
				</tr>
				<%
					}
				%>
			</tbody>
		</table>


	</div>
</body>
</html>