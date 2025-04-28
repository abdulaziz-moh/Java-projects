package com.example.mypackage;
import java.util.Random;


import java.lang.Math;
import java.util.ArrayList;

public class Practice {

    String screen_output_syntax;
    static int counter = 0;
    int counts = 0;
    Practice(){
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

        




        Practice obj0 = new Practice();
        Practice obj1 = new Practice();
        Practice obj2 = new Practice();
        obj0.count();
        obj1.count();
        obj2.count();

        // method overloading (static binding ,polimorphism ) 
        System.out.println("sum with int input : " + add(1,2));
        System.out.println("sum wiht in float : " + add(1.0f,2.0f));

        // method overriding (dynamic bindig , polimorphism)
        Practice cppss = new pract_cpp();
        Practice javass = new pract_java();
        
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
    
        System.out.println(Math.PI);
    }  
    

    
    
}

class pract_java extends Practice{
    void print_syntax(){
        screen_output_syntax = "System.out.println('hello world'); ";
        System.out.println(screen_output_syntax);
    }  

    void additionalfunciton(){
        System.out.println("this is the additonal function only on the child class!!!");
    }

}


class pract_cpp extends Practice{
    void print_syntax(){
        screen_output_syntax = "cout <<'hello world'; ";
        System.out.println(screen_output_syntax);
    } 

}
