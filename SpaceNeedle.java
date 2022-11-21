public class SpaceNeedle {
   
   public static final int SIZE = 4;
   
   // this prints the image
   public static void main(String[] args) {
      pole();
      top();
      bottom();
      pole();
      post();
      top();
   }
   
   //this builds the top and middle pole
   public static void pole() {
      for (int pole = 1; pole <= SIZE; pole++) {
         for (int space = 1; space <= SIZE * 3; space++) {
            System.out.print(" ");
         }
         System.out.println("||");
      }
   }
   
   //this builds the top and base
   public static void top() {
      for (int line = 1; line <= SIZE; line++) {
         for (int space = 1; space <= -3 * line + SIZE * 3; space++) {
            System.out.print(" ");
         }
         System.out.print("__/");
         for (int colon = 1; colon <= 3 * line - 3; colon++) {
            System.out.print(":");
         }
         System.out.print("||");
         for (int colon = 1; colon <= 3 * line - 3; colon++) {
            System.out.print(":");
         }
         System.out.print("\\__");
         System.out.println();
      }
      System.out.print("|");
      for (int quote = 1; quote <= SIZE * 6; quote++) {
         System.out.print("\"");
      }
      System.out.println("|");
   }
   
   //this builds the bottom
   public static void bottom() {
      for (int line = 1; line <= SIZE; line++) {
         for (int space = 1; space <= 2 * line - 2; space++) {
            System.out.print(" ");
         }
         System.out.print("\\_");
         for (int flippedV = 1; flippedV <= -2 * line + (SIZE * 3 + 1); flippedV++) {
            System.out.print("/\\");
         }
         System.out.println("_/");
      }
   }
   
   //this builds the thicker post area
   public static void post() {
      for (int line = 1; line <= SIZE * SIZE; line++) {
         for (int space = 1; space <= 2 * SIZE + 1; space++) {
            System.out.print(" ");
         }
         for (int post = 1; post <= 2; post++) {  
            System.out.print("|");
            for (int percent = 1; percent <= SIZE - 2; percent++) {
               System.out.print("%");
            }
            System.out.print("|");
         }
         System.out.println();
      }
   }
}