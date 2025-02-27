package estudosarray2;

public class Main {

	public static void main(String[] args) {
		Livros meuLivro = new Livros("Receitas", "O Globo",200);
			
		meuLivro.exibirinformacoes();
		
		int tempo = meuLivro.calculartempoleitura(20);
		System.out.print("| Tempo Estimado de Leitura"+ tempo + "horas");

	}

}
