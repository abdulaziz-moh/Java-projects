import java.io.*;
public class FileDemo {
    static void p (String s){
        System.out.println(s);
    }

    public static void main(String args[]){
        File f1 = new File("C:\\Users\\Administrator\\Desktop\\3rdY 2ndsem\\Lab Exercise\\AP\\file1.txt");

        p("File Name: " + f1.getName());
        p("Path: " + f1.getPath());
        p("Absolute path: " + f1.getAbsolutePath());
        p("Parent: " + f1.getParent());
        p(f1.exists() ? "exists" : "doesn't exist");
        p(f1.canWrite() ? "is writable" : "is not writable");
        p(f1.canRead() ? "is readable" : "is not readable");
        p("is" + (f1.isDirectory() ? "" : " not") + " a directory");
        p(f1.isFile() ? "is normal file" : "might be a named pipe");
        p(f1.isAbsolute() ? "is Absolute" : "is not Absolute");
        p("File last modified: " + f1.lastModified());
        p("File size: " + f1.length() + "Bytes");

        try (FileReader  fr = new FileReader("file1.txt")){
            // FileReader  fr = new FileReader("Text1.txt");
            int c;
            while ((c = fr.read()) != -1) System.out.print((char) c);

        }catch(IOException e){
            System.out.println("I/O Error: " + e);

        }


    }




}
