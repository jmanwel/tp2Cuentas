package ar.edu.unlam.PB2;

public class cuentaCorriente extends Cuenta {
	
	private final Double Descubierto=500.00;
	private Double calculocomision=0.00;	
	private Double Deuda=0.00;
	private Double SaldoUnificado=00.00;
	
	public cuentaCorriente (Integer ID, Double Saldo){
		super();
		this.ID=ID;
		this.Saldo=Saldo;
	}
	public void setExtraccion(Double Extraccion){
		if (Extraccion>=0){
			if(Saldo>=Extraccion){
				Saldo=Saldo-Extraccion;
			}else{	SaldoUnificado=Saldo+Descubierto;
			        Deuda=Extraccion-Saldo;
					if(SaldoUnificado>=Extraccion){	
						calculocomision=Deuda*5/100;						
						Saldo=SaldoUnificado-Extraccion-calculocomision;						
				}
			}													
		}
	}
	public void setDepositoCuentaCorriente(Double Deposito){
		if(Deposito>=0){
			if(Saldo==0){
				Saldo=(Saldo+Deposito)-calculocomision;}
			else{Saldo=Saldo+Deposito;}
			}
		}
	
	public Double getCalculoComision(){
	return calculocomision;
		}
	}
