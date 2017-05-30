package ar.edu.unlam.PB2;

public class ServicioImpuesto {
	
	public Double impuesto;
	
	public Double obtenerImpuesto(Double salario){
		
		if (salario<3000){impuesto=0.00;}
		if (salario<6000){impuesto=(salario*5/100);}
		if (salario<1000){impuesto=(salario*8/100);}
		if (salario<1500){impuesto=(salario*9/100);}
		
		return salario-impuesto;
				
	}

	public Double getImpuesto() {
		return impuesto;
	}

	

}
