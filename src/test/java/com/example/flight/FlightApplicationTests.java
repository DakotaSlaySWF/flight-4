package com.example.flight;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FlightApplicationTests {

	@Test
	void contextLoads() {
		FlightApplication.main(new String[]{"1,2"});
	}

}
