package com.jaguie.marketdata.marketdata.interfaces;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketDataController {

    @RequestMapping( "/health")
    public String getHealth() {
        return "Up";
    }
}
