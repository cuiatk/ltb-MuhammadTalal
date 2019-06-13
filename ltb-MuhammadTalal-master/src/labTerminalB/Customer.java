package labTerminalB;
import java.util.Enumeration;
import java.util.Vector;

class Customer {

private String _name; 
private Vector _rentals = new Vector();

public Customer (String name){ 
	_name = name;
	};

public void addRental(Rental arg) {
	_rentals.addElement(arg); 
	}
public String getName (){
	return _name;
}
/*
 * TODO 3	20 Marks Writing Specifications
 * The function Statement displays the total rent of movies and their frequent renter points.
 * @param: nothing
 * @return: bill that contains customer name, movie name and their rent
 */ 

public String statement() {

	double totalAmount = 0; 
	int frequentRenterPoints = 0;
	Enumeration rentals = _rentals.elements(); 
	String result = "Rental Record for " + getName() + "\n"; 
	while (rentals.hasMoreElements()) {

	double thisAmount = 0;

	Rental rental = (Rental) rentals.nextElement();

	
	frequentRenterPoints += rental.getFrequentPoints(rental);

	//show figures for this rental 
	result += "\t" + rental.getMovie().getTitle()+ "\t" + String.valueOf(rental.amount_Calculation()) + "\n"; totalAmount += rental.amount_Calculation();

	} //add footer lines
	result += "Amount owned is " + String.valueOf(totalAmount) +"\n";
	result += "You earned " + String.valueOf(frequentRenterPoints)+ " frequent renter points"; 
	return result;

	}

};

