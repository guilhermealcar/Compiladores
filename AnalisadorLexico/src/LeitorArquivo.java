import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class LeitorArquivo {
	public InputStream is;
	
	public LeitorArquivo(String arquivo) {
		try {
			is = new FileInputStream(arquivo);			
		} catch (FileNotFoundException e ) {
			e.printStackTrace();
		}
	}
	
	public int lerProxCaracter() {
		int caractere = -1;
		
		try {
			caractere = is.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return caractere;
	}
	
	public InputStream getIs() {
		return is;
	}

	public void setIs(InputStream is) {
		this.is = is;
	}

	
	
}
