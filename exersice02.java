import java.util.*;
class exersice02{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the marks of the student  in s1:");
int s1=sc.nextInt();
System.out.print("Enter the marks of the student  in s2:");
int s2=sc.nextInt();
 System.out.print("Enter the marks of the student in s3:");
int s3=sc.nextInt();
 System.out.print("Enter the marks of the student in s4:");
int s4=sc.nextInt();
 System.out.print("Enter the marks of the student in s5:");
int s5=sc.nextInt();
int total=s1+s2+s3+s4+s5;
double percentage=(total*100)/500;
  System.out.print("student percentage in the exam is :");
System.out.print(percentage);
}
}
 