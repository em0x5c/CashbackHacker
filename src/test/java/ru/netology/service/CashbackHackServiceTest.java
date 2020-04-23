package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @org.junit.Test
    public void shouldCheckAmountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(100, service.remain(900));
    }

    @org.junit.Test
    public void shouldCheckAmountMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(900, service.remain(1100));
    }

    @org.junit.Test
    public void shouldCheckAmountEqualToZero() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(1000, service.remain(0));
    }

    @org.junit.Test
    public void shouldCheckAmountEqualToBoundary() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(0, service.remain(1000));
    }
}
