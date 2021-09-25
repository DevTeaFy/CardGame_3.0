package de.cardGame.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import de.cardGame.main.CardGame;
import de.cardGame.utils.icons.IconManager;
import de.cardGame.utils.icons.IconPath;
import de.cardGame.utils.words.WordTypes;
import de.cardGame.utils.words.Words;

public class ProgressBarGUI{
/*	
	private JFrame frame = null;
	private JPanel panel = null;
	private JProgressBar progressBar= null;
	private int lmaximum = 0;
	
	
	public ProgressBarGUI(String Titel,int maximum) {
		this.lmaximum = maximum;
		this.frame = new JFrame(Titel);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setLayout(new BorderLayout());
		this.frame.setResizable(false);
		this.frame.setIconImage(new IconManager(IconPath.GameIcon).getImage());
		//this.frame.setTitle(Titel);
		this.frame.setAlwaysOnTop(true);
		SetFrameVisible(true);
		
		int width = CardGame.getGraphicsDevice().getDisplayMode().getWidth();
		int height = CardGame.getGraphicsDevice().getDisplayMode().getHeight();

		this.frame.setLocation((width/2)-210, (height/2)-45);
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.green);
		
		progressBar = new JProgressBar(0,maximum);
		progressBar.setPreferredSize(new Dimension(420,50));
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		progressBar.setBackground(Color.black);
		progressBar.setForeground(Color.red);
		progressBar.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.BOLD, 25));
		
		panel.add(progressBar,BorderLayout.NORTH);
		
		this.frame.add(panel,BorderLayout.CENTER);
		
		this.frame.pack();
	}
	
	public JFrame getFrame() {
		return this.frame;
	}
	
	public void SetTitel(String Titel) {
		this.frame.setTitle(Titel);
	}
	
	public void SetFrameVisible(boolean value){
		this.frame.setVisible(value);
	}
	
	public void fill(int value) {
		progressBar.setValue(value);
		progressBar.setString(value+"/"+lmaximum);
	}
	public void fillinPersent(int value) {
		progressBar.setValue(value);
		Warten(100);
	}
	
	public void progressend(String progressbarText) {
		progressBar.setString(progressbarText);
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.frame.dispose();
		progressBar.setValue(0);
		progressBar.setString(0+"/"+lmaximum);
	}
	
	public void SaveSettings() {
		int counter = 0;
		while (counter<= 7) {
			counter+=1;
			try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			this.fill(counter);
		}
		this.progressend(Words.get(WordTypes.SavingEnd));
	}
	
	public void Warten(long millisecond) {
		try {
			Thread.sleep(millisecond);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}*/

}
