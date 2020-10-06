import java.util.Scanner;
class q25{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of Array");
int size=sc.nextInt();
int[] x=new int[size];
System.out.println("Enter the "+size+" Element");
for(int i=0;i<size;i++)
{
x[i]=sc.nextInt();
}

int Esum=0;
int Osum=0;
for(int i=0;i<size;i++)
{
if(x[i]%2==0)
{
Esum=Esum+x[i];
}
else
{
Osum=Osum+x[i];
}
}
System.out.println("Sum of Even Element is: "+Esum);
System.out.println("Sum of Odd Element is: "+Osum);
}
}
