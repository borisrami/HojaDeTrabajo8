/*
 
Universidad del valle de Guatemala
Algoritmos y estructura de datos
Hoja de trabajo # 8 
Boris Cifuentes , 14150
Yasmin Valdez, 14079

*/

import java.util.PriorityQueue;

public class Clinica {

	private PriorityQueue<Paciente> pacientesControl = new PriorityQueue<Paciente>();
	
	public void AgregarPaciente(String paciente){
		String[] Lista = paciente.split(",");
		Paciente nuevoPaciente = new Paciente(Lista[0], Lista[1], Lista[2]);
	
		pacientesControl.offer(nuevoPaciente);
	}
	
	
	public void MostrarLista(){
		int cont =pacientesControl.size();
		for (int i=0; i< cont; i++){
			Paciente salida = pacientesControl.poll();
			System.out.println(salida.getnombrePaciente()+ "," + salida.getsintoma() + " , " + salida.getPrioridad());
		}
		
	}
	
}

