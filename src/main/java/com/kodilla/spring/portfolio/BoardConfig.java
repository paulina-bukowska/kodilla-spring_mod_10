package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDo")
    private TaskList tasksToDo;

    @Autowired
    @Qualifier("inProgress")
    private TaskList tasksInProgress;

    @Autowired
    @Qualifier("done")
    private TaskList tasksDone;

    @Bean
    public Board getBoard() {
        return new Board(tasksToDo, tasksInProgress, tasksDone);
    }

    @Bean(name = "toDo")
    @Scope("prototype")
    public TaskList addTaskToDo() {
        List<String> toDoList = new ArrayList<>();
        toDoList.add("feed cats");
        return new TaskList(toDoList);
    }

    @Bean(name = "inProgress")
    @Scope("prototype")
    public TaskList addTaskInProgress() {
        List<String> inProgressList = new ArrayList<>();
        inProgressList.add("programming");
        return new TaskList(inProgressList);
    }

    @Bean(name = "done")
    @Scope("prototype")
    public TaskList addTaskDone() {
        List<String> doneList = new ArrayList<>();
        doneList.add("walk my doggy");
        return new TaskList(doneList);
    }
}
