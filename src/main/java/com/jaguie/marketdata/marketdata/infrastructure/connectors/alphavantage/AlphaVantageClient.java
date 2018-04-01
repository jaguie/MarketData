package com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage;

import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.model.Daily;
import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.model.Function;
import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.model.Symbol;

public class AlphaVantageClient {
    private final ApiConnector apiConnector;

    public AlphaVantageClient(ApiConnector apiConnector) {
        this.apiConnector = apiConnector;
    }

    public Daily daily(String symbol) throws Exception {
        String json = apiConnector.getRequest(new Symbol(symbol), Function.TIME_SERIES_DAILY);
        return Daily.from(json);
    }
}
