package com.bank.util;

import java.util.Scanner;

public class InputReader {
    private final static Scanner scanner = new Scanner(System.in);

    public static double readDouble() {
        return scanner.nextDouble();
    }

    public static String readString() {
        return scanner.next();
    }

    public static int readInt() {
        return scanner.nextInt();
    }
}
