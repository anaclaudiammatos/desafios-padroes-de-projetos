package com.padroesprojeto.strategy;

public class Main {

	public static void main(String[] args) {

		ComportamentoNormal normal = new ComportamentoNormal();
		ComportamentoAgressivo agrecivo = new ComportamentoAgressivo();
		ComportamentoDefensivo defensivo = new ComportamentoDefensivo();

		Robo robo = new Robo();

		// Defensivo
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();

		// Agresivo
		robo.setComportamento(agrecivo);
		robo.mover();
		robo.mover();

		// Normal
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();

	}

}
