
public class PruebaJunit2 {
	
	private VectorHeap2<String> vector = new VectorHeap2<String>();
	public void start2(){
		vector.add("Analy");
		vector.add("Jonatan");
		vector.add("Susana");
		vector.add("Marielos");
		vector.add("Zaida");
		vector.add("Alexander");
		vector.add("Lucia");
		vector.add("Wilber");
		vector.add("Camila");
		vector.add("Kevin");
		vector.add("Mila");
		
}

	public void priority2(){
		
		for(int i= 0 ; i< 11 ; i++){
			System.out.println(i+". "+vector.poll());
		}
	}
	
	public boolean Ppoll2(){
		
		return vector.poll()== null;
	}
}

