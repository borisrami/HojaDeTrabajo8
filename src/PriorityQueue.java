/*
 
Universidad del valle de Guatemala
Algoritmos y estructura de datos
Hoja de trabajo # 8 
Boris Cifuentes , 14150
Yasmin Valdez, 14079

*/

public interface PriorityQueue<E extends Comparable<E>> {
	public E getFirst();
	
	public E remove();
	
	public void add(E value);
	
	public boolean isEmpty();
	
	public int size();
	
	public void clear();
	
}
