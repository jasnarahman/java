import java.util.Scanner;
class complex{
double real;
double image;
 //default constructor
 complex(){}
//parameterized constructor
 complex(double r,double i){
 
 real=r;
 image=i;
 }
 
 // function to add two complex numbers
 complex add (complex c){
 complex result=new complex();
 result.real=real+c.real;
 result.image=image+c.image;
 return result;
 

}
//function to substract two complex numbers
complex substract( complex c)

{
complex result=new complex();
result.real=real-c.real;
result.image=real-c.real;
return result;

}
//function to multiply two complex numbers

complex multiply(complex c)
{ 
complex result=new complex();
result.real=(real*c.real)-(image*c.image);
result.image=(image*c.image)-(image*c.image);
return result;
}
void display()
{
System.out.println(real+"+"+image+"i");

}}
public class complexmain {
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first complex number");
double r1=sc.nextDouble();
double i1=sc.nextDouble();
complex c1=new complex(r1,i1);
System.out.println("Enter the second complex number");
double r2=sc.nextDouble();
double i2=sc.nextDouble();
complex c2= new complex(r2,i2);
System.out.println("--------Result--------");
complex sum=c1.add(c2);
complex diff=c1.substract(c2);
complex prod=c1.multiply(c2);
System.out.println("\n Sum is------");
sum.display();
System.out.println("\n Difference  is------");
diff.display();
System.out.println("\n Product  is------");
prod.display();
}
}







