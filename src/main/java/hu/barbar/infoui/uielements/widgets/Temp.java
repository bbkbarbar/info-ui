package hu.barbar.infoui.uielements.widgets;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import hu.barbar.owm.api.WeatherResponse;

public class Temp extends WidgetBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8078178136233190949L;

	private JLabel label = null;

	public Temp() {
		super();
		init();
	}
	
	public Temp(Color bgColor, Color fgColor) {
		super(bgColor, fgColor);
		init();
	}
	
	private void init(){
		label = new JLabel(" ");
		label.setForeground(this.getForegroudColor());

		Font labelFont = label.getFont();
		int newFontSize = (int) (labelFont.getSize() * 5);
		label.setFont(new Font(labelFont.getName(), Font.PLAIN, newFontSize));

		this.add(label);
	}

	public void updateData(WeatherResponse weather) {
		label.setText(weather.getConditions().getTemp() + "°C");
	}

}
