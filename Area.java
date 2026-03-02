import java.util.*;
class triangle
{
public static void main(String args[])
{
int a,b,c,d;
double x;
Scanner sc = new Scanner(System.in);
System.out.println("Enter three sides of triangle:");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a==b && b==c)
{
System.out.print("Equilatral triangle");
}
else if (a==b || b==c || a==c)
{
System.out.print("Isosceles Triangle");
}
else
{
System.out.println("scalene triangle");
}
d = (a+b+c)/2;
x = Math.sqrt(d*(d-a)*(d-b)*(d-c));
System.out.println("area of triangle:"+x);
}
}
