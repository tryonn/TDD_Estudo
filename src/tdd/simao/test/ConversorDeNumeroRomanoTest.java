package tdd.simao.test;

import org.junit.Assert;
import org.junit.Test;

import tdd.simao.ConversorDeNumeroRomano;

public class ConversorDeNumeroRomanoTest {
	
	private ConversorDeNumeroRomano conversorDeNumeroRomano = new ConversorDeNumeroRomano();
	
	@Test
	public void deveEntenderOSimboloI(){
		Assert.assertEquals(1, ConverteAUX("I"));
	}
	
	@Test
	public void deveEntenderOSimboloV(){
		Assert.assertEquals(5, ConverteAUX("V"));
	}
	
	@Test
	public void deveEntenderDoisSimbolosComoII(){
		Assert.assertEquals(2,ConverteAUX("II"));
	}
	
	@Test
	public void deveEntenderQuatroSimbolosDoisADoisComoXXII(){
		Assert.assertEquals(22, ConverteAUX("XXII"));
	}
	
	@Test
	public void deveEntenderNumerosComoIX(){
		Assert.assertEquals(9, ConverteAUX("IX"));
	}
	
	
	public int ConverteAUX(String value){
		return conversorDeNumeroRomano.converte(value);
	}
}