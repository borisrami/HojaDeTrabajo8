/*
 
Universidad del valle de Guatemala
Algoritmos y estructura de datos
Hoja de trabajo # 8 
Boris Cifuentes , 14150
Yasmin Valdez, 14079

*/
public class PruebaJunit {
	
	private VectorHeap2<String> vector = new VectorHeap2<String>();
	
	//se prueba el metodo de buscar elemento de orden utilizando el abecedario , se excluye la letra Ñ 
	
	public void start(){
		vector.add("O");
		vector.add("X");
		vector.add("H");
		vector.add("T");
		vector.add("K");
		vector.add("D");
		vector.add("L");
		vector.add("W");
		vector.add("C");
		vector.add("R");
		vector.add("B");
		vector.add("I");
		vector.add("F");
		vector.add("V");
		vector.add("A");
		vector.add("M");
		vector.add("E");
		vector.add("P");
		vector.add("Y");
		vector.add("N");
		vector.add("G");
		vector.add("J");
		vector.add("Z");
		//vector.add("Ñ");
		vector.add("S");
		vector.add("Q");
		vector.add("U");
			
	}

		public void priority(){
			
			for(int i= 0 ; i< 26 ; i++){
				System.out.println(i+"). "+vector.poll());
			}
		}
		
		public boolean Ppoll(){
			
			return vector.poll()== null;
		}
}
