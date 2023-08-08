package view;

import java.util.Scanner;

public class View {
	private Scanner scanner = new Scanner(System.in);

	public int menu() {
		System.out.println("Escolha uma opção:");
		System.out.println("1. Consultar Saldo");
		System.out.println("2. Sacar");
		System.out.println("3. Depositar");
		System.out.println("4. Sair");
		return scanner.nextInt();
	}

	public double pedirValor(String acao) {
		System.out.print("Digite o valor para " + acao + ": ");
		return scanner.nextDouble();
	}

	public void exibirSaldo(double saldo) {
		System.out.println("Saldo atual: " + saldo);
	}

	public void exibirMensagem(String mensagem) {
		System.out.println(mensagem);
	}
}
