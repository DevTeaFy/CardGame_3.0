package de.cardGame.main;

import java.awt.Color;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JComponent;
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
	
	public static void main(String[] args) {
		st = new Settings();
		st.load();
		if(st.getLanguage().equalsIgnoreCase("De_de")) {
			//CardGenDe.generateCards(false);
		}else if(st.getLanguage().equalsIgnoreCase("En_en")) {
			//CardGenEn.generateCards(false);
		}
		setBackgroundColor(false,null);
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				de.cardGame.gui.GUI gui = new de.cardGame.gui.GUI();
				gui.Create();;
				gui.show();
				
				gui.getBbtn().addActionListener(e -> {
					//JComponent source = (JComponent) e.getSource();
					gui.Switch(4);
				});
				
				gui.getStorybtn().addActionListener(e -> {
					//JComponent source = (JComponent) e.getSource();
					gui.Switch(3);
				});

				gui.getTitelbtn().addActionListener(e -> {
					//JComponent source = (JComponent) e.getSource();
					gui.Switch(1);
				});
				
				gui.getAbtn().addActionListener(e -> {
					//JComponent source = (JComponent) e.getSource();
					gui.Switch(2);
				});
			
				
				
				
			}
		}, 1000);
		
		
		
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
