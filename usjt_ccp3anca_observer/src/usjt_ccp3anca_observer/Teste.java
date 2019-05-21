package usjt_ccp3anca_observer;

public class Teste {

	public static void main (String args[]) {
		WeatherData estacaoMonitoramento = new WeatherData();
		CurrentConditionDisplay d1 = new CurrentConditionDisplay();
		StartDisplay d2 = new StartDisplay();
		ForecastDisplay d3 = new ForecastDisplay();
		estacaoMonitoramento.registerObserver(d1);
		estacaoMonitoramento.registerObserver(d2);
		estacaoMonitoramento.registerObserver(d3);
		estacaoMonitoramento.Iniciar();
	}
}
