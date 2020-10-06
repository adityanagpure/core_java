/* 31. Create a class Student with 2 data members rno and name. Create one method setData() that takes roll number and student name as parameter and stores them in data members rno and name. Create one more method showData() to print the data member values. Create another class ( main class) StudentDemo that creates Student class object and calls setData() and showData() methods. */

class Student{
private int rno;
private String name;

void setData(int rollno,String fname){
rno=rollno;
name=fname;
}

void showData(){
System.out.println("rollno is: "+rno);
System.out.println("name is: "+name);
}
}
class q31StudentDemo{
public static void main(String[] args){
Student s1=new Student();
s1.setData(10,"Aditya");
s1.showData();
}
}