package com.izaquecunha.todoapp.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.izaquecunha.todoapp.dto.StatusDto;
import com.izaquecunha.todoapp.dto.TaskDto;
import com.izaquecunha.todoapp.entity.Task;
import com.izaquecunha.todoapp.mapper.TaskMapper;
import com.izaquecunha.todoapp.repository.TaskRepository;
import com.izaquecunha.todoapp.service.StatusService;
import com.izaquecunha.todoapp.service.TaskService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {
	private TaskRepository taskRepository;
	private StatusService statusService;

	@Override
	public void create(TaskDto taskDto) {
		StatusDto statusDto = statusService.findByName("To Do");
		taskDto.setStatus(statusDto);
		Task task = TaskMapper.mapToTask(taskDto);
		taskRepository.save(task);
	}

	@Override
	public List<TaskDto> getAll() {
		return taskRepository.findAll().stream().map(task -> TaskMapper.mapToTaskDto(task)).collect(Collectors.toList());
	}

	@Override
	public void delete(Integer id) {
		taskRepository.deleteById(id);
	}

	@Override
	public TaskDto findById(Integer id) {
		Task task = taskRepository.findById(id).get();
		return TaskMapper.mapToTaskDto(task);
	}

	@Override
	public void update(TaskDto taskDto) {
		Task task = TaskMapper.mapToTask(taskDto);
		taskRepository.saveAndFlush(task);
	}

	
}// end of class
