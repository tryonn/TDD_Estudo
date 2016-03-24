package tdd.simao;

import tdd.simao.model.CarrinhoCompras;
import tdd.simao.model.Produto;

public class MaiorEMenor {
	
	private Produto menor;
	private Produto maior;
	
	public double encontra(CarrinhoCompras carrinho){
		
		if (carrinho.getItens().isEmpty()) return 0.0;
		double maiorValor = carrinho.getItens().get(0).getValorTotal();
		
		for (int i = 0; i < carrinho.getItens().size(); i++) {
			
			if (maiorValor < carrinho.getItens().get(i).getValorTotal()){
				maiorValor = carrinho.getItens().get(i).getValorTotal();
			}
			
		}
		return maiorValor;
	}
	
	public Produto getMaior(){
		return maior;
	}
	
	public Produto getMenor(){
		return menor;
	}

}
