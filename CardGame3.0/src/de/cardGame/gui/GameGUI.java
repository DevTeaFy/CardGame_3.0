package de.cardGame.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import de.cardGame.cards.Card;
import de.cardGame.main.CardGame;
import de.cardGame.utils.StoppUhr;
import de.cardGame.utils.icons.IconManager;
import de.cardGame.utils.icons.IconPath;
import de.cardGame.utils.sprachausgabe.SprachAusgabe;
import de.cardGame.utils.sprachausgabe.TextType;
import de.cardGame.utils.words.WordTypes;
import de.cardGame.utils.words.Words;

public class GameGUI implements ActionListener {

	private JFrame frame;
	private JLabel StoryCreator, ProgrammedBy, PlaceHolderProgrammedBy;
	private JPanel framePanel = new JPanel();
	private JPanel PanelmainNorth = new JPanel();
	private JPanel PanelmainEast = new JPanel();
	private JPanel PanelmainWest = new JPanel();
	private JPanel PanelmainSouth = new JPanel();
	private JPanel contentPanel = new JPanel();
	private JPanel contentPanelTop = new JPanel();
	private JPanel contentPanelBottom = new JPanel();
	private JPanel contentPanelBottom_Left = new JPanel(), contentPanelBottom_Right = new JPanel();
	private JButton titelbtn, Storybtn, Abtn, Bbtn, Cbtn, VorlesenAbtn, VorlesenBbtn, VorlesenCbtn = new JButton();

	private JMenuBar menuBar;
	private JMenu Pages, Extras, Help;
	private JMenuItem Startscreen, Settings, PageBack, ProgrammedByHelp, KeyUse, CardPath;

	public GameGUI(JFrame lframe) {
		if (lframe == null) {
			this.frame = new JFrame();
			this.frame.setSize(1052, 596);
			int width = CardGame.getGraphicsDevice().getDisplayMode().getWidth();
			int height = CardGame.getGraphicsDevice().getDisplayMode().getHeight();

			this.frame.setLocation((int) ((width / 2) - (this.frame.getSize().getWidth() / 2)),
					(int) ((height / 2) - (this.frame.getSize().getHeight() / 2)));
		} else {
			this.frame = lframe;
		}
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setLayout(new BorderLayout());
		this.frame.setResizable(true);
		this.frame.setTitle(Words.get(WordTypes.Name));
		this.frame.setAlwaysOnTop(true);
		this.frame.setVisible(true);
		this.frame.getContentPane().setBackground(Color.DARK_GRAY);
		this.frame.setIconImage(new IconManager(IconPath.GameIcon).getImage());

		titelbtn = new JButton();
		titelbtn.setText(Words.get(WordTypes.Karte) + "1");
		titelbtn.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 60));
		titelbtn.setBackground(CardGame.BackgroundColor);
		titelbtn.setForeground(Color.green);
		titelbtn.setHorizontalAlignment(SwingConstants.CENTER);
		titelbtn.setHorizontalTextPosition(SwingConstants.CENTER);
		titelbtn.setFocusable(false);
		titelbtn.addActionListener(this);
		titelbtn.setBorder(BorderFactory.createEmptyBorder());

		menuBar = new JMenuBar();
		menuBar.setBackground(CardGame.BackgroundColor);
		menuBar.setPreferredSize(new Dimension(420, 32));
		menuBar.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 20));
		menuBar.setBorder(BorderFactory.createEmptyBorder());
		Pages = new JMenu(Words.get(WordTypes.Pages));
		Pages.setBackground(CardGame.BackgroundColor);
		Pages.setFocusable(false);
		Pages.setMnemonic(KeyEvent.VK_P);
		Pages.setForeground(new Color(0x06A666));
		Pages.setIcon(new IconManager(IconPath.Pagesx32).getImageIcon());
		Pages.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 20));
		Extras = new JMenu(Words.get(WordTypes.Extras));
		Extras.setBackground(CardGame.BackgroundColor);
		Extras.setFocusable(false);
		Extras.setMnemonic(KeyEvent.VK_E);
		Extras.setForeground(new Color(0x06A666));
		Extras.setIcon(new IconManager(IconPath.Extrasx32).getImageIcon());
		Extras.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 20));
		Help = new JMenu(Words.get(WordTypes.Help));
		Help.setBackground(CardGame.BackgroundColor);
		Help.setFocusable(false);
		Help.setMnemonic(KeyEvent.VK_H);
		Help.setForeground(new Color(0x06A666));
		Help.setIcon(new IconManager(IconPath.Helpx32).getImageIcon());
		Help.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 20));

		CardPath = new JMenuItem(Words.get(WordTypes.CardPath));
		CardPath.setBackground(CardGame.BackgroundColor);
		CardPath.setFocusable(false);
		CardPath.setMnemonic(KeyEvent.VK_K);
		CardPath.setForeground(new Color(0x06A666));
		CardPath.addActionListener(this);
		CardPath.setIcon(new IconManager(IconPath.CardPathx32).getImageIcon());
		CardPath.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 20));
		Settings = new JMenuItem(Words.get(WordTypes.Settings));
		Settings.setBackground(CardGame.BackgroundColor);
		Settings.setFocusable(false);
		Settings.setMnemonic(KeyEvent.VK_S);
		Settings.setForeground(new Color(0x06A666));
		Settings.addActionListener(this);
		Settings.setIcon(new IconManager(IconPath.Settingsx32).getImageIcon());
		Settings.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 20));
		Startscreen = new JMenuItem(Words.get(WordTypes.StartScreen));
		Startscreen.setBackground(CardGame.BackgroundColor);
		Startscreen.setFocusable(false);
		Startscreen.setMnemonic(KeyEvent.VK_T);
		Startscreen.addActionListener(this);
		Startscreen.setForeground(new Color(0x06A666));
		Startscreen.setIcon(new IconManager(IconPath.Startscreenx32).getImageIcon());
		Startscreen.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 20));
		ProgrammedByHelp = new JMenuItem(Words.get(WordTypes.ProgrammedBy));
		ProgrammedByHelp.setBackground(CardGame.BackgroundColor);
		ProgrammedByHelp.setFocusable(false);
		ProgrammedByHelp.addActionListener(this);
		ProgrammedByHelp.setForeground(new Color(0x06A666));
		ProgrammedByHelp.setIcon(new IconManager(IconPath.ProgrammedByx32).getImageIcon());
		ProgrammedByHelp.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 20));
		KeyUse = new JMenuItem(Words.get(WordTypes.KeyUse));
		KeyUse.setBackground(CardGame.BackgroundColor);
		KeyUse.setFocusable(false);
		KeyUse.addActionListener(this);
		KeyUse.setForeground(new Color(0x06A666));
		KeyUse.setIcon(new IconManager(IconPath.KeyUsex32).getImageIcon());
		KeyUse.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 20));
		PageBack = new JMenuItem(Words.get(WordTypes.PageBack));
		PageBack.setBackground(CardGame.BackgroundColor);
		PageBack.setFocusable(false);
		PageBack.addActionListener(this);
		PageBack.setForeground(new Color(0x06A666));
		PageBack.setMnemonic(KeyEvent.VK_Z);
		PageBack.setIcon(new IconManager(IconPath.CardBackx32).getImageIcon());
		PageBack.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 20));

		Pages.add(Settings);
		Pages.add(Startscreen);
		Help.add(ProgrammedByHelp);
		Help.add(KeyUse);
		Extras.add(PageBack);
		Extras.add(CardPath);

		menuBar.add(Pages);
		menuBar.add(Extras);
		menuBar.add(Help);

		this.frame.setJMenuBar(menuBar);

		StoryCreator = new JLabel();
		StoryCreator.setText(Words.get(WordTypes.StoryBasedOn));
		StoryCreator.setPreferredSize(new Dimension(400, 20));
		StoryCreator.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 12));
		StoryCreator.setForeground(new Color(0x808000));
		StoryCreator.setHorizontalAlignment(SwingConstants.CENTER);
		StoryCreator.setVerticalTextPosition(SwingConstants.TOP);
		StoryCreator.setHorizontalTextPosition(SwingConstants.CENTER);

		ProgrammedBy = new JLabel();
		ProgrammedBy.setText("© Copyright 2021 Timon Filz");
		ProgrammedBy.setPreferredSize(new Dimension(220, 20));
		ProgrammedBy.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 12));
		ProgrammedBy.setForeground(new Color(0x808000));
		ProgrammedBy.setHorizontalAlignment(SwingConstants.CENTER);
		ProgrammedBy.setVerticalTextPosition(SwingConstants.TOP);
		ProgrammedBy.setHorizontalTextPosition(SwingConstants.CENTER);

		PlaceHolderProgrammedBy = new JLabel();
		PlaceHolderProgrammedBy.setText("");
		PlaceHolderProgrammedBy.setPreferredSize(new Dimension(220, 20));
		PlaceHolderProgrammedBy.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 12));
		PlaceHolderProgrammedBy.setForeground(new Color(0x808000));
		PlaceHolderProgrammedBy.setHorizontalAlignment(SwingConstants.CENTER);
		PlaceHolderProgrammedBy.setVerticalTextPosition(SwingConstants.TOP);
		PlaceHolderProgrammedBy.setHorizontalTextPosition(SwingConstants.CENTER);

		PanelmainNorth.setLayout(new BorderLayout());
		PanelmainSouth.setLayout(new BorderLayout());
		PanelmainNorth.add(titelbtn, BorderLayout.CENTER);
		PanelmainSouth.add(StoryCreator, BorderLayout.CENTER);
		PanelmainSouth.add(ProgrammedBy, BorderLayout.EAST);
		PanelmainSouth.add(PlaceHolderProgrammedBy, BorderLayout.WEST);

		PanelmainNorth.setBackground(CardGame.BackgroundColor);
		PanelmainNorth.setPreferredSize(new Dimension(100, 100));
		PanelmainEast.setBackground(CardGame.BackgroundColor);
		PanelmainEast.setPreferredSize(new Dimension(20, 20));
		PanelmainWest.setBackground(CardGame.BackgroundColor);
		PanelmainWest.setPreferredSize(new Dimension(20, 20));
		PanelmainSouth.setBackground(CardGame.BackgroundColor);
		PanelmainSouth.setPreferredSize(new Dimension(40, 30));
		contentPanel.setBackground(CardGame.BackgroundColor);
		contentPanel.setLayout(new GridLayout(2, 1, 10, 10));

		contentPanelTop.setPreferredSize(new Dimension(40, 40));
		contentPanelTop.setLayout(new BorderLayout());
		contentPanelTop.setPreferredSize(new Dimension(40, 40));
		contentPanelTop.setBackground(new Color(0x505050));
		contentPanelBottom.setPreferredSize(new Dimension(40, 40));
		contentPanelBottom.setBackground(CardGame.BackgroundColor);
		contentPanelBottom.setLayout(new BorderLayout());

		contentPanel.add(contentPanelTop);
		contentPanel.add(contentPanelBottom);

		Storybtn = new JButton();
		Storybtn.setText(CardGame.cards.get(0).getText());
		Storybtn.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 26));
		Storybtn.setForeground(new Color(0x06A666));
		Storybtn.setBackground(CardGame.BackgroudColorMatch2);
		Storybtn.setHorizontalAlignment(SwingConstants.LEFT);
		Storybtn.setVerticalTextPosition(SwingConstants.TOP);
		Storybtn.setVerticalAlignment(SwingConstants.TOP);
		Storybtn.setHorizontalTextPosition(SwingConstants.LEFT);
		Storybtn.setFocusable(false);
		Storybtn.addActionListener(this);
		Storybtn.setBorder(BorderFactory.createEmptyBorder());

		contentPanelTop.add(Storybtn, BorderLayout.CENTER);

		contentPanelBottom_Left.setPreferredSize(new Dimension(100, 40));
		contentPanelBottom_Left.setLayout(new GridLayout(3, 1, 10, 10));
		contentPanelBottom_Left.setBackground(CardGame.BackgroundColor);

		contentPanelBottom_Right.setPreferredSize(new Dimension(100, 40));
		contentPanelBottom_Right.setLayout(new GridLayout(3, 1, 10, 10));
		contentPanelBottom_Right.setBackground(CardGame.BackgroundColor);

		Abtn = new JButton();
		Abtn.setText(CardGame.cards.get(0).getAntwortA());
		Abtn.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 25));
		Abtn.setForeground(new Color(0x06A666));
		Abtn.setBackground(CardGame.BackgroudColorMatch2);
		Abtn.setHorizontalAlignment(SwingConstants.LEFT);
		Abtn.setVerticalTextPosition(SwingConstants.CENTER);
		Abtn.setVerticalAlignment(SwingConstants.CENTER);
		Abtn.setHorizontalTextPosition(SwingConstants.LEFT);
		Abtn.setFocusable(false);
		Abtn.addActionListener(this);
		Abtn.setBorder(BorderFactory.createEmptyBorder());

		Bbtn = new JButton();
		Bbtn.setText(CardGame.cards.get(0).getAntwortB());
		Bbtn.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 25));
		Bbtn.setForeground(new Color(0x06A666));
		Bbtn.setBackground(CardGame.BackgroudColorMatch2);
		Bbtn.setHorizontalAlignment(SwingConstants.LEFT);
		Bbtn.setVerticalTextPosition(SwingConstants.CENTER);
		Bbtn.setVerticalAlignment(SwingConstants.CENTER);
		Bbtn.setHorizontalTextPosition(SwingConstants.LEFT);
		Bbtn.setFocusable(false);
		Bbtn.addActionListener(this);
		Bbtn.setBorder(BorderFactory.createEmptyBorder());

		Cbtn = new JButton();
		Cbtn.setText(CardGame.cards.get(0).getAntwortC());
		Cbtn.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 25));
		Cbtn.setForeground(new Color(0x06A666));
		Cbtn.setBackground(CardGame.BackgroudColorMatch2);
		Cbtn.setHorizontalAlignment(SwingConstants.LEFT);
		Cbtn.setVerticalTextPosition(SwingConstants.CENTER);
		Cbtn.setVerticalAlignment(SwingConstants.CENTER);
		Cbtn.setHorizontalTextPosition(SwingConstants.LEFT);
		Cbtn.setFocusable(false);
		Cbtn.addActionListener(this);
		Cbtn.setBorder(BorderFactory.createEmptyBorder());

		VorlesenAbtn = new JButton();
		VorlesenAbtn.setForeground(new Color(0x06A666));
		VorlesenAbtn.setBackground(CardGame.BackgroudColorMatch2);
		VorlesenAbtn.setFocusable(false);
		VorlesenAbtn.setMnemonic('a');
		VorlesenAbtn.addActionListener(this);
		VorlesenAbtn.setIcon(new IconManager(IconPath.Playx64).getImageIcon());
		VorlesenAbtn.setBorder(BorderFactory.createEmptyBorder());

		VorlesenBbtn = new JButton();
		VorlesenBbtn.setForeground(new Color(0x06A666));
		VorlesenBbtn.setBackground(CardGame.BackgroudColorMatch2);
		VorlesenBbtn.setFocusable(false);
		VorlesenBbtn.setMnemonic('b');
		VorlesenBbtn.addActionListener(this);
		VorlesenBbtn.setIcon(new IconManager(IconPath.Playx64).getImageIcon());
		VorlesenBbtn.setBorder(BorderFactory.createEmptyBorder());

		VorlesenCbtn = new JButton();
		VorlesenCbtn.setForeground(new Color(0x06A666));
		VorlesenCbtn.setBackground(CardGame.BackgroudColorMatch2);
		VorlesenCbtn.setFocusable(false);
		VorlesenCbtn.setMnemonic('c');
		VorlesenCbtn.addActionListener(this);
		VorlesenCbtn.setIcon(new IconManager(IconPath.Playx64).getImageIcon());
		VorlesenCbtn.setBorder(BorderFactory.createEmptyBorder());

		contentPanelBottom_Right.add(Abtn);
		contentPanelBottom_Right.add(Bbtn);
		contentPanelBottom_Right.add(Cbtn);
		contentPanelBottom_Left.add(VorlesenAbtn);
		contentPanelBottom_Left.add(VorlesenBbtn);
		contentPanelBottom_Left.add(VorlesenCbtn);
		contentPanelBottom.add(contentPanelBottom_Left, BorderLayout.WEST);
		contentPanelBottom.add(contentPanelBottom_Right, BorderLayout.CENTER);

		framePanel = new JPanel();
		framePanel.setBackground(new Color(0x505050));
		framePanel.setLayout(new BorderLayout());

		framePanel.add(PanelmainNorth, BorderLayout.NORTH);
		framePanel.add(PanelmainEast, BorderLayout.EAST);
		framePanel.add(PanelmainWest, BorderLayout.WEST);
		framePanel.add(PanelmainSouth, BorderLayout.SOUTH);
		framePanel.add(contentPanel, BorderLayout.CENTER);

		this.frame.add(framePanel);

		setCardText(0);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setCardText(int id) {
		Card C = CardGame.cards.get(id);
		Card.AktiveCardID = id;
		titelbtn.setText(Words.get(WordTypes.Karte) + String.valueOf((id + 1)));
		if (C.getAntwortA() != null) {
			Abtn.setText(C.getAntwortA());
			Abtn.setVisible(true);
			VorlesenAbtn.setVisible(true);
			Bbtn.setText(C.getAntwortB());
			Bbtn.setVisible(true);
			VorlesenBbtn.setVisible(true);
			Cbtn.setText(C.getAntwortC());
			Cbtn.setVisible(true);
			VorlesenCbtn.setVisible(true);
			Storybtn.setText(C.getText());
		} else if (C.isSonder()) {
			Abtn.setText(C.getAntwortA());
			Abtn.setVisible(true);
			VorlesenAbtn.setVisible(true);
			Bbtn.setText(C.getAntwortB());
			Bbtn.setVisible(true);
			VorlesenBbtn.setVisible(true);
			Cbtn.setVisible(false);
			VorlesenCbtn.setVisible(false);
			Storybtn.setText(C.getText());
		} else if (C.isBlank()) {
			Abtn.setText(Words.get(WordTypes.Weiter));
			Abtn.setVisible(true);
			VorlesenAbtn.setVisible(true);
			Bbtn.setVisible(false);
			VorlesenBbtn.setVisible(false);
			Cbtn.setVisible(false);
			VorlesenCbtn.setVisible(false);
			Storybtn.setText(C.getText());
		} else if (C.isOver()) {
			Abtn.setText(Words.get(WordTypes.GameOver));
			Abtn.setVisible(true);
			VorlesenAbtn.setVisible(true);
			Bbtn.setVisible(false);
			VorlesenBbtn.setVisible(false);
			Cbtn.setVisible(false);
			VorlesenCbtn.setVisible(false);
			Storybtn.setText(C.getText());
		}
		this.frame.setVisible(true);
	}

	private boolean vorgelesenA = false, vorgelesenB = false, vorgelesenC = false;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == titelbtn) {
			setPlayButtonsIconsAfterEnd();
			SprachausgabenAsistent(TextType.Card);
		} else if (e.getSource() == Storybtn) {
			setPlayButtonsIconsAfterEnd();
			SprachausgabenAsistent(TextType.Story);
		} else if (e.getSource() == Abtn) {
			setPlayButtonsIconsAfterEnd();
			Words.choosenWayID.add(Card.AktiveCardID);
			Words.choosenWayAnswer.add(TextType.Story);
			StopSprachausgabeAsistent();
			if (Abtn.getText().equalsIgnoreCase(Words.get(WordTypes.GameOver))) {
				de.cardGame.utils.settings.Settings.Cardback = 2;
				Words.choosenWayID.add(Card.AktiveCardID);
				Words.choosenWayAnswer.add(TextType.GameOver);
				Words.choosenWay.add(
						Words.get(WordTypes.Karte) + (Card.AktiveCardID + 1) + " + " + Words.get(WordTypes.GameOver));
				CardGame.getGUI().dispose();
				StartScreenGUI startScreenGUI = new StartScreenGUI(null);
				StoppUhr.Stopp();
				SetCardPathinStartScreen(startScreenGUI);
				CardGame.setGUI(startScreenGUI.getFrame());
				startScreenGUI.setPlayAudioSotryVisible(true);
				if (CardGame.getSettings().isAutoplayaftergame()) {
					SprachAusgabe.PlayGameInAudio();
				}
			} else if (Abtn.getText().equalsIgnoreCase(Words.get(WordTypes.Weiter))) {
				Words.choosenWayID.add(Card.AktiveCardID);
				Words.choosenWayAnswer.add(TextType.Weiter);
				Words.choosenWay.add(
						Words.get(WordTypes.Karte) + (Card.AktiveCardID + 1) + " + " + Words.get(WordTypes.Weiter));
				setCardText(CardGame.cards.get(Card.AktiveCardID).getNextA());
			} else {
				Words.choosenWayID.add(Card.AktiveCardID);
				Words.choosenWayAnswer.add(TextType.A);
				Words.choosenWay.add(Words.get(WordTypes.Karte) + (Card.AktiveCardID + 1) + " + a)");
				setCardText(CardGame.cards.get(Card.AktiveCardID).getNextA());
			}
		} else if (e.getSource() == Bbtn) {
			setPlayButtonsIconsAfterEnd();
			Words.choosenWayID.add(Card.AktiveCardID);
			Words.choosenWayAnswer.add(TextType.Story);
			StopSprachausgabeAsistent();
			Words.choosenWayID.add(Card.AktiveCardID);
			Words.choosenWayAnswer.add(TextType.B);
			Words.choosenWay.add(Words.get(WordTypes.Karte) + (Card.AktiveCardID + 1) + " + b)");
			setCardText(CardGame.cards.get(Card.AktiveCardID).getNextB());
		} else if (e.getSource() == Cbtn) {
			setPlayButtonsIconsAfterEnd();
			Words.choosenWayID.add(Card.AktiveCardID);
			Words.choosenWayAnswer.add(TextType.Story);
			StopSprachausgabeAsistent();
			Words.choosenWayID.add(Card.AktiveCardID);
			Words.choosenWayAnswer.add(TextType.C);
			Words.choosenWay.add(Words.get(WordTypes.Karte) + (Card.AktiveCardID + 1) + " + c)");
			setCardText(CardGame.cards.get(Card.AktiveCardID).getNextC());
		} else if (e.getSource() == VorlesenAbtn) {
			if (vorgelesenA) {
				VorlesenAbtn.setIcon(new IconManager(IconPath.Playx64).getImageIcon());
				vorgelesenA = false;
				vorgelesenB = false;
				vorgelesenC = false;
			} else {
				VorlesenAbtn.setIcon(new IconManager(IconPath.Stopx64).getImageIcon());
				vorgelesenA = true;
				vorgelesenB = false;
				vorgelesenC = false;
			}
			VorlesenBbtn.setIcon(new IconManager(IconPath.Playx64).getImageIcon());
			VorlesenCbtn.setIcon(new IconManager(IconPath.Playx64).getImageIcon());
			if (Card.getCardByID(Card.AktiveCardID).isOver()) {
				SprachausgabenAsistent(TextType.GameOver);
			} else if (Card.getCardByID(Card.AktiveCardID).isBlank()) {
				SprachausgabenAsistent(TextType.Weiter);
			} else {
				SprachausgabenAsistent(TextType.A);
			}
		} else if (e.getSource() == VorlesenBbtn) {
			if (vorgelesenB) {
				VorlesenBbtn.setIcon(new IconManager(IconPath.Playx64).getImageIcon());
				vorgelesenA = false;
				vorgelesenB = false;
				vorgelesenC = false;
			} else {
				VorlesenBbtn.setIcon(new IconManager(IconPath.Stopx64).getImageIcon());
				vorgelesenA = false;
				vorgelesenB = true;
				vorgelesenC = false;
			}
			VorlesenAbtn.setIcon(new IconManager(IconPath.Playx64).getImageIcon());
			VorlesenCbtn.setIcon(new IconManager(IconPath.Playx64).getImageIcon());
			SprachausgabenAsistent(TextType.B);
		} else if (e.getSource() == VorlesenCbtn) {
			if (vorgelesenC) {
				VorlesenCbtn.setIcon(new IconManager(IconPath.Playx64).getImageIcon());
				vorgelesenA = false;
				vorgelesenB = false;
				vorgelesenC = false;
			} else {
				VorlesenCbtn.setIcon(new IconManager(IconPath.Stopx64).getImageIcon());
				vorgelesenA = false;
				vorgelesenB = false;
				vorgelesenC = true;
			}
			VorlesenAbtn.setIcon(new IconManager(IconPath.Playx64).getImageIcon());
			VorlesenBbtn.setIcon(new IconManager(IconPath.Playx64).getImageIcon());
			SprachausgabenAsistent(TextType.C);
		} else if (e.getSource() == CardPath) {
			ShowCardPath();
		} else if (e.getSource() == Startscreen) {
			de.cardGame.utils.settings.Settings.Cardback = 2;
			StopSprachausgabeAsistent();
			Words.choosenWayID.add(Card.AktiveCardID);
			Words.choosenWayAnswer.add(TextType.GameOver);
			Words.choosenWay
					.add(Words.get(WordTypes.Karte) + (Card.AktiveCardID + 1) + " + " + Words.get(WordTypes.GameOver));
			CardGame.getGUI().dispose();
			StartScreenGUI startScreenGUI = new StartScreenGUI(null);
			StoppUhr.Stopp();
			SetCardPathinStartScreen(startScreenGUI);
			CardGame.setGUI(startScreenGUI.getFrame());
			startScreenGUI.setPlayAudioSotryVisible(true);
			if (CardGame.getSettings().isAutoplayaftergame()) {
				SprachAusgabe.PlayGameInAudio();
			}
		} else if (e.getSource() == Settings) {
			StopSprachausgabeAsistent();
			CardGame.getGUI().dispose();
			StoppUhr.Stopp();
			CardGame.setGUI(new SettingsGUI(null).getFrame());
		} else if (e.getSource() == PageBack) {
			if(de.cardGame.utils.settings.Settings.Cardback <= 2 && de.cardGame.utils.settings.Settings.Cardback >= 1) {
				de.cardGame.utils.settings.Settings.Cardback--;
				StopSprachausgabeAsistent();
					if (Words.choosenWay.size() >= 1) {
						setCardText(Words.choosenWayID.get((Words.choosenWayID.size() - 1)));
						Words.choosenWayAnswer.remove((Words.choosenWayAnswer.size() - 1));
						Words.choosenWayID.remove((Words.choosenWayID.size() - 1));
						Words.choosenWayAnswer.remove((Words.choosenWayAnswer.size() - 1));
						Words.choosenWayID.remove((Words.choosenWayID.size() - 1));
						Words.choosenWay.remove((Words.choosenWay.size() - 1));
					} else {
						setCardText(0);
					}
			}else {
				JOptionPane.showMessageDialog(CardGame.getGUI(), Words.get(WordTypes.NOMoreCardsBack));
			}
		} else if (e.getSource() == ProgrammedByHelp) {
			new ProgrammedByGUI();
		} else if (e.getSource() == KeyUse) {
			new KeyUseGUI();
		}
	}

	private void SetCardPathinStartScreen(StartScreenGUI startScreenGUI) {
		if (Words.choosenWay.size() > 50) {
			startScreenGUI.setTextTimeNumberOfCardsCardPath(
					StoppUhr.SetTitle(StoppUhr.std, StoppUhr.min, StoppUhr.sek, false),
					Words.choosenWay.toString().replace("[", "").replace("]", "").replace(", ", " → "), 10,
					Words.choosenWay.size());
		} else if (Words.choosenWay.size() < 30) {
			startScreenGUI.setTextTimeNumberOfCardsCardPath(
					StoppUhr.SetTitle(StoppUhr.std, StoppUhr.min, StoppUhr.sek, false),
					Words.choosenWay.toString().replace("[", "").replace("]", "").replace(", ", " → "), 20,
					Words.choosenWay.size());
		} else {
			startScreenGUI.setTextTimeNumberOfCardsCardPath(
					StoppUhr.SetTitle(StoppUhr.std, StoppUhr.min, StoppUhr.sek, false),
					Words.choosenWay.toString().replace("[", "").replace("]", "").replace(", ", " → "), 15,
					Words.choosenWay.size());
		}
	}

	@SuppressWarnings("deprecation")
	private void ShowCardPath() {
		String text = Words.choosenWay.toString().replace("[", "").replace("]", "");
		System.out.println(text);
		if (Words.choosenWay.size() > 0) {
			String[] karten = text.split(",");
			int br = 10;
			for (int i = 0; i < karten.length; i++) {
				if (i == br) {
					karten[i] = "<br>" + karten[i];
					br = br + 10;
				}
			}
			Words.choosenWay.clear();
			for (int i = 0; i < karten.length; i++) {
				Words.choosenWay.add(karten[i]);
			}
			String ende = Words.choosenWay.toString().replace("[", "").replace("]", "").replace(", ", " → ");
			System.out.println(ende);
			JOptionPane p = new JOptionPane(Words.getHtmlText(ende));
			p.setBackground(Color.DARK_GRAY);
			p.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 12));
			JDialog dialog = p.createDialog(Words.get(WordTypes.CardPath));
			dialog.setBackground(Color.DARK_GRAY);
			dialog.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 12));
			dialog.setAlwaysOnTop(true);
			dialog.show();
		} else {
			JOptionPane p = new JOptionPane(Words.getHtmlText(Words.get(WordTypes.NoCardsChoosen)));
			p.setBackground(Color.DARK_GRAY);
			p.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 12));
			JDialog dialog = p.createDialog(Words.get(WordTypes.CardPath));
			dialog.setBackground(Color.DARK_GRAY);
			dialog.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 12));
			dialog.setAlwaysOnTop(true);
			dialog.show();
		}
	}

	public void setPlayButtonsIconsAfterEnd() {
		VorlesenAbtn.setIcon(new IconManager(IconPath.Playx64).getImageIcon());
		VorlesenBbtn.setIcon(new IconManager(IconPath.Playx64).getImageIcon());
		VorlesenCbtn.setIcon(new IconManager(IconPath.Playx64).getImageIcon());
		vorgelesenA = false;
		vorgelesenB = false;
		vorgelesenC = false;
	}

	public static void StopSprachausgabeAsistent() {
		if (sa != null) {
			if (sa.isRunning()) {
				sa.Stop();
			}
		}
	}

	private static SprachAusgabe sa = null;
	Timer t = null;

	private void SprachausgabenAsistent(TextType X) {
		if (sa == null) {
			sa = new SprachAusgabe(Card.getCardByID(Card.AktiveCardID), X);
			t = new Timer();
			t.schedule(new TimerTask() {
				@Override
				public void run() {
					setPlayButtonsIconsAfterEnd();
				}
			}, sa.getCliplength() / 1000);
		} else {
			if (sa.isRunning()) {
				if (sa.getPlayedcard() == Card.getCardByID(Card.AktiveCardID)) {
					if (sa.getPlayedText().equals(X)) {
						sa.Stop();
						if (t != null) {
							t.cancel();
							t = null;
						}
					} else {
						sa.Stop();
						if (t != null) {
							t.cancel();
							t = null;
						}
						sa = new SprachAusgabe(Card.getCardByID(Card.AktiveCardID), X);
						t = new Timer();
						t.schedule(new TimerTask() {
							@Override
							public void run() {
								setPlayButtonsIconsAfterEnd();
							}
						}, sa.getCliplength() / 1000);
					}
				} else {
					sa.Stop();
					if (t != null) {
						t.cancel();
						t = null;
					}
					sa = new SprachAusgabe(Card.getCardByID(Card.AktiveCardID), X);
					t = new Timer();
					t.schedule(new TimerTask() {
						@Override
						public void run() {
							setPlayButtonsIconsAfterEnd();
						}
					}, sa.getCliplength() / 1000);
				}
			} else {
				sa = new SprachAusgabe(Card.getCardByID(Card.AktiveCardID), X);
				t = new Timer();
				t.schedule(new TimerTask() {
					@Override
					public void run() {
						setPlayButtonsIconsAfterEnd();
					}
				}, sa.getCliplength() / 1000);
			}
		}
	}
}
