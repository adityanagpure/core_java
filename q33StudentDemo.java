/* 33. Write a program to demonstrate functionalities of this keyword in java. */

import java.util.Scanner;
class Student{
private int rno;
private String name;

void setData(int rno,String name){
this.rno=rno;
this.name=name;
}

void showData(){
System.out.println("rollno is: "+rno);
System.out.println("name is: "+name);
}
}
class q33StudentDemo{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Student s1 = new Student();
System.out.println("Enter Rollno ");
int rno=sc.nextInt();
sc.nextLine();
System.out.println("Enter Name ");
String name=sc.nextLine();
s1.setData(rno,name);
s1.showData();
}
}