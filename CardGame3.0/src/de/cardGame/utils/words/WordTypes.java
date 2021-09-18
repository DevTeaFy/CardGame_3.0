package de.cardGame.utils.words;

public enum WordTypes {

	Settings("Einstellungen","Settings"),
	KeyUseVorlesen("Es wird %Karte% vorgelesen.","%Karte% is read out loud."),
	KeyUsePages("Das Menü Seiten wird geöffnet.","The Pages menü opens."),
	KeyUseExtras("Das Menü Extras wird geöffnet.","The Extras menü opens."),
	KeyUseHelp("Das Menü Hilfe wird geöffnet.","The Help menü opens."),
	KeyUseSettings("Das Menü Seiten wird geöffnet und Einstellungen wird ausgewählt.","The menü Pages is opened and Settings is selected."),
	KeyUseTitelScreen("Das Menü Seiten wird geöffnet und Titelseite wird ausgewählt.","The Pages menü opens and Titlesecreen is selected."),
	KeyUseKartPath("Das Menü Extras wird geöffnet und Kartenpfad wird ausgewählt.","The Extra menü opens and Cardpath is selected."),
	KeyUseKarteBack("Das Menü Extras wird geöffnet und Karte zurück wird ausgewählt.","The menü Extras is opened and card back is selected."),
	Volume("Lautstärke","Volume"),
	Name("Digitales Kartenlabyrinth","Digital Card Maze"),
	Versuchszeit("Versuchszeit: ","Time played: "),
	Kartenpfad("Kartenpfad: ","Card Path: "),
	UnterTitel("Finde deinen Weg!","Find your Way!"),
	DEUTSCH("Deutsch","German"),
	Karte("Karte ","Card "),
	ENGLISCH("Englisch","English"),
	Pages("Seiten","Pages"),
	Help("Hilfe","Help"),
	CardPath("Kartenpfad","Card Path"),
	Extras("Extras","Extras"),
	NoCardsChoosen("Noch keine Karten ausgewählt","No cards selected yet"),
	StartScreen("Titelseite","Startscreen"),
	ProgrammedBy("Programmiert von","Programmed by"),
	Geburtstag("Geburtsjahr","Year of birth"),
	VielSpaßBeimZocken("Viel Spaß beim Zocken :D","Have fun playing :D"),
	KeyUse("Tasten-Kombinationen","Key combination "),
	Info("Info","Info"),
	PageBack("Karte zurück","Card back"),
	CardsChoosen("Anzahl der gespielten Karten:","Number of selected Cards:"),
	Schriftart("Schriftart: ","Font: "),
	AutoSave("Automatische Speicherung: ","Autosave: "),
	AutoPlayAfterGameEnd("Automatisch Geschichte abspielen nach Spielende: ","Autoplay Story after End of the Game: "),
	AudioDateiTypeNichtverwendbar("Audiodateitype nicht verwendbar","Audio file type cannot be used!"),
	Male("Männlich","Male"),
	Female("Weiblich","Female"),
	Hell("Hell","Light"),
	Design("Darstellung: ","Design: "),
	Dunkel("Dunkel","Dark"),
	SavingTitel("Speichern...","Saveing..."),
	LoadCardsTitel("Lade Karten","Loading Cards"),
	LoadCardsEnd("Alle Karten geladen","All Cards loaded"),
	SavingEnd("Alle Einstellungen gespeichert","All settings saved"),
	SpeichernButton("Speichern","Save"),
	PlayDirectButton("Direkt Spielen","Play directly"),
	TitelScreenButton("Titelseite","Startscreen"),
	VorleseStimme("Vorlesestimme: ","Reading voice: "),
	Play("Spielen","Play"),
	PlayAudioStory("Geschichte abspielen","Play Story"),
	StoryBasedOn("Geschichte basierend auf Hypertext-Spielkarten von Ruth Wajnryb","Story based on Hypertext Game Cards by Ruth Wajnryb"),
	Sprache("Sprache: ","Language: "),
	GameOver("Spiel vorbei","Game Over"),
	NOMoreCardsBack("Es gib nur 2 Karten Zurück. Diese sind aber schon aufgebraucht.","There are only 2 cards back. But these have already been used up. "),
	Weiter("Weiter","Continue"),
	
	//GamesGUI
	Games("Andere Spiele","Other Games"),
	NameZuLang("Der gewählte Name ist zu lang/kurz!","The choosen name is too long/short!"),
	//GamesGUI
	
	//schereSteinPapier
	SchereSteinPapier("Schere Stein Papier","Rock Paper Scissors"),
	Score("Spielstand","Score"), 
	hasWon("hat gewonnen!","has Won!"),
	Tie("Unentschieden","tie!")
	//schereSteinPapier
	
	;
	
	private String Deutsch;
	private String Englisch;
	
	WordTypes(String Deutsch, String Englisch) {
		this.Deutsch = Deutsch;
		this.Englisch = Englisch;
	}
	
	public String getDeutsch() {
		return Deutsch;
	}
	
	public String getEnglisch() {
		return Englisch;
	}
	
}

