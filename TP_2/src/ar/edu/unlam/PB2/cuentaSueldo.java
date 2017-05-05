package ar.edu.unlam.PB2;

public class cuentaSueldo extends Cuenta {
		
	public cuentaSueldo(Integer ID,Double Saldo){
		super();
		this.Saldo=Saldo;
		this.ID=ID;
	}
		
	public void setDeposito(Double Deposito){
		if(Deposito>=0){Saldo=Saldo+Deposito;}
	}
		
	public void setExtraccion (Double Extraccion){
		if(Extraccion>=0.00){
			if(Saldo>=Extraccion){
				Saldo=Saldo-Extraccion;
			}
		}
	}
}
