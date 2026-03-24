import java.util.Scanner;
public class tempconv{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
while(true){
System.out.println("\n-------------temperature converter----------");
System.out.println("1.celsius to fahrenheit");
System.out.println("2.fahrenheit to celsius");
System.out.println("3.Exit");
System.out.println("enter your choice");
int choice=sc.nextInt();
sc.nextLine();
if(choice==3)
{
System.out.println("exiting program......");
break;}
System.out.println("Enter temperature");
String userInput=sc.nextLine();
try{
double temperature=Double.parseDouble(userInput);
double fahren,celsius;
switch(choice){
case 1:
fahren=(temperature * 9/5)+32;
System.out.println("Temperature in celsius"+temperature+"In Fahrenhiet"+fahren);
break;
case 2:
celsius=(temperature-32)* 5/9;
System.out.println("Temperature fahrenheit"+temperature+"In celsius"+celsius);
break;
default:
System.out.println("Error:Invalid menu selection");
break;
}}
catch(NumberFormatException e){
System.out.println("Error:Invalid input,You must enter a numerical value");
System.out.println("Exception details:"+ e);
System.out.println("Reason :"+e.getMessage());
}}
sc.close();
}}
