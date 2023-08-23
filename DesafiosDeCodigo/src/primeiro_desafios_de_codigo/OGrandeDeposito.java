package primeiro_desafios_de_codigo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OGrandeDeposito {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##"); 
		double valor=scanner.nextDouble();
		if (valor > 0) {
			System.out.printf("Deposito realizado com sucesso!\r\n"
					+ "Saldo atual: R$ %.2f\n",valor);
		} else if(valor<0){
			System.out.println("Valor invalido! Digite um valor maior que zero.");
		}else {
			System.out.println("Encerrando o programa...");
		}    
	}
}
