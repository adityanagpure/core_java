/* 46. Create a program to demonstrate the use of instanceof operator or secure reference down casting. */


class animal{
int leg;
String color;

animal(){
leg=4;
color="white";
}

animal(int l,String c){
leg=l;
color=c;
}

void show(){
System.out.println("Total leg "+leg);
System.out.println("color is "+color);
}
}


class dog extends animal{
int eye;

dog(){
super();
eye=2;
}

dog(int eye){
super(6,"cockroch");
this.eye=eye;
}

void show(){
System.out.println("Total leg is "+leg);
System.out.println("color is "+color);
System.out.println("Total eye is "+eye);
}
}

class q46demo{
public static void main(String[] args){

animal a = new animal();
dog d = new dog();


a=d;
d=(dog)a; 

d.show();

if( a instanceof animal ){
System.out.println("Yes");
}
else {
System.out.println("No");
}


}
}