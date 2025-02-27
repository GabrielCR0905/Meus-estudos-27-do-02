package estudosarray3;

class Produto {
	String nome;
	double preco;
	int qtdEstoque;
	

	
	public Produto(String nome, double preco, int qtdEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
		
	}
	public void vender(int quantidade) {
		if(quantidade  > qtdEstoque) {
			System.out.print("Estoque Insuficiente.");
		}else {
			qtdEstoque -= quantidade;
			System.out.print("Venda Realizada com Sucesso..." + qtdEstoque);
		}
	}
	
	public void reabastecer(int quantidade) {
		qtdEstoque += quantidade;
		System.out.print("Estoque Reabastecido com sucesso... agora tem..." +qtdEstoque);
	}
	
	public void exibirInformacoes() {
		System.out.print("Produto: " + nome + " do preço" + preco + " tem no estoque:.." + qtdEstoque);
	}
}
