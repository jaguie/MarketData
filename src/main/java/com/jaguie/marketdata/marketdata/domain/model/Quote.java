package com.jaguie.marketdata.marketdata.domain.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Quote {
    private Double open;
    private Double high;
    private Double low;
    private Double volume;
    private LocalDate date;
}
