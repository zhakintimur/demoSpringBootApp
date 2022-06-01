package com.example.demoSpringBootApp.util;

public class AccountIdSequence {
    private static Long accountCounter = 0L;
    public static Long next() {
        return ++accountCounter;
    }
}
