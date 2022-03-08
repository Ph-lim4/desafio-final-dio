package gof.singleton;
/**
 * Singleton "Apressado"
 * @author Ph_lim4
 *
 */
public class SingletonLazyHolder {

	private static class Holder{ 
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia(){
		return Holder.instancia;
	}
}
