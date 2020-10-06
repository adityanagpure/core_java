import java.util.Scanner;
class q19{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number: ");
int num=sc.nextInt();
int sum=0;
for(int i=1;i<=num;i++)
{
int x=i*10;
int y=x+2;
sum=sum+y;
}
System.out.println(sum);
}
}

