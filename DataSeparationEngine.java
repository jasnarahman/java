import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class DataSeparationEngine{

public static void main (String[] args){

//1.Establish file pointers


File inputFile= new File("numbers.txt");
File evenFile= new File("even.txt");
File oddFile= new File("odd.txt");

System.out.println("->initiating tokenization sequence.....");
// multi strean try -With -Resources
//we open three streams simultaneously .The JVM quaranees  all three
//will be closed safely,regardless of partial failure
try (

Scanner sc= new Scanner(inputFile);
PrintWriter evenWriter= new PrintWriter(evenFile);
PrintWriter oddWriter= new PrintWriter(oddFile)
)
{
int count=0;
//The token extraction loop
//has NextInt() prevents NoSuchElementException by verifieng 
//the next token is mathematically a valid integer before reading
while(sc.hasNextInt()){
//Extract and parse the token 
int number =sc.nextInt();
count++;
//Parity Evaluation and Routing
if(number % 2 ==0)
{
evenWriter.println(number);

}
else
{
oddWriter.println(number);
}}
System.out.println("Result :Sucessfully processed"+count+"Integers");
System.out.println("Result :Output routed to 'even.txt'and 'odd.txt'");
}
catch(FileNotFoundException e){
// This triggers specifically if "numbers.txt" does not exist in the root directory.

// PrintWriter will auto-create missing output files, but Scanner CANNOT create input files.

System.err.println("FATAL I/O ERROR:'numbers.txt' not found");

System.err.println("Fix: You must manually craete 'numbers.txt' int the project directory and populate it with integers");
}
}
}







