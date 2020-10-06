import java.util.Scanner;
class q17{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number: ");
int num=sc.nextInt();
int rev=0,rem;
while(num!=0){
rem=num%10;
rev=rev*10+rem;
num=num/10;
}
System.out.println(rev);
}
}

