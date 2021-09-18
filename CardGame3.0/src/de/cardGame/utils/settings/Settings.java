package de.cardGame.utils.settings;

import de.cardGame.utils.file.FileManager;
import de.cardGame.utils.words.WordTypes;
import de.cardGame.utils.words.Words;

public class Settings {
	
	private String language;
	private int audiovalue;
	private String StimmenArt;
	private boolean Autoplayaftergame;
	private boolean AutoSave;
	private String Schriftart;
	private String Design;
	public static int Cardback = 2;
	FileManager fl = new FileManager();

	
	
	public Settings() {
		
	}
	
	public void load() {
		String[] ergebnisse = fl.getResursAsArray();
		setLanguage(ergebnisse[0]);
		setAudiovalue(Integer.valueOf(ergebnisse[1]));
		setStimmenArt(ergebnisse[2]);
		setAutoplayaftergame(Boolean.valueOf(ergebnisse[3]));
		setAutoSave(Boolean.valueOf(ergebnisse[4]));
		setSchriftart(ergebnisse[5]);
		setDesign(ergebnisse[6]);
	}
	
	public void save() {
		fl.SaveResursArray();
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getAudiovalue() {
		return audiovalue;
	}

	public void setAudiovalue(int audiovalue) {
		this.audiovalue = audiovalue;
	}

	public String getStimmenArt() {
		return StimmenArt;
	}

	public void setStimmenArt(String stimmenArt) {
		StimmenArt = stimmenArt;
	}

	public boolean isAutoplayaftergame() {
		return Autoplayaftergame;
	}

	public void setAutoplayaftergame(boolean autoplayaftergame) {
		Autoplayaftergame = autoplayaftergame;
	}

	public String getSchriftart() {
		return Schriftart;
	}

	public void setSchriftart(String schriftart) {
		Schriftart = schriftart;
	}

	public String getDesign() {
		return Design;
	}

	public void setDesign(String design) {
		Design = design;
	}

	public String[] getLanguages(String Type) {
		String[] languages = {Words.get(WordTypes.ENGLISCH,Type),Words.get(WordTypes.DEUTSCH,Type)};
		return languages;
	}
	
	public String[] getSchriftArten() {
		String[] schriftarten = {"MV Boli","Arial","Calibri","Consolas","Roboto","Cambria","Dialog"};
		return schriftarten;
	}

	public boolean isAutoSave() {
		return AutoSave;
	}

	public void setAutoSave(boolean autoSave) {
		AutoSave = autoSave;
	}

}

