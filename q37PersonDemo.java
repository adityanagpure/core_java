/* 37. Create a class Person with properties (name and age) with following features.
a. Default age of person should be 18.
b. A person object can be initialized with name and age.
c. Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods. */


class Person{
String name;
int age;

Person(){
age=18;
}

Person(String name,int age){
this.age=age;
this.name=name;
}

void display(){
System.out.println("Age of person is "+age);
System.out.println("Name of person is "+name);
}

}

class q37PersonDemo{
public static void main(String[] args){
Person p1=new Person("Aditya",20);
p1.display();
Person p2=new Person();
p2.display();
}
}