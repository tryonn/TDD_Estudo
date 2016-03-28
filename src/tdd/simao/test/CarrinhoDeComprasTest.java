package tdd.simao.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tdd.simao.model.CarrinhoCompras;
import tdd.simao.model.Item;

public class CarrinhoDeComprasTest {
	
	private CarrinhoCompras carrinho;
	
	@Before
	public void Initialize(){
		carrinho = new CarrinhoCompras();
	}
	
	@Test
	public void deveRetornaZeroSeCarrinhoVazio(){
		Assert.assertEquals(0.0, carrinho.maiorValor(), 0.00001);
	}
	
	@Test
	public void deveRetornarValorDoItemSeCarrinhoCom1Elemento(){
		carrinho.adiciona(new Item("Ventilador", 1, 900.00));
		Assert.assertEquals(900.00, carrinho.maiorValor(), 0.00001);
	}
	
	@Test
	public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos(){
		carrinho.adiciona(new Item("Ventilador", 1, 900.00));
		carrinho.adiciona(new Item("Geladeira", 2, 2000.00));
		carrinho.adiciona(new Item("Mesa de Passar", 3, 50.00));
		
		Assert.assertEquals(4000.00, carrinho.maiorValor(), 0.00001);
	}

}
