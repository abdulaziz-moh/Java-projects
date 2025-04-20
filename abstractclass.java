public abstract class abstractclass {
    public void print(){
        System.out.println("hello world");
    }
    public abstract void mustinherit(); //  {System.out.println("Abstract method must be inherited");}   //abstract methods don't specify the body (i.e it's syntax error to specify abstract method body.)
                                        // WE CAN ONLY HAVE ABSTRUCT METHODS INSIDE ABSTRACT CLASS.
}

class inheritabstract extends abstractclass {

    public void mustinherit(){  // IT'S MUST TO INHERIT THE FUNCTION mustinherit() BECAUSE IT'S ABSTRACT METHOD
                                // CANNOT REDUCE THE VISIBLIYT OF THE INHERITED CLASS i.e FOR THIS CASE THE mustinherit() function cannot be less visible than PUBLIC.
        System.out.println("This is the forcefully inherited method from its abstract parent class");

    }

}