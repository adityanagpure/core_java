import java.util.Scanner;
class q6{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Radius of Circle : ");
int r = sc.nextInt();
double ar = 3.14*r*r;
double cir = 2*3.14*r;
System.out.println("Area of Circle is : "+ar);
System.out.println("Circumference of Circle is : "+cir);
}
}

