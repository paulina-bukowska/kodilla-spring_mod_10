package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board() {
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void read() {
        System.out.println("Tasks to do: " + toDoList.getTasks());
        System.out.println("Tasks in progress: " + inProgressList.getTasks());
        System.out.println("Tasks done: " + doneList.getTasks());
    }
}
