package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldAmountLess1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = 100;
        int exception = service.remain(amount);
        assertEquals(actual, exception);
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