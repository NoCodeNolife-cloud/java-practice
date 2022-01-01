package com.NoCodeNoLife;

public class MyClass<T> {

    private T value;

    public MyClass(T value) {
        this.value = value;
    }

    public static <W> W printValue(W val) {
        System.out.println(val);
        return val;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public static void main(String[] args) {
        MyClass<Integer> myClass = new MyClass<>(5);
        MyClass<String> myClass1 = new MyClass<>("hello");
        System.out.println(myClass);
        System.out.println(myClass1);
    }
}
