import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
public class CheckDirectory {

    public static void main(String[] args) {
        String path = "C:\\Users\\Administrator\\Desktop\\3rdY 2ndsem\\Lab Exercise\\AP";
        File myfile = new File(path);

        System.out.println("is " + path + " a directory? " + myfile.isDirectory()); //use isDirectory() function
        
        String [] printed = myfile.list();   //using .list() function that returns the names of the contents in the directory in String format.
            System.out.println("    Contents inside the " + path + " directory using list() method: ");

            for (String name : printed) {
                System.out.println("        " + name);
            }

            System.out.println("    check wheter the values of the list are directory or file");
            for (String name : printed) {
                File tempfile = new File(path + "\\" + name);
                if (tempfile.isDirectory()) {
                    System.out.printf("%s%-30s%s%n","        previous path\\ " , name  , "   is a Directory");
                } else {
                    System.out.printf("%s%-30s%s%n","        previous path\\ " , name , "    is a file");
                }
            }

        System.out.println("\n\n");
        
            // e.g. for FilenameFilter()
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return dir.getName().equals("AP") && name.toLowerCase().endsWith(".txt");
            }
        };
        File[] textFilesEndWith_txt = myfile.listFiles(filter);

            // e.g. for FilenameFilter()
        FileFilter directoryFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        };
        File[] directories = myfile.listFiles(directoryFilter);


        File [] retout = myfile.listFiles(filter); //using listFiles() function that returns the File objects of each content file
            System.out.println("    Contents inside the " + path + " directory using listFile() method: ");

            if(retout != null){
                for (File obj :retout){
                    System.out.println("        " + obj.getName() + (obj.isDirectory()?" (Directory) " : " (file) "));
                }
            }

    }

}
