import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
public class wrapperclasscheck {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        List<Integer> checkwrapper = new LinkedList<>();

        System.out.println("Enter the inputs");

        for (int i =0; i <5 ; i++){
            System.out.print("num"+(i+1)+": ");
            int x = input.nextInt();
            checkwrapper.add(x);
        }
        
        for (int i : checkwrapper){
            System.out.print(i+" ");
        }
        input.close();


    }
    
}
