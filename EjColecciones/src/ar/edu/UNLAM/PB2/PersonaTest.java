package ar.edu.UNLAM.PB2;

import java.util.*;

public class PersonaTest {

	public static void main(String[] args) {
							
			Persona per1 = new Persona("Yang Perez", 25);
			Persona per2 = new Persona("Sol Acuña", 39);
			Persona per3 = new Persona("Lars Ulrich", 46);
			Persona per4 = new Persona("Van Halen", 53);
			Persona per5 = new Persona("Juan Perez", 25);
			Persona per6 = new Persona("Juan Perez", 25);
									
			TreeSet<Persona> personas= new TreeSet<Persona>();
			
			personas.add(per1);
			personas.add(per2);
			personas.add(per3);
			personas.add(per4);
			personas.add(per5);
			personas.add(per6);
						
			for(Persona parray: personas){
				
			System.out.println("El nombre es: "+parray.getNombre()+" y su edad es "+parray.getEdad());
				
			}
			/*			
			Iterator<Persona> it=personas.iterator();
			while(it.hasNext()){				
				String nombre_persona=it.next().getNombre();
				System.out.println(nombre_persona);
			}*/
			
			Persona comparadorpersona = new Persona();
			
			TreeSet<Persona> personas1= new TreeSet<Persona>(comparadorpersona);
			
			personas1.add(per1);
			personas1.add(per1);
			personas1.add(per2);
			personas1.add(per3);
			personas1.add(per4);
			personas1.add(per5);
			
			
			for(Persona p:personas1){
				
				System.out.println(p.getNombre());
			}
			

	}

}
