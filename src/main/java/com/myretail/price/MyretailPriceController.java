package com.myretail.price;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myretail")
public class MyretailPriceController {

	Logger logger = LoggerFactory.getLogger(MyretailPriceController.class);

	@GetMapping(path = "/price")
	public PriceDTO findProductPrice(@RequestParam("productID") String id) {
		logger.info("Fetching Price for peoduct ID : {}", id);
		PriceDTO priceDTO = new PriceDTO();
		priceDTO.setProductID(id);
		priceDTO.setValue((double)(Integer.parseInt(id) * 100));
		priceDTO.setCurrencyCode("INR");
		return priceDTO;
	}

	@PostMapping(path = "/price")
	public PriceDTO updateProductPrice(@RequestBody PriceDTO priceDTO) {
		logger.info("Updating Price for peoduct ID : {}", priceDTO.getProductID());
		return priceDTO;
	}

}
