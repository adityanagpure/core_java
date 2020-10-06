/* 41. Write a program to demonstrate this() construct functionality. */

class Student{
int rollno;
String name;

Student(){
this(11,"Adi");
}

Student(int rno,String fname){
rollno=rno;
name=fname;
}

void display(){
System.out.println("rollno is "+rollno);
System.out.println("name is "+name);
}
}

class q41demo{
public static void main(String[] args){
Student s = new Student();
s.display();
Student s1 = new Student(10,"Adinath");
s1.display();
System.out.println("Rollno is "+s1.rollno+" and name is "+s1.name);
}
}