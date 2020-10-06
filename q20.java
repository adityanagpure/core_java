import java.util.Scanner;
class q20{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number: ");
int start=sc.nextInt();
int end=sc.nextInt();
int count;
for(int i = start ; i <= end ; i++)
		{
			//logic for checking number is prime or not
			count = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count = count+1;
			}
			if(count == 2)
				System.out.println(i);
		}
}
}

