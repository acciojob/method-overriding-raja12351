package com.driver;

public class Main {
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args) {
        A objectA = new A();
        B objectB = new B();
//        System.out.println(objectA.meth());
//        System.out.println(objectB.meth());
    }
}