import java.util.*;
class number
{
int n,r=0,dec;
String binary="",octal="",hex="";
char oct[]={'0','1','2','3','4','5','6','7'};
char hexa[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
Scanner Sc=new Scanner(System.in);
void read()
{
System.out.println("Enter the number:");
dec=Sc.nextInt();
}
void binary()
{
n=dec;
r=0;
while(n>0)
{
r=n%2;
binary=r+binary;
n=n/2;
}
System.out.println("Integer to binary="+ binary);
}
void octal()
{
n=dec;
r=0;
while(n>0)
{
r=n%8;
octal=r+octal;
n=n/8;
}
System.out.println("Integer to octal="+octal);
}
void hexadecimal()
{
n=dec;
r=0;
while(n>0)
{
r=n%16;
hex=hexa[r]+hex;
n=n/16;
}
System.out.println("Integer to hex="+hex);
}
}
class Conversion
{
public static void main(String args[])
{
number x=new number();
x.read();
x.binary();
x.octal();
x.hexadecimal();
}
}
