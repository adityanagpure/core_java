/* Modify the above program (no. 31) to count the no of Student objects created. [ In this program static variable is required ] */


class Student{
private int rno;
private String name;
private static int count=0;

void setData(int rollno,String fname){
rno=rollno;
name=fname;
count++;
}

void showData(){
System.out.println("rollno is: "+rno);
System.out.println("name is: "+name);
}

void obj(){
System.out.println("Number of object created is: "+count);
}
}

class q32StudentDemo{
public static void main(String[] args){
Student s1=new Student();
s1.setData(10,"Aditya");
s1.showData();

Student s2=new Student();
s2.setData(11,"Adinath");
s2.showData();
s2.obj();
}
}