class MyException extends Exception { 
    public MyException(String message) { 
        super(message); 
    } 
} 
 
class UserDefineException { 
    public static void validate(int number) throws MyException { 
        if (number < 0) { 
            throw new MyException("Not a Valid Number"); 
        } else { 
            System.out.println("Valid Number=" + number); 
        } 
    } 
 
    public static void main(String args[]) { 
        try { 
            validate(8); // Calling with a valid number 
            // validate(-5); // Uncomment to see the exception being caught 
        } catch (MyException e) { 
            System.out.println(e.getMessage()); 
        } 
    } 
} 
