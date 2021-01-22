package chapter03;

public class SpaService {
	// Declaring data fields (instance variables)
	private String serviceDescription;
	private double price;
	
	// Constructors
	public SpaService() {
		serviceDescription = "XXX";
		price = 0;
	}
	
	// Methods
	public void setServiceDescription(String service) {
		serviceDescription = service;
	}
	
	public void setPrice(double servicePrice) {
		price = servicePrice;		
	}
	
	public String getServiceDescription() {
		return serviceDescription;
	}
	
	public double getPrice() {
		return price;
	}	
}
