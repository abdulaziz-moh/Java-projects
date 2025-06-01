import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FileReadandWrite {

    public static void main(String [] args){



        // try{
        //     FileInputStream inputdata = new FileInputStream("text.txt");
            
        //     int byteread;
        //     // char ch;
        //     List<Character> ch = new ArrayList<>();
        //     int i=0;
        //     while ((byteread = inputdata.read()) != -1){
        //         // byteread = inputdata.read();
        //         ch.add((char)byteread);
        //         if (ch.get(i) == '\n' ){break;}
        //         i++;
        //     }
        //     System.out.println(ch.toString());
        //     inputdata.close();
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }

        // try{
        //     FileInputStream inputdata = new FileInputStream("text.txt");
        //     Scanner input = new Scanner(inputdata);
        //     System.out.println(input.nextLine());

        //     input.close();
        //     inputdata.close();
        // }catch(IOException e){
        //     System.out.println(e.getMessage());
        // }

        try{
            FileReader inputdata = new FileReader("text.txt");
            System.out.println(inputdata.read());
            Scanner input = new Scanner(inputdata);
            System.out.println(input.nextLine());

            input.close();
            inputdata.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }



    }
    
}
