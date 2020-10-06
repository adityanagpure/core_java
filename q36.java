/* 36. Create a class MathOperation containing overloaded methods ‘multiply’ to calculate multiplication of following arguments.
a. two integers
b. three floats
c. all elements of array
d. one double and one integer */


import java.util.Scanner;
class MathOperation{
void multiply(int x,int y){
int mul=x*y;
System.out.println("Multiplication of two integer number is "+mul);
}

void multiply(float x,float y){
float mul=x*y;
System.out.println("Multiplication of two float number is "+mul);
}

void multiply(int[] arr){
int mul=arr[0];
for(int i=1;i<arr.length;i++){
mul=mul*arr[i];
}
System.out.println("Multiplication of Array number is "+mul);
}

void multiply(double x,int y){
double mul=x*y;
System.out.println("Multiplication of double and integer number is "+mul);
}

}

class q36{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the int value of x");
int x=sc.nextInt();
System.out.println("Enter the int value of y");
int y=sc.nextInt();
System.out.println("Enter the float value of x");
float xf=sc.nextFloat();
System.out.println("Enter the float value of x");
float yf=sc.nextFloat();
System.out.println("Enter the double value of x");
double xd=sc.nextFloat();

int[] arr=new int[3];
arr[0]=10;
arr[1]=20;
arr[2]=2;

MathOperation m = new MathOperation();
m.multiply(x,y);
m.multiply(xf,yf);
m.multiply(xd,y);
m.multiply(arr);
}
}