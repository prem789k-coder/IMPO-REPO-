import java.io.*; 
 
class Fileprg { 
    public static void main(String args[]) { 
        // Writing to a File 
        String fname = "example.txt"; 
        try { 
            FileOutputStream fout = new FileOutputStream(fname); 
            String content = "This program is of File Handling"; 
            fout.write(content.getBytes()); 
            fout.close(); // It's good practice to close the stream 
        } catch (IOException e) { 
            System.out.println(e.getMessage()); 
        } 
 
        // Reading a content from file 
        try { 
            FileInputStream fin = new FileInputStream(fname); 
            int ch; 
            while ((ch = fin.read()) != -1) { 
                System.out.print((char) ch); 
            } 
            fin.close(); // It's good practice to close the stream 
        } catch (IOException e) { 
            System.out.println(e.getMessage()); 
        } 
    } 
} 
