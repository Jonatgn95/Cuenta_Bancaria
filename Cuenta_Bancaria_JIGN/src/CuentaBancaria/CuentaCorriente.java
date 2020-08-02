package CuentaBancaria;

public class CuentaCorriente extends CuentaBancaria {
	double a=0;
	public void deposito(double dinero) {
		
		if (dinero <= 1000) {
			a= (dinero *1)/100;
			saldo = dinero+a;
			
		}else {
			saldo += dinero;
		}
		
		
	}
	
}
