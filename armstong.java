import java.util.*;
class Armstrong{
public static void main(String[] args){
int n,i,c,r,d,m,x,y;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the lower limit:");
n=sc.nextInt();
System.out.println("Enter the upper limit:");
m=sc.nextInt();
System.out.println("Armstrong numbers are : ");

for(i=n;i<=m;i++){
c=i;
y=0;

while(c!=0){
c/=10;
y++; }

d=0;
c=i;

while(c!=0){
r=c%10;
d+=Math.pow(r,y);
c=c/10; }

if(i==d){
System.out.println(i); }
}}}
