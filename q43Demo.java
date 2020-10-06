/* 43. Create a class OneBHK with instance variables roomArea, hallArea and price. Then create default constructor that initializes instance variables with some values and a parameterized constructor that takes values for all instance variables and stores them in instance variables. Now create a method named show() to print OneBHK’s instance variable values.

Create another class TwoBHK which has (inherites) all the properties and behaviors of OneBHK and a new instance variable room2Area. Then create default constructor to initialize all 4 instance variables and a parameterized constructor to take the values for initialization of all instance variables. Override show() method to print all data member information.

Write main method in another class (Say Demo) and store three TwoBHK flat’s information and print information using show method. Also print total amount of all flats. */


import java.util.Scanner;
class OneBHK{
int roomArea;
int hallArea;
int price;


OneBHK(){
roomArea=1000;
hallArea=1500;
price=10000;
}

OneBHK(int roomArea,int hallArea,int price){
this.roomArea=roomArea;
this.hallArea=hallArea;
this.price=price;
}


void show(){
System.out.println("OneBHK roomArea is "+roomArea);
System.out.println("OneBHK hallArea is "+hallArea);
System.out.println("OneBHK price is "+price);
}
}


class TwoBHK extends OneBHK{
int room2Area;

TwoBHK(){
super();
room2Area=2000;
}

TwoBHK(int roomArea,int hallArea,int price,int room2Area){
super(roomArea,hallArea,price);
this.room2Area=room2Area;
}

TwoBHK(int room2Area){
super();
this.room2Area = room2Area;
}

int getPrice(){
return price;
}

void show(){
System.out.println("TwoBHK roomArea is "+roomArea);
System.out.println("TwoBHK hallArea is "+hallArea);
System.out.println("TwoBHK price is "+price);
System.out.println("TwoBHK room2Area is "+room2Area);
}
}



class q43Demo{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter OneBHK roomArea");
int ra = sc.nextInt();
System.out.println("Enter OneBHK hallArea");
int ha = sc.nextInt();
System.out.println("Enter OneBHK price");
int pr = sc.nextInt();
System.out.println("Enter TwoBHK room2Area");
int r2a = sc.nextInt();
TwoBHK t1 = new TwoBHK(ra,ha,pr,r2a);


TwoBHK t2 = new TwoBHK();


TwoBHK t3=new TwoBHK(500);

t1.show();
t2.show();
t3.show();

int price = t1.getPrice()+t2.getPrice()+t3.getPrice();
System.out.println("Total price is "+price);
}
}