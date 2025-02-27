package estudos2;

 class Animal {
	 String raca;
	 int qtd;
	 String cor;
	 

	 public Animal(String raca, int qtd, String cor) {
		 this.raca= raca;
		 this.qtd = qtd;
		 this.cor = cor;
		 
	 }
	 
	 public void exibir() {
		 System.out.print("O animal da "+ raca + " tem" + qtd + "na praça e eles tem a cor" + cor );
	 }
}
