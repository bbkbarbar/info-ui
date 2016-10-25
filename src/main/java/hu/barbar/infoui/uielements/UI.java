package hu.barbar.infoui.uielements;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import hu.barbar.infoui.InfoUIApp;
import hu.barbar.infoui.uielements.smallboxes.ConditionText;
import hu.barbar.infoui.uielements.smallboxes.HumidityAndPressure;
import hu.barbar.infoui.uielements.smallboxes.Temp;
import hu.barbar.owm.api.WeatherResponse;

public class UI {

	private JFrame frame;
	
	private ArrayList<WeatherIF> elementsToShowWeather = null;

	public UI() {

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);

		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		if (InfoUIApp.MODE_FULLSCREEN) {
			frame.setUndecorated(true);
		}
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.setBackground(Color.BLACK);

		ArrayList<JPanel> placeHolders = new ArrayList<JPanel>(); 
		for(int i=0; i<8; i++){
			JPanel placeHolder = new JPanel();
			placeHolder.setBackground(Color.BLACK);
			placeHolders.add(placeHolder);
		}
		JPanel placeHolder = new JPanel();
		placeHolder.setBackground(Color.BLACK);
		
		JPanel leftPanel = new JPanel(new GridLayout(8,2));
		leftPanel.setBackground(Color.BLACK);
		mainPanel.add(leftPanel, BorderLayout.WEST);
		elementsToShowWeather = new ArrayList<WeatherIF>();
		
		ConditionText wp = new ConditionText(Color.BLACK);
		elementsToShowWeather.add(wp);
		
		Temp temp = new Temp(Color.BLACK);
		elementsToShowWeather.add(temp);
		
		HumidityAndPressure hp = new HumidityAndPressure(Color.BLACK);
		elementsToShowWeather.add(hp);
		
		leftPanel.add(wp);
		leftPanel.add(temp);
		leftPanel.add(placeHolders.get(2));
		leftPanel.add(placeHolders.get(3));
		leftPanel.add(placeHolders.get(4));
		leftPanel.add(placeHolders.get(5));
		leftPanel.add(placeHolders.get(6));
		leftPanel.add(hp);
		

		frame.add(mainPanel);
		frame.setVisible(true);

	}
	
	public void showWeatherOnUI(WeatherResponse weather){
		for (WeatherIF weatherIF : elementsToShowWeather) {
			weatherIF.updateData(weather);
		}
	}

}
