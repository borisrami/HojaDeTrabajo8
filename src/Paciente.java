/*
 
Universidad del valle de Guatemala
Algoritmos y estructura de datos
Hoja de trabajo # 8 
Boris Cifuentes , 14150
Yasmin Valdez, 14079

*/

public class Paciente implements Comparable<Paciente> {

	
	private String nombrePaciente;
	private String sintoma;
	private String prioridad;
	
	
	
	public Paciente(String nombrePaciente, String sintoma, String prioridad) {
		this.nombrePaciente = nombrePaciente;
		this.sintoma = sintoma;
		this.prioridad = prioridad;
	}
	
	public String getnombrePaciente() {
		return nombrePaciente;
	}
	public void setnombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
	public String getsintoma() {
		return sintoma;
	}
	public void setsintoma(String sintoma) {
		this.sintoma = sintoma;
	}
	public String getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public int compareTo(Paciente paciente) {
		
		
		char datos = prioridad.charAt(1);
		//int ascii1 = (int)datos;
		
		char datos1 = paciente.prioridad.charAt(1);
		
		int codigo= 0;
		
		switch (datos){
		case 'A': 
			codigo= 1;
			break;
		case 'B':  
			codigo= 2;
			break;
		case 'C': 
			codigo= 3;
			
			break;
			
		case 'D':  
			codigo= 4;
			
			break;
		case 'E':  
			codigo= 5;
			
			break;
		}
		
		int codigo1 = 0;
		switch (datos1){
		
		case 'A': 
			codigo1 = 1;
			break;
		case 'B':  
			codigo1 = 2;
			break;
			
		case 'C': 
			codigo1 = 3;
			break;
			
		case 'D':  
			codigo1 = 4;
			break;
		case 'E': 
			codigo1 = 5;
			break;
		}
		
		return codigo- codigo1;
	}
	
	
	
}

