import java.util.*;
class fibo{
public static void main(String args[]){
int n,a=0,b=1,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the limit : ");
n=sc.nextInt();
System.out.println("Fibonacci series : ");
System.out.println(a);
System.out.println(b);
c=a+b;
while(c<n){
System.out.println(c);
a=b;
b=c;
c=a+b; }
}}
