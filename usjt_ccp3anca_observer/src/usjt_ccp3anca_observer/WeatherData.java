package usjt_ccp3anca_observer;

import java.util.*;

public class WeatherData implements Subject{
	
	private List <Observer> observers;
	
	public WeatherData() {
		observers = new LinkedList<>();
	}
	
	private double temperature;
	private double pressure;
	private double humidity;
	
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
		
	}
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}
	@Override
	public void notifyObservers() {
		for (Observer o: observers)
			o.update(temperature, humidity, pressure);
		
	}
	
}
