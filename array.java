import java.util.*;
class sort
{
int t,i,j;
void sorting(int a[],int n)
{
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
}
public static void main(String args[])
{
int n,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the array size:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the Array elements:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
sort s=new sort();
s.sorting(a,n);
System.out.println("sorted array");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}}}
