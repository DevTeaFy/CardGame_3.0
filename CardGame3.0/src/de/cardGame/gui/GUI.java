package de.cardGame.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

import de.cardGame.main.CardGame;
import de.cardGame.utils.icons.IconManager;
import de.cardGame.utils.icons.IconPath;

public class GUI extends JFrame {

	// FRAME
	private JFrame frame;
	private JLayeredPane layeredPane = new JLayeredPane();

	// StartScreen ---- ANFANG ----
	private JLabel titellbl = new JLabel();
	private JLabel subtitellbl = new JLabel();
	// StartScreen ---- ENDE ----

	// SettingsScreen ---- ANFANG ----
	private JPanel sFramePanel = new JPanel();
	private JPanel titelPanel;
	private JPanel mainEast;
	private JPanel mainWest;
	private JPanel mainSouth;
	private JPanel contentPanel;
	private JPanel contentPanelleft;
	private JPanel contentPanelcenter;
	private JPanel contentPanelright;
	private JPanel contentPanelcenter1, contentPanelcenter2, contentPanelcenter3, contentPanelcenter4,
			contentPanelcenter5, contentPanelcenter6;
	private JLabel languagelbl;
	private JLabel schriftartlbl;
	private JComboBox<String> langugagecbb;
	private JComboBox<String> schriftartcbb;
	private JSlider slider;
	private JLabel slidertitellbl;
	private JLabel sliderbottomlbl;
	private JLabel sTitellbl;
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
	// SettingsScreen ---- ENDE ----

	// KeyUseScreen ---- ANFANG ----
	private JPanel kFramePanel = new JPanel();
	private JPanel PanelmainNorth = new JPanel();
	private JPanel PanelmainEast = new JPanel();
	private JPanel PanelmainWest = new JPanel();
	private JPanel PanelmainSouth = new JPanel();
	private JPanel kContentPanel = new JPanel();
	private JLabel kTitellbl, AltA, AltB, AltC, AltP, AltE, AltH, Titelscrenn, Settings, Zurück, KartePath;
	// KeyUseScreen ---- ENDE ----

	// ProgressBar ---- ANFANG ----
	private JPanel panel = null;
	private JProgressBar progressBar = null;
	private int lmaximum = 0;
	// ProgressBar ---- ENDE ----

	// ProgrammedByScreen ---- ANFANG ----
	private JPanel pFramePanel = new JPanel();
	private JPanel pPanelmainNorth = new JPanel();
	private JPanel pPanelmainEast = new JPanel();
	private JPanel pPanelmainWest = new JPanel();
	private JPanel pPanelmainSouth = new JPanel();
	private JPanel pContentPanel = new JPanel();
	private JLabel pTitellbl, Namelbl, Geburtstagslbl, Copyright;
	private JButton btnZocken;
	// ProgrammedByScreen ---- ENDE ----

	// GameScreen ---- ANFANG ----
	private JLabel StoryCreator, ProgrammedBy, PlaceHolderProgrammedBy;
	private JPanel gFramePanel = new JPanel();
	private JPanel gPanelmainNorth = new JPanel();
	private JPanel gPanelmainEast = new JPanel();
	private JPanel gPanelmainWest = new JPanel();
	private JPanel gPanelmainSouth = new JPanel();
	private JPanel gContentPanel = new JPanel();
	private JPanel contentPanelTop = new JPanel();
	private JPanel contentPanelBottom = new JPanel();
	private JPanel contentPanelBottom_Left = new JPanel(), contentPanelBottom_Right = new JPanel();
	private JButton titelbtn, Storybtn, Abtn, Bbtn, Cbtn, VorlesenAbtn, VorlesenBbtn, VorlesenCbtn = new JButton();
	private JMenuBar menuBar;
	private JMenu Pages, Extras, Help;
	private JMenuItem gStartscreen, gSettings, PageBack, ProgrammedByHelp, KeyUse, CardPath;
	// GameScreen ---- ENDE ----

	public GUI() {
	}

	public void Create() {

		this.frame = new JFrame();
		this.frame.setSize(new Dimension(1052, 596));
		int width = CardGame.getGraphicsDevice().getDisplayMode().getWidth();
		int height = CardGame.getGraphicsDevice().getDisplayMode().getHeight();
		this.frame.setLocation((int) ((width / 2) - (this.frame.getSize().getWidth() / 2)),
				(int) ((height / 2) - (this.frame.getSize().getHeight() / 2)));
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setLayout(new BorderLayout());
		this.frame.setResizable(true);
		this.frame.setTitle("Kartenspiel");
		this.frame.setAlwaysOnTop(true);
		this.frame.setVisible(true);
		
		
		
		this.Storybtn = new JButton();
		this.titelbtn = new JButton();
		this.Abtn = new JButton();
		this.Bbtn = new JButton();
		this.Bbtn.setText("Hello");
		this.Storybtn.setText("Hello2");
		this.titelbtn.setText("Hello3");
		this.Abtn.setText("Hello4");
		
		this.sFramePanel.add(Storybtn);
		this.gFramePanel.add(Bbtn);
		this.pFramePanel.add(Abtn);
		this.kFramePanel.add(titelbtn);
		
		
		this.kFramePanel.setBackground(Color.DARK_GRAY);
		this.sFramePanel.setBackground(Color.DARK_GRAY);
		this.pFramePanel.setBackground(Color.DARK_GRAY);
		this.gFramePanel.setBackground(Color.DARK_GRAY);
		
		this.layeredPane.setBackground(new Color(155, 155, 155));
		this.layeredPane.setPreferredSize(new Dimension(300, 310));
		this.layeredPane.setLayout(new BorderLayout());
		
		this.layeredPane.add(gFramePanel, 3);
		this.frame.add(layeredPane);
		this.frame.setIconImage(new IconManager(IconPath.GameIcon).getImage());

	}

	public void Switch(int Panel) {
		// 1 : gFramePanel(GameScreen)
		// 2 : sFramePanel(SettingsScreen)
		// 3 : kFramePanel(KeyUseScreen)
		// 4 : pFramePanel(ProgrammedByScreen)
		
		
		switch (Panel) {
		case 1:
			pFramePanel.setVisible(false);
			kFramePanel.setVisible(false);
			sFramePanel.setVisible(false);
			gFramePanel.setVisible(true);
			break;
		case 2:
			gFramePanel.setVisible(false);
			pFramePanel.setVisible(false);
			kFramePanel.setVisible(false);
			this.layeredPane.add(sFramePanel, 2);
			this.sFramePanel.setVisible(true);
			
			break;
		case 3:
			gFramePanel.setVisible(false);
			sFramePanel.setVisible(false);
			pFramePanel.setVisible(false);
			this.layeredPane.add(kFramePanel, 2);
			this.kFramePanel.setVisible(true);
			
			break;
		case 4:
			gFramePanel.setVisible(false);
			kFramePanel.setVisible(false);
			sFramePanel.setVisible(false);
			this.layeredPane.add(pFramePanel, 2);
			this.pFramePanel.setVisible(true);
			break;

		default:
			break;
		}

	}

	public JButton getTitelbtn() {
		return titelbtn;
	}

	public void setTitelbtn(JButton titelbtn) {
		this.titelbtn = titelbtn;
	}

	public JButton getStorybtn() {
		return Storybtn;
	}

	public void setStorybtn(JButton storybtn) {
		Storybtn = storybtn;
	}

	public JButton getAbtn() {
		return Abtn;
	}

	public void setAbtn(JButton abtn) {
		Abtn = abtn;
	}

	public JButton getBbtn() {
		return Bbtn;
	}

	public void setBbtn(JButton bbtn) {
		Bbtn = bbtn;
	}

}
