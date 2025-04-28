import java.io.IOException;
import java.io.InputStream;

public class ReadFromSystemIn {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        System.out.println("Enter text (press Enter to finish):");

       char []inputss =new char[10];
        try {
            int byteRead;
            int i = 0;
            // Read bytes one by one until the Enter key is pressed
            while ((byteRead = inputStream.read()) != -1) {
                char character = (char) byteRead;
                // Check for the Enter key (platform-dependent, might need adjustments)
                if (character == '\n') {
                    break; // Exit the loop when Enter is pressed
                }
                // System.out.println("what");
                inputss[i] = character; i++;
                System.out.print(byteRead+ " ");  //at last it prints 13 which is the representation of /n
                System.out.println(character);    //prints nothing exepts the newline due to the println 
            }
            System.out.println("the input is : " + new  String(inputss));

        } catch (IOException e) {
            System.err.println("Error reading from input stream: " + e.getMessage());
        } finally {
            // It's generally good practice to close input streams,
            // although System.in is a standard stream and closing it might have
            // unintended side effects in some environments. For this simple example,
            // we'll skip explicitly closing System.in.
            // try {
            //     if (inputStream != null) {
            //         inputStream.close();
            //     }
            // } catch (IOException e) {
            //     System.err.println("Error closing input stream: " + e.getMessage());
            // }
        }
    }
}