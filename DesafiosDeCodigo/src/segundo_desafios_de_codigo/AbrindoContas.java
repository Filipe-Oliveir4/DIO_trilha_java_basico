package segundo_desafios_de_codigo;

import java.util.Scanner;

public class AbrindoContas {
	public static void main(String[] args) {
	    // Lendo os dados de Entrada:
	    Scanner scanner = new Scanner(System.in);
	    int numeroConta = scanner.nextInt();
	    scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
	    String nomeTitular = scanner.nextLine();
	    double saldo = scanner.nextDouble();

	    ContaBancaria1 conta = new ContaBancaria1(numeroConta, nomeTitular, saldo);

	    System.out.println("Informacoes:");
	    System.out.println(conta.toString());
	    scanner.close();
	  }
	}

	class ContaBancaria {
	  int numero;
	  String titular;
	  double saldo;

	  public ContaBancaria(int numero, String titular, double saldo) {
	    this.numero = numero;
	    this.titular = titular;
	    this.saldo = saldo;
	  }

	@Override
		public String toString() {
			
			return "Conta: "+ numero + "\nTitular: " + titular + "\nSaldo R$: " + saldo+"\n"  ; 
		}  
	}

