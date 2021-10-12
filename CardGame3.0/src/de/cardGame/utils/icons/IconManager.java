package de.cardGame.utils.icons;

import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import de.cardGame.gui.StartScreenGUI;
import de.cardGame.main.CardGame;

public class IconManager {
	
	private Image image;
	private ImageIcon imageIcon;
	private URL input;
	
	public IconManager(IconPath IconPath) {
		String Path = IconPath.getPath();
		this.input = this.getClass().getClassLoader().getResource(Path);
		try {
		this.imageIcon = new ImageIcon(input);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Wenn das auftritt RUF den Tech-Support!");
			CardGame.setGUI(null);
		}
		this.image = this.imageIcon.getImage();
	}
	
	public Image getImage() {
		return image;
	}
	
	public ImageIcon getImageIcon() {
		return imageIcon;
	}

}
