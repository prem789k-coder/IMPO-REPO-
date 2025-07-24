import java.io.*;
// Single Level Inheritance
class Student
{
int roll;
String name;
void getdata(int r, String n)
{
roll=r;
name=n;
}
void displaydata()
{
System.out.println("Student name is : "+name);
System.out.println("Student Roll Number is : "+roll);
}
}
// Multilevel Inheritance
class Marks extends Student
{
int OOPJ, DBMS, EHS;
void getmarks(int o, int d, int e)
{
OOPJ=o;
DBMS=d;
EHS=e;
}
void displaymarks()
{
System.out.println("Student Marks in OOPJ : "+OOPJ);
System.out.println("Student Marks in DBMS : "+DBMS);
System.out.println("Student Marks in EHS : "+EHS);
}
}

// Hierarchical Inheritance
class Grade extends Marks
{
char grade;
double tot, per;
void displaygrade()
{
tot=(OOPJ+DBMS+EHS);
per=(tot/300.0)*100;
if (per>=80)
grade='A';
if (per>=60 && per<80)
grade='B';
if (per>=40 && per<60)
grade='C';
System.out.println("Student Marks Total : "+tot);
System.out.println("Student Percentage : "+per);
System.out.println("Student Grade : "+grade);
}
}

class Result extends Student
{
public static void main(String args[])
{
Grade obj=new Grade();
obj.getdata(269,"PREM");
obj.displaydata();
obj.getmarks(96,98,93);
obj.displaymarks();
obj.displaygrade();
}
}
