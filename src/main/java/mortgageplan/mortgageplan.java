package mortgageplan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import mortgage.Prospect;

public class mortgageplan {
public static void main(String[]args) throws IOException {
		
		//Initiate and array list of prospect-objects
   	 	ArrayList<Prospect> prospectList = new ArrayList<Prospect>();
		
		//Read the text file to get information on customers loans
		BufferedReader br = new BufferedReader(new FileReader("prospects.txt"));
	    String line = null;
	    
	    br.readLine(); //Skip first line of heading categories
	    
	    
	    while ((line = br.readLine()) != null) {
	 
	      //Split the lines of the text at the commas
	      String[] values = line.split(","); 

	      //IF statement to catch string-split of customer name separated by a comma
	      if(values[0].startsWith("\""))
	      {
	    	  	String customerName = values[0].replace("\"", "") +" "+ values[1].replace("\"", "");
		        String loan = values[2];
		        String interest = values[3];
		        String years = values[4];
		         
		         //Turn strings into numbers for calculation
		         double totalLoan = Double.parseDouble(loan);
		         double interestYear = Double.parseDouble(interest);
		         double yearsOfLoan = Double.parseDouble(years);
		         double noOfPayments = yearsOfLoan*12;
		         
		         
		        //Sending off values to methods for calculation
		         double interestMonth = calculateInterest(interestYear);
		         
		         double powerOfResult = calculatePowerOf(interestMonth, noOfPayments);
		         
		         double fixedMonthlyPayment = calculateFixedPayment(totalLoan, interestMonth, powerOfResult);
		         
		         //Add prospect to array list
		         prospectList.add(new Prospect(customerName, totalLoan, interestMonth, yearsOfLoan, fixedMonthlyPayment));
		         
	      } else { //Same as above for non exceptions
	    	 
	      	 String customerName = values[0];
	         String loan = values[1];
	         String interest = values[2];
	         String years = values[3];
	         
	         double totalLoan = Double.parseDouble(loan);
	         double interestYear = Double.parseDouble(interest);
	         double yearsOfLoan = Double.parseDouble(years);
	         
	         double noOfPayments = yearsOfLoan*12;
	        
	         double interestMonth = calculateInterest(interestYear);
	         
	         double powerOfResult = calculatePowerOf(interestMonth, noOfPayments);
	         
	         double fixedMonthlyPayment = calculateFixedPayment(totalLoan, interestMonth, powerOfResult);
	         
	         prospectList.add(new Prospect(customerName, totalLoan, interestMonth, yearsOfLoan, fixedMonthlyPayment));  
	      }
	    }
	    
	    br.close();
	    	
	    	//change double decimals to limit to only 2 decimals in output
	    	DecimalFormat df = new DecimalFormat("0.##");
	    	
	    	
	    	// Loop through array list and print all the information from read file
	    		for (int i = 0;  i <prospectList.size(); i++) {
	    		
	    			Prospect prospect = prospectList.get((i));
	    			
	    			System.out.println("Prospect " + (i+1) + ": " + prospect.getCustomerName() + 
	    					" wants to borrow  " + prospect.getTotalLoan() + "€ for a period of "  + prospect.getYearsOfLoan() + 
	    					" years and pay " + df.format(prospect.getFixedMonthlyPayment()) +"€ per month.\n");
	    			}
	    	
	  }
	
	
	
	/////////////////////////////////////// - Calculation methods - ///////////////////////////////////////////////
	
	
	//Method to calculate interest per month
	public static double calculateInterest(double interestYear) {
		
		//Divide by 100 to get decimal number of interest rate
		double interestYeardecimal = interestYear/100;
		
		//Divide by 12 to get monthly value
		double interestMonth = interestYeardecimal / 12;
		
		return interestMonth;
	}
	
	
	
	//Method to calculate the power of numbers
	public static double calculatePowerOf(double interestMonth, double noOfPayments) {
		//Calculation of the power of noOfPayments1
        double base = 1 + interestMonth, exponent = noOfPayments;
    	 double powerOfResult = 1;
        while (exponent != 0)
        {
       	 powerOfResult *= base;
            --exponent;
        }    
        return powerOfResult;
	}
	
	
	
	
	//Method to calculate the fixed monthly payment according to provided formula
public static double calculateFixedPayment(double totalLoan, double interestMonth, double powerOfResult) {
		
		double power = interestMonth * powerOfResult; 
		double firstPart = totalLoan * power; 
		double secondPart = powerOfResult - 1; 
	
		double fixedMonthlyPayment = firstPart / secondPart;
		
		return fixedMonthlyPayment;
	}
	
}
