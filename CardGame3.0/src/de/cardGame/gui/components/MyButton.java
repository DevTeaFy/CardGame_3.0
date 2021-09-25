package de.cardGame.gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.border.Border;

import de.cardGame.main.CardGame;
import de.cardGame.utils.settings.Settings;

@SuppressWarnings("serial")
public class MyButton extends JComponent {
	
	private String Text = "";
	private Font Font = null;
	private Color BackgroundColorMain, BackgroundColorSecondary, ForegroundColor;
	private int HorizontalAlignment,VerticalAlignment;
	private int HorizontalTextPosition,VerticalTextPosition;
	private int Alpha = 1;
	private ActionListener ActionListener;
	private Border Border;
	private boolean Focusable;
	private ImageIcon ImageIcon;
	
	public MyButton() {}
	
	public MyButton(String Text, Font Font,Color BackgroundColorMain,Color BackgroundColorSecondary, Color ForegroundColor, int HorizontalAlignment,int VerticalAlignment, int HorizontalTextPosition,int VerticalTextPosition, int Alpha,Border Border,ActionListener ActionListener,boolean Focusable) {
		this.Text = Text;
		this.Font = Font;
		this.setBackgroundColorMain(BackgroundColorMain);
		this.setBackgroundColorSecondary(BackgroundColorSecondary);
		this.ForegroundColor = ForegroundColor;
		this.HorizontalAlignment = HorizontalAlignment;
		this.HorizontalTextPosition = HorizontalTextPosition;
		this.Alpha = Alpha;
		this.Border = Border;
		this.ActionListener = ActionListener;
		this.Focusable = Focusable;
		this.VerticalAlignment = VerticalAlignment;
		this.VerticalTextPosition = VerticalTextPosition;
	}
	
	public MyButton(String Text, Font Font, Color ForegroundColor, int HorizontalAlignment,int VerticalAlignment, int HorizontalTextPosition,int VerticalTextPosition, int Alpha,Border Border,ActionListener ActionListener,boolean Focusable) {
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
		this.Border = Border;
		this.ActionListener = ActionListener;
		this.Focusable = Focusable;
		this.VerticalAlignment = VerticalAlignment;
		this.VerticalTextPosition = VerticalTextPosition;
	}
	
	public JButton getMyButtonAsJButton(boolean BackgroundMain) {
		JButton B = new JButton();
		B.setText(getText());
		B.setFont(getFont());
		B.setForeground(getForeground());
		if(BackgroundMain) {
			B.setBackground(getBackgroundColorMain());
		} else {
			B.setBackground(getBackgroundColorSecondary());
		}
		B.setHorizontalAlignment(getHorizontalAlignment());
		B.setVerticalTextPosition(getVerticalTextPosition());
		B.setVerticalAlignment(getVerticalAlignment());
		B.setHorizontalTextPosition(getHorizontalTextPosition());
		B.setFocusable(isFocusable());
		B.addActionListener(getActionListener());
		B.setBorder(getBorder());
		return B;
	}
	
	public MyButton addIcon(ImageIcon imageIcon) {
		this.setImageIcon(imageIcon);
		return this;
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
	public Color getForegroundColor() {
		return ForegroundColor;
	}
	public void setForegroundColor(Color foregroundColor) {
		ForegroundColor = foregroundColor;
	}
	public int getHorizontalAlignment() {
		return HorizontalAlignment;
	}
	public void setHorizontalAlignment(int horizontalAlignment) {
		HorizontalAlignment = horizontalAlignment;
	}
	public int getVerticalAlignment() {
		return VerticalAlignment;
	}
	public void setVerticalAlignment(int verticalAlignment) {
		VerticalAlignment = verticalAlignment;
	}
	public int getHorizontalTextPosition() {
		return HorizontalTextPosition;
	}
	public void setHorizontalTextPosition(int horizontalTextPosition) {
		HorizontalTextPosition = horizontalTextPosition;
	}
	public int getVerticalTextPosition() {
		return VerticalTextPosition;
	}
	public void setVerticalTextPosition(int verticalTextPosition) {
		VerticalTextPosition = verticalTextPosition;
	}
	public int getAlpha() {
		return Alpha;
	}
	public void setAlpha(int alpha) {
		Alpha = alpha;
	}
	public ActionListener getActionListener() {
		return ActionListener;
	}
	public void setActionListener(ActionListener actionListener) {
		ActionListener = actionListener;
	}
	public Border getBorder() {
		return Border;
	}
	public void setBorder(Border border) {
		Border = border;
	}
	public boolean isFocusable() {
		return Focusable;
	}
	public void setFocusable(boolean focusable) {
		Focusable = focusable;
	}

	public ImageIcon getImageIcon() {
		return ImageIcon;
	}

	public void setImageIcon(ImageIcon imageIcon) {
		ImageIcon = imageIcon;
	}
	
}
