/* 35. Create a class MathOperation that has four static methods. add() method that takes two integer numbers as parameter and returns the sum of the numbers.
subtract() method that takes two integer numbers as parameter and returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the product. power() method that takes two integer numbers as parameter and returns the power of first number to second number. 
Create another class Demo (main class) that takes the two numbers from the user and calls all four methods of MathOperation class by providing entered numbers and prints the return values of every method. */

import java.lang.Math;
import java.util.Scanner;
class MathOperation{

static int add(int x,int y){
return x+y;
} 

static int subtract(int x,int y){
return x-y;
}

static int multiply(int x,int y){
return x*y;
}

static double power(int x,int y){
return Math.pow(x,y);
}
}

class q35Demo{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Value of X");
int x = sc.nextInt();
System.out.println("Enter the Value of Y");
int y = sc.nextInt();
System.out.println("Addition of number is "+MathOperation.add(x,y));
System.out.println("Subtraction of number is "+MathOperation.subtract(x,y));
System.out.println("Multiplication of number is "+MathOperation.multiply(x,y));
System.out.println("power of number is "+MathOperation.power(x,y));
}
}
