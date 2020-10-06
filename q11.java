import java.util.Scanner;
class q11{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Value of A: ");
int a=sc.nextInt();
System.out.println("Enter Value of B: ");
int b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("value of A is: "+a);
System.out.println("value of B is: "+b);
}
}
