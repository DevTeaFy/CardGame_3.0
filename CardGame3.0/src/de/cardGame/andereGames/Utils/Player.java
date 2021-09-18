package de.cardGame.andereGames.Utils;

public class Player {
	
	private String name;
	private int Score;
	private int wahl;
	
	public Player(String name) {
		this.setName(name);
		this.setScore(0);
		this.setWahl(-1);
	}
	
	public void resetScore() {
		this.setScore(0);
		this.setWahl(-1);
	}
	
	public void addOneScore() {
		setScore(getScore()+1);
	}
	public void addScore(int anzahl) {
		setScore(getScore()+anzahl);
	}
	
	public int getWahl() {
		return wahl;
	}
	public void setWahl(int wahl) {
		this.wahl = wahl;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
