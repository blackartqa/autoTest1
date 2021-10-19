package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldAmountLess1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = 100;
        int expection = service.remain(amount);
        assertEquals(actual, expection);
    }

    @Test
    public void shouldAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = 0;
        int expection = service.remain(amount);
        assertEquals(actual, expection);
    }

    @Test
    public void shouldAmountMore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;
        int actual = 800;
        int expection = service.remain(amount);
        assertEquals(actual, expection);
    }
}