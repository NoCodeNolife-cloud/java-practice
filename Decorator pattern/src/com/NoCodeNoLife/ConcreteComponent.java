package com.NoCodeNoLife;

/**
 * Data: Created in 2021/12/2
 * Description:
 */
public class ConcreteComponent implements Component {

    @Override
    public void function() {
        System.out.println("基本功能：呼吸+觅食+睡觉");
    }
}
