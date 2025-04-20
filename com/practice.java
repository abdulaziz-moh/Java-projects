package com;
import java.util.Random;


import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class practice {

    String screen_output_syntax;
    static int counter = 0;
    int counts = 0;
    practice(){
        counter++;
        counts = counter;
    }

    void count(){
        System.out.println("I am object: " + counts);
    }

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

        practice check = new pract_java();
        // check.counts;
        




        practice obj0 = new practice();
        practice obj1 = new practice();
        practice obj2 = new practice();
        obj0.count();
        obj1.count();
        obj2.count();

        // method overloading (static binding ,polimorphism ) 
        System.out.println("sum with int input : " + add(1,2));
        System.out.println("sum wiht in float : " + add(1.0f,2.0f));

        // method overriding (dynamic bindig , polimorphism)
        practice cppss = new pract_cpp();
        practice javass = new pract_java();
        
        cppss.print_syntax();
        javass.print_syntax();

        Random ran_num = new Random();
        
        
        int a = (int)ran_num.nextFloat(10);
        float b = ran_num.nextFloat(10);

        float c = ran_num.nextInt(10);
        int d= ran_num.nextInt(10);
        
        System.out.println("random number generated ....");

        ArrayList<Float> floatarray1 = new ArrayList<Float>();
        floatarray1.add((float)a);
        floatarray1.add(b);
        floatarray1.add(c);
        floatarray1.add((float)d);
        floatarray1.add((float)(Math.ceil((Math.random() * 100))));
        System.out.println(floatarray1.toString());
        
        // System.out.println(" a: " + a + "\n b: " + b + "\n c: " + c + "\n d: " +  d + "\n e: " +  floatarray1[4]);
        
        int i =0;
        for (float f : floatarray1){
            System.out.println("floatarry["+ i++ +"]: " + f );
        }
        // System.out.println(Stream(toString(floatarray1)));
        // System.out.println("Implicit type casting (up casting ) showing\n  int x = 5; \n  float y = x returns a float value : " + y );
        System.out.println("");
        System.out.println("Explicit type casting (down casting )  showing\n   float z = 5.0f; \n   int a = (int)x returns an int : " + a);
    

    }  
    

    
    
}

class pract_java extends practice{
    void print_syntax(){
        screen_output_syntax = "System.out.println('hello world'); ";
        System.out.println(screen_output_syntax);
    }  

    void additionalfunciton(){
        System.out.println("this is the additonal function only on the child class!!!");
    }

}


class pract_cpp extends practice{
    void print_syntax(){
        screen_output_syntax = "cout <<'hello world'; ";
        System.out.println(screen_output_syntax);
    } 

}
