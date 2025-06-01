import java.io.File;
public class CreatingDirectory {

    public static void main(String [] args ){
        // here if the new folder (parent directory) doesn't exist it can't create the folder

        File createfoldermkdir = new File("new folder\\folder");
        System.out.println(createfoldermkdir.mkdir());

        // here if the new folder (parent directory) doesn't exist it create the folders also

        File createfoldermkdirs = new File("new folder\\folders");
        System.out.println(createfoldermkdirs.mkdirs());
    }
    
}
