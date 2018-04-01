package com.jaguie.marketdata.marketdata;

import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.model.Function;
import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.model.Interval;
import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.model.OutputSize;
import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.model.Symbol;
import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.AlphaVantageConnector;
import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.ApiParameterBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MarketdataApplicationTests {

	@Test
	public void contextLoads() {
		String apiKey = "";
		int timeout = 5000;
		AlphaVantageConnector alphaVantageConnector = new AlphaVantageConnector(apiKey, timeout);

		//function=TIME_SERIES_DAILY
		// symbol=MSFT
		// datatype=json

		String params = "function=TIME_SERIES_DAILY& symbol=MSFT&datatype=json";

		//String request = alphaVantageConnector.getRequest();

	}
	@Test
	public void timeSeries() {
		ApiParameterBuilder apiParameterBuilder = new ApiParameterBuilder();
		apiParameterBuilder.append(new Symbol("DUMMY"));
		apiParameterBuilder.append(Function.TIME_SERIES_DAILY);
		apiParameterBuilder.append(Interval.FIFTEEN_MIN);
		apiParameterBuilder.append(OutputSize.FULL);
		String url = apiParameterBuilder.getUrl();
		Assert.assertEquals(url, "&symbol=DUMMY&function=TIME_SERIES_DAILY&interval=15min&outputsize=full");
	}
}
