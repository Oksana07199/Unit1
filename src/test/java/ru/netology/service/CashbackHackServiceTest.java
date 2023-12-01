package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test

    public void shouldReturnIfAmount800() {
        CashbackHackService service = new CashbackHackService();
        int amount = 400;

        int actual = service.remain(amount);
        int expected = 600;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnIfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnIfAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }
}

