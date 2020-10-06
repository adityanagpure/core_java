/* 38. Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
a. Only parameterized constructor. [Do not overload the constructor]
b. totalSalary always represents salary total of all the employees created.
c. empNo should be auto incremented.
d. display total employees and totalSalary using a method.
Create another class EmployeeDemo (main class) that creates some Employee objects and calls Employee method to display no. of employees and total of their salaries. */


class Employee{
static int empNo=0;
float salary;
static float totalSalary;

Employee(float salary){
empNo++;
this.totalSalary=salary+totalSalary;
}

void display(){
System.out.println("Total Employee "+empNo);
System.out.println("Total Salary "+totalSalary);
}

}

class q38EmployeeDemo{
public static void main(String[] args){
Employee e1 = new Employee(1000);
Employee e2 = new Employee(1000);
Employee e3 = new Employee(1000);
Employee e4 = new Employee(1000);
e4.display();
}
}