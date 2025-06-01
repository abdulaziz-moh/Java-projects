import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.CHAR_ARRAY;
import javax.print.DocFlavor.STRING;

public class readfromfile {
    public static void main(String [] args) throws IOException{
        try{
        FileInputStream myfile = new FileInputStream("test.txt");
        FileReader mychrfile = new FileReader("test.txt");

        int ch;
        while ((ch =  mychrfile.read()) != -1) {
            
            System.err.print((char)ch);
            
        }


        int byteread;
        List<Character> ans = new ArrayList<>();

        while ((byteread = myfile.read()) != -1) {
            
            ans.add((char)byteread);
        }

        System.out.println(ans);
        System.out.println();
        


        FileWriter writeonfile = new FileWriter("test.txt",true);
        char [] name = {'a','b','u','l','a','z','i','z'};
        writeonfile.write(name);
        writeonfile.close();
        while((byteread = myfile.read()) != -1){
            ans.add((char)byteread);

        } 


        for (char c: ans){
            System.out.print(c);
        }

        }catch(IOException e){
            e.getMessage();
        }
        //USING PROCESS BUILDER
    try{
        ProcessBuilder myprocessbuilder = new ProcessBuilder("notepad.exe", "test.txt");  //Create a process builder instance for the external process and with parameter
        Process myprocess = myprocessbuilder.start();   //Start process
        int exitCode  = myprocess.waitFor();       //Wait for completion
        System.out.println(exitCode);    //Get exit code
    }catch (IOException ioe  ){
    }catch (InterruptedException ie){
    }
    
    //USING RUNTIME
    try{
        Runtime myruntime = Runtime.getRuntime();  // create a Runtime instance and use its exec() method to start the external program. 
        Process myprocess = myruntime.exec("notepad.ext test.txt"); //Start process
        int exitCode = myprocess.waitFor();    //Wait for completion
        System.out.println(exitCode);    //Get exit code

    }catch(IOException ioe){
    }catch (InterruptedException ie){
    }


    // Create a PipedInputStream and a PipedOutputStream
    PipedInputStream in = new PipedInputStream();    
    PipedOutputStream out = new PipedOutputStream(in); 
    // Write some data to the output stream    
    out.write("Hello, world!".getBytes());
              // Read the data from the input stream 
    byte[] buffer = new byte[1024]; 
    int bytesRead = in.read(buffer); 
    String message = new String(buffer, 0, bytesRead); 
    System.out.println(message); 
               // Close the streams 
    out.close(); 
    in.close(); 

    }
    
}


