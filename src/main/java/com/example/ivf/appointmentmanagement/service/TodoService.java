package com.example.ivf.appointmentmanagement.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ivf.appointmentmanagement.model.Todo;
import com.example.ivf.appointmentmanagement.repository.TodoRepository;



@Service
public class TodoService implements ITodoService {

	@Autowired
	private TodoRepository todoRepository;

	@Override
	public List<Todo> getTodosByUser(String user) {
		return todoRepository.findByUserName(user);
	}

	@Override
	public Optional<Todo> getTodoById(long id) {
		return todoRepository.findById(id);
	}

	@Override
	public void updateTodo(Todo todo) {
		todoRepository.save(todo);
	}

	

	@Override
	public void deleteTodo(long id) {
		Optional<Todo> todo = todoRepository.findById(id);
		if (todo.isPresent()) {
			todoRepository.delete(todo.get());
		}
	}

	@Override
	public void saveTodo(Todo todo) {
		todoRepository.save(todo);
	}

	@Override
	public void addTodo(String userName,
			String description,
			String immediate_intervention, String outcome_of_events, String event_consider,String event_related, String action_taken,
			String patient_name, String patient_id, Date eventDate, Date admissionDate, Date dischargeDate,
			String procedur, String personFilling, String actionTakenBy,boolean isDone) {
		todoRepository.save(new Todo( userName, description, immediate_intervention, outcome_of_events, event_consider,event_related, action_taken, patient_name, patient_id, eventDate, admissionDate, dischargeDate, procedur, personFilling, actionTakenBy, isDone));
		
	}
}