package de.cardGame.main;

import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import de.cardGame.cards.Card;
import de.cardGame.cards.generate.CardGenDe;
import de.cardGame.cards.generate.CardGenEn;
import de.cardGame.gui.StartScreenGUI;
import de.cardGame.utils.settings.Settings;


public class CardGame {

	private static Settings st;
	private static JFrame GUI;
	public static Color BackgroundColor,BackgroudColorMatch2;
	private static GraphicsDevice graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
	public static ArrayList<Card> cards = new ArrayList<>();
	public static String ich = "Ich War hier!";
	
	public static void main(String[] args) {
		st = new Settings();
		st.load();
		if(st.getLanguage().equalsIgnoreCase("De_de")) {
			CardGenDe.generateCards(true);
		}else if(st.getLanguage().equalsIgnoreCase("En_en")) {
			CardGenEn.generateCards(true);
		}
		setBackgroundColor(false,null);
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				setGUI(new StartScreenGUI(null).getFrame());
			}
		}, 1000);
		
		Timer timer2 = new Timer();
		timer2.schedule(new TimerTask() {
			@Override
			public void run() {
				getGUI().setSize(1053, 597);
			}
		}, 1250);
		
	}
	
	public static Settings getSettings() {
		return st;
	}

	public static GraphicsDevice getGraphicsDevice() {
		return graphicsDevice;
	}

	public static JFrame getGUI() {
		return GUI;
	}
	
	public static void setGUI(JFrame gui) {
		GUI = gui;
	}
	
	public static Color setBackgroundColor(boolean IsNew,String Typ) {
		if(!IsNew) {
			if(st.getDesign().equalsIgnoreCase("Dunkel")) {
				BackgroudColorMatch2 = new Color(0x505050);
				BackgroundColor = Color.DARK_GRAY;
				return Color.DARK_GRAY;
			}else if(st.getDesign().equalsIgnoreCase("Hell")){
				BackgroudColorMatch2 = new Color(0x808080);
				BackgroundColor = Color.WHITE;
				return Color.WHITE;
			}else {
				return Color.RED;
			}
		}else {
			if(Typ.equalsIgnoreCase("Dunkel")) {
				BackgroudColorMatch2 = new Color(0x505050);
				BackgroundColor = Color.DARK_GRAY;
				return Color.DARK_GRAY;
			}else if(Typ.equalsIgnoreCase("Hell")){
				BackgroudColorMatch2 = new Color(0x808080);
				BackgroundColor = Color.WHITE;
				return Color.WHITE;
			}else {
				return Color.RED;
			}
		}
	}

	

}
