import java.util.Scanner;

public class Interpretador{

	public void run(){
		String linha="a",var;
		int nLinhas=0;
		Scanner scanner = new Scanner(System.in);
		Codigo codigo = new Codigo();
		
		while(linha!=""){
			nLinhas++;
			linha = scanner.nextLine();
			linha = linha.replaceAll(" ", "");
			var = codigo.compara(linha,nLinhas);
		}

	}
}