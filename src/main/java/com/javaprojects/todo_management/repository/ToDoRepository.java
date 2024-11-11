package com.javaprojects.todo_management.repository;

import com.javaprojects.todo_management.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
