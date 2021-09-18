package de.cardGame.utils.sprachausgabe;

public enum TextType {
	
	Card("Card.wav"),
	Story("Story.wav"),
	A("A.wav"),
	B("B.wav"),
	C("C.wav"),
	Weiter("Weiter.wav"),
	GameOver("GameOver.wav");
	
	String Name;
	
	private TextType(String Name) {
		this.Name = Name;
	}
	
	public String getDateiName() {
		return Name;
	}

}
