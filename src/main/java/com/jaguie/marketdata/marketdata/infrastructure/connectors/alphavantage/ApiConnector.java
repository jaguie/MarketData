package com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage;

import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.model.Daily;
import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.model.Function;
import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.model.Symbol;

@FunctionalInterface
public interface ApiConnector {
    String getRequest(ApiParameter... apiParameters) throws Exception;
}

