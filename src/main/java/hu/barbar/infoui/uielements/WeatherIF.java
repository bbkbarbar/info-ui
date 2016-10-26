package hu.barbar.infoui.uielements;

import hu.barbar.owm.api.WeatherResponse;

/**
 * Interface to get and process different parts of current weather conditions
 * 
 * @author Andras Boor
 */
public interface WeatherIF {

	/**
	 * Method what will be called when current weather arameters changed.
	 * @param weather
	 */
	public void updateData(WeatherResponse weather);
	
}
