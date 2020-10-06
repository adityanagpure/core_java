import java.util.Scanner;
class q23{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Size of Element");
int size=sc.nextInt();
int[] x= new int[size];
System.out.println("Enter The Element");
for(int i=0;i<size;i++)
{
x[i]=sc.nextInt();
}

for (int i = 0; i<size; i++)
{  
System.out.print(x[i] + " ");  
} 
System.out.println(" ");
for (int i = size-1; i >=0; i--)
{  
System.out.print(x[i] + " ");  
} 
}
}

