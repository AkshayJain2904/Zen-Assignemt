package com.zensar.currency.conversion;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionControllerFeign {
	
	@Autowired
	private CurrencyExchangeServerProxy currencyExchangeServerProxy;

	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertConversionFeign(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quantity) {
		
		CurrencyConversionBean currencyConversionBean=currencyExchangeServerProxy.reviewExchangeValue(from, to);
		
		//logger info("{}",currencyConversionBean);
		
		return new CurrencyConversionBean(currencyConversionBean.getId(),from,to,currencyConversionBean.getConvertionMultiple(),
				quantity,quantity.multiply(currencyConversionBean.getConvertionMultiple()),currencyConversionBean.getPort());
	}
}
