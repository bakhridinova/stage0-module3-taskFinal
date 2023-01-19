package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sumOfDigits = 0;
        for (int i = 1; i < 5; i++) {
            sumOfDigits += number % 10;
            number /= 10;
        }
        System.out.println(sumOfDigits);
    }
}
