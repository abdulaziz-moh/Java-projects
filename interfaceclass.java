public interface interfaceclass {
    
    //by defult the functions here are abstract
    int add(int a, int b);
    int subtract(int a, int b);
}

class mathematics implements interfaceclass{

      // the interface ENFORCES the implimenter class to impliment all the abstruct methods inside it.

    @Override 
    public int add(int a, int b){
        return a+b;
    }
    @Override
    public int subtract(int a, int b){
        return a-b;
    }

}