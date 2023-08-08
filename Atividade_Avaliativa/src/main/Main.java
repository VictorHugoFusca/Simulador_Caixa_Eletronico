package main;

import controller.Controller;
import model.Conta;
import view.View;

public class Main {
	public static void main(String[] args) {
		double saldoInicial = 1000.0;
		Conta conta = new Conta(saldoInicial);
		View view = new View();
		Controller controller = new Controller(conta, view);
		controller.sair();
	}
}
