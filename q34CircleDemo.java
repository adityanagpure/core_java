/* 34. Create a class Circle that has two data members, one to store the radius and another to store area and three methods first init() method to input radius from user, secondcalculateArea() method to calculate area of circle and third display() method to display values of radius and area. Create class CircleDemo ( main class) that creates the Circle object and calls init(), calculateArea() and display() methods. */

import java.util.Scanner;
class Circle{
private int radius;
private double area;

void init(int radius){
this.radius=radius;
}

void calculateArea(){
area=3.14*radius*radius;
}

void display(){
System.out.println("value of radius is "+radius);
System.out.println("value of area is "+area);
}
}

class q34CircleDemo{
public static void main(String[] args){
Circle c1=new Circle();
System.out.println("Enter the Radius");
Scanner sc=new Scanner(System.in);
int r = sc.nextInt();
c1.init(r);
c1.calculateArea();
c1.display();
}
}