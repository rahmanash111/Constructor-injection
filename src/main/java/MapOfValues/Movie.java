package MapOfValues;

import java.util.Map;

public class Movie {

	private String name;
	private Map<Integer,String> Actors;

	public Movie(String name, Map<Integer, String> actors) {
		this.name = name;
		Actors = actors;
	}

	public String getName() {
		return name;
	}

	public Map<Integer, String> getActors() {
		return Actors;
	}
	
	
}
