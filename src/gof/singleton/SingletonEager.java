package gof.singleton;
/**
 * Singleton "Apressado"
 * @author Ph_lim4
 *
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia(){
		return instancia;
	}
}
