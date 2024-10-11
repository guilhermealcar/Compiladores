
public class Main {

	public static void main(String[] args) {
		Lexico lex = new Lexico(args[0]);
		Token t = lex.proximoToken();
		
		while(t != null) {
			System.out.println(t.toString());
			t = lex.proximoToken();
		}
		
		System.out.println("\n\nOBJETIVO: Abrir um arquivo.fonte e percorrer os lexemas paa tokenizá-los");
	}

}
