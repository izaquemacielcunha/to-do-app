package com.izaquecunha.todoapp.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.izaquecunha.todoapp.dto.StatusDto;
import com.izaquecunha.todoapp.entity.Status;
import com.izaquecunha.todoapp.mapper.StatusMapper;
import com.izaquecunha.todoapp.repository.StatusRepository;
import com.izaquecunha.todoapp.service.StatusService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StatusSeviceImpl implements StatusService {
	private StatusRepository statusRepository;

	@Override
	public List<StatusDto> getAll() {
		return statusRepository.findAll().stream().map(status -> StatusMapper.mapToStatusDto(status)).collect(Collectors.toList());
	}

	@Override
	public StatusDto findByName(String name) {
		Status status = statusRepository.findByName(name);
		return StatusMapper.mapToStatusDto(status);
	}

}// end of class
