/*
 
Universidad del valle de Guatemala
Algoritmos y estructura de datos
Hoja de trabajo # 8 
Boris Cifuentes , 14150
Yasmin Valdez, 14079

*/

// archivo main de las pruebas Junit
//Aqui se prueba el VectorHeap
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
