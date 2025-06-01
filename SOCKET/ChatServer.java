package SOCKET;

import java.io.*;
import java.net.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8000)) {
            System.out.println("Server started. Waiting for a client...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            DataInputStream input = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream output = new DataOutputStream(clientSocket.getOutputStream());

            ExecutorService pool = Executors.newFixedThreadPool(2);

            // Thread to receive messages
            pool.execute(() -> {
                try {
                    while (true) {
                        System.out.println("--");
                        String msg = input.readUTF();
                        System.out.println("Client: " + msg);
                    }
                } catch (IOException e) {
                    System.out.println("Client disconnected.");
                }
            });

            // Thread to send messages
            pool.execute(() -> {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                    String msg;
                    while ((msg = br.readLine()) != null) {
                        System.out.println("--");
                        output.writeUTF(msg);
                    }
                } catch (IOException e) {
                    System.out.println("Error sending message.");
                }
            });

        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
