package tdd.simao;

import java.util.HashMap;
import java.util.Map;

import org.omg.CORBA.portable.ValueBase;

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
		int ultimoVizinhoDaDireita = 0;
		
		for (int i = valor.length() - 1;  i>= 0; i--) {
			// pega o inteiro referente ao simbolo atual
			int atual = tabela.get(valor.charAt(i));
			
			// se a da direita for menor, o multiplicaremos
			// por -1 para torná-lo negativo
			int multiplicador = 1;
			
			if (atual < ultimoVizinhoDaDireita) multiplicador = -1;
			
			acumulador += atual* multiplicador;
			
			// atualiza o vizinho da direita
			ultimoVizinhoDaDireita = atual;
		}
		
//		for (int i = 0; i <valor.length(); i++) {
//			acumulador += tabela.get(valor.charAt(i)); 
//		}
		
		return acumulador;
	}
}
