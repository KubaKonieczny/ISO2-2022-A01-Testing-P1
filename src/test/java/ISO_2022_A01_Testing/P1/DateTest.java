package ISO_2022_A01_Testing.P1;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTest {

	@Test
	public void testIsLeap() {
	    Date date = new Date(29, 2, 2000);
	    assertTrue(date.isLeap());
	}
	
	@Test
	public void testIsNotLeap() {
	    Date date = new Date(29, 2, 2001);
	    assertFalse(date.isLeap());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeDateValues() {
	    new Date(-1, -1, -1);
	}
	
	@Test
	public void testSetGetDay() {
	    Date date = new Date(1, 1, 1);
	    date.setDay(15);
	    assertEquals(15, date.getDay());
	}
	
	@Test
	public void testSetGetMonth() {
	    Date date = new Date(1, 1, 1);
	    date.setMonth(6);
	    assertEquals(6, date.getMonth());
	}

	@Test
	public void testSetGetYear() {
	    Date date = new Date(1, 1, 1);
	    date.setYear(2022);
	    assertEquals(2022, date.getYear());
	}




}
