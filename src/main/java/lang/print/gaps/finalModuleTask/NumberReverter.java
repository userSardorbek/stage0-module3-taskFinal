package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int i = 0;
        while (number != 0) {
            i = i * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(i);
    }
}
