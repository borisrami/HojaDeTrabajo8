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
		System.out.println(" ");
		System.out.println("____________________________________________");
		System.out.println("Prueba # 2 ");
		

		PruebaJunit2 prueba2 = new PruebaJunit2();
		
		prueba2.start2();
		
		prueba2.priority2();
		
		System.out.println("Se imprimira true si todo esta correcto: ");
		System.out.println("... "+ prueba2.Ppoll2());
		
		
	}

}
