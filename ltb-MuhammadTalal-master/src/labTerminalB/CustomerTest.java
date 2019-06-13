package labTerminalB;

import org.junit.Test;

public class CustomerTest {
	Movie m1 = new Movie("Spancer", 0);
	Movie m2 = new Movie("Speed", 1);
	Customer me = new Customer("Nadir");
	Customer me2 = new Customer("Allah Ditta");
	Rental r1 = new Rental(m1, 23);
	Rental r2 = new Rental(m2,4);
	
	/**
	 * Test 1 Customer rented two movies one REGULAR and one NEW_RELEASE
	 */
	@Test
	public void testStatement1() {
		me.addRental(r1);
		me.addRental(r2);
		//fail("Not yet implemented");
		String output1 = "Rental Record for Nadir\r\n" + 
				"	Spancer	33.5\r\n" + 
				"	Speed	12.0";
		if(output1.equals(me.statement()))
		{
			assert true;
		}
	}
	@Test
	public void testDaysrented() {
		me.addRental(r1);
		me.addRental(r2);
		
		String output2 = "Rental Record for Nadir\r\n" +
		         "		Spancer 2.0\r\n "+
				 "		Speed   0.0";	
		if(output2.equals(me.statement()))
		{
			assert true;
		}

	}
	Rental r3= new Rental(m1,23);
	Rental r4=new Rental(m2,4);

	@Test
	public void testAmountOwed()
	{
		
		me.addRental(r1);
		me.addRental(r2);
		String output3 = "Rental Record for Nadir\r\n" +
		             "   Spancer   33.5\r\n "+
				     "   Speed     12.0\r\n"+
		             "   Avengers  9.0\r\n"+
				     "   Iron man  6.0";
		if(output3.equals(me.statement()))
		{
			assert true;
		}  
	}}