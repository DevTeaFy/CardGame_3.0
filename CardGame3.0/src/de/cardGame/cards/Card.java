package de.cardGame.cards;

import de.cardGame.main.CardGame;

public class Card {

	public static boolean German = false;
	public static int AktiveCardID = 0;
	private String Text,AntwortA,AntwortB,AntwortC;
	private int nextA,nextB,nextC;
	private boolean sonder,blank,over;
	private String AudioFilePath;
	

	public Card(String Text, String AntwortA, String AntwortB, int nextA, int nextB, boolean sonder,String AudioFilePath) {
		this.Text = "<html><body>"+Text+"</body></html>";
		this.AntwortA = "<html><body>"+AntwortA+"</body></html>";
		this.AntwortB = "<html><body>"+AntwortB+"</body></html>";
		this.AudioFilePath = AudioFilePath; 
		this.nextA = -1;
		this.nextA = nextA;
		this.nextB = nextB;
		this.sonder = sonder;
		this.blank = false;
		this.over = false;
	}

	public Card(String Text, String AntwortA, String AntwortB, String AntwortC, int nextA, int nextB, int nextC,String AudioFilePath) {
		this.Text = "<html><body>"+Text+"</body></html>";
		this.AntwortA = "<html><body>"+AntwortA+"</body></html>";
		this.AntwortB = "<html><body>"+AntwortB+"</body></html>";
		this.AntwortC = "<html><body>"+AntwortC+"</body></html>";
		this.AudioFilePath = AudioFilePath; 
		this.nextA = -1;
		this.nextA = nextA;
		this.nextB = nextB;
		this.nextC = nextC;
		this.sonder = false;
		this.blank = false;
		this.over = false;
	}

	public Card(String Text, String AudioFilePath) {
		this.Text = "<html><body>"+Text+"</body></html>";
		this.AudioFilePath = AudioFilePath; 
		this.over = true;
		this.sonder = false;
		this.blank = false;
	}

	public Card(String Text, int nextA, String AudioFilePath) {
		this.Text = "<html><body>"+Text+"</body></html>";
		this.AudioFilePath = AudioFilePath; 
		this.over = false;
		this.sonder = false;
		this.blank = true;
		this.nextA = nextA;
	}
	
	public static int getAktiveCardID() {
		return AktiveCardID;
	}

	public boolean isBlank() {
		return blank;
	}

	public boolean isOver() {
		return over;
	}

	public String getText() {
		return Text;
	}

	public String getAntwortA() {
		return AntwortA;
	}

	public String getAntwortB() {
		return AntwortB;
	}

	public String getAntwortC() {
		return AntwortC;
	}

	public int getNextA() {
		return nextA;
	}

	public int getNextB() {
		return nextB;
	}

	public int getNextC() {
		return nextC;
	}

	public boolean isSonder() {
		return sonder;
	}
	
	public String getAudioFilePath() {
		return AudioFilePath;
	}
	
	public static Card getCardByID(int id) {
		return CardGame.cards.get(id);
	}
	
}
