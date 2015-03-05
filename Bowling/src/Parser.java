
public class Parser {

	Lexer input; // from where do we get tokens?
	Token lookahead;
	
	public Parser(Lexer input) {
	this.input = input;
		 // prime lookahead
		}
	public void match(int x) {
		System.out.println("Hello");
		if ( Token.getType() == x ) consume();
		else throw new Error("expecting " +input.getTokenName(x)+
		"; found " + lookahead);
		}
		public void consume() { lookahead = input.nextToken(); }
}
