package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldAmountLess1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = 100;
        int expected = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = 0;
        int exception = service.remain(amount);
        assertEquals(actual, exception);
    }

    @Test
    public void shouldAmountMore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;
        int actual = 800;
        int exception = service.remain(amount);
        assertEquals(actual, exception);
    }
}