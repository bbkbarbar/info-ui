package hu.barbar.infoui;

import hu.barbar.infoui.uielements.UI;
import hu.barbar.owm.api.WeatherInfoProvider;

public class InfoUIApp {

	public static final boolean MODE_FULLSCREEN = true;
	
	private static InfoUIApp me = null;
	private UI ui = null;
	
	public static void main(String[] args) {
		me = new InfoUIApp();
	}
	
	public InfoUIApp() {
		this.ui = new UI();
		
		WeatherInfoProvider wip = new WeatherInfoProvider();
		ui.showWeatherOnUI(wip.getCurrentInfos());
	}
	
}
