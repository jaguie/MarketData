package com.jaguie.marketdata.marketdata.domain.services;

import com.jaguie.marketdata.marketdata.domain.model.Quote;
import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.AlphaVantageClient;
import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.model.Daily;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuoteService {

    @Autowired
    private AlphaVantageClient alphaVantageClient;

    public Daily getQuotesDaily(String symnbol){
        try {
            return alphaVantageClient.daily("MSFT");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
