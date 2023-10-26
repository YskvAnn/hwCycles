package ru.netology.hwCycles.services;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;



public class MoneyServiceTest {
    @Test
    public void shouldCalcExact() {
        MoneyService service = new MoneyService();

        int expected = 3;
        int actual = service.calcMoney(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcInexact() {
        MoneyService service = new MoneyService();

        int expected = 6;
        int actual = service.calcMoney(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

}
