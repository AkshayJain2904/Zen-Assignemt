package com.zensar.currency.conversion;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convert(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quantity) {
		Map<String,String> uriVarible=new HashMap();
		uriVarible.put("from", from);
		uriVarible.put("to", to);
		
		ResponseEntity<CurrencyConversionBean> responceEntity=new RestTemplate().getForEntity("http://localhost:8080/currency.exchange/from/{from}/to/{to}",
				CurrencyConversionBean.class,uriVarible);
		CurrencyConversionBean responceBean=responceEntity.getBody();
		System.out.println(quantity);
		return new CurrencyConversionBean(responceBean.getId(),from,to,responceBean.getConvertionMultiple(),quantity,quantity.multiply(responceBean.getConvertionMultiple()),responceBean.getPort());
	}
}
