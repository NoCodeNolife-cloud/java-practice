package com.code;

public class TicketDB {

    private int ticketCount = 5;

    public synchronized int getTicketCount() {

        return ticketCount;
    }

    public synchronized void sellTicket() {

        try {

            Thread.sleep(250);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        System.out.printf("第%d号票，已经售出\n", ticketCount);
        ticketCount--;
    }
}
