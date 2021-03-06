import java.util.Map;
import java.util.TreeMap;

public class Variaveis{

	protected Map<String, Integer> mapaVariaveis;


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
	public void arithmeticExpression( String exp ){
		
		String[] separa, splitted;     
		int result=666;
		String var,operador="x";

		var = exp;
		separa = var.split("="); //pega a variavel
		var = separa[0];
		exp = separa[1];

		splitted = exp.split("[+-/*]"); //splita pelos símbolos possíveis

		//considerando que a expressão só pode ter dois operandos
		//você pode aumentar isso
	
		if(mapaVariaveis.containsKey(var)){ //ve se ela existe no map
			//chama função pra calcular
			if(exp.contains("+"))
				operador="+";
			else if(exp.contains("-"))
				operador="-";
			else if(exp.contains("*"))
				operador="*";
			else if(exp.contains("/"))
				operador="/";
			else{
				operador="=";
			}
			
			switch (operador){
				case "+":
					result = calc(splitted,0)+calc(splitted,1);
				break;
				
				case "-":
					result = calc(splitted,0)-calc(splitted,1);
				break;
				
				case "*": 
					result = calc(splitted,0)*calc(splitted,1);
				break;
				
				case "/":
					result = calc(splitted,0)/calc(splitted,1);
				break;

				case "=":
					result = calc(separa,1);
				break;

				//default: throws exception;
			
			}

			mapaVariaveis.put(var, result);
		}else{
			System.out.println("\nVariable not found");
		}

	}

	public Integer calc(String[] splitted, int i){
		int op1=0;

		try{
			op1 = mapaVariaveis.get(splitted[i]);
				
		}catch(NullPointerException b){

		try{
			op1 = Integer.parseInt(splitted[i]);
					
		}catch(NumberFormatException e){
			System.out.println("indefined value of "+splitted[i]);              

			}
		}

	return op1;
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
