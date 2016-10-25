package hu.barbar.infoui.uielements.smallboxes;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import hu.barbar.infoui.uielements.WeatherIF;
import hu.barbar.owm.api.WeatherResponse;

public class HumidityAndPressure extends JPanel implements WeatherIF {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9100649557054923468L;
	
	private JLabel label = null;
	private JLabel label2 = null;
	
	public HumidityAndPressure(Color bgColor){
		super(new GridLayout(2, 1));
		this.setBackground(bgColor);
		label = new JLabel(" ");
		label.setForeground(Color.WHITE);
		
		label2 = new JLabel(" ");
		label2.setForeground(Color.WHITE);
		
		Font labelFont = label.getFont();
		int newFontSize = (int)(labelFont.getSize() * 4);
		int newFontSize2 = (int)(labelFont.getSize() * 4);
		label.setFont(new Font(labelFont.getName(), Font.PLAIN, newFontSize));
		label2.setFont(new Font(labelFont.getName(), Font.PLAIN, newFontSize2));
		
		this.add(label);
		this.add(label2);
	}

	public void updateData(WeatherResponse weather) {
		label.setText(" H: " + weather.getMain().getHumidity() + "%");
		label2.setText(" P: " + weather.getMain().getPressure());
		
	}
	
}
