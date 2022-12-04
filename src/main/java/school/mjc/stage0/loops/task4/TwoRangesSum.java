package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        } else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
            return;
        }
        int skipedsumm = 0;
        int summ = 0;

        int currentNumber = 0;
        do {
            if (currentNumber <= numberToSkip) {
                skipedsumm = skipedsumm + currentNumber;

            } else {
                summ = summ + currentNumber;
            }
            currentNumber++;

        } while (currentNumber <= lastInRow);
        System.out.println("skipped sum is " + skipedsumm);
        System.out.println("counted sum is " + summ);

    }
}
