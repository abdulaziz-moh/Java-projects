package SOCKET;

import java.io.*;
import java.net.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SocketCheck {
    public static void main(String[] args) {
        try {
            Socket soc = new Socket("localhost", 8000);
            System.out.println("Connected to server.");

            DataInputStream input = new DataInputStream(soc.getInputStream());
            DataOutputStream output = new DataOutputStream(soc.getOutputStream());

            ExecutorService pool = Executors.newFixedThreadPool(2);

            // Thread to receive messages from server
            pool.execute(() -> {
                try {
                    while (true) {
                        String msg = input.readUTF();
                        System.out.println("Server: " + msg);
                    }
                } catch (IOException e) {
                    System.out.println("Disconnected from server.");
                }
            });

            // Thread to send messages to server
            pool.execute(() -> {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                    String msg;
                    while ((msg = br.readLine()) != null) {
                        output.writeUTF(msg);
                    }
                } catch (IOException e) {
                    System.out.println("Error sending message.");
                }
            });

        } catch (IOException e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
