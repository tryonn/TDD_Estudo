package tdd.simao.test;

import org.junit.Assert;
import org.junit.Test;

import tdd.simao.ConversorDeNumeroRomano;

public class ConversorDeNumeroRomanoTest {
	
	@Test
	public void deveEntenderOSimboloI(){
		ConversorDeNumeroRomano conversorDeNumeroRomano = new ConversorDeNumeroRomano();
		
		int numero = conversorDeNumeroRomano.converte("I");
		Assert.assertEquals(1, numero);
	}
	
	
	@Test
	public void deveEntenderOSimboloV(){
		ConversorDeNumeroRomano conversorDeNumeroRomano = new ConversorDeNumeroRomano();
		int cinco = conversorDeNumeroRomano.converte("V");
		Assert.assertEquals(5, cinco);
	}
	
	@Test
	public void deveEntenderDoisSimbolosComoII(){
		ConversorDeNumeroRomano conversorDeNumeroRomano = new ConversorDeNumeroRomano();
		
		int numero = conversorDeNumeroRomano.converte("II");
		
		Assert.assertEquals(2,numero);
	}
}
