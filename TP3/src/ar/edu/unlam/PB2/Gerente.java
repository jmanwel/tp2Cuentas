package ar.edu.unlam.PB2;

import java.util.Date;

public class Gerente extends Empleado {
	
	private Integer cochera;
	
	public Gerente(String nombre, Double salario, Integer dianacimiento,Integer mesnacimiento,Integer añonacimiento){
		
		super(nombre, salario, añonacimiento, añonacimiento, añonacimiento);
		
	}

	public Integer getCochera() {
		return cochera;
	}

	public void setCochera(Integer cochera) {
		this.cochera = cochera;
	}

	
	
	

}
