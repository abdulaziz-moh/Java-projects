import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
   public static void main(String[] args) {

        //all colors
      String[] allColors = new String[]{"MAGNETA", "RED", "WHITE", "BLUE", "CYAN"};
      List<String> colors = new ArrayList<>();
      for(int i = 0; i< allColors.length; ++i) {
         colors.add(allColors[i]);
      }

         //remove colors
      String[] removeColors;
      removeColors = new String[]{"RED", "WHITE", "BLUE"};
      List<String> rColors = new ArrayList<>();  //we make the reference List to use only functions of the List not the whole ArrayList saving memory
      for (String str:  removeColors){
         rColors.add(str);
      }

         //pring all colors before the removal
      for (String str : allColors){
         System.out.print(str + ", ");
      }
      System.out.println("");

      removeColFunction(colors,rColors);

      //pring all colors after the removal
      for (String str : colors){
         System.out.print(str + ", ");
      }
      System.out.println("");


   }

   static void removeColFunction (Collection<String> allC_col, Collection<String> remC_col){
      Iterator<String> iteratorOnallcolor = allC_col.iterator();  //now we store the object retuned by the iterator() function of the allC_col to an Iterator object, just to use the functions inside the Iterator(like .hasNext() ==> return true if it have a next value and false if not, .next()  ==> returns the next value if it exists)
      
      while (iteratorOnallcolor.hasNext()){
         if (remC_col.contains(iteratorOnallcolor.next())){
            iteratorOnallcolor.remove();
         }
      }
   }
}