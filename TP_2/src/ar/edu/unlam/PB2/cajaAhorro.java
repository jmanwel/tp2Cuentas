package ar.edu.unlam.PB2;

public class cajaAhorro extends Cuenta{

	private Double cuentaExtracciones=0.00;
	private final Double multaPorExtraccion=6.00;
	
	public cajaAhorro(Integer ID,Double Saldo){
		super();
		this.Saldo=Saldo;
		this.ID=ID;
	}
	
	
	public void setDeposito(Double Deposito){
		if(Deposito>=0){Saldo=Saldo+Deposito;}
	}
	
	public void setExtraccion(Double Extraccion){
		if(Extraccion>0){
			if(Saldo>=Extraccion){
				Saldo=Saldo-Extraccion;
				cuentaExtracciones++;
				if(cuentaExtracciones>=5){Saldo=Saldo-multaPorExtraccion;}
			}
		}
	}	
}
