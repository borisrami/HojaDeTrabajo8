
public class mainPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PruebaJunit prueba = new PruebaJunit();
		
		prueba.start();
		
		prueba.priority();
		
		System.out.println("Se imprimira true si todo esta correcto: ");
		System.out.println("... "+ prueba.Ppoll());
	}

}
