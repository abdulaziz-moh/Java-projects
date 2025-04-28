import java.io.File;
public class CheckDirectory {
    
    public static void main(String [] args){
        String path = "com\\example";
        File myfile = new File(path);
        System.out.println("is " + path + " a directory? " + myfile.isDirectory());
        System.out.println("Contents inside the " + path + "directory: ");
        String[] printed = myfile.list();
        for (String name : printed){
            System.out.print(name + " ");
        }
        System.out.println("");
        System.out.println(myfile.listFiles());

    }
    
}
