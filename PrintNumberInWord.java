
public class PrintNumberInWord {   



      private static final String[] VALUES = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};

      public static String printNumberInWord(int number) {
         if (isValidNumber(number)) {
            return getNumberWord(number);
         } else {
            return "other";
         }
      }
   private static boolean isValidNumber(int number) {
      return number >= 0 && number < VALUES.length;
   }
   private static String getNumberWord(int number) {
      return VALUES[number];
   }

   public static void main(String[] args) {
      System.out.println(printNumberInWord(3));
      System.out.println(printNumberInWord(10));
   }

}
