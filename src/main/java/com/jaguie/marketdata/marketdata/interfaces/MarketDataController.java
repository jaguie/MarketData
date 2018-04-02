package com.jaguie.marketdata.marketdata.interfaces;

import com.jaguie.marketdata.marketdata.domain.model.Quote;
import com.jaguie.marketdata.marketdata.domain.services.QuoteService;
import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.model.Daily;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MarketDataController{

    @Autowired
    private QuoteService quoteService ;

    @RequestMapping( "/health")
    public String getHealth() {
        return "Up";
    }

    @RequestMapping( "/quotes")
    public Daily getHisotQuotes(){
        Daily msft = quoteService.getQuotesDaily("MSFT");
        return msft;
    }
}
