package usjt_ccp3anca_observer;

public class StartDisplay extends Display {

	@Override
	public void display() {


	}
	private int qtde = 0;
	private double totalHistorico = 0;
	
	@Override
	public void update(double temperature, double humidity, double pressure) {
		qtde++;
		totalHistorico += temperature;
		System.out.println("--------- Dados Estat�sticos ---------");
		System.out.printf("M�dia: %.2f\n", totalHistorico/qtde);
		
	}
}
