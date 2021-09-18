package de.cardGame.utils.Words;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;

import de.cardGame.main.CardGame;
import de.cardGame.utils.Sprachausgabe.TextType;

public class Words {

	public static ArrayList<String> choosenWay = new ArrayList<>();
	public static ArrayList<Integer> choosenWayID = new ArrayList<>();
	public static ArrayList<TextType> choosenWayAnswer = new ArrayList<>();
	
	
	public static String get(WordTypes type) {
		switch (CardGame.getSettings().getLanguage()) {
		case "De_de":
			return type.getDeutsch();
		case "En_en":
			return type.getEnglisch();
		}
		return "Error";
	}
	public static String get(WordTypes type,String LanguageType) {
		switch (LanguageType) {
		case "De_de":
			return type.getDeutsch();
		case "En_en":
			return type.getEnglisch();
		}
		return "Error";
	}
	
	public static String getHtmlText(String Text) {
		return "<html><body>"+Text+"</body></html>";
	}
	
	public static void setTextInPerfectHeight(JLabel label) {
		Font labelFont = label.getFont();
		String labelText = label.getText();
		int stringWidth = label.getFontMetrics(labelFont).stringWidth(labelText);
		int componentWidth = label.getWidth();
		double widthRatio = (double)componentWidth / (double)stringWidth;
		int newFontSize = (int)(labelFont.getSize() * widthRatio);
		int componentHeight = label.getHeight();
		int fontSizeToUse = Math.min(newFontSize, componentHeight);
		label.setFont(new Font(labelFont.getName(), labelFont.getStyle(), fontSizeToUse));
	}
	
	public static void setTextInPerfectHeight(JButton btn) {
		Font labelFont = btn.getFont();
		String labelText = btn.getText();
		int stringWidth = btn.getFontMetrics(labelFont).stringWidth(labelText);
		int componentWidth = btn.getWidth();
		double widthRatio = (double)componentWidth / (double)stringWidth;
		int newFontSize = (int)(labelFont.getSize() * widthRatio);
		int componentHeight = btn.getHeight();
		int fontSizeToUse = Math.min(newFontSize, componentHeight);
		btn.setFont(new Font(labelFont.getName(), labelFont.getStyle(), fontSizeToUse));
	}
	
}
