package primeiro_desafios_de_codigo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList < String > ativos = new ArrayList < > ();
    String auxiliar;
    //Entrada dos tipos de ativos
    int quantidadeAtivos = scanner.nextInt();
    auxiliar=scanner.nextLine();
    // Entrada dos códigos dos ativos
    for (int i = 0; i < quantidadeAtivos; i++) {
      String codigoAtivo = scanner.nextLine();
      ativos.add(codigoAtivo);
    }
    
    for (int i = 0; i < ativos.size()-1; i++) {
		for (int j = i+1; j < ativos.size(); j++) {
			if(ativos.get(i).charAt(0)>ativos.get(j).charAt(0)) {
				auxiliar=ativos.get(i);
				ativos.set(i,ativos.get(j));
				ativos.set(j, auxiliar);
			}
		}
	}
    
    
    //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
    for (int i = 0; i < ativos.size(); i++) {
		System.out.println(ativos.get(i));
	}
  }
}

