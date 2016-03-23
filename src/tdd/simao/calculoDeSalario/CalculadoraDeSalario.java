package tdd.simao.calculoDeSalario;

import tdd.simao.calculoDeSalario.model.Funcionario;
import tdd.simao.calculoDeSalario.model.enumM.Cargo;

public class CalculadoraDeSalario {

	public double calcular(Funcionario funcionario) {		
		
		if (funcionario.getSalario() > 3000.0)
			return funcionario.getSalario() * 0.8;
		return funcionario.getSalario() * 0.9;
	}

}
