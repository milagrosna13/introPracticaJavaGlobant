// Guarda este archivo como Main.java

public class Main {
    public static void main(String[] args) {
        // Imprimir 'Hello' y nombre en una sola clase
        PrintHelloAndName.print();
        // Imprimir la suma de dos números en una sola clase
        SumTwoNumbers.print();
        // Imprimir el resultado de la división de dos números en una sola clase
        DivideTwoNumbers.print();
    }
}

class PrintHelloAndName {
    public static void print() {
        System.out.println("Hello");
        System.out.println("Alexandra Abramov");
    }
}

class SumTwoNumbers {
    public static void print() {
        int number1 = 74;
        int number2 = 36;
        int sum = number1 + number2;
        System.out.println(sum);
    }
}

class DivideTwoNumbers {
    public static void print() {
        int dividend = 50;
        int divisor = 3;
        int result = dividend / divisor;
        System.out.println(result);
    }
}
