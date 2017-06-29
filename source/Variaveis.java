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

	public void criaVar(String linha){
		String recebe,var,separado [];
		try{
			separado = linha.split("#");
			var = separado[1];
			separado = var.split("=");
			var = separado[0];

			if(var.equals("")){
				System.out.println("Deu pau ");
			}else if(!var.equals("")){
				if(linha.contains("=")){
					separado = linha.split("#");
					recebe = separado[1];
					separado = recebe.split("=");
					recebe = separado[1];

					if(!recebe.equals("")){
						stringToInt(var,recebe);
					}else{
						System.out.println("DEU PAU "+recebe);
					}
				}else{
						System.out.println("var nada "+var);
						mapaVariaveis.put(var,0);
					}
			}

		}catch(ArrayIndexOutOfBoundsException erro){
			System.out.println("Syntax Error - "+erro);
		}
	}

	public void stringToInt(String var, String valor){
		try {
			int i = Integer.parseInt(valor);
			
			mapaVariaveis.put(var,i);
		} catch (NumberFormatException e) {
			System.out.println("Numero com formato errado!");

		}
	}
}