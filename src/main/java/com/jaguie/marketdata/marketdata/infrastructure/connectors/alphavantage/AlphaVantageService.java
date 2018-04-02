package com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage;

import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.model.Daily;
import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.model.Function;
import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.model.Symbol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlphaVantageService {

    @Autowired
    private AlphaVantageConnector alphaVantageConnector;

    public Daily daily(String symbol) throws Exception {
        String json = alphaVantageConnector.getRequest(new Symbol(symbol), Function.TIME_SERIES_DAILY);
        return Daily.from(json);
    }
}
