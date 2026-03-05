import java.util.Scanner;
//define Geometry class
class Geometry{
//overloaded method 1:area of circle
double area(double radius){
return Math.PI*radius*radius;
}
//overloaded method 2:area of rectangle
double area(double length,double breadth){
return length*breadth;
}
//overloaded method 3:area of triangle(Heron's formula)
double area(double a,double b,double c){
//Triangle inequality theorem validation
if((a+b <=c) || (a+c <=b) || (b+c<=a)){
System.out.println("Invalid traingle side");
return 0;
}
//calculate semi-perimeter
double s=(a+b+c)/2;
return Math.sqrt(s*(s-a)*(s-b)*(s-c));
}}
//main class
public class methodoverloading{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
Geometry g=new Geometry();
System.out.println("Method overloading:Area calculation");
//cirle area
 System.out.println("Enter radius of the circle");
 double r=sc.nextDouble();
 System.out.println("Area of circle"+g.area(r));
 //rectangle area
 System.out.println("\nEnter length and breadth of rectangle");
 double l=sc.nextDouble();
 double b=sc.nextDouble();
 System.out.println("Area of rectangle"+g.area(l,b));
 //triangle area
 System.out.println("Enter three side of triangle");
 double a=sc.nextDouble();
 double c=sc.nextDouble();
 double  d=sc.nextDouble();
 System.out.println("area of triangle"+g.area(a,c,d));
 sc.close();
 }
 }
 
 
