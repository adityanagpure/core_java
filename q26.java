import java.util.Scanner;
class q26{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int x[][]=new int[5][];
for(int i=0;i<5;i++)
{
System.out.println("Enter Size of 1-D of "+i+" Array");
int s=sc.nextInt();
x[i]=new int[s];
for(int j=0;j<s;j++)
{
System.out.println("Enter the elements");
x[i][j]=sc.nextInt();
}
}
int sum=0;
for(int i=0;i<x.length;i++)
{
for(int j=0;j<x[i].length;j++)
{
System.out.println(" "+x[i][j]);
sum=sum+x[i][j];
}
System.out.println(" ");
}
System.out.println("sum of all element "+sum);
}
}