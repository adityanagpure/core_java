import java.util.Scanner;
class q7{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter 5 Subject Marks \n");

int a=0;
for(int i=1;i<=5;i++)
{
int b=sc.nextInt();
a=a+b;
}

System.out.println("Sum of Number is : "+a);

int y=(a*100)/500;
System.out.println("percentage marks = "+y+"%");
}
}

