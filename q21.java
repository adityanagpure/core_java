import java.util.Scanner;
class q21{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter 10 Element");
int arr[]=new int[10];
int sum=0;
for(int i=0;i<10;i++)
{
arr[i]=sc.nextInt();
sum=sum+arr[i];
}
System.out.println("Sum of Number is: "+sum);
float avg=sum/10;
System.out.println("Average of Number is: "+avg);
}
}

