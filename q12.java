import java.util.Scanner;
class q12{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Salary: ");
int salary=sc.nextInt();
if(salary<10000)
{
float HRA=(10/100);
float DA=(90/100);
double GS=salary+DA+HRA;
System.out.println("gross salary :"+GS);
}
else if(salary>=10000)
{
int HRA=2000;
float DA=(98/100);
double GS=salary+DA+HRA;
System.out.println("gross salary :"+GS);
}
}
}

