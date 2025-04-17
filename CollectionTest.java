import java.util.ArrayList;

public class CollectionTest {
   public CollectionTest() {
   }

   public static void main(String[] var0) {
      String[] var1 = new String[]{"MAGNETA", "RED", "WHITE", "BLUE", "CYAN"};
      ArrayList var2 = new ArrayList();
      String[] var3 = var1;
      int var4 = var1.length;

      int var5;
      for(var5 = 0; var5 < var4; ++var5) {
         String var6 = var3[var5];
         var2.add(var6);
      }

      var3 = new String[]{"RED", "WHITE", "BLUE"};
      ArrayList var9 = new ArrayList();
      String[] var10 = var3;
      int var11 = var3.length;

      for(int var7 = 0; var7 < var11; ++var7) {
         String var8 = var10[var7];
         var9.add(var8);
      }

      System.out.println("ArrayList: ");

      for(var5 = 0; var5 < var2.size(); ++var5) {
         System.out.printf("%s", var2.get(var5));
      }

   }
}