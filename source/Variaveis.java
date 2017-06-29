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
			System.out.println("var antes "+var);

			separado = var.split("=");
			var = separado[0];
			System.out.println("var despois "+var);


			if(var.equals("")){
				System.out.println("Deu pau "+var);
				return var;
			}else if(!var.equals("")){
				//if(recebe.)
				separado = linha.split("#");
				recebe = separado[1];
				System.out.println("recebe antes "+recebe);

				separado = recebe.split("=");
				recebe = separado[1];
				System.out.println("recebe depois "+recebe);
					if(!recebe.equals("")){
						System.out.println("Var: "+var);
						System.out.println("\nrecebe "+(int)recebe.charAt(0));
					}else{
						separado = linha.split("#");
						var = separado[1];
						System.out.println("var nada "+var);
					}
				return var;
			}

		}catch(ArrayIndexOutOfBoundsException erro){
			System.out.println("Syntax Error - "+erro);
			var="1";
			return var;
		}
		return var;
	}
}