package com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.model;

import java.util.List;
import java.util.Map;

public class TimeSeriesResponse {

    private final Map<String, String> metaData;
    private final List<StockData> stockData;

    TimeSeriesResponse(final Map<String, String> metaData, final List<StockData> stockData) {
        this.stockData = stockData;
        this.metaData = metaData;
    }

    /**
     * Meta data for response
     *
     * @return map of keys and values in json representation of metadata.
     */
    public Map<String, String> getMetaData() {
        return metaData;
    }

    /**
     * List of StockData
     *
     * @return list of {@link StockData}.
     */
    public List<StockData> getStockData() {
        return stockData;
    }
}
