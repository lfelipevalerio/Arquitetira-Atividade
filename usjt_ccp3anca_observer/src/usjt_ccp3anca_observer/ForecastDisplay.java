package usjt_ccp3anca_observer;

import java.util.Random;

public class ForecastDisplay extends Display {

	private Random gerador = new Random();
	@Override
	public void display() {
		

	}
	@Override
	public void update(double temperature, double humidity, double pressure) {
		double previsao = temperature -2 + gerador.nextDouble() * 4;
		System.out.println("--------- Previs�es --------\n");
		System.out.printf("Previs�o para o pr�ximo dia: %.2f\n",  previsao);
	}
}
