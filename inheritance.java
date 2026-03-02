import java.io.*;
class country
{
country()
{
System.out.println("country");
}
void printcon()
{
System.out.println("Printing country...");
}
}
class state extends country
{
state()
{
System.out.println("state");
}
void printnat()
{
System.out.println("printing state..");
}}
class district extends state
{
district()
{
System.out.println("district...");
}
void printdis()
{
System.out.println("printing district...");
}
}
class earth
{
public static void main(String args[])
{
district d=new district();
d.printcon();
d.printnat();
d.printdis();
}
}
