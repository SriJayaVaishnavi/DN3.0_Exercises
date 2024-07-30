package com.example.MVCPatternExample;

public class Test {
public static void main(String args[]) {
	Student model=new Student("Vishnu","1","B");
	StudentView view=new StudentView();
	
   StudentController control=new StudentController(model,view);
   
   control.updateView();
   
   control.setName("Vimal");
   control.setId("2");
   control.setGrade("A+");
   
   control.updateView();
}
}
