import java.util.Map;
import java.util.TreeMap;

public class Codigo{
	private Map<String, Integer> mapaLinhas = new TreeMap<String, Integer>(); //armazena todas as linhas (??)
    private Recursao pilhaRecursao = new pilhaRecursao();   //armazena a pilha de recursao


	public String compara(String linha, int nLinhas){
		String var="a",token,restoToken;
		Variaveis variaveis = new Variaveis();

		mapaLinhas.put(linha, nLinhas);
		token = linha.substring(0,1);

		System.out.println("substring: "+token);

		switch(token){
			//cria variavel
			case "#":
				if(token.equals("#")){
					var = variaveis.criaVar(linha);
					return var;
				}
			break;
        
            //while
			case "w":
				restoToken = linha.substring(1,5);
				if(restoToken.equals("hile")){
					System.out.println("while ");
					return var;
				}
			break;
            
            //endWhile
			case "i"://ainda falta reconhecer o comando
                     //assumi que tava feito rs
                     
                    /*isso aqui tem que virar codigo*/

                    //se a condição do while for verdadeira
                    //empilha a linha no while
                    pilhaRecursao.newWhileStatement(nLinhas);

                    // e se se a condição do while não for verdadeira?                                           
                        
			break;

			case "o":

			case default: /*ve se é uma variavel*/

			break;
		}

		/*if(linha.contains("=")){
//			var = atribuicao(linha);
		}*/
		var = "a";
		return var;
	}
	
}
