import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Arraylistdemo{
public static void main(String[]args){Scanner sc=new Scanner(System.in);
List<String>systemLog=new ArrayList<>();
System.out.println("------------Adding Elements--------------");
systemLog.add("Kernel");
systemLog.add("Bootloader");
systemLog.add("Daemon");
systemLog.add("Shell");

System.out.println("System Log List: "+systemLog);
System.out.println("\n------Searching for an Element-------");
System.out.println("Enter element to search:" );
String target=sc.nextLine();
if(systemLog.contains(target)){
int position=systemLog.indexOf(target);
System.out.println("element found at position:"+position);
}
else
{
System.out.println("Element not found in the list");
}
System.out.println("\n------Removing an Element---");
boolean isRemoved=systemLog.remove("Bootloader");
if(isRemoved){
System.out.println("Bootloader removed successfully:");}
else{
System.out.println("Bootloader not found");
}
System.out.println("List after removal: "+systemLog);
System.out.println("\n-------Sorting the list-------");
Collections.sort(systemLog);
System.out.println("Sorted list:"+systemLog);
sc.close();
}}




