import java.util.Stack;

public Class Recursao{

	private Stack pilhaIf<String>;
	private Stack pilhaWhile<String>;
	

	public newIfStatement( String comp ){
	//e se o comp é falso?
		pilhaIf.push(comp);
	}

	public endIfStatement( ){
		pilhaIf.pop(); 
	}

	public newWhileStatement( String comp ){
		pilhaWhile.push(comp)
	}

	public endWhileStatement( ){
		pilhaWhile.pop();
	}


}
