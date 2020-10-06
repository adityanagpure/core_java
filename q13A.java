import java.util.Scanner;
class q13B{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter First Value: ");
int f=sc.nextInt();
System.out.println("Enter second Value: ");
int s=sc.nextInt();
System.out.println("Enter third Value: ");
int t=sc.nextInt();
(f>s & f>t) ? System.out.println(f+"is greater") : System.out.println(t+"is greater");
(s>t & s>f) ? System.out.println(s+"is greater") : System.out.println(t+"is greater");

}
}

