package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Player{
	
    //private static final long serialVersionUID = 6716714837006810519L;
	
	@Id
	private String name;
	@Column
	private int score;
	@ManyToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	public Set<Player> friends = new HashSet<Player>();
	
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
