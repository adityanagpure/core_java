import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
class q24{
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
System.out.println("Enter Array Element are "+Arrays.toString(x));
System.out.println("Enter The Element To Search");
int search=sc.nextInt();
int flag=0;
for(int i=0;i<size;i++)
{
if(x[i]==search)
{
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
}
if(flag==1)
{
System.out.println("Search Element Found");
}
else
{
System.out.println("Element Not Found");
}
}
}

