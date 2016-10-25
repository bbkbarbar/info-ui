package hu.barbar.infoui.uielements.smallboxes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import hu.barbar.infoui.uielements.WeatherIF;
import hu.barbar.owm.api.WeatherResponse;

public class Temp extends JPanel implements WeatherIF {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8078178136233190949L;
	
	private JLabel label = null;
	
	public Temp(Color bgColor){
		super();
		this.setBackground(bgColor);
		label = new JLabel(" ");
		label.setForeground(Color.WHITE);
		
		Font labelFont = label.getFont();
		int newFontSize = (int)(labelFont.getSize() * 5);
		label.setFont(new Font(labelFont.getName(), Font.PLAIN, newFontSize));
		
		this.add(label);
	}

	public void updateData(WeatherResponse weather) {
		label.setText(weather.getConditions().getTemp() + "°C");
		
	}
	
}
