import java.io.*;

public class CreateProcessExample {
    public static void main(String[] args) throws IOException, InterruptedException { // Create a ProcessBuilder
                                                                                      // instance for the external
                                                                                      // program
    //     ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe", "test.txt"); // Start the external program
    //     Process process = processBuilder.start(); // Wait for the process to finish
    //     int exitCode = process.waitFor(); // Print the exit code of the process
    //     System.out.println("Process exited with code " + exitCode);

    Runtime runtimebuilded = Runtime.getRuntime();
    Process proexecute= runtimebuilded.exec("notepad.exe text.txt");
    System.out.println(proexecute.isAlive());
    int exitcode = proexecute.waitFor();

    System.out.println(exitcode);
    System.out.println(proexecute.exitValue());



    }
}