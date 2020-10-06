import java.util.Scanner;
class q28{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of Array");
int size=sc.nextInt();
String[] arr=new String[size];
System.out.println("Enter the Array Elements");
int temp;
for(int i=0;i<size;i++)
{
arr[i]=sc.next();
}
System.out.println("");
for(String x : arr)
{
System.out.println(x);
} 

}
}