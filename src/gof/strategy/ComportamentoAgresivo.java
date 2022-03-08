package gof.strategy;

public class ComportamentoAgresivo implements Comportamento {
	
	@Override
	public void mover() {
		System.out.println("Agressivamente");
	}
}
