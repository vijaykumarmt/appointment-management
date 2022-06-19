package com.example.ivf.appointmentmanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ivf.appointmentmanagement.model.Todo;



public interface TodoRepository extends JpaRepository<Todo, Long>{
	List<Todo> findByUserName(String user);
		<S extends Todo> S save(Todo entity);      

	  Optional<Todo> findById(Long id); 

	  List<Todo> findAll();               

	  long count();                        

	  void delete(Todo entity);               

	  boolean existsById(Long id);   
}
