package subsistema1.crm;

public class CrmService {

	private CrmService() {
		super();
	}
	public static void gravarCliente(String nome) {
		System.out.println("Salvo");
		System.out.println(nome);
	}
}
