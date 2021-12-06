package com.NoCodeNoLife;

/**
 * Data: Created in 2021/12/2
 * Description:
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void function() {
        component.function();// 客户端的调用委派给具体的方案
    }
}
