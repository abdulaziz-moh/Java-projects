import java.io.File;
import java.util.Scanner;

public class FileDemonestration {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the file or directory path: ");
        analyzePath(input.nextLine());
    } 

    static void analyzePath(String path ){
        File myfile = new File(path);
        if (myfile.exists()){
            System.out.printf(
                "%s %s\n%s%s",myfile.getName(),"exists","is ",(myfile.isDirectory()? "directory":"not directory")
            //not finished here finish it!!! page 20 onward
                );

        }
        else{
            System.out.printf("%s!!%n%s!!%n","Please provide valid paht","The provided path doesn't exist or unreachable");
        }

    }

    
}
