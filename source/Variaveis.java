import java.util.Map;
import java.util.TreeMap;

public class Variaveis{

	private Map<String, Integer> mapaVariaveis;


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

    public Variaveis(){
        mapaVariaveis = new TreeMap<String, Integer>();
    }
    
    //recebe uma string com a expressão aritmética que deve ser resolvida. Ex: "a * b", "1 + b", "2 / 6".
    public Integer arithmeticExpression( String exp ){
        
        String[] separa, splitted;     
        int op1, op2;
        String var;

        var = exp;
		separa = var.split("="); //pega a variavel
		var = separa[0];
		exp = separa[1];
		System.out.println(exp);

		splitted = exp.split("[+-/*]"); //splita pelos símbolos possíveis

        System.out.println(splitted);
				
        //considerando que a expressão só pode ter dois operandos
        //você pode aumentar isso
	
         //	System.out.println("var="+var);
        //	System.out.println(mapaVariaveis.keySet());
	    //	System.out.println("Key: " + mapaVariaveis.get(var) + ". Value: " + mapaVariaveis.get(var));

 		if(mapaVariaveis.containsKey(var)){ //ve se ela existe no map
        //pega o valor do primeiro operando
	        try{
	            op1 = mapaVariaveis.get(splitted[0]);

	        }catch(NullPointerException b){

	            try{
	                Integer.parseInt(splitted[0]);

	            }catch(NumberFormatException e){
	                System.out.println("indefined value of"+splitted[0]);              
	            }
	        }

	        try{
	            op2 = mapaVariaveis.get(splitted[1]);

	        }catch(NullPointerException b){

	            try{
	                Integer.parseInt(splitted[1]);

	            }catch(NumberFormatException e){
	                System.out.println("indefined value of"+splitted[1]);              
	            }
	        }

        //falta fazer a mesma coisa para o operador 2 (op2)
	    }
        //calcular o resultado da operação

        int result = 0;

        /*switch (operador){
            case '+': result = op1 + op2; break;
            case '-': result = op1 - op2; break;
            case '*': result = op1 * op2; break;
            case '/': result = op1 / op2; break;
            default: throws exception;
        
        }*/

        //retorna o resultado
        return result;

    }


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
			System.out.println("Number with incorrect format! "+e);

		}
	}
}
