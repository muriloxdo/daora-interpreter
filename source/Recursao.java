import java.util.Stack;

public class Recursao{

	private Stack<String> pilhaIf;    //pilha pro if
	private Stack<Integer> pilhaWhile;	//pilha pro while
	

	public void newIfStatement( String exp, Variaveis variaveis){
		String [] splitted;
		String operador=";";

		splitted = exp.split("[<>&!]");
		
			if(exp.contains("<"))
				operador="<";
			else if(exp.contains(">"))
				operador=">";
			else if(exp.contains("&"))
				operador="&";
			else if(exp.contains("!"))
				operador="!";

			switch (operador){
				case "<":
					if(comp(splitted,0,variaveis)<comp(splitted,1,variaveis)){
						pilhaIf.push("t");
					}else{
						System.out.println("maior");
					}
				break;
				
				case ">":
					if(comp(splitted,0,variaveis)>comp(splitted,1,variaveis)){
						System.out.println("maior");
					}else{
						System.out.println("menor");
					}
				break;
				
				case "&": 
					if(comp(splitted,0,variaveis)==comp(splitted,1,variaveis)){
						System.out.println("ingual");
					}else{
						System.out.println("num é ingual");
					}
				break;
				
				case "!":
					if(comp(splitted,0,variaveis)!=comp(splitted,1,variaveis)){
						System.out.println("deferente");
					}else{
						System.out.println("num é deferente");
					}
				break;

				//default: throws exception;
			}
//		pilhaIf.push(comp);
	}

	public Integer comp(String[] splitted, int i, Variaveis variaveis){
		int op1=0;

		try{
			op1 = variaveis.mapaVariaveis.get(splitted[i]);
				
		}catch(NullPointerException b){

		try{
			op1 = Integer.parseInt(splitted[i]);
					
		}catch(NumberFormatException e){
			System.out.println("indefined value of"+splitted[i]);              

			}
		}

	return op1;
	}

	public String endIfStatement( ){
		return pilhaIf.pop(); 
	}

	//empilha a linha do código em que ta a condição do while
	public void newWhileStatement( Integer conditionLine, String comp ){
		pilhaWhile.push(conditionLine);
	}

	//desempilha a linha do while
	public Integer endWhileStatement( ){
		return pilhaWhile.pop();
	}

	//linha em que está a condição do ultimo while
	public Integer conditionLine(){
		return pilhaWhile.peek();
	}


}
