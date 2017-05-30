package ar.edu.unlam.PB2;

import java.util.Date;

public class Empleado  {
	
	protected String nombre;
	protected Double salario;
	protected Integer dianacimiento;
	protected Integer mesnacimiento;
	protected Integer aņonacimiento;
	protected Double salarioNeto;
	
	public Empleado(String nombre, Double salario, Integer dianacimiento,Integer mesnacimiento,Integer aņonacimiento){
		
		this.nombre=nombre;
		this.salario=salario;
		this.dianacimiento=dianacimiento;
		this.dianacimiento=mesnacimiento;
		this.dianacimiento=aņonacimiento;
	}
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	

	public String brindarDetalles(){
		
		return ("Nombre del empleado: "+nombre+" su salario es: "+salario+" y su cumpleaņos es en: "+dianacimiento+"/"+mesnacimiento+"/"+aņonacimiento);
		
	}

}
