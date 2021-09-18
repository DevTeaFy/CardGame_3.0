package de.cardGame.andereGames.scheresteinPapier;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import de.cardGame.andereGames.GamesGUI;
import de.cardGame.andereGames.Utils.BOT;
import de.cardGame.andereGames.Utils.Player;
import de.cardGame.main.CardGame;
import de.cardGame.utils.Icons.IconManager;
import de.cardGame.utils.Icons.IconPath;
import de.cardGame.utils.Words.WordTypes;
import de.cardGame.utils.Words.Words;

public class SchereSteinPapierGUI implements ActionListener {
	
	private JFrame frame;
	
	private JLabel Vs = new JLabel(), PlayerOneName = new JLabel(), BOTname = new JLabel(), WinMessage = new JLabel(), Score = new JLabel(), UserLabel = new JLabel(), BotLabel = new JLabel();
	private JPanel framePanel = new JPanel();
	private JPanel PanelmainTop = new JPanel();
	private JPanel PanelmainTopLeft = new JPanel(),PanelmainTopMiddle = new JPanel(), PanelmainTopRight = new JPanel();
	private JPanel PanelmainMiddle = new JPanel(), PanelmainMiddleLeft = new JPanel(), PanelmainMiddleRight = new JPanel(), PanelmainMiddleMiddle = new JPanel();
	private JPanel PanelmainBottom = new JPanel();
	private Color SchriftFarbe = new Color(255,0,0);
	private Font schriftart = new Font(CardGame.getSettings().getSchriftart(), Font.PLAIN, 30);
	private JButton BtnSchere, BtnStein, BtnPapier;
	private BOT bot;
	private Player player;

	public SchereSteinPapierGUI(JFrame lframe,BOT bot,Player player) {
		this.bot = bot;
		this.player = player;
		if (lframe == null) {
			this.frame = new JFrame();
			this.frame.setSize(1052, 596);
			int width = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getWidth();
			int height = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getHeight();

			this.frame.setLocation((int) ((width / 2) - (this.frame.getSize().getWidth() / 2)),
					(int) ((height / 2) - (this.frame.getSize().getHeight() / 2)));
		} else {
			this.frame = lframe;
		}
		frame.setIconImage(new IconManager(IconPath.SchereSteinPapierx128).getImage());
		frame.setTitle(Words.get(WordTypes.SchereSteinPapier));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PlayerOneName.setText(player.getName());
		PlayerOneName.setFont(schriftart);
		PlayerOneName.setVisible(true);
		PlayerOneName.setForeground(SchriftFarbe);
		PlayerOneName.setHorizontalAlignment(SwingConstants.CENTER);

		BOTname.setText(bot.getName());
		BOTname.setFont(schriftart);
		BOTname.setVisible(true);
		BOTname.setForeground(SchriftFarbe);
		BOTname.setHorizontalAlignment(SwingConstants.CENTER);
		
		UserLabel.setHorizontalAlignment(SwingConstants.CENTER);
		BotLabel.setHorizontalAlignment(SwingConstants.CENTER);
		

		Score.setText(Words.get(WordTypes.Score)+" "+player.getScore()+":"+bot.getScore());
		Score.setFont(schriftart);
		Score.setVisible(true);
		Score.setForeground(SchriftFarbe);
		Score.setHorizontalAlignment(SwingConstants.CENTER);
		
		WinMessage.setText("%Name%"+" "+Words.get(WordTypes.hasWon));
		WinMessage.setFont(schriftart);
		WinMessage.setVisible(false);
		WinMessage.setForeground(SchriftFarbe);
		WinMessage.setHorizontalAlignment(SwingConstants.CENTER);
		
		Vs.setText("VS");
		Vs.setFont(schriftart);
		Vs.setVisible(true);
		Vs.setForeground(Color.red);
		Vs.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		framePanel.setBackground(Color.BLACK);
		framePanel.setLayout(new GridLayout(3,1,5,5));
		
		PanelmainTop.setBackground(Color.BLACK);
		PanelmainTop.setLayout(new GridLayout(1,3,5,5));
		PanelmainTopLeft.setLayout(new BorderLayout());
		PanelmainTopLeft.setBackground(Color.BLACK);
		PanelmainTopLeft.add(PlayerOneName, BorderLayout.SOUTH);
		
		PanelmainTopMiddle.setBackground(Color.BLACK);
		PanelmainTopMiddle.setLayout(new BorderLayout());
		PanelmainTopMiddle.add(Score, BorderLayout.CENTER);
		PanelmainTopMiddle.add(WinMessage, BorderLayout.SOUTH);
		
		
		PanelmainTopRight.setBackground(Color.BLACK);
		PanelmainTopRight.setLayout(new BorderLayout());
		PanelmainTopRight.add(BOTname, BorderLayout.SOUTH);
		

		PanelmainMiddleLeft.setBackground(Color.BLACK);
		PanelmainMiddleMiddle.setBackground(Color.BLACK);
		PanelmainMiddleRight.setBackground(Color.BLACK);
		PanelmainMiddle.setBackground(Color.BLACK);
		PanelmainMiddle.setLayout(new GridLayout(1,3,5,5));
		
		PanelmainMiddleLeft.setLayout(new BorderLayout());
		PanelmainMiddleLeft.add(UserLabel,BorderLayout.CENTER);
		PanelmainMiddleRight.setLayout(new BorderLayout());
		PanelmainMiddleRight.add(BotLabel,BorderLayout.CENTER);
		PanelmainMiddle.add(PanelmainMiddleLeft);
		PanelmainMiddle.add(PanelmainMiddleMiddle);
		PanelmainMiddle.add(PanelmainMiddleRight);
		

		PanelmainMiddleMiddle.setLayout(new BorderLayout());
		PanelmainMiddleMiddle.add(Vs,BorderLayout.CENTER);
		
		PanelmainTop.add(PanelmainTopLeft);
		PanelmainTop.add(PanelmainTopMiddle);
		PanelmainTop.add(PanelmainTopRight);
		
		PanelmainBottom.setBackground(Color.BLACK);
		PanelmainBottom.setLayout(new GridLayout(1,3,5,5));
		BtnSchere = new JButton();
		BtnSchere.setIcon(new IconManager(IconPath.Schere).getImageIcon());
		BtnSchere.setFocusable(false);
		BtnSchere.setBackground(Color.GRAY);
		BtnSchere.addActionListener(this);
		BtnSchere.setVisible(true);
		BtnSchere.setBorder(BorderFactory.createEmptyBorder());

		BtnStein = new JButton();
		BtnStein.setIcon(new IconManager(IconPath.Stein).getImageIcon());
		BtnStein.setFocusable(false);
		BtnStein.setBackground(Color.GRAY);
		BtnStein.addActionListener(this);
		BtnStein.setVisible(true);
		BtnStein.setBorder(BorderFactory.createEmptyBorder());
		
		BtnPapier = new JButton();
		BtnPapier.setIcon(new IconManager(IconPath.Papier).getImageIcon());
		BtnPapier.setFocusable(false);
		BtnPapier.setBackground(Color.GRAY);
		BtnPapier.addActionListener(this);
		BtnPapier.setVisible(true);
		BtnPapier.setBorder(BorderFactory.createEmptyBorder());
		
		PanelmainBottom.add(BtnSchere);
		PanelmainBottom.add(BtnStein);
		PanelmainBottom.add(BtnPapier);
		
		framePanel.add(PanelmainTop);
		framePanel.add(PanelmainMiddle);
		framePanel.add(PanelmainBottom);
		frame.add(framePanel);
		frame.setVisible(true);
	}

	public JFrame getFrame() {
		return this.frame;
	}
	
	int UserWahl = 0;
	int Win = 0;
	boolean isTicking = false;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(isTicking) {
			return;
		}
		if(e.getSource() == BtnSchere) {
			isTicking = true;
			bot.neueWahl();
			setBotImage(bot.getWahl());
			player.setWahl(1);
			UserLabel.setIcon(new IconManager(IconPath.Schere).getImageIcon());
			Win = checkWin(bot.getWahl(), player.getWahl());
			Ergebnis(Win);
		}else if(e.getSource() == BtnPapier) {
			isTicking = true;
			bot.neueWahl();
			setBotImage(bot.getWahl());
			player.setWahl(3);
			UserLabel.setIcon(new IconManager(IconPath.Papier).getImageIcon());
			Win = checkWin(bot.getWahl(), player.getWahl());
			Ergebnis(Win);
		}else if(e.getSource() == BtnStein) {
			isTicking = true;
			bot.neueWahl();
			setBotImage(bot.getWahl());
			player.setWahl(2);
			UserLabel.setIcon(new IconManager(IconPath.Stein).getImageIcon());
			Win = checkWin(bot.getWahl(), player.getWahl());
			Ergebnis(Win);
		}
	}

	private void setBotImage(int botWahl) {
		if(botWahl == 1) {
			BotLabel.setIcon(new IconManager(IconPath.Schere).getImageIcon());
		}else if (botWahl == 2) {
			BotLabel.setIcon(new IconManager(IconPath.Stein).getImageIcon());
		}else if (botWahl == 3) {
			BotLabel.setIcon(new IconManager(IconPath.Papier).getImageIcon());
		}
	}

	private void Ergebnis(int Win) {
		if(Win > 0) {
			if(Win == 1) {
				UserLabel.setVisible(true);
				BotLabel.setVisible(true);
				PanelmainMiddleLeft.setBackground(Color.GREEN);
				PanelmainMiddleRight.setBackground(Color.RED);
				PanelmainMiddle.updateUI();
				WinMessage.setText(player.getName()+" "+Words.get(WordTypes.hasWon));
				WinMessage.setVisible(true);
				player.addOneScore();
				ResetWin();
			}else if(Win == 2) {
				UserLabel.setVisible(true);
				BotLabel.setVisible(true);
				PanelmainMiddleLeft.setBackground(Color.RED);
				PanelmainMiddleRight.setBackground(Color.GREEN);
				PanelmainMiddle.updateUI();
				WinMessage.setText(bot.getName()+" "+Words.get(WordTypes.hasWon));
				WinMessage.setVisible(true);
				bot.addOneScore();
				ResetWin();
			}
		}else {
			UserLabel.setVisible(true);
			BotLabel.setVisible(true);
			PanelmainMiddleLeft.setBackground(Color.BLUE);
			PanelmainMiddleRight.setBackground(Color.BLUE);
			PanelmainMiddle.updateUI();
			WinMessage.setText(Words.get(WordTypes.Tie));
			WinMessage.setVisible(true);
			ResetWin();
		}
		
	}

	private void ResetWin() {
		Timer t = new Timer();
		t.schedule(new TimerTask() {
			
			@Override
			public void run() {
				PanelmainMiddleLeft.setBackground(Color.BLACK);
				PanelmainMiddleRight.setBackground(Color.BLACK);
				isTicking = false;
				WinMessage.setVisible(false);
				WinMessage.setText("%Name%"+" "+Words.get(WordTypes.hasWon));
				UserLabel.setVisible(false);
				BotLabel.setVisible(false);
				
				if(player.getScore() == GamesGUI.games.getBestOf() || bot.getScore() == GamesGUI.games.getBestOf()) {
					player.resetScore();
					bot.resetScore();
					CardGame.getGUI().dispose();
					CardGame.setGUI(new GamesGUI(true).getFrame());
				}
				
			}
		}, 1000);
		
		Score.setText(Words.get(WordTypes.Score)+" "+player.getScore()+":"+bot.getScore());
		
	}
	
	public int checkWin(int BotWahl,int UserWahl) {
		if(UserWahl == BotWahl) {
			return 0;
		}
		if((UserWahl == 1 && BotWahl == 2 )|| (UserWahl == 2 && BotWahl == 3) || (UserWahl == 3 && BotWahl == 1)) {
			return 2;
		}else {
			return 1;
		}
		
	}
}


