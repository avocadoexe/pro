import java.util.*;
class Complex
{
int real,imag;
Complex()
{
}
Complex(int treal,int timag)
{
real=treal;
imag=timag;
}
Complex add(Complex c1,Complex c2)
{
Complex temp=new Complex();
temp.real=c1.real+c2.real;
temp.imag=c1.imag+c2.imag;
return temp;
}
}
class MainComplex
{
public static void main(String args[])
{
Scanner S= new Scanner(System.in);
Complex c1=new Complex();
System.out.println("Enter the first complex number:");
c1.real=S.nextInt();
c1.imag=S.nextInt();
Complex c2=new Complex();
System.out.println("Enter the second complex number:");
c2.real=S.nextInt();
c2.imag=S.nextInt();
Complex c3=new Complex();
c3=c3.add(c1,c2);
System.out.println("Sum is: "+c3.real + "+" + c3.imag + "i");
}
} 
