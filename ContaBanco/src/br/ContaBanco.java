package br;

import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {
		//Abertura do Scanner
		Scanner ent = new Scanner(System.in);
		//Declaração de variáveis
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		//Input de dados
		System.out.println("Por favor, digite o numero da agencia");
		agencia=ent.nextLine();
		System.out.println("Informe o nome do cliente");
		nomeCliente=ent.nextLine();
		System.out.println("Informe o numero da conta");
		numero=ent.nextInt();
		System.out.println("Informe o saldo");
		saldo=ent.nextDouble();
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

		ent.close();
	}

}
