package ListOfValues;

import java.util.List;

public class Ipl {

	private String name;
	private String color;
	private List<String> players;
	
	public Ipl(String name, String color, List<String> players) {
		this.name = name;
		this.color = color;
		this.players = players;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public List<String> getPlayers() {
		return players;
	}
	
	
}
