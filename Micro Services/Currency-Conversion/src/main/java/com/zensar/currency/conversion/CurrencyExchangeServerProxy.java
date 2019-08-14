package com.zensar.currency.conversion;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "forex-service")
@RibbonClient(name = "forex-service")
public interface CurrencyExchangeServerProxy {

	@GetMapping("/currency.exchange/from/{from}/to/{to}")
	public CurrencyConversionBean reviewExchangeValue(@PathVariable("from") String from,@PathVariable("to") String to);
}
