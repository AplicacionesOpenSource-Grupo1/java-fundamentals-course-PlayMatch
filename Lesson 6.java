import java.util.Scanner;

class CuentaBancaria{
	public double saldo;
	
	CuentaBancaria(double saldo){
		this.saldo = saldo;
	}
	
	public void setSaldo(double nuevoSaldo){
		if (nuevoSaldo >= 0) {
			saldo = nuevoSaldo;
		} else {
			System.out.print("El saldo no puede ser negativo");
		}
	}
}

CuentaBancaria e1 = new CuentaBancaria(19000);

System.out.print(e1.getSaldo());

