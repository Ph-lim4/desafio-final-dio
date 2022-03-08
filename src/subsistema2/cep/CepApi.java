package subsistema2.cep;

import gof.singleton.SingletonEager;

public class CepApi {
	
	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia(){
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Lapa";
	}
	
	public String recuperarEstado(String cep) {
		return "BA";
	}
}

