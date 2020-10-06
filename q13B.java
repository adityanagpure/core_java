import java.util.Scanner;
class q13B{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter First Value: ");
int a=sc.nextInt();
System.out.println("Enter second Value: ");
int b=sc.nextInt();
System.out.println("Enter third Value: ");
int c=sc.nextInt();
int x = ( a > b ) ? (a > c ? a : c) : ( b > c ? b : c);
System.out.println("Greater number is: "+x);
}
}

