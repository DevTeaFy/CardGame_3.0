package de.cardGame.gui.components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JComponent;
import javax.swing.JLabel;

import de.cardGame.main.CardGame;
import de.cardGame.utils.settings.Settings;

@SuppressWarnings("serial")
public class MyLabel extends JComponent {

	private String Text = "";
	private Font Font = null;
	private Color BackgroundColorMain, BackgroundColorSecondary, ForegroundColor;
	private int HorizontalAlignment;
	private int HorizontalTextPosition;
	private int Alpha = 1;
	
	public MyLabel() {}
	
	public MyLabel(String Text, Font Font,Color BackgroundColorMain,Color BackgroundColorSecondary, Color ForegroundColor, int HorizontalAlignment, int HorizontalTextPosition, int Alpha) {
		this.Text = Text;
		this.Font = Font;
		this.setBackgroundColorMain(BackgroundColorMain);
		this.setBackgroundColorSecondary(BackgroundColorSecondary);
		this.ForegroundColor = ForegroundColor;
		this.HorizontalAlignment = HorizontalAlignment;
		this.HorizontalTextPosition = HorizontalTextPosition;
		this.Alpha = Alpha;
	}
	public MyLabel(String Text, Font Font, Color ForegroundColor, int HorizontalAlignment, int HorizontalTextPosition, int Alpha) {
		this.Text = Text;
		this.Font = Font;
		Settings st = CardGame.getSettings();
		String Typ = st.getDesign();
		if(Typ.equalsIgnoreCase("Dunkel")) {
			setBackgroundColorSecondary(new Color(0x505050));
			setBackgroundColorMain(Color.DARK_GRAY);
		}else if(Typ.equalsIgnoreCase("Hell")){
			setBackgroundColorSecondary(new Color(0x808080));
			setBackgroundColorMain(Color.WHITE);
		}
		this.ForegroundColor = ForegroundColor;
		this.HorizontalAlignment = HorizontalAlignment;
		this.HorizontalTextPosition = HorizontalTextPosition;
		this.Alpha = Alpha;
	}
	
	public JLabel getMyLabelAsJLabel(boolean BackgroundMain) {
		JLabel l = new JLabel();
		l.setText(getText());
		l.setFont(getFont());
		if(BackgroundMain) {
			l.setBackground(getBackgroundColorMain());
		} else {
			l.setBackground(getBackgroundColorSecondary());
		}
		l.setOpaque(true);
		l.setForeground(getForegroundColor());
		l.setHorizontalAlignment(getHorizontalAlignment());
		l.setHorizontalTextPosition(getHorizontalTextPosition());
		l.setFocusable(false);
		return l;
	}
	
	
	
	public Color getForegroundColor() {
		return ForegroundColor;
	}
	public void setForegroundColor(Color foregroundColor) {
		ForegroundColor = foregroundColor;
	} 
	public String getText() {
		return Text;
	}
	public void setText(String text) {
		Text = text;
	}
	public Font getFont() {
		return Font;
	}
	public void setFont(Font font) {
		Font = font;
	}
	public int getHorizontalAlignment() {
		return HorizontalAlignment;
	}
	public void setHorizontalAlignment(int horizontalAlignment) {
		HorizontalAlignment = horizontalAlignment;
	}
	public int getHorizontalTextPosition() {
		return HorizontalTextPosition;
	}
	public void setHorizontalTextPosition(int horizontalTextPosition) {
		HorizontalTextPosition = horizontalTextPosition;
	}


	public int getAlpha() {
		return Alpha;
	}


	public void setAlpha(int alpha) {
		Alpha = alpha;
	}
	public Color getBackgroundColorMain() {
		return BackgroundColorMain;
	}
	public void setBackgroundColorMain(Color backgroundColorMain) {
		BackgroundColorMain = backgroundColorMain;
	}
	public Color getBackgroundColorSecondary() {
		return BackgroundColorSecondary;
	}
	public void setBackgroundColorSecondary(Color backgroundColorSecondary) {
		BackgroundColorSecondary = backgroundColorSecondary;
	}
	
}
