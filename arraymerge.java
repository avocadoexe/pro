import java.util.*;
class ArrayMerge{
public static void main(String args []){
int m,n,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of first array :");
m=sc.nextInt();
System.out.println("Enter the size of second array :");
n=sc.nextInt();
int a[]=new int[m];
int b[]=new int[n];
int c[]=new int[m+n];
System.out.println("Enter the elements of first arrays : ");
for(i=0;i<m;i++){
a[i]=sc.nextInt();
c[i]=a[i]; }
System.out.println("Enter the elements of second arrays : ");
for(j=0;j<n;j++){
b[j]=sc.nextInt();
c[m+j]=b[j]; }
System.out.println("The merged array is : ");
for(i=0;i<m+n;i++) {
System.out.println(c[i]); }
}}
