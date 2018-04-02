package com.jaguie.marketdata.marketdata.domain.services;

import com.jaguie.marketdata.marketdata.domain.model.Quote;
import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.AlphaVantageService;
import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.model.Daily;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class QuoteService {

    @Autowired
    private AlphaVantageService alphaVantageService;

    public List<Quote> getQuotesDaily(String symnbol) throws Exception {
        Daily msft = alphaVantageService.daily("MSFT");
        ArrayList<Quote> quotes = new ArrayList<>();
        msft.getStockData().forEach( q -> {
            Quote quote = new Quote();
            LocalDate date =LocalDate.of(q.getDateTime().getYear(), q.getDateTime().getMonthValue(), q.getDateTime().getDayOfMonth());
            date.atTime(q.getDateTime().getHour(), q.getDateTime().getMinute(), q.getDateTime().getSecond());
            quote.setDate(date);
            quote.setHigh(q.getHigh());
            quote.setLow(q.getLow());
            quote.setOpen(q.getOpen());
            quote.setVolume(q.getVolume());
            quote.setClose(q.getClose());
            quote.setAdjustedClose(q.getAdjustedClose());
            quote.setDividendAmount(q.getDividendAmount());
            quote.setSplitCoefficient(q.getSplitCoefficient());
            quotes.add(quote);
        });
        return quotes;
    }
}
