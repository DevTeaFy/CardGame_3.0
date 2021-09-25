package de.cardGame.gui.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JComponent;
import javax.swing.JPanel;

import de.cardGame.main.CardGame;
import de.cardGame.utils.settings.Settings;

@SuppressWarnings("serial")
public class MyPanel extends JComponent {
	/*
	private Dimension Dimension;
	private LayoutManager LayoutManager;
	private Color BackgroundColor;
	
	public MyPanel() {}
	
	public MyPanel(LayoutManager Layout, Color BackgroundColor) {
		this.Dimension = null;
		this.setLayoutManager(Layout);
		this.BackgroundColor = BackgroundColor;
	}
	public MyPanel(LayoutManager Layout) {
		this.Dimension = null;
		this.setLayoutManager(Layout);
		Settings st = CardGame.getSettings();
		String Typ = st.getDesign();
		if(Typ.equalsIgnoreCase("Dunkel")) {
			setBackgroundColor(Color.DARK_GRAY);
		}else if(Typ.equalsIgnoreCase("Hell")){
			setBackgroundColor(Color.WHITE);
		}
	}
	
	public MyPanel(Dimension Dimension, LayoutManager Layout, Color BackgroundColor) {
		this.Dimension = Dimension;
		this.setLayoutManager(Layout);
		this.BackgroundColor = BackgroundColor;
	}
	public MyPanel(Dimension Dimension, LayoutManager Layout) {
		this.Dimension = Dimension;
		this.setLayoutManager(Layout);
		Settings st = CardGame.getSettings();
		String Typ = st.getDesign();
		if(Typ.equalsIgnoreCase("Dunkel")) {
			setBackgroundColor(Color.DARK_GRAY);
		}else if(Typ.equalsIgnoreCase("Hell")){
			setBackgroundColor(Color.WHITE);
		}
	}
	
	public JPanel getMyPanelAsJPanel() {
		JPanel P = new JPanel();
		P.setPreferredSize(getDimension());
		P.setLayout(getLayoutManager());
		P.setBackground(getBackgroundColor());
		return P;
	}
	
	public Dimension getDimension() {
		return Dimension;
	}
	public void setDimension(Dimension dimension) {
		Dimension = dimension;
	}
	public Color getBackgroundColor() {
		return BackgroundColor;
	}
	public void setBackgroundColor(Color backgroundColor) {
		BackgroundColor = backgroundColor;
	}

	public LayoutManager getLayoutManager() {
		return LayoutManager;
	}

	public void setLayoutManager(LayoutManager layoutManager) {
		LayoutManager = layoutManager;
	}
	*/
	
}
