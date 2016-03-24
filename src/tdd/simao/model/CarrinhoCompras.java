package tdd.simao.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarrinhoCompras {
	
	private List<Item> items;
	private double valor;
	
	private Produto produto;
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public CarrinhoCompras() {
		this.items = new ArrayList<Item>();
		this.valor = 0;
	}
	
	public void adiciona(Item item) {
		this.items.add(item);
	}
	
	public List<Item> getItens(){
		return Collections.unmodifiableList(items);
	}
	
	public double maiorValor(){
		if (items.isEmpty()) return valor;
		
		valor = items.get(0).getValorTotal();
		
		for (int i = 0; i < items.size(); i++) {
			if (valor < items.get(i).getValorTotal())
				valor = items.get(i).getValorTotal();
		}
		
		return valor;
	}
	
	

}
