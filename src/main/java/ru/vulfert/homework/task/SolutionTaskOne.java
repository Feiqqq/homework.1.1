package ru.vulfert.homework.task.first;

public class SolutionTaskOne {

    /**
     * @param N incoming param for calculate
     * @return amount for N
     */
    public Double calculate(int N) {
        double sum = 0.0;
        if (N < 1) {
            return 0.0;
        } else {
            for (int i = 1; i <= N; i++) {
                sum += 1.0 / getFactorial(i);
            }
        }
        return sum;
    }

    /**
     * @param f incoming param for calculate fact
     * @return factorial for f
     */
    public long getFactorial(int f) {
        long result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
