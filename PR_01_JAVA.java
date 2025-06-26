import java.io.*;

class Student{
    int roll_no, APP, OS, DSPD, SEIT, total;
    String name;
    double perc;
    
    public void getdetails(){
        name="PREM RAHANGDALE";
        roll_no=269;
        APP=97;
        OS=98;
        DSPD=99;
        SEIT=92;
        total=APP+OS+DSPD+SEIT;
        perc=(total/400.0)*100;
    }
    public void display(){
        System.out.println("Student Name :"+name);
        System.out.println("Student Roll Number :"+roll_no);
        System.out.println("Marks in APP :"+APP);
        System.out.println("Marks in OS :"+OS);
        System.out.println("Marks in DSPD :"+DSPD);
        System.out.println("Marks in SEIT :"+SEIT);
        System.out.println("Total Marks Obtained :"+total);
        System.out.println("Percentage :"+perc);
    }
public static void main(String args[]){
    Student obj = new Student();
    obj.getdetails();
    obj.display();
}
}
