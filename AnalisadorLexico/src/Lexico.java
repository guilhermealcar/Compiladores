
public class Lexico {
	LeitorArquivo ldat;
	
	public Lexico(String arquivo) {
		this.ldat = new LeitorArquivo(arquivo);
	}
	
	public Token proximoToken() {
		int c;
		char ch;
		
		while((c=ldat.lerProxCaracter()) != -1) {
			ch = (char)c;
			switch(ch) {
				case '+': return(new Token("+", TipoToken.OpAritSoma, 1));
				case '-': return(new Token("-", TipoToken.OpAritSoma, 1));
			}
		}
		
		return null;
	}
}
