package de.cardGame.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import de.cardGame.cards.Card;
import de.cardGame.cards.generate.CardGenDe;
import de.cardGame.cards.generate.CardGenEn;
import de.cardGame.main.CardGame;
import de.cardGame.utils.StoppUhr;
import de.cardGame.utils.icons.IconManager;
import de.cardGame.utils.icons.IconPath;
import de.cardGame.utils.settings.Settings;
import de.cardGame.utils.sprachausgabe.TextType;
import de.cardGame.utils.words.WordTypes;
import de.cardGame.utils.words.Words;

public class SettingsGUI implements ActionListener, ChangeListener{
	
	private JPanel framePanel;
	private JPanel titelPanel;
	private JPanel mainEast;
	private JPanel mainWest;
	private JPanel mainSouth;
	private JPanel contentPanel;
	private JPanel contentPanelleft;
	private JPanel contentPanelcenter;
	private JPanel contentPanelright;
	private JPanel contentPanelcenter1,contentPanelcenter2,contentPanelcenter3,contentPanelcenter4,contentPanelcenter5,contentPanelcenter6;
	private JLabel languagelbl;
	private JLabel schriftartlbl;
	private JComboBox<String> langugagecbb;
	private JComboBox<String> schriftartcbb;
	private JSlider slider;
	private JLabel slidertitellbl;
	private JLabel sliderbottomlbl;
	private JLabel titellbl;
	private JCheckBox AutoPlayAfterGameEndckb;
	private JCheckBox AutoSaveAfterChangesckb;
	private JButton Speichern;
	private JButton PlayDirect;
	private JButton Titelscreen;

	
	
	private JRadioButton Meanlich;
	private JRadioButton Weiblich;
	private JPanel groupPanelstimme;
	private JLabel groupstimmelbl;
	private JLabel designlbl;
	private JRadioButton Hell;
	private JRadioButton Dunkel;
	private JPanel groupPanelDesign;
	
	private ButtonGroup vorlesestimme = new ButtonGroup();
	private ButtonGroup groupdesign = new ButtonGroup();
	
	
	private int AudioValue;
	private boolean AutoSave;
	private boolean PlaySotryAfterGameend;
	private String stimmenart;
	private String schriftart;
	private String design;
	private String sprache;
	
	public SettingsGUI() {
		
		Settings st = CardGame.getSettings();
		setAudioValue(st.getAudiovalue());
		setAutoSave(st.isAutoSave());
		setPlaySotryAfterGameend(st.isAutoplayaftergame());
		setStimmenart(st.getStimmenArt());
		setSchriftart(st.getSchriftart());
		setdesign(st.getDesign());
		setSprache(st.getLanguage());
		
		
		titelPanel = new JPanel();
		titelPanel.setBackground(CardGame.BackgroundColor);
		titelPanel.setPreferredSize(new Dimension(10,75));
		titelPanel.setLayout(new BorderLayout());

		titellbl = new JLabel();
		titellbl.setText(Words.get(WordTypes.Settings));
		titellbl.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.BOLD, 40));
		titellbl.setForeground(Color.green);
		titellbl.setHorizontalAlignment(SwingConstants.CENTER);
		titelPanel.add(titellbl,BorderLayout.CENTER);
		

		mainEast = new JPanel();
		mainEast.setPreferredSize(new Dimension(5,5));
		mainEast.setBackground(CardGame.BackgroundColor);
		mainWest = new JPanel();
		mainWest.setPreferredSize(new Dimension(5,5));
		mainWest.setBackground(CardGame.BackgroundColor);
		mainSouth = new JPanel();
		mainSouth.setPreferredSize(new Dimension(5,5));
		mainSouth.setBackground(CardGame.BackgroundColor);
		contentPanel = new JPanel();
		contentPanel.setLayout(new GridLayout(1,3,5,5)); 		//Grid 1 row // 3 Colloums  // 5 Pixel vertigal 5 Pixel Horizontal
		contentPanel.setBackground(CardGame.BackgroundColor);
		

		contentPanelleft = new JPanel();
		contentPanelleft.setBackground(CardGame.BackgroudColorMatch2);
		contentPanelleft.setLayout(new BorderLayout());
		slidertitellbl = new JLabel();
		slidertitellbl.setPreferredSize(new Dimension(5,60));
		slidertitellbl.setText(Words.get(WordTypes.Volume));
		slidertitellbl.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.BOLD, 30));
		slidertitellbl.setForeground(new Color(0x06A666));
		slidertitellbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		slider = new JSlider(0,100,CardGame.getSettings().getAudiovalue());
		slider.setBackground(CardGame.BackgroudColorMatch2);
		slider.setForeground(new Color(0x06A666));
		slider.setPreferredSize(new Dimension(50,400));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 20));
		slider.setPaintLabels(true);
		slider.addChangeListener(this);
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				sliderbottomlbl.setText(slider.getValue()+"%");
				setAudioValue(slider.getValue());
			}
		});
		
		sliderbottomlbl = new JLabel();
		sliderbottomlbl.setPreferredSize(new Dimension(5,60));
		sliderbottomlbl.setText(CardGame.getSettings().getAudiovalue()+"%");
		sliderbottomlbl.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.BOLD, 30));
		sliderbottomlbl.setForeground(new Color(0x06A666));
		sliderbottomlbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		contentPanelleft.add(slidertitellbl,BorderLayout.NORTH);
		contentPanelleft.add(slider,BorderLayout.CENTER);
		contentPanelleft.add(sliderbottomlbl,BorderLayout.SOUTH);
		
		
		contentPanelcenter = new JPanel();
		contentPanelcenter.setBackground(CardGame.BackgroundColor);
		contentPanelcenter.setLayout(new GridLayout(6,1,5,5));
		
		languagelbl = new JLabel();
		languagelbl.setPreferredSize(new Dimension(250,30));
		languagelbl.setText(Words.get(WordTypes.Sprache));
		languagelbl.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 30));
		languagelbl.setForeground(new Color(0x06A666));
		languagelbl.setVerticalAlignment(SwingConstants.CENTER);
		languagelbl.setHorizontalAlignment(SwingConstants.LEFT);
		languagelbl.setBorder(BorderFactory.createLineBorder(CardGame.BackgroudColorMatch2,5));
		
		
		langugagecbb = new JComboBox<>(CardGame.getSettings().getLanguages(CardGame.getSettings().getLanguage()));
		langugagecbb.setBackground(CardGame.BackgroudColorMatch2);
		langugagecbb.setForeground(new Color(0x06A666));
		langugagecbb.setBorder(BorderFactory.createLineBorder(CardGame.BackgroudColorMatch2,10));
		langugagecbb.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 30));
		langugagecbb.setBorder(BorderFactory.createEmptyBorder());
		langugagecbb.addActionListener(this);
		if(getSprache().equalsIgnoreCase("De_de")) {
			langugagecbb.setSelectedIndex(1);
		}else if(getSprache().equalsIgnoreCase("En_en")) {
			langugagecbb.setSelectedIndex(0);
		}
		
		contentPanelcenter1 = new JPanel();
		contentPanelcenter1.setBackground(CardGame.BackgroudColorMatch2);
		contentPanelcenter1.setLayout(new BorderLayout());
		contentPanelcenter1.add(languagelbl,BorderLayout.WEST);
		contentPanelcenter1.add(langugagecbb,BorderLayout.CENTER);
		
		
		
		contentPanelcenter2 = new JPanel();
		contentPanelcenter2.setBackground(CardGame.BackgroudColorMatch2);
		contentPanelcenter2.setLayout(new BorderLayout());
		
		schriftartlbl = new JLabel();
		schriftartlbl.setPreferredSize(new Dimension(250,30));
		schriftartlbl.setText(Words.get(WordTypes.Schriftart));
		schriftartlbl.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 30));
		schriftartlbl.setForeground(new Color(0x06A666));
		schriftartlbl.setVerticalAlignment(SwingConstants.CENTER);
		schriftartlbl.setHorizontalAlignment(SwingConstants.LEFT);
		schriftartlbl.setIcon(new IconManager(IconPath.Fontx64).getImageIcon());
		schriftartlbl.setBorder(BorderFactory.createLineBorder(CardGame.BackgroudColorMatch2,5));
		
		schriftartcbb = new JComboBox<>(CardGame.getSettings().getSchriftArten());
		schriftartcbb.setBackground(CardGame.BackgroudColorMatch2);
		schriftartcbb.setForeground(new Color(0x06A666));
		schriftartcbb.setBorder(BorderFactory.createLineBorder(CardGame.BackgroudColorMatch2,10));
		schriftartcbb.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 30));
		schriftartcbb.setBorder(BorderFactory.createEmptyBorder());
		schriftartcbb.setSelectedItem(CardGame.getSettings().getSchriftart());
		schriftartcbb.addActionListener(this);
		contentPanelcenter2.add(schriftartlbl,BorderLayout.WEST);
		contentPanelcenter2.add(schriftartcbb,BorderLayout.CENTER);
		
		
		contentPanelcenter3 = new JPanel();
		contentPanelcenter3.setBackground(CardGame.BackgroudColorMatch2);
		contentPanelcenter3.setLayout(new BorderLayout());

		AutoPlayAfterGameEndckb  = new JCheckBox();
		AutoPlayAfterGameEndckb.setText(Words.get(WordTypes.AutoPlayAfterGameEnd));
		AutoPlayAfterGameEndckb.setFocusable(false);
		AutoPlayAfterGameEndckb.setHorizontalTextPosition(SwingConstants.LEFT);
		AutoPlayAfterGameEndckb.setIconTextGap(20);
		AutoPlayAfterGameEndckb.addActionListener(this);
		AutoPlayAfterGameEndckb.setBackground(CardGame.BackgroudColorMatch2);
		AutoPlayAfterGameEndckb.setForeground(new Color(0x06A666));
		AutoPlayAfterGameEndckb.setSelected(CardGame.getSettings().isAutoplayaftergame());
		AutoPlayAfterGameEndckb.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 25));
		
		contentPanelcenter3.add(AutoPlayAfterGameEndckb,BorderLayout.CENTER);
		
		contentPanelcenter4 = new JPanel();
		contentPanelcenter4.setLayout(new BorderLayout());
		contentPanelcenter4.setBackground(CardGame.BackgroudColorMatch2);
		
		AutoSaveAfterChangesckb = new JCheckBox();
		AutoSaveAfterChangesckb.setText(Words.get(WordTypes.AutoSave));
		AutoSaveAfterChangesckb.setFocusable(false);
		AutoSaveAfterChangesckb.setBackground(CardGame.BackgroudColorMatch2);
		AutoSaveAfterChangesckb.addActionListener(this);
		AutoSaveAfterChangesckb.setForeground(new Color(0x06A666));
		AutoSaveAfterChangesckb.setHorizontalTextPosition(SwingConstants.LEFT);
		AutoSaveAfterChangesckb.setIconTextGap(20);
		AutoSaveAfterChangesckb.setSelected(CardGame.getSettings().isAutoSave());
		AutoSaveAfterChangesckb.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 25));
		
		contentPanelcenter4.add(AutoSaveAfterChangesckb,BorderLayout.CENTER);
		
		contentPanelcenter5 = new JPanel();
		contentPanelcenter5.setLayout(new BorderLayout());
		contentPanelcenter5.setBackground(CardGame.BackgroudColorMatch2);
		
		groupstimmelbl = new JLabel();
		groupstimmelbl.setPreferredSize(new Dimension(200,30));
		groupstimmelbl.setForeground(new Color(0x06A666));
		groupstimmelbl.setText(Words.get(WordTypes.VorleseStimme));
		groupstimmelbl.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 25));
		groupstimmelbl.setVerticalAlignment(SwingConstants.CENTER);
		groupstimmelbl.setHorizontalAlignment(SwingConstants.LEFT);
		groupstimmelbl.setBorder(BorderFactory.createLineBorder(CardGame.BackgroudColorMatch2,5));
		
		Meanlich = new JRadioButton(Words.get(WordTypes.Male));
		Meanlich.setFocusable(false);
		Meanlich.setBackground(CardGame.BackgroudColorMatch2);
		Meanlich.setForeground(new Color(0x06A666));
		Meanlich.addActionListener(this);
		Meanlich.setVerticalTextPosition(SwingConstants.CENTER);
		Meanlich.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 25));
		Weiblich = new JRadioButton(Words.get(WordTypes.Female));
		Weiblich.setFocusable(false);
		Weiblich.addActionListener(this);
		Weiblich.setBackground(CardGame.BackgroudColorMatch2);
		Weiblich.setForeground(new Color(0x06A666));
		Weiblich.setVerticalTextPosition(SwingConstants.CENTER);
		Weiblich.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 25));
		if(CardGame.getSettings().getStimmenArt().equalsIgnoreCase("W")) {
			Weiblich.setSelected(true);
		}else if(CardGame.getSettings().getStimmenArt().equalsIgnoreCase("M")) {
			Meanlich.setSelected(true);
		}
		
		groupPanelstimme = new JPanel();
		groupPanelstimme.setLayout(new GridLayout(2,1,5,5));
		groupPanelstimme.setBackground(CardGame.BackgroudColorMatch2);

		vorlesestimme.add(Meanlich);
		vorlesestimme.add(Weiblich);
		
		
		groupPanelstimme.add(Meanlich);
		groupPanelstimme.add(Weiblich);
		
		contentPanelcenter5.add(groupstimmelbl,BorderLayout.WEST);
		contentPanelcenter5.add(groupPanelstimme,BorderLayout.CENTER);

		contentPanelcenter6 = new JPanel();	
		contentPanelcenter6.setLayout(new BorderLayout());
		contentPanelcenter6.setBackground(CardGame.BackgroudColorMatch2);
		
		designlbl = new JLabel();
		designlbl.setPreferredSize(new Dimension(200,30));
		designlbl.setForeground(new Color(0x06A666));
		designlbl.setText(Words.get(WordTypes.Design));
		designlbl.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 25));
		designlbl.setVerticalAlignment(SwingConstants.CENTER);
		designlbl.setHorizontalAlignment(SwingConstants.LEFT);
		designlbl.setBorder(BorderFactory.createLineBorder(CardGame.BackgroudColorMatch2,5));
		
		
		Dunkel = new JRadioButton(Words.get(WordTypes.Dunkel));
		Dunkel.setFocusable(false);
		Dunkel.setBackground(CardGame.BackgroudColorMatch2);
		Dunkel.setForeground(new Color(0x06A666));
		Dunkel.addActionListener(this);
		Dunkel.setVerticalTextPosition(SwingConstants.CENTER);
		Dunkel.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 25));
		Hell = new JRadioButton(Words.get(WordTypes.Hell));
		Hell.setFocusable(false);
		Hell.addActionListener(this);
		Hell.setBackground(CardGame.BackgroudColorMatch2);
		Hell.setForeground(new Color(0x06A666));
		Hell.setVerticalTextPosition(SwingConstants.CENTER);
		Hell.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 25));
		if(getdesign().equalsIgnoreCase("Dunkel")) {
			Dunkel.setSelected(true);
		}else if(getdesign().equalsIgnoreCase("Hell")) {
			Hell.setSelected(true);
		}
		
		groupPanelDesign = new JPanel();
		groupPanelDesign.setLayout(new GridLayout(2,1,5,5));
		groupPanelDesign.setBackground(CardGame.BackgroudColorMatch2);

		groupdesign.add(Dunkel);
		groupdesign.add(Hell);
		
		
		groupPanelDesign.add(Dunkel);
		groupPanelDesign.add(Hell);
		


		contentPanelcenter6.add(designlbl,BorderLayout.WEST);
		contentPanelcenter6.add(groupPanelDesign,BorderLayout.CENTER);		
			
		
		
		contentPanelcenter.add(contentPanelcenter1);
		contentPanelcenter.add(contentPanelcenter2);
		contentPanelcenter.add(contentPanelcenter3);
		contentPanelcenter.add(contentPanelcenter4);
		contentPanelcenter.add(contentPanelcenter5);
		contentPanelcenter.add(contentPanelcenter6);									
		
		
		contentPanelright = new JPanel();
		contentPanelright.setBackground(CardGame.BackgroundColor);
		contentPanelright.setLayout(new GridLayout(3,1,5,5));
		
		Speichern = new JButton();
		Speichern.setPreferredSize(new Dimension(180,30));
		Speichern.setText(Words.get(WordTypes.SpeichernButton));
		Speichern.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 30));
		Speichern.setForeground(new Color(0x06A666));
		Speichern.setBackground(CardGame.BackgroudColorMatch2);
		Speichern.setFocusable(false);
		Speichern.addActionListener(this);
		Speichern.setIcon(new IconManager(IconPath.Savex64).getImageIcon());
		Speichern.setBorder(BorderFactory.createEmptyBorder());
		Speichern.setVerticalAlignment(SwingConstants.CENTER);
		Speichern.setHorizontalAlignment(SwingConstants.CENTER);
		Titelscreen = new JButton();
		Titelscreen.setPreferredSize(new Dimension(180,30));
		Titelscreen.setText(Words.get(WordTypes.TitelScreenButton));
		Titelscreen.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 30));
		Titelscreen.setForeground(new Color(0x06A666));
		Titelscreen.setBackground(CardGame.BackgroudColorMatch2);
		Titelscreen.setFocusable(false);
		Titelscreen.addActionListener(this);
		Titelscreen.setIcon(new IconManager(IconPath.Startscreenx64).getImageIcon());
		Titelscreen.setBorder(BorderFactory.createEmptyBorder());
		Titelscreen.setVerticalAlignment(SwingConstants.CENTER);
		Titelscreen.setHorizontalAlignment(SwingConstants.CENTER);
		PlayDirect = new JButton();
		PlayDirect.setPreferredSize(new Dimension(180,30));
		PlayDirect.setText(Words.get(WordTypes.PlayDirectButton));
		PlayDirect.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 30));
		PlayDirect.setForeground(new Color(0x06A666));
		PlayDirect.setBackground(CardGame.BackgroudColorMatch2);
		PlayDirect.setFocusable(false);
		PlayDirect.setIcon(new IconManager(IconPath.DirectPlay).getImageIcon());
		PlayDirect.addActionListener(this);
		PlayDirect.setBorder(BorderFactory.createEmptyBorder());
		PlayDirect.setVerticalAlignment(SwingConstants.CENTER);
		PlayDirect.setHorizontalAlignment(SwingConstants.CENTER);
		
		contentPanelright.add(Titelscreen);
		contentPanelright.add(PlayDirect);
		contentPanelright.add(Speichern);
		
		
		contentPanel.add(contentPanelright);// Ist jetzt einfach links eigentlich ist das contentPanelleft hier
		contentPanel.add(contentPanelcenter);
		contentPanel.add(contentPanelleft);// Ist jetzt einfach rechts eigentlich ist das contentPanelright hier
		

		framePanel = new JPanel();
		framePanel.setBackground(CardGame.BackgroudColorMatch2);
		framePanel.setLayout(new BorderLayout());
		
		framePanel.add(titelPanel,BorderLayout.NORTH);
		framePanel.add(mainEast,BorderLayout.EAST);
		framePanel.add(mainWest,BorderLayout.WEST);
		framePanel.add(mainSouth,BorderLayout.SOUTH);
		framePanel.add(contentPanel,BorderLayout.CENTER);
		
	}
	
	public JPanel getFrame() {
		return this.framePanel;
	}

	public int getAudioValue() {
		return AudioValue;
	}

	public void setAudioValue(int audioValue) {
		AudioValue = audioValue;
	}

	public boolean isAutoSave() {
		return AutoSave;
	}

	public void setAutoSave(boolean autoSave) {
		AutoSave = autoSave;
	}

	public boolean isPlaySotryAfterGameend() {
		return PlaySotryAfterGameend;
	}

	public void setPlaySotryAfterGameend(boolean playSotryAfterGameend) {
		PlaySotryAfterGameend = playSotryAfterGameend;
	}

	public String getStimmenart() {
		return stimmenart;
	}

	public void setStimmenart(String stimmenart) {
		this.stimmenart = stimmenart;
	}

	public String getSchriftart() {
		return schriftart;
	}

	public void setSchriftart(String schriftart) {
		this.schriftart = schriftart;
	}

	public String getdesign() {
		return design;
	}

	public void setdesign(String design) {
		this.design = design;
	}

	public String getSprache() {
		return sprache;
	}

	public void setSprache(String sprache) {
		this.sprache = sprache;
	}

	private int IsSecondTime = 0;
	@Override
	public void actionPerformed(ActionEvent e) {
		Settings st = CardGame.getSettings();
		if(e.getSource() == Titelscreen) {
			CardGame.setGUI(new StartScreenGUI(null).getFrame());
		}else if(e.getSource() == Speichern) {
			if(st.isAutoSave()) {
				CardGame.setGUI(new StartScreenGUI(null).getFrame());
			}else {
				ProgressBarGUI progressBarGUI = new ProgressBarGUI(Words.get(WordTypes.SavingTitel), 7);
				progressBarGUI.fill(0);
				progressBarGUI.Warten(100);
				st.setAudiovalue(getAudioValue());
				progressBarGUI.fill(1);
				progressBarGUI.Warten(100);
				st.setAutoplayaftergame(isPlaySotryAfterGameend());
				progressBarGUI.fill(2);
				progressBarGUI.Warten(100);
				st.setAutoSave(isAutoSave());
				progressBarGUI.fill(3);
				progressBarGUI.Warten(100);
				st.setDesign(getdesign());
				progressBarGUI.fill(4);
				progressBarGUI.Warten(100);
				st.setLanguage(getSprache());
				progressBarGUI.fill(5);
				progressBarGUI.Warten(100);
				st.setSchriftart(getSchriftart());
				progressBarGUI.fill(6);
				progressBarGUI.Warten(100);
				st.setStimmenArt(getStimmenart());
				progressBarGUI.fill(7);
				progressBarGUI.Warten(100);
				st.save();
				progressBarGUI.Warten(100);
				progressBarGUI.progressend(Words.get(WordTypes.SavingEnd));
				//KartenSpiel.setGUI(new StartScreenGUI(null).getFrame());
			}
		}else if(e.getSource() == PlayDirect) {
			st.setAudiovalue(getAudioValue());
			st.setAutoplayaftergame(isPlaySotryAfterGameend());
			st.setAutoSave(isAutoSave());
			st.setDesign(getdesign());
			st.setLanguage(getSprache());
			st.setSchriftart(getSchriftart());
			st.setStimmenArt(getStimmenart());
			st.save();
			GameGUI gui = new GameGUI();
			if(Words.choosenWayID.size()>=2) {
				Card c = Card.getCardByID(Words.choosenWayID.get(Words.choosenWayID.size()-2));
				if(Words.choosenWayAnswer.get(Words.choosenWayAnswer.size()-1) == TextType.A||Words.choosenWayAnswer.get(Words.choosenWayAnswer.size()-1) == TextType.Weiter) { 
					gui.setCardText(c.getNextA());
				}else if(Words.choosenWayAnswer.get(Words.choosenWayAnswer.size()-1) == TextType.B){
					gui.setCardText(c.getNextB());
				}else if(Words.choosenWayAnswer.get(Words.choosenWayAnswer.size()-1) == TextType.C){
					gui.setCardText(c.getNextC());
				}else if(Words.choosenWayAnswer.get(Words.choosenWayAnswer.size()-1) == TextType.GameOver) {
					gui.setCardText(0);
				}
			}else {
				gui.setCardText(0);
			}
			CardGame.setGUI(gui.getFrame());
			StoppUhr.Run();
		}else if(e.getSource() == Weiblich) {
			setStimmenart("W");
			if(CardGame.getSettings().isAutoSave()) {
				CardGame.getSettings().setStimmenArt(getStimmenart());
				CardGame.getSettings().save();
			}
		}else if(e.getSource() == Meanlich) {
			setStimmenart("M");
			if(CardGame.getSettings().isAutoSave()) {
				CardGame.getSettings().setStimmenArt(getStimmenart());
				CardGame.getSettings().save();
			}
		}else if(e.getSource() == Dunkel) {
			setdesign("Dunkel");
			if(CardGame.getSettings().isAutoSave()) {
				CardGame.getSettings().setDesign(getdesign());
				CardGame.getSettings().save();
			}
			CardGame.setBackgroundColor(true,getdesign());
		}else if(e.getSource() == Hell) {
			setdesign("Hell");
			if(CardGame.getSettings().isAutoSave()) {
				CardGame.getSettings().setDesign(getdesign());
				CardGame.getSettings().save();
			}
			CardGame.setBackgroundColor(true,getdesign());
		}else if(e.getSource() == AutoSaveAfterChangesckb) {
			setAutoSave(AutoSaveAfterChangesckb.isSelected());
			CardGame.getSettings().setAutoSave(isAutoSave());
			CardGame.getSettings().save();
		}else if(e.getSource() == AutoPlayAfterGameEndckb) {
			setPlaySotryAfterGameend(AutoPlayAfterGameEndckb.isSelected());
			if(CardGame.getSettings().isAutoSave()) {
				CardGame.getSettings().setAutoplayaftergame(isPlaySotryAfterGameend());
				CardGame.getSettings().save();
			}
		}else if(e.getSource() == schriftartcbb) {
			setSchriftart(schriftartcbb.getSelectedItem().toString());
			if(CardGame.getSettings().isAutoSave()) {
				CardGame.getSettings().setSchriftart(getSchriftart());
				CardGame.getSettings().save();
			}
			if(IsSecondTime >= 1) {
				UpdateComponets();
			}
		}else if(e.getSource() == langugagecbb) {
		if(langugagecbb.getItemCount() >= 1) {
			if(langugagecbb.getSelectedItem().toString().equalsIgnoreCase(Words.get(WordTypes.DEUTSCH,getSprache()))) {
				setSprache("De_de");
				languagelbl.setIcon(new IconManager(IconPath.DeutscheFlagge).getImageIcon());
				CardGenDe.generateCards(false);
			}else if(langugagecbb.getSelectedItem().toString().equalsIgnoreCase(Words.get(WordTypes.ENGLISCH,getSprache()))){
				setSprache("En_en");
				languagelbl.setIcon(new IconManager(IconPath.EnglischeFlagge).getImageIcon());
				CardGenEn.generateCards(false);
				
			}
			if(CardGame.getSettings().isAutoSave()) {
				CardGame.getSettings().setLanguage(getSprache());
				CardGame.getSettings().save();
			}
			if(IsSecondTime >= 1 && langugagecbb.getSelectedItem().toString() != null) {
				UpdateComponets();
			}
		}
		IsSecondTime++;
		}
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if(e.getSource() == slider) {
			setAudioValue(slider.getValue());
			if(CardGame.getSettings().isAutoSave()) {
				CardGame.getSettings().setAudiovalue(getAudioValue());
				CardGame.getSettings().save();
			}
		}
		
	}
	
	private void UpdateComponets() {
		titellbl.setFont(new Font(getSchriftart(), Font.PLAIN, 40));
		titellbl.setText(Words.get(WordTypes.Settings,getSprache()));
		slidertitellbl.setFont(new Font(getSchriftart(), Font.PLAIN, 30));
		slidertitellbl.setText(Words.get(WordTypes.Volume,getSprache()));
		slider.setFont(new Font(getSchriftart(), Font.PLAIN, 20));
		sliderbottomlbl.setFont(new Font(getSchriftart(), Font.PLAIN, 30));
		sliderbottomlbl.setText(CardGame.getSettings().getAudiovalue()+"%");
		languagelbl.setFont(new Font(getSchriftart(), Font.PLAIN, 30));
		languagelbl.setText(Words.get(WordTypes.Sprache,getSprache()));
		langugagecbb.setFont(new Font(getSchriftart(), Font.PLAIN, 30));
		langugagecbb.removeAllItems();
		for (int i = 0; i < CardGame.getSettings().getLanguages(getSprache()).length; i++) {
			langugagecbb.addItem(CardGame.getSettings().getLanguages(getSprache())[i]);
		}
		if(getSprache().equalsIgnoreCase("De_de")) {
			langugagecbb.setSelectedIndex(1);
		}else if(getSprache().equalsIgnoreCase("En_en")) {
			langugagecbb.setSelectedIndex(0);
		}
		schriftartcbb.setFont(new Font(getSchriftart(), Font.PLAIN, 30));
		schriftartlbl.setFont(new Font(getSchriftart(), Font.PLAIN, 30));
		schriftartlbl.setText(Words.get(WordTypes.Schriftart,getSprache()));
		AutoPlayAfterGameEndckb.setFont(new Font(getSchriftart(), Font.PLAIN, 25));
		AutoPlayAfterGameEndckb.setText(Words.get(WordTypes.AutoPlayAfterGameEnd,getSprache()));
		AutoSaveAfterChangesckb.setFont(new Font(getSchriftart(), Font.PLAIN, 25));
		AutoSaveAfterChangesckb.setText(Words.get(WordTypes.AutoSave,getSprache()));
		Speichern.setFont(new Font(getSchriftart(), Font.PLAIN, 30));
		Speichern.setText(Words.get(WordTypes.SpeichernButton,getSprache()));
		PlayDirect.setFont(new Font(getSchriftart(), Font.PLAIN, 30));
		PlayDirect.setText(Words.get(WordTypes.PlayDirectButton,getSprache()));
		Titelscreen.setFont(new Font(getSchriftart(), Font.PLAIN, 30));
		Titelscreen.setText(Words.get(WordTypes.TitelScreenButton,getSprache()));
		Meanlich.setFont(new Font(getSchriftart(), Font.PLAIN, 25));
		Meanlich.setText(Words.get(WordTypes.Male,getSprache()));
		Weiblich.setFont(new Font(getSchriftart(), Font.PLAIN, 25));
		Weiblich.setText(Words.get(WordTypes.Female,getSprache()));
		groupstimmelbl.setFont(new Font(getSchriftart(), Font.PLAIN, 25));
		groupstimmelbl.setText(Words.get(WordTypes.VorleseStimme,getSprache()));
		Dunkel.setFont(new Font(getSchriftart(), Font.PLAIN, 25));
		Dunkel.setText(Words.get(WordTypes.Dunkel,getSprache()));
		Hell.setFont(new Font(getSchriftart(), Font.PLAIN, 25));
		Hell.setText(Words.get(WordTypes.Hell,getSprache()));
		designlbl.setFont(new Font(getSchriftart(), Font.PLAIN, 25));
		designlbl.setText(Words.get(WordTypes.Design,getSprache()));
		if(getdesign().equalsIgnoreCase("Dunkel")) {
			Dunkel.setSelected(true);
		}else if(getdesign().equalsIgnoreCase("Hell")) {
			Hell.setSelected(true);
		}
	}

}
