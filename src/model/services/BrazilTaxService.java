package model.services;

public class BrazilTaxService implements TaxService {
	public Double tax(double amount) {
		if(amount <= 100.0) {
			return amount * 0.20;
		}else {
			return amount * 0.15;
		}
	}
}