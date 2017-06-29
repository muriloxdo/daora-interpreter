import java.util.Stack;

public class Recursao{

	private Stack<String> pilhaIf;    //pilha pro if
	private Stack<Integer> pilhaWhile;	//pilha pro while
	

	public void newIfStatement( String comp ){
	//e se o comp é falso?
		pilhaIf.push(comp);
	}

	public String endIfStatement( ){
		return pilhaIf.pop(); 
	}
	
	//empilha a linha do código em que ta a condição do while
	public void newWhileStatement( Integer conditionLine ){
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
