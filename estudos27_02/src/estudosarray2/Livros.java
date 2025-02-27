package estudosarray2;

class Livros {
	String titulo;
	String autor;
	int qtddepaginas;
	
	
	public Livros(String titulo, String autor, int qtddepaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.qtddepaginas = qtddepaginas;
	}

	public void exibirinformacoes() {
		System.out.print("Livro: "+ titulo + "| Autor: "+ autor +" | Paginas: "+ qtddepaginas);
	}
	
	public int calculartempoleitura(int paginasPorHora) {
		return qtddepaginas / paginasPorHora;
		
	}
}
