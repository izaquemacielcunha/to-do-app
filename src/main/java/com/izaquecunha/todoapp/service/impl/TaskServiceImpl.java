package com.izaquecunha.todoapp.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.izaquecunha.todoapp.dto.TaskDto;
import com.izaquecunha.todoapp.entity.Task;
import com.izaquecunha.todoapp.mapper.TaskMapper;
import com.izaquecunha.todoapp.repository.TaskRepository;
import com.izaquecunha.todoapp.service.TaskService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {
	private TaskRepository taskRepository;

	@Override
	public void create(TaskDto taskDto) {
		taskDto.setStatus("To Do");
		Task task = TaskMapper.mapToTask(taskDto);
		taskRepository.save(task);
	}

	@Override
	public List<TaskDto> getAll() {
		return taskRepository.findAll().stream().map(task -> TaskMapper.mapToTaskDto(task)).collect(Collectors.toList());
	}

}// end of class
