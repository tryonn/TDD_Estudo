package tdd.simao.test;

import org.junit.Assert;
import org.junit.Test;

import tdd.simao.ConversorDeNumeroRomano;

public class ConversorDeNumeroRomanoTest {
	
	
	private ConversorDeNumeroRomano conversorDeNumeroRomano = new ConversorDeNumeroRomano();
	
	@Test
	public void deveEntenderOSimboloI(){
		int numero = conversorDeNumeroRomano.converte("I");
		Assert.assertEquals(1, numero);
	}
	
	@Test
	public void deveEntenderOSimboloV(){
		int cinco = conversorDeNumeroRomano.converte("V");
		Assert.assertEquals(5, cinco);
	}
	
	@Test
	public void deveEntenderDoisSimbolosComoII(){
		int numero = conversorDeNumeroRomano.converte("II");
		Assert.assertEquals(2,numero);
	}
	
	@Test
	public void deveEntenderQuatroSimbolosDoisADoisComoXXII(){
		int numero = conversorDeNumeroRomano.converte("XXII");
		Assert.assertEquals(22, numero);
	}
	
	@Test
	public void deveEntenderNumerosComoIX(){
		int numero = conversorDeNumeroRomano.converte("IX");
		Assert.assertEquals(9, numero);
	}
}