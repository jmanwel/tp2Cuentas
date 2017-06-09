package ar.edu.UNLAM.PB2;

import java.util.*;

public class Persona implements Comparable<Persona>, Comparator<Persona> {
	
	private String nombre;
	private Integer edad;	

	
	public Persona(String nombre, Integer edad){
		if (nombre==null || edad==null)
			throw new NullPointerException();
		this.nombre=nombre;
		this.edad=edad;		
	}	
	//Constructor x defecto para utilizar el metodo Comparador
	public Persona(){}

	public String getNombre() {
		return nombre;
	}

	public Integer getEdad() {
		return edad;
	}
	
	@Override
	public int compareTo(Persona o) {
		
		Persona n = (Persona)o;	
		int lastCmp = nombre.compareTo(n.nombre);
		return (lastCmp!=0 ? lastCmp : nombre.compareTo(n.nombre));
	}

	@Override
	public int compare(Persona arg0, Persona arg1) {		
		String descripcionA =arg0.getNombre();
		String descripcionB =arg1.getNombre();
		
		return descripcionA.compareTo(descripcionB);
	}	

}
