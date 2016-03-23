package tdd.simao.model;

import java.util.ArrayList;
import java.util.List;

public class CarrinhCompras {
	
	private Produto produto;
	private List<Produto> produtos = new ArrayList<Produto>();

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void adiciona(Produto produto2) {
		Produto produto = new Produto();
		produto.setNome(produto2.getNome());
		produto.setValor(produto2.getValor());
		
		produtos.add(produto);
	}
	
	

}
