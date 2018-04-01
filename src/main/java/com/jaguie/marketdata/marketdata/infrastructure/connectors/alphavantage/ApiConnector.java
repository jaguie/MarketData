package com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage;

@FunctionalInterface
public interface ApiConnector {
    String getRequest(ApiParameter... apiParameters) throws Exception;

}

