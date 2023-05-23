import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите факториал натурально числа n : ");
        int n = scan.nextInt();

        SuperFC superFC = new SuperFC();
        int result = superFC.calculateFactorial(5);
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        System.out.println(result);

//        Car bmw = new Car();
//
//        bmw.showSpeed();
    }
}
