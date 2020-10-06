class q3{
public static void main(String args[]){
int x=10;
int y;
int z;
y=x*2 + 3*x - 7;
System.out.println("value of y :" +y);

y=x++ + ++x;
System.out.println("value of x :"+x+" "+"value of y :"+y);

z=x++ - --y - --x + x++;
System.out.println("value of x :"+x+" "+"value of y :"+y+" "+"value of z :"+z);
}
}
