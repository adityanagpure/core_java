/* 42. Create a class Tile to store the edge length of a square tile, and create another class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely. */

import java.lang.Math;
import java.util.Scanner;
class Tile{
int edge_length;

Tile(int elength){
edge_length=elength;
}

int len(){
return edge_length;
}
}

class Floor{
int length;
int width;

Floor(int length,int width){
this.length=length;
this.width=width;
}

int totalTiles(Tile t){
int no = Math.round((length*width)/(t.len()*t.len()));
return no;
}
}

class q42Floor{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the length of Tile");
int le=sc.nextInt();
Tile t=new Tile(le);
System.out.println("Enter the length and width of Floor");
int lf=sc.nextInt();
int lw=sc.nextInt();
Floor f=new Floor(lf,lw);
System.out.println("Total number of Tiles required "+f.totalTiles(t));
}
}

