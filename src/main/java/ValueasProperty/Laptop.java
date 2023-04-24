package ValueasProperty;

public class Laptop {

	private String company;
	private String model;
	private int storage;
	
	public Laptop(String company, String model, int storage) {
		this.company = company;
		this.model = model;
		this.storage = storage;
	}

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public int getStorage() {
		return storage;
	}
	
}
