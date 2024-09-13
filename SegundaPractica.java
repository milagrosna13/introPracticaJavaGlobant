

public class SegundaPractica {
    public static void main(String[] args) {

        PrintHelloAndName.print();

        SumTwoNumbers.printSum();

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


    public static int sum(int number1, int number2) {
        return number1 + number2;
    }


    public static void printSum() {
        int number1 = 74;
        int number2 = 36;
        int result = sum(number1, number2);
        System.out.println(result);
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
