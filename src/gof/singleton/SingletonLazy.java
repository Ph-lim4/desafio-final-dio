package gof.singleton;
/**
 * Singleton "Pregui�oso"
 * @author Ph_lim4
 *
 */
public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia(){
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
