package ar.edu.unlam.PB2;

import java.util.Date;

public class Gerente extends Empleado {
	
	private Integer cochera;
	
	public Gerente(String nombre, Double salario, Integer dianacimiento,Integer mesnacimiento,Integer a�onacimiento){
		
		super(nombre, salario, a�onacimiento, a�onacimiento, a�onacimiento);
		
	}

	public Integer getCochera() {
		return cochera;
	}

	public void setCochera(Integer cochera) {
		this.cochera = cochera;
	}

	
	
	

}
