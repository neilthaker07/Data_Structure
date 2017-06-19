package lambda;

public class Country {
	
	private Integer population;
	private String countryName; 
	private String cont; 

	public String getCont() {
		return cont;
	}

	public void setCont(String cont) {
		this.cont = cont;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public Integer getPopulation() {
		return population;
	}
}
