package tdd.simao;

import tdd.simao.model.CarrinhCompras;
import tdd.simao.model.Produto;

public class MaiorEMenor {
	
	private Produto menor;
	private Produto maior;
	
	public void encontra(CarrinhCompras carrinho){
		
		for (Produto p : carrinho.getProdutos()) {
			
			if(menor == null || p.getValor() < menor.getValor()){
				menor = p;
			}
			
			if (maior == null || p.getValor() > maior.getValor()){
					maior = p;
				}
			}
	}
	
	public Produto getMaior(){
		return maior;
	}
	
	public Produto getMenor(){
		return menor;
	}

}
