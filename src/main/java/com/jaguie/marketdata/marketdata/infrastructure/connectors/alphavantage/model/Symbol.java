package com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.model;

import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.ApiParameter;

public class Symbol implements ApiParameter {
    private String symbol;
    public Symbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    @Override
    public String getKey() {
        return "symbol";
    }

    @Override
    public String getValue() {
        return symbol;
    }
}