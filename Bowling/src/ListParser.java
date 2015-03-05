public class ListParser extends Parser
{
public ListParser(Lexer input) { 
	super(input); 
	}
/** list : '[' elements ']' ; // match bracketed list */

public void list() {
	
match(ListLexer.LBRACK); //error at this point.
System.out.println("hi");
elements(); 
match(ListLexer.RBRACK);
}
/** elements : element (',' element)* ; */

void elements() {
element();
while ( Token.getType()==ListLexer.COMMA ) {
match(ListLexer.COMMA); element();
}
}
/** element : name | list ; // element is name or nested list */

void element() {
if ( Token.getType()==ListLexer.NAME ) match(ListLexer.NAME);
else if ( Token.getType()==ListLexer.LBRACK ) list();
else throw new Error("expecting name or list; found " +lookahead);
}
}
