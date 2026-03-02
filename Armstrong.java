import java.util.*;
class calc{
public static void main(String[] args){
int x=Integer.parseInt(args[0]);
int y=Integer.parseInt(args[1]);
int a,b,c,d,e;

a=x+y;
b=x-y;
c=x*y;
d=x/y;
e=x%y;
System.out.println("Result of addition is : "+a);
System.out.println("Result of subtraction is : "+b);
System.out.println("Result of division is : "+c);
System.out.println("Result of multiplication is : "+d);
System.out.println("Result of remainder is : "+e);
}}
