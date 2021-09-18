package de.cardGame.utils;

import java.util.Timer;
import java.util.TimerTask;

import de.cardGame.main.CardGame;
import de.cardGame.utils.Words.WordTypes;
import de.cardGame.utils.Words.Words;

public class StoppUhr {

	public static int std = 0;
	public static int min = 0;
	public static int sek = 0;
	private static Timer t = null;

	public static void Run() {
		std = 0;
		min = 0;
		sek = 0;
		t = new Timer();
		t.schedule(new TimerTask() {

			@Override
			public void run() {
				sek++;
				if (sek == 60) {
					min++;
					sek = 0;
				}
				if (min == 60) {
					std++;
					min = 0;
				}
				SetTitle(std, min, sek, true);
			}
		}, 0, 1000);
	}
	public static void Stopp() {
		if(t != null) {
			t.cancel();
		}
	}
	public static String SetTitle(int std, int min,int sek,boolean game) {
		String placeholder = " → ";
		if(game) {
			if (std < 10) {
				if (min < 10) {
					if (sek < 10) {
						CardGame.getGUI().setTitle(Words.get(WordTypes.Name)+placeholder+ " 0" + std + ":0" + min + ":0" + sek);
						return Words.get(WordTypes.Name)+placeholder+ " 0" + std + ":0" + min + ":0" + sek;
					} else {
						CardGame.getGUI().setTitle(Words.get(WordTypes.Name)+placeholder+ " 0" + std + ":0" + min + ":" + sek);
						return Words.get(WordTypes.Name)+placeholder+ " 0" + std + ":0" + min + ":" + sek;
					}
				} else {
					if (sek < 10) {
						CardGame.getGUI().setTitle(Words.get(WordTypes.Name)+placeholder+ " 0" + std + ":" + min + ":0" + sek);
						return Words.get(WordTypes.Name)+placeholder+ " 0" + std + ":" + min + ":0" + sek;
					} else {
						CardGame.getGUI().setTitle(Words.get(WordTypes.Name)+placeholder+ " 0" + std + ":" + min + ":" + sek);
						return Words.get(WordTypes.Name)+placeholder+ " 0" + std + ":" + min + ":" + sek;
					}
				}
			}else {
				if (min < 10) {
					if (sek < 10) {
						CardGame.getGUI().setTitle(Words.get(WordTypes.Name)+placeholder+ " 0" + std + ":0" + min + ":0" + sek);
						return Words.get(WordTypes.Name)+placeholder+ " " + std + ":0" + min + ":0" + sek;
					} else {
						CardGame.getGUI().setTitle(Words.get(WordTypes.Name)+placeholder+ " 0" + std + ":0" + min + ":" + sek);
						return Words.get(WordTypes.Name)+placeholder+ " " + std + ":0" + min + ":" + sek;
					}
				} else {
					if (sek < 10) {
						CardGame.getGUI().setTitle(Words.get(WordTypes.Name)+placeholder+ " 0" + std + ":" + min + ":0" + sek);
						return Words.get(WordTypes.Name)+placeholder+ " " + std + ":" + min + ":0" + sek;
					} else {
						CardGame.getGUI().setTitle(Words.get(WordTypes.Name)+placeholder+ " 0" + std + ":" + min + ":" + sek);
						return Words.get(WordTypes.Name)+placeholder+ " " + std + ":" + min + ":" + sek;
					}
				}
			}
		} else {
			if (std < 10) {
				if (min < 10) {
					if (sek < 10) {
						return "0" + std + ":0" + min + ":0" + sek;
					} else {
						return "0" + std + ":0" + min + ":" + sek;
					}
				} else {
					if (sek < 10) {
						return "0" + std + ":" + min + ":0" + sek;
					} else {
						return "0" + std + ":" + min + ":" + sek;
					}
				}
			}else {
				if (min < 10) {
					if (sek < 10) {
						return "" + std + ":0" + min + ":0" + sek;
					} else {
						return "" + std + ":0" + min + ":" + sek;
					}
				} else {
					if (sek < 10) {
						return "" + std + ":" + min + ":0" + sek;
					} else {
						return "" + std + ":" + min + ":" + sek;
					}
				}
			}
		}
	}

}
