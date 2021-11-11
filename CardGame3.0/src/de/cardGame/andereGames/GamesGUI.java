package de.cardGame.andereGames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import de.cardGame.andereGames.scheresteinPapier.SchereSteinPapierGUI;
import de.cardGame.andereGames.utils.BOT;
import de.cardGame.andereGames.utils.Player;
import de.cardGame.gui.StartScreenGUI;
import de.cardGame.main.CardGame;
import de.cardGame.utils.icons.IconManager;
import de.cardGame.utils.icons.IconPath;
import de.cardGame.utils.words.WordTypes;
import de.cardGame.utils.words.Words;

public class GamesGUI implements ActionListener {
	
	private JFrame frame;
	private JPanel framePanel = new JPanel();
	private JPanel PanelmainNorth = new JPanel();
	private JPanel PanelmainEast = new JPanel();
	private JPanel PanelmainWest = new JPanel();
	private JPanel PanelmainSouth = new JPanel();
	private JPanel contentPanel = new JPanel(),contentPanel1 = new JPanel();
	private JTextArea NamesFeld = new JTextArea();
	private JComboBox<String> cbBestOf;
	private JLabel lblSchereSteinPapier,lblTicTacToe,lblVierGewinnt,lblKartenSpiel;
	private JButton btnWeiter,btnSchereSteinPapier,btnTicTacToe,btnVierGewinnt,btnKartenSpiel;
	private HashMap<Integer, Integer> HashBestOf = new HashMap<>();
	private HashMap<Integer, Integer> HashBestOfBackConvertion = new HashMap<>();
	private String[] wins = {"Best of 1","Best of 3","Best of 5","Best of 10"};
	public static Games games = new Games();
	
	public GamesGUI(boolean afterGame) {
		HashBestOf.clear();
		HashBestOf.put(1, 1);
		HashBestOf.put(3, 2);
		HashBestOf.put(5, 3);
		HashBestOf.put(10, 6);
		HashBestOfBackConvertion.clear();
		HashBestOfBackConvertion.put(1, 0);
		HashBestOfBackConvertion.put(2, 1);
		HashBestOfBackConvertion.put(3, 2);
		HashBestOfBackConvertion.put(6, 3);
		this.frame =  new JFrame();
		this.frame.setSize(526, 298);
		int width = CardGame.getGraphicsDevice().getDisplayMode().getWidth();
		int height = CardGame.getGraphicsDevice().getDisplayMode().getHeight();
		this.frame.setLocation((int) ((width/2)-(this.frame.getSize().getWidth()/2)), (int) ((height/2)-(this.frame.getSize().getHeight()/2)));
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setLayout(new BorderLayout());
		this.frame.setResizable(false);
		this.frame.setTitle(Words.get(WordTypes.Games));
		this.frame.setAlwaysOnTop(true);
		this.frame.getContentPane().setBackground(CardGame.BackgroundColor);
		this.frame.setIconImage(new IconManager(IconPath.GameIcon).getImage());
		
		PanelmainNorth = new JPanel();
		PanelmainNorth.setBackground(CardGame.BackgroundColor);
		PanelmainNorth.setLayout(new BorderLayout());
		
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
		contentPanel.setLayout(new GridLayout(3,1,10,10));
		
		contentPanel1 = new JPanel();
		contentPanel1.setBackground(CardGame.BackgroundColor);
		contentPanel1.setLayout(new GridLayout(1,3,10,10));
		
		NamesFeld.setText("Name?");
		NamesFeld.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.BOLD, 22));
		NamesFeld.setForeground(Color.red);
		NamesFeld.setBackground(CardGame.BackgroundColor);
		
		cbBestOf = new JComboBox<>(wins);
		cbBestOf.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.BOLD, 22));
		cbBestOf.setForeground(Color.red);
		cbBestOf.addActionListener(this);
		cbBestOf.setBackground(CardGame.BackgroundColor);
		cbBestOf.setSelectedIndex(HashBestOfBackConvertion.get(games.getBestOf()));
		
		btnWeiter = new JButton(Words.get(WordTypes.Weiter));
		btnWeiter.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.BOLD, 22));
		btnWeiter.setForeground(Color.red);
		btnWeiter.setBackground(CardGame.BackgroundColor);
		btnWeiter.setFocusable(false);
		btnWeiter.addActionListener(this);
		btnWeiter.setBorder(BorderFactory.createEmptyBorder());
		
		contentPanel1.add(btnWeiter);
		
		contentPanel.add(NamesFeld);
		contentPanel.add(cbBestOf);
		contentPanel.add(contentPanel1);
		
		framePanel = new JPanel();
		framePanel.setBackground(CardGame.BackgroundColor);
		framePanel.setLayout(new BorderLayout());
		
		framePanel.add(PanelmainNorth,BorderLayout.NORTH);
		framePanel.add(PanelmainEast,BorderLayout.EAST);
		framePanel.add(PanelmainWest,BorderLayout.WEST);
		framePanel.add(PanelmainSouth,BorderLayout.SOUTH);
		framePanel.add(contentPanel,BorderLayout.CENTER);
		
		if(afterGame) {
			setFrameAfterName(games.getPlayer());
		}
		
		this.frame.add(framePanel);
		this.frame.setVisible(true);
	}

	public JPanel getFrame() {
		return this.framePanel;
	}

	public void setFrameAfterName(Player p) {
		this.frame.setSize(1052,596);
		int width = CardGame.getGraphicsDevice().getDisplayMode().getWidth();
		int height = CardGame.getGraphicsDevice().getDisplayMode().getHeight();
		this.frame.setLocation((int) ((width/2)-(this.frame.getSize().getWidth()/2)), (int) ((height/2)-(this.frame.getSize().getHeight()/2)));
		btnWeiter.setVisible(false);
		contentPanel1.remove(btnWeiter);
		NamesFeld.setText(p.getName());
		contentPanel1.setLayout(new GridLayout(2,4,10,10));
		btnSchereSteinPapier = new JButton();
		btnSchereSteinPapier.setIcon(new IconManager(IconPath.SchereSteinPapierx128).getImageIcon());
		btnSchereSteinPapier.setForeground(Color.red);
		btnSchereSteinPapier.setBackground(CardGame.BackgroundColor);
		btnSchereSteinPapier.setFocusable(false);
		btnSchereSteinPapier.addActionListener(this);
		btnSchereSteinPapier.setBorder(BorderFactory.createEmptyBorder());
		
		btnTicTacToe = new JButton("Soon");
		btnTicTacToe.setForeground(Color.red);
		btnTicTacToe.setBackground(CardGame.BackgroundColor);
		btnTicTacToe.setFocusable(false);
		btnTicTacToe.addActionListener(this);
		btnTicTacToe.setBorder(BorderFactory.createEmptyBorder());
		
		btnVierGewinnt = new JButton("Soon");
		btnVierGewinnt.setForeground(Color.red);
		btnVierGewinnt.setBackground(CardGame.BackgroundColor);
		btnVierGewinnt.setFocusable(false);
		btnVierGewinnt.addActionListener(this);
		btnVierGewinnt.setBorder(BorderFactory.createEmptyBorder());
		

		btnKartenSpiel = new JButton();
		btnKartenSpiel.setIcon(new IconManager(IconPath.GameIcon).getImageIcon());
		btnKartenSpiel.setForeground(Color.red);
		btnKartenSpiel.setBackground(CardGame.BackgroundColor);
		btnKartenSpiel.setFocusable(false);
		btnKartenSpiel.addActionListener(this);
		btnKartenSpiel.setBorder(BorderFactory.createEmptyBorder());
		
		lblSchereSteinPapier = new JLabel(Words.get(WordTypes.SchereSteinPapier));
		lblSchereSteinPapier.setFocusable(false);
		lblSchereSteinPapier.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 22));
		lblSchereSteinPapier.setForeground(Color.red);
		lblSchereSteinPapier.setBackground(CardGame.BackgroundColor);
		lblSchereSteinPapier.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblTicTacToe = new JLabel("Soon");
		lblTicTacToe.setFocusable(false);
		lblTicTacToe.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 22));
		lblTicTacToe.setForeground(Color.red);
		lblTicTacToe.setBackground(CardGame.BackgroundColor);
		lblTicTacToe.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblVierGewinnt = new JLabel("Soon");
		lblVierGewinnt.setFocusable(false);
		lblVierGewinnt.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 22));
		lblVierGewinnt.setForeground(Color.red);
		lblVierGewinnt.setBackground(CardGame.BackgroundColor);
		lblVierGewinnt.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblKartenSpiel = new JLabel(Words.get(WordTypes.Name));
		lblKartenSpiel.setFocusable(false);
		lblKartenSpiel.setFont(new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 20));
		lblKartenSpiel.setForeground(Color.red);
		lblKartenSpiel.setBackground(CardGame.BackgroundColor);
		lblKartenSpiel.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		
		cbBestOf.setSelectedIndex(HashBestOfBackConvertion.get(games.getBestOf()));

		contentPanel1.add(lblSchereSteinPapier);
		contentPanel1.add(lblTicTacToe);
		contentPanel1.add(lblVierGewinnt);
		contentPanel1.add(lblKartenSpiel);
		contentPanel1.add(btnSchereSteinPapier);
		contentPanel1.add(btnTicTacToe);
		contentPanel1.add(btnVierGewinnt);
		contentPanel1.add(btnKartenSpiel);
//		this.frame.repaint();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnWeiter) {
			if(NamesFeld.getText().equalsIgnoreCase("Name?")) {
				return;
			}
			if(NamesFeld.getText().length() >= 1 && NamesFeld.getText().length() <= 12) {
				games.setPlayer(new Player(NamesFeld.getText()));
				setFrameAfterName(games.getPlayer());
			}else {
				ResetNameFeld();
			}
		}else if(e.getSource() == btnSchereSteinPapier) {
			if(NamesFeld.getText().length() >= 1 && NamesFeld.getText().length() <= 12) {
				games.getPlayer().setName(NamesFeld.getText());
				//CardGame.setGUI(new SchereSteinPapierGUI(null, new BOT(), games.getPlayer()).getFrame());
			}else {
				ResetNameFeld();
			}
		}else if(e.getSource() == cbBestOf) {
			games.setBestOf(Integer.valueOf(HashBestOf.get(Integer.valueOf(cbBestOf.getSelectedItem().toString().replace("Best of ", "")))));
		}else if(e.getSource() == btnKartenSpiel) {
			if(NamesFeld.getText().length() >= 1 && NamesFeld.getText().length() <= 12) {
				games.getPlayer().setName(NamesFeld.getText());
				CardGame.setGUI(new StartScreenGUI(null).getFrame());
			}else {
				ResetNameFeld();
			}
		}else if(e.getSource() == NamesFeld) {
			games.getPlayer().setName(NamesFeld.getText());
		}
	}

	private void ResetNameFeld() {
		NamesFeld.setText(Words.get(WordTypes.NameZuLang));
		Timer t = new Timer();
		t.schedule(new TimerTask() {
			@Override
			public void run() {
				NamesFeld.setText("");
			}
		}, 1000);
	}
	
}
