import java.util.*;
class Matrix{
public static void main(String[] args){
int c,r,i,j,s=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows : ");
r=sc.nextInt();
System.out.println("Enter the number of cols : ");
c=sc.nextInt();
int a[][]=new int [r][c];
System.out.println("Enter the matrix elements : ");
for(i=0;i<r;i++){
for(j=0;j<c;j++){
a[i][j]=sc.nextInt(); }}
System.out.println("The given matrix is : ");
for(i=0;i<r;i++){
for(j=0;j<c;j++){
System.out.print(a[i][j] + "\t"); }
System.out.println("\n"); }
System.out.println("Transpose of matrix is : ");
for(i=0;i<c;i++){
for(j=0;j<r;j++){
System.out.print(a[j][i] + "\t"); }
System.out.println("\n"); }
if(r==c){
for(i=0;i<r;i++){
for(j=0;j<c;j++){
if(i==j){
s=s+a[i][j]; }}}
System.out.println("Trace of matrix = "+s); }
else{
System.out.println("Trace cannot be found"); }
}}
