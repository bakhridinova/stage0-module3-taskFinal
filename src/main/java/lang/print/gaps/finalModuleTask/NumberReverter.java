package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int reverted = 0;
        for (int i = 1; i < 4; i++) {
               reverted += (int) Math.pow(10, 3 - i) * (number % 10);
               number /= 10;
        }
        System.out.println(reverted);
    }
}
