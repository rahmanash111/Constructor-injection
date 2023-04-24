package SetOfValues;

import java.util.List;

public class Player {

	private String name;
	private List<String> teams;
	
	public Player(String name, List<String> teams) {
		super();
		this.name = name;
		this.teams = teams;
	}

	public String getName() {
		return name;
	}

	public List<String> getTeams() {
		return teams;
	}
	
}
