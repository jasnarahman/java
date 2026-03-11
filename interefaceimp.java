import java.util.Scanner;

interface shapes{
double area();
double perimeter();
}

class circle implements shapes{
private double radius;

public circle(double radius){
this.radius=Math.abs(radius);
}
public double area(){
return Math.PI*radius*radius;
}
public double perimeter(){
return 2*Math.PI*radius;
}
}
class rectangle implements shapes{
private double breadth,length;
public rectangle(double breadth,double length){
this.breadth=breadth;
this.length=length;
}
public double area(){
return length*breadth;
}
public double perimeter(){
 return 2*(length+breadth);
}
}
public class interefaceimp{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
shapes currentshape=null;
while (true){
System.out.println("\n1.Circle");

System.out.println("\n2.Rectangle");
System.out.println("\n3.Exit");
System.out.println("\nselect an option");

int option=sc.nextInt();
if(option==3){
System.out.println("EXIT");
break;
}
switch(option)
{
case 1:
System.out.println("\nEnter radius of circle");
double r=sc.nextDouble();
currentshape=new circle(r);
System.out.println("\nArea of circle is"+currentshape.area());
System.out.println("\nPerimeter of circle is"+currentshape.perimeter());
break;

case 2:
System.out.println("\nEnter breadth of rectangle");
double b=sc.nextDouble();
System.out.println("\nEnter length of rectangle");
double l=sc.nextDouble();
currentshape=new rectangle(b,l);
System.out.println("\nArea of rectangle is"+currentshape.area());
System.out.println("\nPerimeter of rectangle is"+currentshape.perimeter());
break;

}}
sc.close();
}}
