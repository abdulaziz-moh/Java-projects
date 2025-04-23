import java.util.ArrayList;
import java.util.List;

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
      List<String> rColors = new ArrayList<>();

      for (String str:  removeColors){
         rColors.add(str);
      }
         //pring all colors before the removal
      for (String str : allColors){
         System.out.print(str + ", ");
      }

   }
}