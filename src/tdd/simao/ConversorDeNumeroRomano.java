package tdd.simao;

import java.util.HashMap;
import java.util.Map;

public class ConversorDeNumeroRomano {
	
	private static Map<Character, Integer> tabela = new HashMap<Character, Integer>(){{
		put('I', 1);
		put('V', 5);
		put('X', 10);
		put('L', 50);
		put('C', 100);
		put('D', 500);
		put('M', 1000);
	}};
	
	
	
	
	public int converte(String valor){
		int acumulador = 0;
		for (int i = 0; i <valor.length(); i++) {
			acumulador += tabela.get(valor.charAt(i)); 
		}
		return acumulador;
	}
}
