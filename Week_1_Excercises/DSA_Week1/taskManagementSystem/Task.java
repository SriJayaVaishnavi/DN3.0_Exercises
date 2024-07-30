package com.example.TaskManagementSystem;
impoty java.util.*;
import java.util.LinkedList;

public class Task {
private int taskid;
private String taskName;
private String status;

private LinkedList<Task> tasks;

public Task() {
	tasks=new LinkedList<>();
}
public Task(int taskId, String taskName, String status) {
	this.taskid=taskId;
	this.taskName=taskName;
	this.status=status;
}
public int getTaskId() {
	return taskid;
}

public String getTaskName() {
	return taskName;
}

public String getStatus() {
	return status;
}


public void addTask(int taskId,String taskName,String status) {
	Task newtask=new Task(taskId,taskName,status);
	tasks.add(newtask);
}

public Task searchTask(int taskId) {
	for(Task task:tasks) {
		if(task.getTaskId()==taskId) {
			return task;
		}
	}
	return null;
}

public void deleteTask(int taskId) {
	Task taskToRemove=null;
	for(Task task:tasks) {
		if(task.getTaskId()==taskId)
		{
			taskToRemove=task;
			break;
		}
		}
	if(taskToRemove!=null) {
		tasks.remove(taskToRemove);
	}
	else {
		System.out.println("Task not found.");
	}
}

public void traverseTasks() {
	for(Task task:tasks) {
		System.out.println(task.getTaskId()+" "+task.getTaskName()+" "+task.getStatus());
	}
}

}

