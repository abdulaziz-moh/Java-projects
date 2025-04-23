import java.util.List;
import java.util.ArrayList;
import java.util.Collections;   //see more on the difference between Collection Vs. Collections
public class CollectionVsCollections { 
    
    // Now in this code we will see that Collection is an interface that most JCF interfaces(extend) and classes(impliment)
    // while Collections is a class that contains static helper methods for working with Collection objects (and its sub-interfaces). eg act on List and its childs
    public static void main(String [] args){

        //first lets create an object with reference of Collection
        List<Integer> seeRelation = new ArrayList<>();  
        int [] x = {7,6,4,3,0,4,3};

        for (int i=0; i<x.length ; i++){
            seeRelation.add(x[i]);
        }

        // List referenced object befor the opereations made by Collectons static method
        for (Integer val: seeRelation){
            System.out.print(val + "  ");
        }
        System.out.println("");

        Collections.sort(seeRelation);   // here we see that the Collections can be used if only the object is referenced to list or its inherted child otherwise it dont work
                                        // eg if our code was like this Collection<Integer> seeRelation = new ArrayList<>();   we were not be able to use the .sort() function on the ArrayList object referenced by Collection
        
        // Collection referenced object befor the opereations made by Collectons static method        
        
        for (int val: seeRelation){
            System.out.print(val + "  ");
        }
        System.out.println("");

        }
    
}
