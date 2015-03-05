

public class Token {

	private static int type;
	public String text;
	public Token(int type, String text) {this.setType(type); this.text=text;}
	public String toString() {
	String tname = ListLexer.tokenNames[getType()];
	return "<'" +text+"'," +tname+">" ;
	}
	static int getType() {
		return type;
	}
	public static void setType(int type) {
		Token.type = type;
	}
	}






