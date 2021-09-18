package de.cardGame.utils.Sprachausgabe;

import java.io.IOException;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

import de.cardGame.cards.Card;
import de.cardGame.main.CardGame;
import de.cardGame.utils.Words.WordTypes;
import de.cardGame.utils.Words.Words;

public class SprachAusgabe {
	
	private Clip clip;
	private URL playurl;
	private TextType PlayedText;
	private Card Playedcard;
	private long Cliplength;
	private FloatControl volume;
	
	
	private long Cliptime = 0L;
	
	public SprachAusgabe(Card card,TextType X) {
		this.Playedcard = card;
		this.PlayedText = X;
		String URL = card.getAudioFilePath()+CardGame.getSettings().getStimmenArt()+"/"+X.getDateiName();
		this.playurl = this.getClass().getClassLoader().getResource(URL);
		Start();
	}
	
	public SprachAusgabe(URL url) {
		playurl = url;
		Start();
	}
	

	public void Start() {
		try {
			AudioInputStream audioInput = AudioSystem.getAudioInputStream(this.playurl);
			this.clip = AudioSystem.getClip();
			this.clip.open(audioInput);
			volume = (FloatControl) this.clip.getControl(FloatControl.Type.MASTER_GAIN);
			float eingabewert = CardGame.getSettings().getAudiovalue();
			if(eingabewert > 50) {
				eingabewert = 106.0206f-CardGame.getSettings().getAudiovalue();
			}else if (eingabewert < 50){
				eingabewert = CardGame.getSettings().getAudiovalue()-106.0206f;
			}
			float f = -0.760206F; //-80 +6,0206
			float volume = eingabewert*f;
			if(volume>-0.5f) {
				volume *= -1;
			}
			setVolume(volume);
			this.Cliplength = this.clip.getMicrosecondLength();
			this.clip.start();
			this.Cliptime = clip.getMicrosecondPosition();
		} catch (UnsupportedAudioFileException e) {
			JOptionPane.showMessageDialog(CardGame.getGUI(), Words.getHtmlText(Words.get(WordTypes.AudioDateiTypeNichtverwendbar)));
			this.Stop();
		} catch (IOException e) {
			e.printStackTrace();
			this.Stop();
		} catch (Exception e) {
			e.printStackTrace();
			this.Stop();
		}
	}
	
	public void setVolume(float volume) {
		this.volume.setValue(volume);
	}
	
	public void Stop() {
		if(this.clip.isActive()) {
			this.clip.stop();
			this.clip.close();
		}
	}
	
	public boolean isRunning() {
		if(!this.clip.isActive() || this.clip == null) {
			return false;
		}else {
			return true;
		}
	}
	
	public void Pause() {
		if (this.clip == null) {
			return;
		}
		if(isRunning()) {
			this.Cliptime = this.clip.getMicrosecondPosition();
			this.clip.stop();
		}else {
			Weiter();
		}
	}
	
	public void Weiter() {
		if(this.clip.isActive()) {
			return;
		}
		this.clip.setMicrosecondPosition(this.Cliptime);
		this.clip.start();
		
	}
	
	public URL getPlayurl() {
		return playurl;
	}
	
	public TextType getPlayedText() {
		return PlayedText;
	}
	
	public Card getPlayedcard() {
		return Playedcard;
	}
	
	public long getCliptime() {
		return Cliptime;
	}
	
	public long getCliplength() {
		return Cliplength;
	}
	public static boolean PlayBackisRunning = false;
	public static boolean stopPlayBack = false;
	
	public static void PlayGameInAudio() {
		if(PlayBackisRunning) {
			stopPlayBack = true;
			return;
		}
		Timer t = new Timer();
		PlayBackisRunning = true;
		t.schedule(new TimerTask() {
			@Override
			public void run() {
				if (Words.choosenWayID.size() > 0) {
					SprachAusgabe sa = null;
					for (int i = 0; i < Words.choosenWayID.size(); i++) {
						if(stopPlayBack) {
							break;
						}
						if(sa == null) {
							sa = new SprachAusgabe(Card.getCardByID(Words.choosenWayID.get(i)), Words.choosenWayAnswer.get(i));
							Warten(((sa.getCliplength()/1000)+400));
							sa = null;
						}
					}
					PlayBackisRunning = false;
					stopPlayBack = false;
				}
			}
		}, 500);
	}	
	
	private static void Warten(long miliseconds) {
		try {
			Thread.sleep(miliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
