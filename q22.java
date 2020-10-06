import java.util.Scanner;
import java.util.Arrays;
class q22{
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

 for (int i = 0; i < size; i++) 
        {
            for (int j = i + 1; j < size; j++) 
            {
                if (x[i] < x[j]) 
                {
                   int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }

System.out.print(Arrays.toString(x));
}
}

