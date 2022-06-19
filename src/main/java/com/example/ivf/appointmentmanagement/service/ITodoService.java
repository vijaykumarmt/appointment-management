package com.example.ivf.appointmentmanagement.service;

import java.util.Date;

import java.util.List;
import java.util.Optional;

import javax.validation.constraints.Size;

import com.example.ivf.appointmentmanagement.model.Todo;


public interface ITodoService {

	List<Todo> getTodosByUser(String user);

	Optional<Todo> getTodoById(long id);

	void updateTodo(Todo todo);

	void addTodo(String userName,
			String description,
			String immediate_intervention, String outcome_of_events, String event_consider,String event_related, String action_taken,
			String patient_name, String patient_id, Date eventDate, Date admissionDate, Date dischargeDate,
			String procedur, String personFilling, String actionTakenBy,boolean isDone);

	void deleteTodo(long id);
	
	void saveTodo(Todo todo);

}