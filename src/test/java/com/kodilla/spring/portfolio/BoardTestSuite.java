package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testRead() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When & Then
        board.read();
    }

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("Feed Tom's cats");
        board.getInProgressList().getTasks().add("Adjust TV");
        board.getDoneList().getTasks().add("Walk my doggy");

        //Then
        Assert.assertTrue(board.getToDoList().getTasks().contains("Feed Tom's cats"));
        Assert.assertTrue(board.getInProgressList().getTasks().contains("Adjust TV"));
        Assert.assertTrue(board.getDoneList().getTasks().contains("Walk my doggy"));
    }
}
