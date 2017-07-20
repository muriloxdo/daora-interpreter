import java.util.Map;
import java.util.TreeMap;

public class Codigo{
	private Map<String, Integer> mapaLinhas = new TreeMap<String, Integer>(); //armazena todas as linhas (??)
    private Recursao pilhaRecursao = new Recursao();   //armazena a pilha de recursao
    private Variaveis variaveis = new Variaveis();
    //variavel nLinhas
    //string de saida

	public void compara(String linha, int nLinhas){ 
		String token,restoToken;

		mapaLinhas.put(linha, nLinhas);
		token = linha.substring(0,1);

		switch(token){
			//cria variavel
			case "#":
				if(token.equals("#")){
					variaveis.criaVar(linha);
				}
			break;
        
            //while
			case "w":
				restoToken = linha.substring(1,5);
				if(restoToken.equals("hile")){
					System.out.println("while ");
				}
                //se a condição do while for verdadeira
                //empilha a linha no while
                pilhaRecursao.newWhileStatement(nLinhas,condition(linha, "while"));

                // e se se a condição do while não for verdadeira?    
			break;
            
            //endWhile
			case "i":
				restoToken = linha.substring(1,2);
				if(restoToken.equals("f")){
	                /*isso aqui tem que virar codigo*/
	                /*Integer lineCondition = */ pilhaRecursao.newIfStatement(condition(linha, "if"),variaveis);
				}

            
                //se a condição da linha for verdadeira

	        break;

			case "o":
            break;

			default: /*ve se é uma variavel*/

				variaveis.arithmeticExpression(linha);
			break;
		}

		/*if(linha.contains("=")){
//			var = atribuicao(linha);
		}*/
	}

	public String condition(String linha, String token){
		String[] exp;
		String splitted;

		exp = linha.split(token); //splita pelos token possíveis

		splitted = exp[1];

		return splitted;
	}
	
}
