package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void shouldCheckAmountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(900), 100);
    }

    @org.testng.annotations.Test
    public void shouldCheckAmountMoreThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1100), 900);
    }

    @org.testng.annotations.Test
    public void shouldCheckAmountEqualToZero() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(0), 1000);
    }

    @org.testng.annotations.Test
    public void shouldCheckAmountEqualToBoundary() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1000), 0);
    }
}
