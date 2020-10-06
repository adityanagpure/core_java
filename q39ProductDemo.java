/* 39. Create class Product with three data members (pid, price, quantity) and parameterized constructor that takes values for all three data members.Create a main method in different class (say ProductDemo) and perform following task:
a. Accept information for five Product objects from user and store objects in an
array
b. Find pid of product with highest price.
c. Create a static method (with array of product’s object as argument) in Product class to calculate and return total amount spent on all products. ( amount spent
on single product = price of product * quantity of product ) */

import java.util.Scanner;
class Product{
int pid;
float price;
int quantity;

Product(int pid,float price,int quantity){
this.pid=pid;
this.price=price;
this.quantity=quantity;
}
}

class q39ProductDemo{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
Product[] pd= new Product[5];
for(int i=0;i<5;i++){
System.out.println("Enter the pid");
int pid=sc.nextInt();
System.out.println("Enter the price");
float price=sc.nextFloat();
System.out.println("Enter the Quantity");
int quantity=sc.nextInt();
pd[i]=new Product(pid,price,quantity);
}

for(Product i : pd){
System.out.println(i);
}
}
}

