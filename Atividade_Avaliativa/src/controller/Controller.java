package controller;

import model.Conta;
import view.View;

public class Controller {
	private Conta conta;
	private View view;

	public Controller(Conta conta, View view) {
		this.conta = conta;
		this.view = view;
	}

	public void sair() {
		boolean saindo = true;

		while (saindo) {
			int escolha = view.menu();

			switch (escolha) {
			case 1:
				view.exibirSaldo(conta.getSaldo());
				break;
			case 2:
				double retirarQuant = view.pedirValor("saque");
				conta.retirar(retirarQuant);
				break;
			case 3:
				double valordoDeposito = view.pedirValor("depósito");
				conta.deposito(valordoDeposito);
				break;
			case 4:
				saindo = false;
				view.exibirMensagem("Sistema encerrado.");
				break;
			default:
				view.exibirMensagem("Opção inválida.");
			}
		}
	}
}
