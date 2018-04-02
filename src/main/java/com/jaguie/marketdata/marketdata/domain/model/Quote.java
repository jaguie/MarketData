package com.jaguie.marketdata.marketdata.domain.model;

import lombok.*;

import java.time.LocalDate;


public class Quote {
    private Double open;
    private Double high;
    private Double low;
    private Long volume;
    private LocalDate date;
    private Double close;
    private Double adjustedClose;
    private Double dividendAmount;
    private Double splitCoefficient;


    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getClose() {
        return close;
    }

    public void setClose(Double close) {
        this.close = close;
    }

    public double getAdjustedClose() {
        return adjustedClose;
    }
    public void setAdjustedClose(Double adjustedClose) {
        this.adjustedClose = adjustedClose;
    }
    public double getDividendAmount() {
        return dividendAmount;
    }
    public void setDividendAmount(Double div) {
        this.dividendAmount = div;
    }

    public double getSplitCoefficient() {
        return splitCoefficient;
    }

    public void setSplitCoefficient(Double split) {
        this.splitCoefficient = split;
    }
}
