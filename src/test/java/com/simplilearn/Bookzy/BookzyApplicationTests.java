package com.simplilearn.Bookzy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class BookzyApplicationTests {

	@Test
	void contextLoads() {
	}

	private BookzyApplication ticketer = new BookzyApplication();
	@Test	 
	public void testRandomNumber() {     	 
   		Assert.assertTrue(ticketer.getRandomTicketNumber()>1000&&ticketer.getRandomTicketNumber()<9999);	 
	}	


}
