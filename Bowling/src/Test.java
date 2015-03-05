
public class Test {

	public static void main(String args[]) throws Exception
	{
		
		// TODO Auto-generated method stub
		ListLexer lexer = new ListLexer(args[0]); 
		
		ListParser parser = new ListParser(lexer);
		
		parser.list();
		

	}

}
