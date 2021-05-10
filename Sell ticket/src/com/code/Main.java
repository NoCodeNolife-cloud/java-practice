package com.code;

public class Main {

    public static void main(String[] args) {

        TicketDB db = new TicketDB();

        Thread t1 = new Thread(() -> {

            while (true) {

                int currTickCount = db.getTicketCount();
                if (currTickCount > 0) {

                    db.sellTicket();
                } else {

                    break;
                }
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {

            while (true) {

                int currTickCount = db.getTicketCount();
                if (currTickCount > 0) {

                    db.sellTicket();
                } else {

                    break;
                }
            }
        });
        t2.start();
    }
}
