package gof;

import gof.facade.Facade;
import gof.singleton.SingletonEager;
import gof.singleton.SingletonLazy;
import gof.singleton.SingletonLazyHolder;
import gof.strategy.Comportamento;
import gof.strategy.ComportamentoAgresivo;
import gof.strategy.ComportamentoDefensivo;
import gof.strategy.ComportamentoNormal;
import gof.strategy.Robo;

public class teste {

	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgresivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		
		robo.mover();
		
		// Facade
		Facade facade = new Facade();
		facade.migrarCliente("PH", "41322315");
	}

}
