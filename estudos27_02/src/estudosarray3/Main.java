package estudosarray3;

public class Main {

	public static void main(String[] args) {
		Produto celular = new Produto("Samsung Galaxy",1599.60,10);
			
		celular.exibirInformacoes();
		celular.vender(3);
		celular.reabastecer(5);

	}

}
