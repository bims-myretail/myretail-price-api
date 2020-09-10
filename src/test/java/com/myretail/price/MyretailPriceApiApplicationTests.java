package com.myretail.price;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyretailPriceApiApplicationTests {

	@Autowired
	private MyretailPriceController controller;

	@Test
	public void contexLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
	
	@Test
	public void testPriceResponse() throws Exception {
		PriceDTO price = controller.findProductPrice("1");
		assertThat(price.getValue()).isGreaterThan(1.0);
	}

}
