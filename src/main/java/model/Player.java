package model;

public class Player extends Entity{
	
    private static final long serialVersionUID = 6716714837006810519L;
	
	private String name;
	private int score;
	
	public Player (){
		super();
	}
	
	public Player (String name){
		super();
		this.name = name;
		this.score = 0;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}


}
