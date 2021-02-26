package mortgage;


public class Prospect {

	String customerName;
	double totalLoan;
	double monthlyInterest;
	double yearsOfLoan;
	double fixedMonthlyPayment;
	
	public Prospect(String prospectName, double loanTotal, double interestMonth, double yearsOfLoan2,
			double fixedMonthlyPayment2) {
		
		setCustomerName(prospectName);
		setTotalLoan(loanTotal);
		setMonthlyInterest(interestMonth);
		setYearsOfLoan(yearsOfLoan2);
		setFixedMonthlyPayment(fixedMonthlyPayment2);
		
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getTotalLoan() {
		return totalLoan;
	}
	public void setTotalLoan(double totalLoan2) {
		this.totalLoan = totalLoan2;
	}
	public double getMonthlyInterest() {
		return monthlyInterest;
	}
	public void setMonthlyInterest(double interestMonth) {
		this.monthlyInterest = interestMonth;
	}
	public double getYearsOfLoan() {
		return yearsOfLoan;
	}
	public void setYearsOfLoan(double yearsOfLoan2) {
		this.yearsOfLoan = yearsOfLoan2;
	}
	public double getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}
	public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}
		
	
}

