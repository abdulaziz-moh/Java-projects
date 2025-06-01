package SOCKET;


import java.io.*;
import java.net.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class User {

    public static void main(String[] args) {
        try{
            Socket usersocket = new Socket("localhost", 4005);

            DataInputStream responce = new DataInputStream(usersocket.getInputStream());
            DataOutputStream requst = new DataOutputStream(usersocket.getOutputStream());

            int r = 3;
            requst.writeInt(r);
            int ans = responce.readInt();
            System.out.println("The square is: " + ans);
            
        }
        catch(UnknownHostException e){
            System.out.println("unkown host exception");
        }
        catch(IOException e){
            System.out.println("io exception");
        }
        

    }
    
}
