package com.lits4;

public class app {
    public static void main(String[] args) {
        try {
            throwException();
            System.out.println("Try block");

        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Hi");
        }finally {
            System.out.println("Bye");
        }
    }
    private static void throwException() throws Exception {
        System.out.println("Hello");
        throw new Exception();
    }
}