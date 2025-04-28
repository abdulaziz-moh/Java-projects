public class SuperKeyword {
    public SuperKeyword(int x){

    }
    public static void main(String [] args){
        System.out.println("hello world");
    }
}

class subclass extends SuperKeyword{
    
    public subclass(int y){
        super(y);            //comment this line to see:  
                            //the implicit call of the subclass(i.e super() =>no arg constructor inside subclass constructor for calling/initializing of a super class constructor because the subclass uses a methods variables of a super class and they should be initialized) failing due to the super class have no default constructor with no argument or generally their is no constructor with a no-argument
    }

}
