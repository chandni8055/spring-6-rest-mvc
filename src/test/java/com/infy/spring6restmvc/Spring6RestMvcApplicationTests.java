package com.infy.spring6restmvc;

import com.infy.spring6restmvc.controller.BeerController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
class Spring6RestMvcApplicationTests {

	@Autowired
	BeerController beerController;

	@Test
	void contextLoads() {

	}

}
