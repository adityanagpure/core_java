/* 44. Create three classes
- Faculty with two data members facultyId and salary and two methods, one input() method for accepting facultyId as input and another printSalary() to print salary.
- FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance. Override input() method in this class that calls super class input() method and accepts basicSalary and allowance as input. Salary should not be accepted as input but should be calculated using formula (basicSalary + allowance)
- PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour. Override input() method in this class that calls super class input() method and accepts workingHours and ratePerHour as input. Salary should not be accepted as input but should be calculated using formula (workingHour * ratePerHour ) */

import java.util.Scanner;
class Faculty{
int facultyId;
float salary;

void input(int id,float sal){
facultyId=id;
salary=sal;
}


void printSalary(){
System.out.println("Salary of Faculty is "+salary);
}
}

class FullTimeFaculty extends Faculty{
float basicSalary;
int allowance;

void input(float bs,int al){
super.salary=bs+al;
System.out.println("Salary of FullTimeFaculty is "+salary);
}
}

class PartTimeFaculty extends Faculty{
double workingHour;
float ratePerHour;

void input(float wh,float rph){
super.salary=wh*rph;
System.out.println("Salary of PartTimeFaculty is "+salary);
}

}

class q44{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Faculty Id");
int id = sc.nextInt();
System.out.println("Enter Faculty Salary");
float s = sc.nextFloat();

Faculty f = new Faculty();
f.input(id,s);
f.printSalary();

FullTimeFaculty f1 = new FullTimeFaculty();
f1.input(100f,2);

PartTimeFaculty f2 = new PartTimeFaculty();
f2.input(100f,2f);

}
}