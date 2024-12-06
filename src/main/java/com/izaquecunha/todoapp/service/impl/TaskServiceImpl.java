package com.izaquecunha.todoapp.service.impl;

import org.springframework.stereotype.Service;

import com.izaquecunha.todoapp.repository.TaskRepository;
import com.izaquecunha.todoapp.service.TaskService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {
	private TaskRepository taskRepository;

}// end of class
