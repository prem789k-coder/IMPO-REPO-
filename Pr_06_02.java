import java.util.*; 
 
class DivideZero { 
    public static void main(String args[]) { 
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter 2 Numbers"); 
        int a = in.nextInt(); 
        int b = in.nextInt(); 
        try { 
            int res = a / b; 
            System.out.println("Result=" + res); 
        } catch (ArithmeticException e) { 
            System.out.println("Division by Zero is Not Possible............"); 
        } finally { 
            System.out.println("Finally Block Executed"); 
        } 
    } 
} 
