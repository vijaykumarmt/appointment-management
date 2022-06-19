<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<div class="row">
		<div class="col-md-6 col-md-offset-3 ">
			<div class="panel panel-primary">
				<div class="panel-heading">Add Appointment</div>
				<div class="panel-body">
					<form:form method="post" modelAttribute="todo">
						<form:hidden path="id" />
						<fieldset class="form-group">
							<form:label path="event_related">Event Related to: </form:label>
							Reaction:
							<form:radiobutton path="event_related" value="Reaction" />
							Error:
							<form:radiobutton path="event_related" value="Error" />
							Incident:
							<form:radiobutton path="event_related" value="Incident" />
							<form:errors path="event_related" cssClass="text-warning" />
						</fieldset>
						<fieldset class="form-group">
							<form:label path="patient_name">Patient name</form:label>
							<form:input path="patient_name" type="text" class="form-control"
								required="required" />
							<form:errors path="patient_name" cssClass="text-warning" />
						</fieldset>
						<fieldset class="form-group">
							<form:label path="description">Details of Event</form:label>
							<form:textarea path="description" rows="3" cols="20"
								class="form-control" />
							<form:errors path="description" cssClass="text-warning" />
						</fieldset>
						<fieldset class="form-group">
							<form:label path="immediate_intervention">Immediate Intervention</form:label>
							<form:textarea path="immediate_intervention" rows="3" cols="20"
								class="form-control" />
							<form:errors path="immediate_intervention"
								cssClass="text-warning" />
						</fieldset>
						<fieldset class="form-group">
							<form:label path="outcome_of_events">Outcome of Events</form:label>
							<form:input path="outcome_of_events" type="text"
								class="form-control" required="required" />
							<form:errors path="outcome_of_events" cssClass="text-warning" />
						</fieldset>
						<fieldset class="form-group">
							<form:label path="event_consider">Event Consider as</form:label>
							Near miss:
							<form:radiobutton path="event_consider" value="near miss" />
							Adverse:
							<form:radiobutton path="event_consider" value="adverse" />
							sentinel:
							<form:radiobutton path="event_consider" value="sentinel" />

							<form:errors path="event_consider" cssClass="text-warning" />
						</fieldset>
						<fieldset class="form-group">
							<form:label path="action_taken">Preventive & Corrective Action Taken</form:label>
							<form:textarea path="action_taken" class="form-control"
								required="required" />
							<form:errors path="action_taken" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="patient_id">Patient ID Number</form:label>
							<form:input path="patient_id" type="text" class="form-control"
								required="required" />
							<form:errors path="patient_id" cssClass="text-warning" />
						</fieldset>
						<fieldset class="form-group">
							<form:label path="procedur">Procedure</form:label>
							<form:input path="procedur" type="text" class="form-control"
								required="required" />
							<form:errors path="procedur" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="eventDate">Date of Event</form:label>
							<form:input path="eventDate" type="text"
								placeholder="enter in format of dd/mm/yyyy hh:mm"
								class="form-control" required="required" />
							<form:errors path="eventDate" cssClass="text-warning" />
						</fieldset>


						<fieldset class="form-group">
							<form:label path="admissionDate">Date of admission</form:label>
							<form:input path="admissionDate" type="text"
								placeholder="enter in format of dd/mm/yyyy hh:mm"
								class="form-control" required="required" />
							<form:errors path="admissionDate" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="dischargeDate">Date of Discharge</form:label>
							<form:input path="dischargeDate" type="text"
								placeholder="enter in format of dd/mm/yyyy hh:mm"
								class="form-control" required="required" />
							<form:errors path="dischargeDate" cssClass="text-warning" />
						</fieldset>
						<fieldset class="form-group">
							<form:label path="personFilling">Name of person filling form</form:label>
							<form:input path="personFilling" type="text" class="form-control"
								required="required" />
							<form:errors path="personFilling" cssClass="text-warning" />
						</fieldset>
						<fieldset class="form-group">
							<form:label path="actionTakenBy">Name of person who has taken action</form:label>
							<form:input path="actionTakenBy" type="text" class="form-control"
								required="required" />
							<form:errors path="actionTakenBy" cssClass="text-warning" />
						</fieldset>

						<button style="margin: auto" type="submit" class="btn btn-success">Save</button>
						<button type="reset" value="Reset">Reset</button>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>