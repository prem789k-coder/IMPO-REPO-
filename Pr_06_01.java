import java.util.*; 
import java.io.*; 
 
class ThrowThrowsEx { 
    public static void checkage() throws IOException { 
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter age"); 
        int age = in.nextInt(); 
        if (age < 18) { 
            throw new ArithmeticException("Not Eligible"); 
        } else { 
            System.out.println("Eligible for Voting"); 
        } 
    } 
 
    public static void main(String args[]) throws IOException { 
        checkage(); 
    } 
} 
