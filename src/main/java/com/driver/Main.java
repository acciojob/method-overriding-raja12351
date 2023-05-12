package com.driver;

public class Main {
    public static class A{
        public void meth(){
            System.out.println("Invoking method from class A");
        }
    }
    public static class B extends A{
        @Override
        public void meth(){
            System.out.println("Method is overridden in Extendend class B");
        }
    }
    public static void main(String[] args) {
        A a = new B();
        a.meth();

        B b = new B();
        b.meth();
    }
}