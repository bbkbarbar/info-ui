package hu.barbar.infoui.uielements.widgets;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import hu.barbar.owm.api.WeatherResponse;

public class LastUpdate extends WidgetBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8381176999810011683L;
	
	private JLabel label = null;

	public LastUpdate() {
		super();
		init();
	}
	
	public LastUpdate(Color bgColor, Color fgColor) {
		super(bgColor, fgColor);
		init();
	}
	
	private void init(){
		label = new JLabel(" ");
		label.setForeground(this.getForegroudColor());

		Font labelFont = label.getFont();
		int newFontSize = (int) (labelFont.getSize() * 1);
		label.setFont(new Font(labelFont.getName(), Font.PLAIN, newFontSize));

		this.add(label);
	}

	public void updateData(WeatherResponse weather) {
		label.setText("Last update: " + weather.getDtFormatted());
	}

}
