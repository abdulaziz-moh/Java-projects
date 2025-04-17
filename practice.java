
public class practice {

    String screen_output_syntax;

    void print_syntax(){
        System.out.println(screen_output_syntax);
    }


    //compile time polimorphism
    public static int add(int x,int y){
        int sum = x+y;
        return sum;
    }

    public static float add(float x,float y){
        float sum = x+y;
        return sum;
    }

    public static void main(String args[]){
        System.out.println("sum with int input : " + add(1,2));
        System.out.println("sum wiht in float : " + add(1.0f,2.0f));

        practice cppss = new pract_cpp();
        practice javass = new pract_java();
        
        cppss.print_syntax();
        javass.print_syntax();
    

    }
    

    
    
}

class pract_java extends practice{
    void print_syntax(){
        screen_output_syntax = "System.out.println('hello world'); ";
        System.out.println(screen_output_syntax);
    }  

}


class pract_cpp extends practice{
    void print_syntax(){
        screen_output_syntax = "cout <<'hello world'; ";
        System.out.println(screen_output_syntax);
    } 

}
