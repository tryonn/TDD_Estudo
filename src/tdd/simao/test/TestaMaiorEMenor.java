package tdd.simao.test;

import org.junit.Assert;
import org.junit.Test;

import tdd.simao.MaiorEMenor;
import tdd.simao.model.CarrinhoCompras;
import tdd.simao.model.Produto;
	
public class TestaMaiorEMenor {
	
	@Test
	public void ordemDescrescente() {
		CarrinhoCompras carrinhCompras = new CarrinhoCompras();
		
//		carrinhCompras.adiciona(new Produto("Geladeira",450.00));
//		carrinhCompras.adiciona(new Produto("Liquidificador", 250.00));
//		carrinhCompras.adiciona(new Produto("Jogo de pratos", 70.00));
		
		MaiorEMenor maiorEMenor = new MaiorEMenor();
		maiorEMenor.encontra(carrinhCompras);
		
		//Assert.assertEquals("Jogo de pratos", maiorEMenor.getMenor().getNome());
		
		//Assert.assertEquals("Geladeira", maiorEMenor.getMaior().getNome());
	}
	
	
	@Test
	public void apenasUmProduto(){
		CarrinhoCompras carrinhCompra = new CarrinhoCompras();
//		carrinhCompra.adiciona(new Produto("Ventilador", 120.00));
		
		MaiorEMenor maiorEMenor = new MaiorEMenor();
		maiorEMenor.encontra(carrinhCompra);
		
		//Assert.assertEquals("Ventilador", maiorEMenor.getMenor().getNome());
		//Assert.assertEquals("Ventilador", maiorEMenor.getMaior().getNome());
	}

}
