import java.util.Scanner;
class Product {
int pcode;
String pname;
double price;

//default constructor
Product() {
pcode=0;
pname="Unkonown";
price=0;
}
//parameterized constructor
Product(int c ,String n,double p) {
pcode=c;
pname=n;
price=p;
}
void display () {
System.out.println(pcode+"\t"+pname+"\t"+price);
}
}
public class Productmain{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
//creating 3 objects
Product p1=new Product(101,"laptop",45000.00);
//object2 :user input(Parameterized)
System.out.println("Enter details for product 2");
System.out.print("Product code");
int c2=sc.nextInt();
sc.nextLine();

System.out.print("Product name");
String n2=sc.nextLine();

System.out.print("Price");
double pr2=sc.nextDouble();

Product p2=new Product(c2,n2,pr2);
//object 3:user input(default constructor)
System.out.println("Enter details for product 3");
Product p3=new Product();
System.out.print("Product code");
p3.pcode=sc.nextInt();
sc.nextLine();

System.out.print("Product name");
p3.pname=sc.nextLine();

System.out.print("Price");
p3.price=sc.nextDouble();

System.out.println("\n---------Product with lowest price------");
Product low=p1;
if(p2.price<low.price){
low=p2;
}
if(p3.price<low.price){
low=p3;
}
System.out.println("Code\tName\tPrice");
low.display();
}
}



