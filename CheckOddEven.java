
public class CheckOddEven { 

      public static boolean isEven(int number) {
         return number % 2 == 0;
      }


      public static void checkOddEven(int number) {
         if (isEven(number)) {
            System.out.println("even number");  // numero par
         } else {
            System.out.println("odd number");   // numero impar
         }
      }


      public static void main(String[] args) {
         checkOddEven(4);
         checkOddEven(7);
      }
}
