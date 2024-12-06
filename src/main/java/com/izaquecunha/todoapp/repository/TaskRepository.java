package com.izaquecunha.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.izaquecunha.todoapp.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}// end of interface
