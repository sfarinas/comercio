package comercio.entities;

public class Product {
	public String nome;
	public double preco;
	public int qtd;
	
	public double totalEstoque() {
		return preco * qtd;
	}
	
	public void addEstoque(int qtd) {
		this.qtd += qtd;
	}
	
	public void removEstoque(int qtd) {
		this.qtd -= qtd;
	}
	
	public String toString() {
		return nome
			+ ", $ "
			+ String.format("%.2f", preco)
			+ ", "
			+ qtd
			+ " units, total: $ "
			+ String.format("%.2f", totalEstoque());
	}

}
