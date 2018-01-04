package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void read() {
        System.out.println("Tasks to do: " + toDoList.getTasks());
        System.out.println("Tasks in progress: " + inProgressList.getTasks());
        System.out.println("Tasks done: " + doneList.getTasks());
    }
}
