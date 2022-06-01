package com.example.demoSpringBootApp.entity;

import java.math.BigDecimal;

public class Payment {
    private Long id;
    private Account from;
    private Account to;
    private BigDecimal sum;
}
