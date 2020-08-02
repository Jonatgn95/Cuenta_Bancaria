package CuentaBancaria;

import java.util.Scanner;

public class main {
	
	

	public static void main(String[] args) {
		CuentaCorriente ctaC = new CuentaCorriente();
		CuentaAhorro ctaAho= new CuentaAhorro();
		
		boolean salir=false;
		while (!salir) {
			System.out.println("\nMenu Principal");
			System.out.println("----------------------");
			System.out.println("1. Depositar Cta Corriente");
			System.out.println("2. Depositar Cta Ahorro");
			System.out.println("3. Retirar Cta Corriente");
			System.out.println("4. Retirar Cta Ahorro");
			System.out.println("5. Consultar Saldo");
			System.out.println("Digite Opcion: ");
			Scanner entrada = new Scanner(System.in);
			int opcion = entrada.nextInt();
			
			Scanner in = new Scanner(System.in);
		
			switch (opcion) {
			case 1:
				
				System.out.println("Cantidad de deposito cta Corriente: ");
				double dinero = in.nextDouble();
				ctaC.deposito(dinero);
				break;
			
			case 2:
				
				System.out.println("Cantidad de deposito cta Ahorro: ");
				dinero = in.nextDouble();
				ctaAho.deposito(dinero);
				break;
			
			case 3: 
				System.out.println("Cantidad de retiro cta Corriente: ");
				dinero = in.nextDouble();
				ctaC.retiro(dinero);
				break;
				
			
			case 4:
				System.out.println("Cantidad de retiro cta Ahorro: ");
				dinero = in.nextDouble();
				ctaAho.retiro(dinero);
				break;
				
			
			case 5:
				System.out.println("Saldo cta Corrinete: "+ ctaC.getSaldo());
				System.out.println("Saldo cta Ahorro: "+ ctaAho.getSaldo());
				break;
				
			default:
				System.out.println("Las opciones son entre 1 y 5");
			
			}
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
