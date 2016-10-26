package hu.barbar.infoui.uielements.widgets;

import java.awt.Color;

import javax.swing.JPanel;

import hu.barbar.infoui.uielements.WeatherIF;

public abstract class WidgetBase extends JPanel implements WeatherIF {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6700861038051903472L;

	public Color DEFAULT_BG_COLOR = Color.BLACK;
	public Color DEFAULT_FG_COLOR = Color.WHITE;

	private Color bgColor = null;
	private Color fgColor = null;

	public WidgetBase() {
		this.bgColor = DEFAULT_BG_COLOR;
		this.fgColor = DEFAULT_FG_COLOR;
		this.setBackground(this.bgColor);
	}

	public WidgetBase(Color backgroundColor, Color foregroundColor) {
		this.bgColor = backgroundColor;
		this.fgColor = foregroundColor;
		this.setBackground(this.bgColor);
	}

	protected Color getBackgroudColor() {
		return this.bgColor;
	}

	protected Color getForegroudColor() {
		return this.fgColor;
	}
	
}
