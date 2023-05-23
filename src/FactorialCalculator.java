import java.util.Scanner;

public class FactorialCalculator {

    public int calculateFactorial(int numberToCalculate) {
        int result = 1;

        if (numberToCalculate > 10) {
            System.out.println("Слишком большое значение!");
        }
        else if (numberToCalculate < 0) {
            System.out.println("Вы ввели отрицательный факториал!");
        }
        else {
            for (int i = 2; i <= numberToCalculate; i++) {
                result *= i;
            }
        }

        return result;
    }
}