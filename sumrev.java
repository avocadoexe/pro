import java.util.*;
class Sumrev
{
int m,d,sum=0,rev=0;
void sum(int m)
{
while(m>0)
{
d=m%10;
sum=sum+d;
m=m/10;
}
System.out.println("Sum of given number is"+sum);
}
void reverse(int m)
{
while(m>0)
{
d=m%10;
rev=rev*10+d;
m=m/10;
}
System.out.println("Reverse of given number is"+rev);
}
}
class SumrevMain
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
n=sc.nextInt();
Sumrev sr=new Sumrev();
sr.sum(n);
sr.reverse(n);
}
}
