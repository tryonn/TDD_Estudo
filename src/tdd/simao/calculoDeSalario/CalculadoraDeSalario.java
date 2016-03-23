package tdd.simao.calculoDeSalario;

import tdd.simao.calculoDeSalario.model.Funcionario;
import tdd.simao.calculoDeSalario.model.enumM.Cargo;

public class CalculadoraDeSalario {

	public double calcular(Funcionario funcionario) {
		
		if (funcionario.getCargo().equals(Cargo.DESENVOLVEDOR)){
			if (funcionario.getSalario() > 3000.0)
				return 3200.0;
			
			return 1350.0;
			
		}
		return 425.0;
	}

}
