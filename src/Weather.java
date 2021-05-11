
public class Weather {
	private String weather;
	private int fahrenheit;
	private int celsius;
	
	public Weather() {
		setTemperature();
		setWeather();
	}
	public void setWeather() {
		int random = (int)(Math.random() * 5) + 1;
		if (random == 1)
			weather = "Clear and Sunny";
		else if (random == 2)
			weather = "Cloudy";
		else if (random == 3)
			weather = "Hazy";
		else if (random == 4)
			weather = "Overcast";
		else if (random == 5)
			weather = "Rainy";
	}
	public void setTemperature() {
		fahrenheit = (int)(Math.random() * 41) + 50;
		celsius = (fahrenheit - 32) * 5/9;
	}
	public String getWeather() {
		return weather;
	}
	public int getFahrenheit() {
		return fahrenheit;
	}
	public int getCelsius() {
		return celsius;
	}
}
