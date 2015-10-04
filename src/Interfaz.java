/*
 
Universidad del valle de Guatemala
Algoritmos y estructura de datos
Hoja de trabajo # 8 
Boris Cifuentes , 14150
Yasmin Valdez, 14079

*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Interfaz {
	public static void main(String[] args) {
		
	   	  File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      Clinica clinica = new Clinica();
	      try {
	        
	         archivo = new File ("src/pacientes.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	 
	        
	         
	         String linea;
	         
	         while((linea=br.readLine())!=null){
	        	 clinica.AgregarPaciente(linea);
	         }
	 		
	         clinica.MostrarLista();
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		
	}
}
	
