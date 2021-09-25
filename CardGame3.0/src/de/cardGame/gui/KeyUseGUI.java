package de.cardGame.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import de.cardGame.main.CardGame;
import de.cardGame.utils.icons.IconManager;
import de.cardGame.utils.icons.IconPath;
import de.cardGame.utils.words.WordTypes;
import de.cardGame.utils.words.Words;

public class KeyUseGUI {
	/*
	private JFrame frame;
	private JPanel framePanel = new JPanel();
	private JPanel PanelmainNorth = new JPanel();
	private JPanel PanelmainEast = new JPanel();
	private JPanel PanelmainWest = new JPanel();
	private JPanel PanelmainSouth = new JPanel();
	private JPanel contentPanel = new JPanel();
	private JLabel titellbl,AltA,AltB,AltC,AltP,AltE,AltH,Titelscrenn,Settings,Zurück,KartePath;
	
	public KeyUseGUI() {
		this.frame =  new JFrame();
		this.frame.setSize(Integer.valueOf((int) (CardGame.getGUI().getWidth()/1.5)),Integer.valueOf((int) (CardGame.getGUI().getHeight()/1.5)));
		int width = CardGame.getGraphicsDevice().getDisplayMode().getWidth();
		int height = CardGame.getGraphicsDevice().getDisplayMode().getHeight();
		this.frame.setLocation((int) ((width/2)-(this.frame.getSize().getWidth()/2)), (int) ((height/2)-(this.frame.getSize().getHeight()/2)));
		this.frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.frame.setLayout(new BorderLayout());
		this.frame.setResizable(true);
		this.frame.setTitle(Words.get(WordTypes.Name));
		this.frame.setAlwaysOnTop(true);
		this.frame.setVisible(true);
		this.frame.getContentPane().setBackground(CardGame.BackgroundColor);
		this.frame.setIconImage(new IconManager(IconPath.GameIcon).getImage());
		
		
		titellbl = new JLabel();
		titellbl.setText(Words.get(WordTypes.KeyUse));
		titellbl.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 60));
		titellbl.setBackground(CardGame.BackgroundColor);
		titellbl.setForeground(Color.green);
		titellbl.setHorizontalAlignment(SwingConstants.CENTER);
		titellbl.setHorizontalTextPosition(SwingConstants.CENTER);
		
		AltA = new JLabel();
		AltA.setText("Alt + A | "+Words.get(WordTypes.KeyUseVorlesen).replace("%Karte%", "(a)"));
		AltA.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 15));
		AltA.setBackground(CardGame.BackgroudColorMatch2);
		AltA.setOpaque(true);
		AltA.setForeground(Color.green);
		AltA.setHorizontalAlignment(SwingConstants.CENTER);
		AltA.setHorizontalTextPosition(SwingConstants.CENTER);
		
		AltB = new JLabel();
		AltB.setText("Alt + B | "+Words.get(WordTypes.KeyUseVorlesen).replace("%Karte%", "(b)"));
		AltB.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 15));
		AltB.setBackground(CardGame.BackgroudColorMatch2);
		AltB.setOpaque(true);
		AltB.setForeground(Color.green);
		AltB.setHorizontalAlignment(SwingConstants.CENTER);
		AltB.setHorizontalTextPosition(SwingConstants.CENTER);
		
		AltC = new JLabel();
		AltC.setText("Alt + C | "+Words.get(WordTypes.KeyUseVorlesen).replace("%Karte%", "(c)"));
		AltC.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 15));
		AltC.setBackground(CardGame.BackgroudColorMatch2);
		AltC.setOpaque(true);
		AltC.setForeground(Color.green);
		AltC.setHorizontalAlignment(SwingConstants.CENTER);
		AltC.setHorizontalTextPosition(SwingConstants.CENTER);
		
		AltP = new JLabel();
		AltP.setText("Alt + P | "+Words.get(WordTypes.KeyUsePages));
		AltP.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 15));
		AltP.setBackground(CardGame.BackgroudColorMatch2);
		AltP.setOpaque(true);
		AltP.setForeground(Color.green);
		AltP.setHorizontalAlignment(SwingConstants.CENTER);
		AltP.setHorizontalTextPosition(SwingConstants.CENTER);
		
		AltE = new JLabel();
		AltE.setText("Alt + E | "+Words.get(WordTypes.KeyUseExtras));
		AltE.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 15));
		AltE.setBackground(CardGame.BackgroudColorMatch2);
		AltE.setOpaque(true);
		AltE.setForeground(Color.green);
		AltE.setHorizontalAlignment(SwingConstants.CENTER);
		AltE.setHorizontalTextPosition(SwingConstants.CENTER);
		
		AltH = new JLabel();
		AltH.setText("Alt + H | "+Words.get(WordTypes.KeyUseHelp));
		AltH.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 15));
		AltH.setBackground(CardGame.BackgroudColorMatch2);
		AltH.setOpaque(true);
		AltH.setForeground(Color.green);
		AltH.setHorizontalAlignment(SwingConstants.CENTER);
		AltH.setHorizontalTextPosition(SwingConstants.CENTER);
		
		Titelscrenn = new JLabel();
		Titelscrenn.setText("Alt + P + T | "+Words.get(WordTypes.KeyUseTitelScreen));
		Titelscrenn.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 15));
		Titelscrenn.setBackground(CardGame.BackgroudColorMatch2);
		Titelscrenn.setOpaque(true);
		Titelscrenn.setForeground(Color.green);
		Titelscrenn.setHorizontalAlignment(SwingConstants.CENTER);
		Titelscrenn.setHorizontalTextPosition(SwingConstants.CENTER);
		
		Settings = new JLabel();
		Settings.setText("Alt + P + S | "+Words.get(WordTypes.KeyUseSettings));
		Settings.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 15));
		Settings.setBackground(CardGame.BackgroudColorMatch2);
		Settings.setOpaque(true);
		Settings.setForeground(Color.green);
		Settings.setHorizontalAlignment(SwingConstants.CENTER);
		Settings.setHorizontalTextPosition(SwingConstants.CENTER);
		
		Zurück = new JLabel();
		Zurück.setText("Alt + E + Z | "+Words.get(WordTypes.KeyUseKarteBack));
		Zurück.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 15));
		Zurück.setBackground(CardGame.BackgroudColorMatch2);
		Zurück.setOpaque(true);
		Zurück.setForeground(Color.green);
		Zurück.setHorizontalAlignment(SwingConstants.CENTER);
		Zurück.setHorizontalTextPosition(SwingConstants.CENTER);

		KartePath = new JLabel();
		KartePath.setText("Alt + E + K | "+Words.get(WordTypes.KeyUseKartPath));
		KartePath.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 15));
		KartePath.setBackground(CardGame.BackgroudColorMatch2);
		KartePath.setOpaque(true);
		KartePath.setForeground(Color.green);
		KartePath.setHorizontalAlignment(SwingConstants.CENTER);
		KartePath.setHorizontalTextPosition(SwingConstants.CENTER);
		
		PanelmainNorth = new JPanel();
		PanelmainNorth.setBackground(CardGame.BackgroundColor);
		PanelmainNorth.setLayout(new BorderLayout());
		PanelmainNorth.setPreferredSize(new Dimension(20,100));
		PanelmainNorth.add(titellbl);
		
		PanelmainEast = new JPanel();
		PanelmainEast.setBackground(CardGame.BackgroundColor);
		PanelmainEast.setLayout(new BorderLayout());
		PanelmainEast.setPreferredSize(new Dimension(20,20));
		
		PanelmainWest = new JPanel();
		PanelmainWest.setBackground(CardGame.BackgroundColor);
		PanelmainWest.setLayout(new BorderLayout());
		PanelmainWest.setPreferredSize(new Dimension(20,20));
		
		PanelmainSouth = new JPanel();
		PanelmainSouth.setBackground(CardGame.BackgroundColor);
		PanelmainSouth.setLayout(new BorderLayout());
		PanelmainSouth.setPreferredSize(new Dimension(20,20));
		//new Color(0x505050)
		contentPanel = new JPanel();
		contentPanel.setBackground(CardGame.BackgroundColor);
		contentPanel.setLayout(new GridLayout(5,2,10,10));
		
		contentPanel.add(AltA);
		contentPanel.add(AltP);
		contentPanel.add(AltB);
		contentPanel.add(Titelscrenn);
		contentPanel.add(AltC);
		contentPanel.add(Settings);
		contentPanel.add(AltE);
		contentPanel.add(AltH);
		contentPanel.add(KartePath);
		contentPanel.add(Zurück);
		
		framePanel = new JPanel();
		framePanel.setBackground(CardGame.BackgroundColor);
		framePanel.setLayout(new BorderLayout());
		
		framePanel.add(PanelmainNorth,BorderLayout.NORTH);
		framePanel.add(PanelmainEast,BorderLayout.EAST);
		framePanel.add(PanelmainWest,BorderLayout.WEST);
		framePanel.add(PanelmainSouth,BorderLayout.SOUTH);
		framePanel.add(contentPanel,BorderLayout.CENTER);
		
		this.frame.add(framePanel);
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public void Close() {
		this.frame.dispose();
	}
	*/
}
