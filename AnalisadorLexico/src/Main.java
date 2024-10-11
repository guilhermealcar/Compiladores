
public class Main {

	public static void main(String[] args) {
		LeitorArquivo ldat = new LeitorArquivo(args[0]);
		int c;
		
		while((c=ldat.lerProxCaracter()) != -1) {
			System.out.print((char)c);
		}
		
		System.out.println("Tipo token <PROG, " + TipoToken.PCProg + ">");
		
		System.out.println("\n\nOBJETIVO: Abrir um arquivo.fonte e percorrer os lexemas paa tokenizá-los");
	}

}
