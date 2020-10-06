/* 47. Create a program to demonstrate constructor chaining. */

class A{
A(){
System.out.println("Class A default Constructor");
}

A(int a){
System.out.println("Class A Parameteries Constructor");
}
}

class B extends A{

B(){
super();
System.out.println("Class B default Constructor");
}

B(int b){
super(10);
System.out.println("Class B Parameteries Constructor");
}

}

class q47demo{
public static void main(String[] args){
B b1 = new B();
B b2 = new B(20);
}
}