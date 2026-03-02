import java.util.*;
class Student {
int rollno;
String name,batch;
Scanner sc=new Scanner(System.in);
void read(){
System.out.println("Enter name : ");
name=sc.next();
System.out.println("Enter roll number : ");
rollno=sc.nextInt();
System.out.println("Enter batch  : ");
batch=sc.next();
}

void display(){
System.out.println("Roll number :" +rollno);
System.out.println("Name :" +name);
System.out.println("Batch :" +batch);
}}

class Result extends Student{
int m1,m2,m3,m4,m5,t,g;
void read(){
super.read();
System.out.println("Enter 5 marks : ");
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
m4=sc.nextInt();
m5=sc.nextInt();
t=m1+m2+m3+m4+m5; }

void grade(){
g=t/5;
if(g>=90){
System.out.println("Grade A"); }
else if (g>=80){
System.out.println("Grade B"); }
else if (g>=70){
System.out.println("Grade C"); }
else if (g>=60){
System.out.println("Grade D"); }
else if (g>=50){
System.out.println("Grade P"); }
else{
System.out.println("FAILED !"); }
}

void display(){
super.display();
System.out.println("Mark 1 : "+m1);
System.out.println("Mark 2 : "+m2);
System.out.println("Mark 3 : "+m3);
System.out.println("Mark 4 : "+m4);
System.out.println("Mark 5 : "+m5);
System.out.println("Total : "+t);}
}

class StudentMain{
public static void main(String[] args){
Result r=new Result();
r.read();
r.display();
r.grade(); }
}
