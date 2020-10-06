import java.util.Scanner;
class q27{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of Array");
int size=sc.nextInt();
int[] arr=new int[size];
System.out.println("Enter the Array Elements");
int temp;
for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}
for (int i = 0; i<size; i++)
{  
System.out.print(arr[i] + " ");  
} 
int min=arr[0];
int max=arr[0];
for(int i=0;i<arr.length;i++)
{
if (arr[i] > max) 
{
max = arr[i];
}
if (arr[i] < min) 
{
min = arr[i];
}
}
System.out.println(" ");
System.out.println("Largest Number in a given array is : " + max);
System.out.println("Smallest Number in a given array is : " + min);
}
}