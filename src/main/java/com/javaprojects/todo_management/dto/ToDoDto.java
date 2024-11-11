package com.javaprojects.todo_management.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ToDoDto {
    private Long id;
    private String title;
    private String description;
    private boolean statusCompleted;


}
