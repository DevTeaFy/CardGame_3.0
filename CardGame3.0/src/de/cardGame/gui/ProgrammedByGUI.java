package de.cardGame.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import de.cardGame.andereGames.GamesGUI;
import de.cardGame.cards.Card;
import de.cardGame.main.CardGame;
import de.cardGame.utils.StoppUhr;
import de.cardGame.utils.icons.IconManager;
import de.cardGame.utils.icons.IconPath;
import de.cardGame.utils.settings.Settings;
import de.cardGame.utils.sprachausgabe.TextType;
import de.cardGame.utils.words.WordTypes;
import de.cardGame.utils.words.Words;

public class ProgrammedByGUI implements ActionListener {
	/*
	private JFrame frame;
	private JPanel framePanel = new JPanel();
	private JPanel PanelmainNorth = new JPanel();
	private JPanel PanelmainEast = new JPanel();
	private JPanel PanelmainWest = new JPanel();
	private JPanel PanelmainSouth = new JPanel();
	private JPanel contentPanel = new JPanel();
	private JLabel titellbl,Namelbl,Geburtstagslbl,Copyright;
	private JButton btnZocken;
	
	public ProgrammedByGUI() {
		this.frame =  new JFrame();
		this.frame.setSize(Integer.valueOf((int) (CardGame.getGUI().getWidth()/1.5)),Integer.valueOf((int) (CardGame.getGUI().getHeight()/1.5)));
		int width = CardGame.getGraphicsDevice().getDisplayMode().getWidth();
		int height = CardGame.getGraphicsDevice().getDisplayMode().getHeight();
		this.frame.setLocation((int) ((width/2)-(this.frame.getSize().getWidth()/2)), (int) ((height/2)-(this.frame.getSize().getHeight()/2)));
		this.frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.frame.setLayout(new BorderLayout());
		this.frame.setResizable(false);
		this.frame.setTitle(Words.get(WordTypes.Name));
		this.frame.setAlwaysOnTop(false);
		this.frame.setVisible(true);
		this.frame.getContentPane().setBackground(CardGame.BackgroundColor);
		this.frame.setIconImage(new IconManager(IconPath.GameIcon).getImage());
		
		titellbl = new JLabel();
		titellbl.setText(Words.get(WordTypes.Info));
		titellbl.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 60));
		titellbl.setBackground(CardGame.BackgroundColor);
		titellbl.setOpaque(true);
		titellbl.setForeground(Color.green);
		titellbl.setHorizontalAlignment(SwingConstants.CENTER);
		titellbl.setHorizontalTextPosition(SwingConstants.CENTER);
		
		Namelbl = new JLabel();
		Namelbl.setText("Name: Timon Filz");
		Namelbl.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 24));
		Namelbl.setBackground(CardGame.BackgroudColorMatch2);
		Namelbl.setOpaque(true);
		Namelbl.setForeground(Color.green);
		Namelbl.setHorizontalAlignment(SwingConstants.CENTER);
		Namelbl.setHorizontalTextPosition(SwingConstants.CENTER);
		
		Geburtstagslbl = new JLabel();
		Geburtstagslbl.setText(Words.get(WordTypes.Geburtstag)+": 2002");
		Geburtstagslbl.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 24));
		Geburtstagslbl.setBackground(CardGame.BackgroudColorMatch2);
		Geburtstagslbl.setOpaque(true);
		Geburtstagslbl.setForeground(Color.green);
		Geburtstagslbl.setHorizontalAlignment(SwingConstants.CENTER);
		Geburtstagslbl.setHorizontalTextPosition(SwingConstants.CENTER);
		
		btnZocken = new JButton();
		btnZocken.setText(Words.get(WordTypes.VielSpaﬂBeimZocken));
		btnZocken.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 24));
		btnZocken.setBackground(CardGame.BackgroudColorMatch2);
		btnZocken.setOpaque(true);
		btnZocken.setFocusable(false);
		btnZocken.addActionListener(this);
		btnZocken.setForeground(Color.green);
		btnZocken.setHorizontalAlignment(SwingConstants.CENTER);
		btnZocken.setHorizontalTextPosition(SwingConstants.CENTER);
		btnZocken.setBorder(BorderFactory.createEmptyBorder());
		
		Copyright = new JLabel();
		Copyright.setText("© Copyright 2021 Timon Filz");
		Copyright.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 24));
		Copyright.setBackground(CardGame.BackgroudColorMatch2);
		Copyright.setOpaque(true);
		Copyright.setForeground(Color.green);
		Copyright.setHorizontalAlignment(SwingConstants.CENTER);
		Copyright.setHorizontalTextPosition(SwingConstants.CENTER);
		
		PanelmainNorth = new JPanel();
		PanelmainNorth.setBackground(CardGame.BackgroundColor);
		PanelmainNorth.setLayout(new BorderLayout());
		PanelmainNorth.add(titellbl);
		
		PanelmainEast = new JPanel();
		PanelmainEast.setPreferredSize(new Dimension(20,20));
		PanelmainEast.setBackground(CardGame.BackgroundColor);
		PanelmainEast.setLayout(new BorderLayout());
		
		PanelmainWest = new JPanel();
		PanelmainWest.setPreferredSize(new Dimension(20,20));
		PanelmainWest.setBackground(CardGame.BackgroundColor);
		PanelmainWest.setLayout(new BorderLayout());
		
		PanelmainSouth = new JPanel();
		PanelmainSouth.setPreferredSize(new Dimension(20,20));
		PanelmainSouth.setBackground(CardGame.BackgroundColor);
		PanelmainSouth.setLayout(new BorderLayout());
		
		contentPanel = new JPanel();
		contentPanel.setBackground(CardGame.BackgroundColor);
		contentPanel.setLayout(new GridLayout(4,1,10,10));
		
		contentPanel.add(Namelbl);
		contentPanel.add(Geburtstagslbl);
		contentPanel.add(btnZocken);
		contentPanel.add(Copyright);
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if(!(e.getSource() == btnZocken)) {
			return;
		}
		this.frame.dispose();
		Settings.Cardback = 2;
		GameGUI.StopSprachausgabeAsistent();
		Words.choosenWayID.add(Card.AktiveCardID);
		Words.choosenWayAnswer.add(TextType.GameOver);
		Words.choosenWay.add(Words.get(WordTypes.Karte) + (Card.AktiveCardID + 1) + " + " + Words.get(WordTypes.GameOver));
		CardGame.getGUI().dispose();
		StoppUhr.Stopp();
		CardGame.setGUI(new GamesGUI(false).getFrame());
		
	}*/
	
}
