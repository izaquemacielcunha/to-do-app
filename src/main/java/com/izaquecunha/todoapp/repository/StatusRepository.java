package com.izaquecunha.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.izaquecunha.todoapp.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Integer> {
	Status findByName(String name);

}// end of interface
