import java.util.*;
class distance
{
public static void main(String args[])
{
int x1,x2,y1,y2;
double d;
Scanner sc=new Scanner(System.in);
System.out.println("enter the (x1,y1)vlaues;");
x1=sc.nextInt();
y1=sc.nextInt();
System.out.println("enter the (x2,y2)vlaues;");
x2=sc.nextInt();
y2=sc.nextInt();
d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
System.out.println("answer:"+d);
}
}
