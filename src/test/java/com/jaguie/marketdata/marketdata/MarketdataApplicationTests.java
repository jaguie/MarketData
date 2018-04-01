package com.jaguie.marketdata.marketdata;

import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.AlphaVantageClient;
import com.jaguie.marketdata.marketdata.infrastructure.connectors.alphavantage.model.*;
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
	public void contextLoads() throws Exception {
		String apiKey = "50M3AP1K3Y";
		int timeout = 3000;
		AlphaVantageConnector apiConnector = new AlphaVantageConnector(apiKey, timeout);
		AlphaVantageClient client = new AlphaVantageClient(apiConnector);
        Daily msft = client.daily("MSFT");
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
