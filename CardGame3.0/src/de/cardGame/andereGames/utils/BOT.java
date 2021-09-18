package de.cardGame.andereGames.utils;

import java.util.ArrayList;
import java.util.Random;

public class BOT {
	
	private String name;
	private int Score;
	private int wahl;
	
	public BOT() {
		this.name = getNewBotName();
		this.Score = 0;
		neueWahl();
	}
	
	public BOT(String name) {
		this.name = name;
		this.Score = 0;
		neueWahl();
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
	
	
	public int neueWahl() {
		int schere, stein, papier;
		schere = new Random().nextInt(10);
		stein = new Random().nextInt(10);
		papier = new Random().nextInt(10);
		if(schere > stein && schere > papier) {
			wahl = 1;
			return 1;
		}else if(stein > schere && stein > papier) {
			wahl = 2;
			return 2;
		}else if(papier > schere && papier > stein) {
			wahl = 3;
			return 3;
		}else {
			int r;
			do {
				r = Math.round(new Random().nextInt(4));
			}while (r == 0);
			wahl = r;
			return r;
		}
	}
	
	
	
	private String getNewBotName() {
		ArrayList<String> BotNamenWeiblich = new ArrayList<>();
		BotNamenWeiblich.add("Eckhardt");
		BotNamenWeiblich.add("Lea");
		BotNamenWeiblich.add("Paula");
		BotNamenWeiblich.add("Lara");
		BotNamenWeiblich.add("Kiara");
		BotNamenWeiblich.add("Nina");
		BotNamenWeiblich.add("Julia");
		BotNamenWeiblich.add("Sophia");
		BotNamenWeiblich.add("Alisia");
		BotNamenWeiblich.add("Sabrina");
		
		ArrayList<String> BotNamenMeanlich = new ArrayList<>();
		BotNamenMeanlich.add("Matthias");
		BotNamenMeanlich.add("Tim");
		BotNamenMeanlich.add("Paul");
		BotNamenMeanlich.add("Luis");
		BotNamenMeanlich.add("Domenik");
		BotNamenMeanlich.add("Marcel");
		BotNamenMeanlich.add("Julius");
		BotNamenMeanlich.add("Sven");
		BotNamenMeanlich.add("Ben");
		BotNamenMeanlich.add("Michael");
		
		byte random = (byte) (Math.round(Math.random()));
		if(random == 1) {
			byte randomW = (byte) (Math.round(new Random().nextInt((BotNamenWeiblich.size()-1)))); 
			return BotNamenWeiblich.get(randomW)+" [BOT]";
		}else if(random == 0) {
			byte randomM = (byte) (Math.round(new Random().nextInt((BotNamenMeanlich.size()-1)))); 
			return BotNamenMeanlich.get(randomM)+" [BOT]";
		}
		return null;
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
	public int getWahl() {
		return wahl;
	}
	public void setWahl(int wahl) {
		this.wahl = wahl;
	}

}
