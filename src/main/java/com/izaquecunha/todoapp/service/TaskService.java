package com.izaquecunha.todoapp.service;

import java.util.List;

import com.izaquecunha.todoapp.dto.TaskDto;

public interface TaskService {
	void create(TaskDto taskDto);
	List<TaskDto> getAll();

}// end of interface
