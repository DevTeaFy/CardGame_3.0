package de.cardGame.utils.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import de.cardGame.main.CardGame;
import de.cardGame.utils.Settings.Settings;

public class FileManager {

	private String resPath;
	private BufferedReader reader;

	public FileManager() {
		FileWriter fw;
		File ordner = new File(this.getClass().getClassLoader().getResource("").getPath()+"Settings");
		File file = new File(this.getClass().getClassLoader().getResource("").getPath()+"Settings/Settings.txt");
		if(!ordner.exists()) {
			ordner.mkdir();
		}
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("Kann den File nicht erstellen!");
				e.printStackTrace();
			}
			try {
				fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw);

				bw.write("Sprache: De_de\n");
				bw.write("AudioVolume: 50\n");
				bw.write("Stimmenart: W\n");
				bw.write("Autoplayaftergame: false\n");
				bw.write("AutoSave: false\n");
				bw.write("Schriftart: MV Boli\n");
				bw.write("Design: Dunkel\n");

				bw.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}
		try {
			reader = new BufferedReader(new FileReader(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String[] getResursAsArray() {
		String[] Text = new String[7];
		String zeile = "Error";
		try {
			int counter = 0;
			while (counter <= 6) {
				zeile = reader.readLine();
				if (zeile != null) {
					String ende = zeile.replace("Sprache: ", "") 	// 0
							.replace("AudioVolume: ", "") 			// 1
							.replace("Stimmenart: ", "") 			// 2
							.replace("Autoplayaftergame: ", "")		// 3
							.replace("AutoSave: ", "")				// 4
							.replace("Schriftart: ", "") 			// 5
							.replace("Design: ", ""); 				// 6
					Text[counter] = ende;
				}
				counter += 1;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Text;
	}

	public void SaveResursArray() {

		FileWriter fw;

		try {
			File datei = new File(this.getClass().getClassLoader().getResource("").getPath()+"Settings/Settings.txt");
			if (!datei.exists()) {
				datei.createNewFile();
				fw = new FileWriter(datei);

				BufferedWriter bw = new BufferedWriter(fw);

				bw.write("Sprache: En_en\n");
				bw.write("AudioVolume: 50\n");
				bw.write("Stimmenart: W\n");
				bw.write("Autoplayaftergame: false\n");
				bw.write("AutoSave: true\n");
				bw.write("Schriftart: MV Boli\n");
				bw.write("Design: Dunkel\n");

				bw.close();
			} else {
				fw = new FileWriter(datei);

				BufferedWriter bw = new BufferedWriter(fw);
				Settings st = CardGame.getSettings();

				bw.write("Sprache: "+st.getLanguage()+"\n");
				bw.write("AudioVolume: "+st.getAudiovalue()+"\n");
				bw.write("Stimmenart: "+st.getStimmenArt()+"\n");
				bw.write("Autoplayaftergame: "+st.isAutoplayaftergame()+"\n");
				bw.write("AutoSave: "+st.isAutoSave()+"\n");
				bw.write("Schriftart: "+st.getSchriftart()+"\n");
				bw.write("Design: "+st.getDesign()+"\n");

				bw.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getResPath() {
		return resPath;
	}

}

