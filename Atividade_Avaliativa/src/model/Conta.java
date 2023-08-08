package model;

public class Conta {
	private double saldo;

	public Conta(double saldoInicial) {
		this.saldo = saldoInicial;
	}

	public double getSaldo() {
		return saldo;
	}

	public void retirar(double quant) {
		if (quant > 0 && quant <= saldo) {
			saldo -= quant;
		} else {
			System.out.println("Saldo insuficiente ou valor inválido.");
		}
	}

	public void deposito(double quant) {
		if (quant > 0) {
			saldo += quant;
		} else {
			System.out.println("Valor inválido para depósito.");
		}
	}
}
