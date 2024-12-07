package com.izaquecunha.todoapp.mapper;

import com.izaquecunha.todoapp.dto.TaskDto;
import com.izaquecunha.todoapp.entity.Task;

public class TaskMapper {

	public static Task mapToTask(TaskDto taskDto) {
		Task task = Task.builder()
				.id(taskDto.getId())
				.name(taskDto.getName())
				.description(taskDto.getDescription())
				.status(taskDto.getStatus())
				.createdOn(taskDto.getCreatedOn())
				.build();
		return task;
	}
	
	public static TaskDto mapToTaskDto(Task task) {
		TaskDto taskDto = TaskDto.builder()
				.id(task.getId())
				.name(task.getName())
				.description(task.getDescription())
				.status(task.getStatus())
				.createdOn(task.getCreatedOn())
				.build();
		return taskDto;
	}

}// end of class
