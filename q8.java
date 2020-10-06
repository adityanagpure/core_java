import java.util.Scanner;
class q8{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Principle Amount: ");
int x=sc.nextInt();
System.out.println("Enter Rate of Inerest: ");
int y=sc.nextInt();
System.out.println("Enter Time: ");
int z=sc.nextInt();

int si=(x*y*z)/100;
System.out.println("Simple Interest: "+si);

}
}

