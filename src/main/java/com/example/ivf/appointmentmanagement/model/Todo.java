package com.example.ivf.appointmentmanagement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "todo_appointment")
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String userName;

	@Size(min = 10, message = "Enter at least 10 Characters...")
	private String description;
	
	private String immediate_intervention;
	private String outcome_of_events;
	private String event_consider;
	private String event_related;
	private String action_taken;
	private String patient_name;
	private String patient_id;
	private Date eventDate;
	private Date admissionDate;
	private Date dischargeDate;
	private String procedur;
	private String personFilling;
	private String actionTakenBy;
	public Todo() {
		super();
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImmediate_intervention() {
		return immediate_intervention;
	}
	public void setImmediate_intervention(String immediate_intervention) {
		this.immediate_intervention = immediate_intervention;
	}
	public String getOutcome_of_events() {
		return outcome_of_events;
	}
	public void setOutcome_of_events(String outcome_of_events) {
		this.outcome_of_events = outcome_of_events;
	}
	public String getEvent_consider() {
		return event_consider;
	}
	public void setEvent_consider(String event_consider) {
		this.event_consider = event_consider;
	}
	public String getAction_taken() {
		return action_taken;
	}
	public void setAction_taken(String action_taken) {
		this.action_taken = action_taken;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public Date getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}
	public Date getDischargeDate() {
		return dischargeDate;
	}
	public void setDischargeDate(Date dischargeDate) {
		this.dischargeDate = dischargeDate;
	}
	
	public String getPersonFilling() {
		return personFilling;
	}
	public void setPersonFilling(String personFilling) {
		this.personFilling = personFilling;
	}
	public String getActionTakenBy() {
		return actionTakenBy;
	}
	public void setActionTakenBy(String actionTakenBy) {
		this.actionTakenBy = actionTakenBy;
	}
	public String getProcedur() {
		return procedur;
	}
	public void setProcedur(String procedur) {
		this.procedur = procedur;
	}
	public String getEvent_related() {
		return event_related;
	}
	public void setEvent_related(String event_related) {
		this.event_related = event_related;
	}
	public Todo( String userName,
			@Size(min = 10, message = "Enter at least 10 Characters...") String description,
			String immediate_intervention, String outcome_of_events, String event_consider,String event_related, String action_taken,
			String patient_name, String patient_id, Date eventDate, Date admissionDate, Date dischargeDate,
			String procedur, String personFilling, String actionTakenBy,boolean isDone) {
		super();
	
		this.userName = userName;
		this.description = description;
		this.immediate_intervention = immediate_intervention;
		this.outcome_of_events = outcome_of_events;
		this.event_consider = event_consider;
		this.event_related = event_related;
		this.action_taken = action_taken;
		this.patient_name = patient_name;
		this.patient_id = patient_id;
		this.eventDate = eventDate;
		this.admissionDate = admissionDate;
		this.dischargeDate = dischargeDate;
		this.procedur = procedur;
		this.personFilling = personFilling;
		this.actionTakenBy = actionTakenBy;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", userName=" + userName + ", description=" + description
				+ ", immediate_intervention=" + immediate_intervention + ", outcome_of_events=" + outcome_of_events
				+ ", event_consider=" + event_consider + ", event_related=" + event_related + ", action_taken="
				+ action_taken + ", patient_name=" + patient_name + ", patient_id=" + patient_id + ", eventDate="
				+ eventDate + ", admissionDate=" + admissionDate + ", dischargeDate=" + dischargeDate + ", procedur="
				+ procedur + ", personFilling=" + personFilling + ", actionTakenBy=" + actionTakenBy + "]";
	}
	
	
	
}