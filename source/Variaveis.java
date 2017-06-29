import java.util.Map;
import java.util.TreeMap;

public class Variaveis{
	Map<String, Integer> mapaVariaveis = new TreeMap<String, Integer>();


	/*
	public void buscaValores(String linha)
    -- descobre se é uma criação
        se for uma criação: criaVar
    -- descobre se é uma atualização
        se for uma atualização: var
    -- senão catch exceção
	*/

    /*
    public atualiza(nome var, valor)
    */

	public String criaVar(String linha){
		String recebe,var,separado [];
		try{
			separado = linha.split("#");
			var = separado[1];
			separado = var.split("=");
			var = separado[0];

			separado = linha.split("#");
			recebe = separado[1];
			separado = recebe.split("=");
			recebe = separado[1];
			
			if(!var.equals("")){
				
				System.out.println("var "+var);
				System.out.println("\nrecebe "+(int)recebe.charAt(0));

				return var;

			}else{
				separado = linha.split("#");
				var = separado[1];
				System.out.println("var "+var);
				
				return var;
			}
		}catch(ArrayIndexOutOfBoundsException erro){
			System.out.println("Syntax Error - "+erro);
			var="1";
			return var;
		}
	}




}
