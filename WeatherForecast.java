package corejava;

public class WeatherForecast {
	public static double getTemperature()
	{
		return 25.0;
	}

	public static void main(String[] args) {
		double temp= WeatherForecast.getTemperature();
		System.out.println(temp);

	}

}
