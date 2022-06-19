<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<div>
		<a type="button" class="btn btn-primary btn-md" href="/add-todo">Add Appointment</a>
	</div>
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3>List of Appointments</h3>
		</div>
		<div class="panel-body">
		<div class="table-responsive">
			<table class="table table-striped table-dark">
				<thead >
					<tr>
						<th scope="col">Description</th>
						<th scope="col">Event Date</th>
						<th scope="col">Action Taken by</th>
						<th scope="col">Admission Date</th>
						<th scope="col">Discharge Date</th>
						<th scope="col">Event considered as</th>
						<th scope="col">Event related to</th>
						<th scope="col">Immediate Intervention</th>
						<th scope="col">Outcome of events</th>
						<th scope="col">Patient Id</th>
						<th scope="col">Patient name</th>
						<th scope="col">Person who filled form</th>
						<th scope="col">Procedure</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${todos}" var="todo">
						<tr scope="row">
							<td>${todo.description}</td>
							<td><fmt:formatDate value="${todo.eventDate}"
									pattern="dd/MM/yyyy" /></td>
							<td>${todo.actionTakenBy}</td>
							<td><fmt:formatDate value="${todo.admissionDate}"
									pattern="dd/MM/yyyy" /></td>
							<td><fmt:formatDate value="${todo.dischargeDate}"
									pattern="dd/MM/yyyy" /></td>
							<td>${todo.event_consider}</td>
							<td>${todo.event_related}</td>
							<td>${todo.immediate_intervention}</td>
							<td>${todo.outcome_of_events}</td>
							<td>${todo.patient_id}</td>
							<td>${todo.patient_name}</td>
							<td>${todo.personFilling}</td>
							<td>${todo.procedur}</td>
							<td><a type="button" class="btn btn-success"
								href="/update-todo?id=${todo.id}">Update</a> <a type="button"
								class="btn btn-warning" href="/delete-todo?id=${todo.id}">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			</div>
		</div>
	</div>

</div>
<%@ include file="common/footer.jspf"%>