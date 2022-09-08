package ru.vulfert.homework.tast.first;

import org.junit.Test;
import ru.vulfert.homework.task.first.SolutionTaskOne;

public class SolutionTaskOneTest {
    private final SolutionTaskOne test = new SolutionTaskOne();

    @Test
    public void test_when_N_equal_10() {
        var result = test.calculate(10);
        System.out.println(result);
        // TODO: подумать, как проверить тест, если значение N большое ~ > 30 8 байт не хватает
    }
}
