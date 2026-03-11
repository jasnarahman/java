import java.util.Scanner;
import mathutils.calculator;
public class packagedemo{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
calculator calc=new calculator();
System.out.println("Enter the first number");
double num1=sc.nextDouble();
System.out.println("Enter the second number");
double num2=sc.nextDouble();

System.out.println("\n ---------------results--------------");
System.out.println("Addition:"+calc.add(num1,num2));
System.out.println("Substraction:"+calc.substract(num1,num2));
System.out.println("Multiplication:"+calc.multiply(num1,num2));
if(num2==0)
{
System.out.println("cannot divisible");
}
else
{
System.out.println("Division:"+calc.division(num1,num2));
}
}
}

