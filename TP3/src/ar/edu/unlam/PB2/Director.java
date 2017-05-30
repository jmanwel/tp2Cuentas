package ar.edu.unlam.PB2;

import java.util.Date;

public class Director extends Gerente{
	
	private Integer cochera;
	private Double plus;

	public Director(String nombre, Double salario, Integer dianacimiento,Integer mesnacimiento,Integer aņonacimiento) {
		super(nombre, salario, aņonacimiento, aņonacimiento, aņonacimiento);
		this.cochera=cochera;
		this.plus=plus;		
	}

	public Double getPlus() {
		return plus;
	}

	public void setPlus(Double plus) {
		this.plus = plus;
	}
		
	public Double getSalario(Double plus){
		return salario+plus;
	}
	

}
