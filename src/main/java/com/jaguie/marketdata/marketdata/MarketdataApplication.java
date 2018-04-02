package com.jaguie.marketdata.marketdata;

import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.AlphaVantageConnector;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MarketdataApplication {

	public static void main(String[] args) {

		SpringApplication.run(MarketdataApplication.class, args);
	}

	@Bean
    public AlphaVantageConnector alphaVantageConnector(@Value("${alphavante.key}") String key){
        return new AlphaVantageConnector(key, 5000);
    }
}
