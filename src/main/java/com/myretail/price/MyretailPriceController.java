package com.myretail.price;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myretail")
public class MyretailPriceController {

	Logger logger = LoggerFactory.getLogger(MyretailPriceController.class);

	@RequestMapping(path = "/price", method = RequestMethod.GET)
	public PriceDTO findProductPrice(@RequestParam("productID") String id) {
		logger.info("Fetching Price for peoduct ID : {}", id);
		PriceDTO priceDTO = new PriceDTO();
		priceDTO.setProductID(id);
		priceDTO.setValue((double)(Integer.parseInt(id) * 100));
		priceDTO.setCurrencyCode("INR");
		return priceDTO;
	}

	@RequestMapping(path = "/price", method = RequestMethod.POST)
	public PriceDTO updateProductPrice(@RequestBody PriceDTO priceDTO) {
		logger.info("Updating Price for peoduct ID : {}", priceDTO.getProductID());
		return priceDTO;
	}

}
