package designpattern;

import java.util.ArrayList;
import java.util.List;

/*
 * �۲��ߣ�Observer��
 * �������֮���һ�Զ���������һ������״̬�ı�ʱ�������������������յ�֪ͨ�����Զ�����״̬��
 * ���⣨Subject���Ǳ��۲�Ķ��󣬶������������ߣ�Observer����Ϊ�۲��ߡ�
 * 
 * ���⣨Subject������ע����Ƴ��۲��ߡ���֪ͨ���й۲��ߵĹ��ܣ�
 * ������ͨ��ά��һ�Ź۲����б���ʵ����Щ�����ġ�
 * �۲��ߣ�Observer����ע�Ṧ����Ҫ��������� registerObserver() ������
 * 
 * �������ݲ�������������Ϣ�����ı�ʱ���������ݣ�������ж���������ڽ�����������ӡ�
 */
interface Subject {
	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObserver();
}

class WeatherData implements Subject {
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<>();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObserver();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		for (Observer o : observers) {
			o.update(temperature, humidity, pressure);
		}
	}
}

interface Observer {
	void update(float temp, float humidity, float pressure);
}

class StatisticsDisplay implements Observer {

	public StatisticsDisplay(Subject weatherData) {
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		System.out.println("StatisticsDisplay.update: " + temp + " " + humidity + " " + pressure);
	}
}

class CurrentConditionsDisplay implements Observer {

	public CurrentConditionsDisplay(Subject weatherData) {
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		System.out.println("CurrentConditionsDisplay.update: " + temp + " " + humidity + " " + pressure);
	}
}

public class ObserverClient {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

		weatherData.setMeasurements(0, 0, 0);
		weatherData.setMeasurements(1, 1, 1);
	}

}
