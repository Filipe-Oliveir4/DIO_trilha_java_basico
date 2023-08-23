package primeiro_desafios_de_codigo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JurosCompostos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("#.##");      
        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
            
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
        for (int i = 0; i <periodo; i++) {
			valorInicial+=(valorInicial*taxaJuros);
		}
        
        System.out.println("Valor final do investimento: R$ " + df.format(valorInicial));
        scanner.close();
	}

}
