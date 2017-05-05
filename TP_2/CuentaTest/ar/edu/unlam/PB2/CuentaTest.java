package ar.edu.unlam.PB2;

import org.junit.Assert;
import org.junit.Test;

public class CuentaTest {
	@Test
	public void cuentaSueldoTest(){
		cuentaSueldo csueldo1 = new cuentaSueldo(1000, 200.00);
		csueldo1.setDeposito(100.00);
		csueldo1.setExtraccion(200.00);		
		Double saldoObtenido = csueldo1.getSaldo();
		Double SaldoEsperado = 100.00;
		Assert.assertEquals(SaldoEsperado,saldoObtenido);
	}
	@Test
	public void cajaAhorroTest(){
		cajaAhorro cahorro1 = new cajaAhorro (1001, 1000.00);
		cahorro1.setDeposito(50.00);
		cahorro1.setExtraccion(100.00);
		cahorro1.setExtraccion(100.00);
		cahorro1.setExtraccion(100.00);
		cahorro1.setExtraccion(100.00);
		cahorro1.setExtraccion(100.00);
		cahorro1.setExtraccion(100.00);
		cahorro1.setExtraccion(100.00);
		Double saldoObtenido = cahorro1.getSaldo();
		Double SaldoEsperado = 332.00;
		Assert.assertEquals(SaldoEsperado,saldoObtenido);
	}
	@Test
	public void cuentaCorrienteTest(){
		cuentaCorriente CC = new cuentaCorriente (1002, 1000.00);
		CC.setDepositoCuentaCorriente(200.00);
		CC.setExtraccion(1200.00);
		System.out.println(CC.getSaldo());
		System.out.println(CC.getCalculoComision());
	}
		
		
	

}
