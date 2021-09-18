package de.cardGame.andereGames;

import de.cardGame.andereGames.Utils.BOT;
import de.cardGame.andereGames.Utils.Player;

public class Games {
	
	private Player player;
	private BOT bot;
	private int bestOf = 2;
	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public BOT getBot() {
		return bot;
	}

	public void setBot(BOT bot) {
		this.bot = bot;
	}

	public int getBestOf() {
		return bestOf;
	}

	public void setBestOf(int bestOf) {
		this.bestOf = bestOf;
	}
}
