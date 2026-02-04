import java.util.Scanner;
public class matrixopera{
public static void main (String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter dimension for matrix A");
System.out.println("Rows");
int r1=sc.nextInt();
System.out.println("Colums");
int c1=sc.nextInt();

System.out.println("Enter dimension for matrix B");
System.out.println("Rows");
int r2=sc.nextInt();
System.out.println("Colums");
int c2=sc.nextInt();
int[][]A=new int[r1][c1];
int[][]B=new int[r2][c2];
//reading matrix A
System.out.println("Enter the elements of matrixA");
for(int i=0;i<r1;i++)
 for(int j=0;j<c1;j++)
     A[i][j]=sc.nextInt();
 System.out.println("Enter the elements of matrixB");
for(int i=0;i<r2;i++)
 for(int j=0;j<c2;j++)
     B[i][j]=sc.nextInt();
 while(true){
 System.out.println("\n------Menu--------");
 System.out.println("1.Addition");
 System.out.println("2.Multiplication");
 System.out.println("3.Exit");
 System.out.println("Enter choice");
 int choice=sc.nextInt();
 if (choice==3)break;
 switch(choice){
 case 1:
 if(r1==r2&&c1==c2){
 System.out.println("\n------Menu--------");
 System.out.println("Sum matrix");
 //Logic Row major traversal
 for(int i=0;i<r1;i++){
 for(int j=0;j<c1;j++){
 System.out.print(A[i][j]+B[i][j]+"\t");
 }
 System.out.println();
 }
 }
 else
 {
 System.out.println("Error :Dimension must be same for addition");
 }
 break;
 case 2:
 if(c1==r2){
 	System.out.println("Product matrix");
 	int[][]c=new int[r1][c2];
 for(int i=0;i<r1;i++){
	 for(int j=0;j<c2;j++){
	 c[i][j]=0;
 for(int k=0;k<c1;k++){
	 c[i][j]+=A[i][k]*B[k][j];
 }
 System.out.print(c[i][j]+"\t");
 }
 System.out.println();
 }
 }else
{
System.out.println("Error coloumn of A must equal to row of B");
}
break;
default:System.out.println("Invalid choice");
}
}
}
}
 

