package com;

import java.util.logging.Logger;

public class Main {

    static Logger logger = Logger.getLogger(String.valueOf(Main.class));

    public static void main(String[] args) {

        logger.info("hello");
        int x = 5;
        logger.info("x = " + x);
    }

}