package hu.barbar.infoui.uielements.widgets;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import hu.barbar.infoui.uielements.WeatherIF;
import hu.barbar.owm.api.WeatherResponse;

public class HumidityAndPressure extends WidgetBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9100649557054923468L;

	private JLabel label = null;
	private JLabel label2 = null;
	private JPanel mainPanel = null;

	public HumidityAndPressure() {
		super();
		init();
	}

	public HumidityAndPressure(Color bg, Color fg) {
		super(bg, fg);
		init();
	}

	public void updateData(WeatherResponse weather) {
		label.setText(" H: " + weather.getMain().getHumidity() + "%");
		label2.setText(" P: " + weather.getMain().getPressure());

	}

	protected void init() {
		mainPanel = new JPanel(new GridLayout(2, 1));
		mainPanel.setBackground(this.getBackgroudColor());
		this.add(mainPanel);

		label = new JLabel(" ");
		label.setForeground(this.getForegroudColor());

		label2 = new JLabel(" ");
		label2.setForeground(this.getForegroudColor());

		Font labelFont = label.getFont();
		int newFontSize = (int) (labelFont.getSize() * 4);
		int newFontSize2 = (int) (labelFont.getSize() * 4);
		label.setFont(new Font(labelFont.getName(), Font.PLAIN, newFontSize));
		label2.setFont(new Font(labelFont.getName(), Font.PLAIN, newFontSize2));

		mainPanel.add(label);
		mainPanel.add(label2);
	}

}
