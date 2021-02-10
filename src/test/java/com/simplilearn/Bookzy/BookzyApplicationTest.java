package com.simplilearn.Bookzy;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class BookzyApplicationTest {

	@Test
	void contextLoads() {
	}

	private BookzyApplication ticketer = new BookzyApplication();
	@Test	 
	public void testRandomNumber() {     	 
   		assertTrue(ticketer.getRandomNumber()>1000&&ticketer.getRandomNumber()<9999);	 
	}	


}
