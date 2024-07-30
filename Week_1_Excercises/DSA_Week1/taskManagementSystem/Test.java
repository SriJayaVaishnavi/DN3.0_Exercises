package com.example.TaskManagementSystem;
import java.util.*;

public class Test {
public static void main(String args[]) {
	Task task=new Task();
	task.addTask(1, "Test features", "In progress");
	task.addTask(2, "Develop backend", "Not Started");
	
	System.out.println("Task List:");
	task.traverseTasks();
	
	System.out.println("Searching task with taskId 2:");
    task.searchTask(2);
    if (task != null) {
        System.out.println("Task found ");
    } else {
        System.out.println("Task not found!");
    }

    
    System.out.println("Deleting task with taskId 2:");
    task.deleteTask(2);
    task.traverseTasks();
	
}
}
