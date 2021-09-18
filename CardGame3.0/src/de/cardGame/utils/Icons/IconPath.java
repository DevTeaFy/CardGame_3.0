package de.cardGame.utils.Icons;

public enum IconPath {

	Settingsx32("Images/Settings/settings_iconx32.png"),
	Settingsx64("Images/Settings/settings_iconx64.png"),
	Helpx32("Images/Help/Helpx32.png"),
	MeinName("Images/Help/Name.png"),
	Geburtstag("Images/Help/Geburtstag.png"),
	Ort("Images/Help/Ort.png"),
	ProgrammedByx32("Images/Help/ProgrammedByx32.png"),
	KeyUsex32("Images/Help/KeyUsex32.png"),
	Fontx32("Images/Font/Fontx32.png"),
	Fontx64("Images/Font/Fontx64.png"),
	Startscreenx32("Images/Pages/StartScreenx32.png"),
	Startscreenx64("Images/Pages/Startscreenx64.png"),
	Pagesx32("Images/Pages/Pagesx32.png"),
	PagesV2x32("Images/Pages/PagesV2x32.png"),
	Extrasx32("Images/Extras/Pagesx32.png"),
	CardPathx32("Images/Extras/CardPathx32.png"),
	CardBackx32("Images/Extras/CardBackx32.png"),
	CardBackV2x32("Images/Extras/ArrowBackx32.png"),
	Playx64("Images/Speaker/Playx64.png"),
	Stopx64("Images/Speaker/Stopx64.png"),
	DeutscheFlagge("Images/Language/De_de.png"),
	EnglischeFlagge("Images/Language/En_en.png"),
	GameIcon("Images/Game_Icon.png"),
	Play("Images/Play/Play.png"),
	DirectPlay("Images/Play/DirectPlay.png"),
	Alt("Images/letters/Alt.png"),
	A("Images/letters/A.png"),
	B("Images/letters/B.png"),
	C("Images/letters/C.png"),
	C2("Images/letters/C2.png"),
	E("Images/letters/E.png"),
	H("Images/letters/H.png"),
	H2("Images/letters/H2.png"),
	I("Images/letters/I.png"),
	K("Images/letters/K.png"),
	P("Images/letters/P.png"),
	Savex64("Images/Save/savex64.png"),
	
	
	Schere("Images/SchereSteinPapier/Schere.png"),
	Papier("Images/SchereSteinPapier/Papier.png"),
	SchereSteinPapierx128("Images/SchereSteinPapier/EchteGamex128.png"),
	Stein("Images/SchereSteinPapier/Stein.png");
	

	private String Path;
	
	IconPath(String Path) {
		this.Path = Path;
	}
	
	public String getPath() {
		return Path;
	}
}
