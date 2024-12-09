package com.izaquecunha.todoapp.service;

import java.util.List;

import com.izaquecunha.todoapp.dto.TaskDto;

public interface TaskService {
	void create(TaskDto taskDto);
	List<TaskDto> getAll();
	void delete(Integer id);
	TaskDto findById(Integer id);
	void update(TaskDto taskDto);

}// end of interface
