package com.izaquecunha.todoapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.izaquecunha.todoapp.dto.TaskDto;
import com.izaquecunha.todoapp.service.TaskService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class TaskController {
	private TaskService taskService;

	@GetMapping
	public String tasks(Model model) {
		List<TaskDto> tasks = taskService.getAll();
		model.addAttribute("tasks", tasks);
		return "/task";
	}
	
	@GetMapping("/task/newtask")
	public String newTask(Model model) {
		TaskDto taskDto = TaskDto.builder().build();
		model.addAttribute("task", taskDto);
		return "/forms/task-form";
	}

	@PostMapping("/task/create")
	public String create(@Valid @ModelAttribute("task") TaskDto taskDto, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("task", taskDto);
			return "/forms/task-form";
		}
		taskService.create(taskDto);
		return "redirect:/";
	}

}// end of class
