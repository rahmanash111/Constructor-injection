package ValueasAttribute;

public class Country {

	private String name;
	private String language;
	private String capital;
	private String currency;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public Country(String name, String language, String capital, String currency) {
		super();
		this.name = name;
		this.language = language;
		this.capital = capital;
		this.currency = currency;
	}


}
