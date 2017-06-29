import java.util.Stack;

public Class Recursao{

	private Stack pilhaIf<String>;
	private Stack pilhaWhile<Integer>;
	

	public void newIfStatement( String comp ){
	//e se o comp é falso?
		pilhaIf.push(comp);
	}

	public String endIfStatement( ){
		pilhaIf.pop(); 
	}
	
	//empilha a linha do código em que ta a condição do while
	public void newWhileStatement( Integer conditionLine ){
		pilhaWhile.push(conditionLine)
	}

	//desempilha a linha do while
	public Integer endWhileStatement( ){
		return pilhaWhile.pop();
	}

	public Integer conditionLine(){
		return pilhaWhile.peek();
	}


}
