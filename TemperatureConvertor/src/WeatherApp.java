
public class WeatherApp {
	public static void main(String[] args) {
	
	TemperatureConvertor1 c1 = new TemperatureConvertor1();
	double result = c1.convertFahToCelsius(68.0);
	System.out.println("the celsius"+" "+result);
	
}
}