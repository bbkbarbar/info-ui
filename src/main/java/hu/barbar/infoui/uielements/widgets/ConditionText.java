package hu.barbar.infoui.uielements.widgets;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import hu.barbar.infoui.uielements.WeatherIF;
import hu.barbar.owm.api.WeatherResponse;

public class ConditionText extends WidgetBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1683565975025133858L;

	private JLabel label = null;
	
	public ConditionText(){
		super();
		init();
	}
	
	public ConditionText(Color bgColor, Color fgColor){
		super(bgColor, fgColor);
		init();
	}
	
	private void init(){
		label = new JLabel(" ");
		label.setForeground(this.getForegroudColor());
		
		Font labelFont = label.getFont();
		System.out.println("Default font size: " + labelFont.getSize());
		int newFontSize = (int)(labelFont.getSize() * 2);
		int newFontSize2 = (int)(labelFont.getSize() * 3);
		label.setFont(new Font(labelFont.getName(), Font.PLAIN, newFontSize));
		
		this.add(label);
	}

	public void updateData(WeatherResponse weather) {
		label.setText(weather.getWeather().getMain());
		
	}
	
}
