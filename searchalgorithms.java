import java.util.Scanner;
import java.util.Arrays;
public class searchalgorithms{
//linear search
static int linearsearch(int[]arr,int target){
for(int i=0;i<arr.length;i++)
{if(arr[i]==target)
{
return i;
}}
return -1;
}
//binary search
static int binarysearch(int[]arr,int target)
{
int low=0;
int high=arr.length-1;
while(low<=high){
int mid=(low+high)/2;
if(arr[mid]==target)
{
return mid;
}
else if(arr[mid]<target)
{
low=mid+1;
}
else
{
high=mid-1;
}}
return -1;
}
//recursive binary search
static int binarysearchrecursive(int[]arr,int low,int high,int target){
if(low>high){
return -1;
}
int mid=(low+high)/2;
if(arr[mid]==target)
{
return mid;
}
else if(arr[mid]<target){
return 
binarysearchrecursive(arr,mid+1,high,target);
}
else{
return binarysearchrecursive(arr,low,mid-1,target);
}
}
//main method
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of elements ");
int n=sc.nextInt();
int[]arr=new int[n];
System.out.println("Enter "+n+" elements");
for(int i=0;i<n;i++)
{arr[i]=sc.nextInt();
}

System.out.print("Enter element to search");
int target=sc.nextInt();
//linear search
int linearresult=linearsearch(arr,target);
if(linearresult !=-1)
System.out.println("Linear search element found at index "+linearresult);
else
System.out.println("Linear search element not found");
//sort array for binary search

Arrays.sort(arr);
System.out.println("sorted array:"+Arrays.toString(arr));

//binary search
int binaryresult=binarysearch(arr,target);
if(binaryresult!=-1)

System.out.println("Simple binary search element found at index "+binaryresult);
else
System.out.println("simple binary search element not found");
//recursive binary search
int recursiveresult=binarysearchrecursive(arr,0,arr.length-1,target);
if(recursiveresult!=-1)
System.out.println("Recursive binary search element found at index "+recursiveresult);
else
System.out.println("Recursive binary seacrh element not found");
sc.close();
}
}



