package com.torpeconsulting.demos.rest.model;

import java.math.BigDecimal;

/**
 * @author Pedro Torrao <pedro.torrao@torpeconsulting.com>
 */
public class Amount {
    private String currency;
    private BigDecimal value;
    
    public Amount(BigDecimal value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getValue() {
        return value;
    }
}