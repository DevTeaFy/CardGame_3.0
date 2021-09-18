package de.cardGame.GUI;

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

import de.cardGame.main.CardGame;
import de.cardGame.utils.StoppUhr;
import de.cardGame.utils.Icons.IconManager;
import de.cardGame.utils.Icons.IconPath;
import de.cardGame.utils.Sprachausgabe.SprachAusgabe;
import de.cardGame.utils.Words.WordTypes;
import de.cardGame.utils.Words.Words;

public class StartScreenGUI implements ActionListener{
	
	private JFrame frame;
	private JLabel titellbl;
	private JLabel subtitellbl;
	private JLabel TimePlayed;
	private JLabel NumberOfCards;
	private JLabel CardPath;
	private JButton Settings;
	private JButton PlayAudioSotry;
	private JButton PlayGame;
	private JPanel framePanel = new JPanel();
	private JPanel titelPanel = new JPanel();
	private JPanel PanelmainEast = new JPanel();
	private JPanel PanelmainWest = new JPanel();
	private JPanel PanelmainSouth = new JPanel();
	private JPanel contentPanel = new JPanel();
	private JPanel contentPanel1 = new JPanel();
	private JPanel contentPanel2 = new JPanel();
	private JPanel contentPanel3 = new JPanel();
	
	public StartScreenGUI(JFrame lframe) {
		if(lframe == null) {
			this.frame =  new JFrame();;
			this.frame.setSize(1052, 596);
			int width = CardGame.getGraphicsDevice().getDisplayMode().getWidth();
			int height = CardGame.getGraphicsDevice().getDisplayMode().getHeight();
			
			this.frame.setLocation((int) ((width/2)-(this.frame.getSize().getWidth()/2)), (int) ((height/2)-(this.frame.getSize().getHeight()/2)));
		}else {
			this.frame = lframe;
			this.frame.removeAll();
		}
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setLayout(new BorderLayout());
		this.frame.setResizable(true);
		this.frame.setTitle(Words.get(WordTypes.Name));
		this.frame.setAlwaysOnTop(true);
		this.frame.setVisible(true);
		this.frame.setIconImage(new IconManager(IconPath.GameIcon).getImage());
		
		titelPanel.setLayout(new BorderLayout());
		titelPanel.setBackground(CardGame.BackgroundColor);
		titelPanel.setPreferredSize(new Dimension(20,175));
		titellbl = new JLabel();
		titellbl.setText(Words.get(WordTypes.Name));
		titellbl.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.BOLD, 60));
		titellbl.setForeground(Color.green);
		titellbl.setHorizontalAlignment(SwingConstants.CENTER);
		titellbl.setHorizontalTextPosition(SwingConstants.CENTER);
		titelPanel.add(titellbl,BorderLayout.NORTH);
		subtitellbl = new JLabel();
		subtitellbl.setPreferredSize(new Dimension(20,175));
		subtitellbl = new JLabel();
		subtitellbl.setText(Words.get(WordTypes.UnterTitel));
		subtitellbl.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.BOLD, 50));
		subtitellbl.setForeground(Color.green);
		subtitellbl.setHorizontalAlignment(SwingConstants.CENTER);
		subtitellbl.setHorizontalTextPosition(SwingConstants.CENTER);
		titelPanel.add(subtitellbl,BorderLayout.CENTER);
		
		PanelmainEast.setBackground(CardGame.BackgroundColor);
		PanelmainEast.setPreferredSize(new Dimension(5,5));
		PanelmainWest.setBackground(CardGame.BackgroundColor);
		PanelmainWest.setPreferredSize(new Dimension(5,5));
		PanelmainSouth.setBackground(CardGame.BackgroundColor);
		PanelmainSouth.setPreferredSize(new Dimension(40,20));
		contentPanel.setBackground(CardGame.BackgroundColor);
		contentPanel.setLayout(new GridLayout(3,1,10,10));
		
		
		contentPanel1.setBackground(CardGame.BackgroudColorMatch2);
		contentPanel1.setLayout(new GridLayout(2,1,10,10));
		TimePlayed = new JLabel();
		TimePlayed.setPreferredSize(new Dimension(400,50));
		TimePlayed.setText(Words.get(WordTypes.Versuchszeit));
		TimePlayed.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 30));
		TimePlayed.setForeground(new Color(0x06A666));
		TimePlayed.setVerticalAlignment(SwingConstants.BOTTOM);
		TimePlayed.setHorizontalAlignment(SwingConstants.LEFT);
		NumberOfCards = new JLabel();
		NumberOfCards.setPreferredSize(new Dimension(400,50));
		NumberOfCards.setText(Words.get(WordTypes.CardsChoosen));
		NumberOfCards.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 30));
		NumberOfCards.setForeground(new Color(0x06A666));
		NumberOfCards.setVerticalAlignment(SwingConstants.TOP);
		NumberOfCards.setHorizontalAlignment(SwingConstants.LEFT);
		
		contentPanel1.add(TimePlayed);
		contentPanel1.add(NumberOfCards);
		
		contentPanel2.setBackground(CardGame.BackgroudColorMatch2);
		contentPanel2.setLayout(new BorderLayout());

		CardPath = new JLabel();
		CardPath.setText(Words.get(WordTypes.Kartenpfad));
		CardPath.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 40));
		CardPath.setForeground(new Color(0x06A666));
		CardPath.setVerticalAlignment(SwingConstants.TOP);
		CardPath.setHorizontalAlignment(SwingConstants.LEFT);
		
		contentPanel2.add(CardPath,BorderLayout.CENTER);
		
		
		contentPanel3.setBackground(CardGame.BackgroundColor);
		contentPanel3.setLayout(new GridLayout(1,3,10,10));
		
		Settings = new JButton();
		Settings.setText(Words.get(WordTypes.Settings));
		Settings.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 35));
		Settings.setForeground(new Color(0x06A666));
		Settings.setBackground(CardGame.BackgroudColorMatch2);
		Settings.setFocusable(false);
		Settings.addActionListener(this);
		Settings.setIcon(new IconManager(IconPath.Settingsx64).getImageIcon());
		Settings.setBorder(BorderFactory.createEmptyBorder());

		PlayAudioSotry = new JButton();
		PlayAudioSotry.setText(Words.get(WordTypes.PlayAudioStory));
		PlayAudioSotry.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 35));
		PlayAudioSotry.setForeground(new Color(0x06A666));
		PlayAudioSotry.setBackground(CardGame.BackgroudColorMatch2);
		PlayAudioSotry.setFocusable(false);
		PlayAudioSotry.addActionListener(this);
		PlayAudioSotry.setBorder(BorderFactory.createEmptyBorder());
		PlayAudioSotry.setVisible(false);

		PlayGame = new JButton();
		PlayGame.setText(Words.get(WordTypes.Play));
		PlayGame.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 35));
		PlayGame.setForeground(new Color(0x06A666));
		PlayGame.setBackground(CardGame.BackgroudColorMatch2);
		PlayGame.setFocusable(false);
		PlayGame.addActionListener(this);
		PlayGame.setIcon(new IconManager(IconPath.Play).getImageIcon());
		PlayGame.setBorder(BorderFactory.createEmptyBorder());
		
		
		contentPanel3.add(Settings);
		contentPanel3.add(PlayAudioSotry);
		contentPanel3.add(PlayGame);
		
		
		contentPanel.add(contentPanel1);
		contentPanel.add(contentPanel2);
		contentPanel.add(contentPanel3);


		framePanel = new JPanel();
		framePanel.setBackground(CardGame.BackgroudColorMatch2);
		framePanel.setLayout(new BorderLayout());
		
		framePanel.add(titelPanel,BorderLayout.NORTH);
		framePanel.add(PanelmainEast,BorderLayout.EAST);
		framePanel.add(PanelmainWest,BorderLayout.WEST);
		framePanel.add(PanelmainSouth,BorderLayout.SOUTH);
		framePanel.add(contentPanel,BorderLayout.CENTER);
		
		this.frame.add(framePanel,BorderLayout.CENTER);
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public void removeFramePanel(){
		this.frame.remove(framePanel);
	}
	public void setFramePanel(JPanel panel){
		this.frame.add(panel,BorderLayout.CENTER);
	}


	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Settings) {
			CheckPlayBack();
			CardGame.getGUI().dispose();
			SettingsGUI gui = new SettingsGUI(null);
			CardGame.setGUI(gui.getFrame());
			CardGame.getGUI().show();
		}else if(e.getSource() == PlayGame) {
			Words.choosenWay.clear();
			Words.choosenWayAnswer.clear();
			Words.choosenWayID.clear();
			CheckPlayBack();
			StoppUhr.Run();
			CardGame.getGUI().dispose();
			CardGame.setGUI(new GameGUI(null).getFrame());
		}else if(e.getSource() == PlayAudioSotry) {
			SprachAusgabe.PlayGameInAudio();
		}
		
	}
	
	private void CheckPlayBack() {
		if(SprachAusgabe.PlayBackisRunning) {
			SprachAusgabe.stopPlayBack = true;
		}
	}
	
	public void setTextTimeNumberOfCardsCardPath(String Versuchszeit, String Text, int size, int versuchsmenge) {
		TimePlayed.setText(Words.get(WordTypes.Versuchszeit) + " " + Versuchszeit);
		NumberOfCards.setText(Words.get(WordTypes.CardsChoosen)+" "+versuchsmenge);
		CardPath.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.BOLD, size));
		CardPath.setText("<html><body>" + Words.get(WordTypes.Kartenpfad) + "<br>" + Text + "</body></html>");
	}
	
	public void setPlayAudioSotryVisible(boolean value) {
		PlayAudioSotry.setVisible(value);
	}
}
