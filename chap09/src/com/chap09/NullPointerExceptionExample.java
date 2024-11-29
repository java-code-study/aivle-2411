package com.chap09;

public class NullPointerExceptionExample {

    public static int getStringLength(String a) {
        int length = 0;
        try {
            length = a.length();
        } catch (NullPointerException e) {
            System.out.println("NullPoint 발생!!" + e.getMessage());
        }
        return length;
    }

    public static void main(String[] args) {
        getStringLength(null);
    }
}
