import java.util.Scanner;
class publisher{
String publishername;
public publisher (String publishername){
this.publishername=publishername;
}
public void display(){
System.out.println("Publisher name   :"+publishername);
}}
class book extends publisher{
String bookname;
String author;
double price;

public book(String publishername,String bookname,String author,double price){
super(publishername);
this.bookname=bookname;
this.author=author;
this.price=price;
}
public void display(){
super.display();
System.out.println("Book name  :"+bookname);
System.out.println("Author  :"+author);
System.out.println("Price :"+price);
}}
//sub class 1 litterature
class literature extends book{
String type;
public literature(String publishername,String bookname,String author,double price,String type){
super(publishername ,bookname,author,price);
this.type=type;
}
 public void display(){
 super.display();
 System.out.println("category  :Literature  ");
System.out.println("Type  :"+type);
System.out.println("-------------------------------------------------");
}}
//subclass 2 fiction
class fiction extends book{
String genre;
public fiction (String publishername,String bookname,String author,double price,String genre){
super(publishername,bookname,author,price);
this.genre=genre;
}
public void display(){
super.display();
System.out.println("Category:Fiction");
System.out.println("Genre   :"+genre);
System.out.println("-----------------------------------------------");
}}
//main class
public class heirarchicalinheritance{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter total number of books");
int n=sc.nextInt();
book[] books=new book[n];
for(int i=0;i<n;i++){
System.out.println("\n Enter Deatais for Book   :"+(i+1)+"-----------------");
System.out.println("Select category (1 for Literature, 2 for Fiction");
int choice=sc.nextInt();
sc.nextLine();

System.out.println("publisher Name");
String publishername=sc.nextLine();
System.out.println("Book name  :");
String bookname=sc.nextLine();
System.out.println("Author :");
String author=sc.nextLine();
System.out.println("Price :");
double price=sc.nextDouble();
sc.nextLine();
if (choice==1){
System.out.print("Literature type  :");
String type=sc.nextLine();
books[i]=new literature(publishername,bookname,author,price,type);
}
else if(choice==2){
System.out.print("Fiction Genre   :");
String genre=sc.nextLine();
books[i]=new fiction(publishername,bookname,author,price,genre);
}else
{System.out.println("Invalid choice");
}
}
System.out.println("\n-----------------Dispalay Books by category--------------");
System.out.print("Enter category to display (1 for Literature ,2 for Fiction) :");
int searchchoice=sc.nextInt();
boolean found=false;
for(int i=0;i<n;i++){
if(searchchoice==1&& books[i] instanceof literature){
books[i].display();
found=true;
}
else if(searchchoice==2&& books[i] instanceof fiction){
books[i].display();
found=true;
}}
if (!found){
System.out.println("No books found in selcted category");
}
sc.close();
}}



