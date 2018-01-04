package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class BoardConfig {
    Board board;

    @Bean
    public Board getBoard() {
        return new Board();
    }

    @Bean
    @Scope("prototype")
    public TaskList addTaskToDo() {
        board.getToDoList().getTasks().add("Feed cats");
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList addTaskInProgress() {
        board.getToDoList().getTasks().add("Adjust TV");
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList addTaskDone() {
        board.getToDoList().getTasks().add("Walk my doggy");
        return new TaskList();
    }
}
