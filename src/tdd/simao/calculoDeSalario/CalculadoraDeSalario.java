package tdd.simao.calculoDeSalario;

import tdd.simao.calculoDeSalario.model.Funcionario;
import tdd.simao.calculoDeSalario.model.enumM.Cargo;

public class CalculadoraDeSalario {

	public double calcular(Funcionario funcionario) {		
		
		if (funcionario.getCargo().equals(Cargo.DESENVOLVEDOR)){
			return dezOuVintePorCentoDeDesconto(funcionario);
		} else 
			if (funcionario.getCargo().equals(Cargo.DBA) || funcionario.getCargo().equals(Cargo.TESTADOR)){
				return quinzeOuVinteCincoPorCentoDeDesconto(funcionario);
		}
		
		throw new RuntimeException("Funcionario Invalido");
	}

	private double quinzeOuVinteCincoPorCentoDeDesconto(Funcionario funcionario) {
		if (funcionario.getSalario() < 2500.00)
			return funcionario.getSalario() * 0.85;
		return funcionario.getSalario() * 0.75;
	}

	private double dezOuVintePorCentoDeDesconto(Funcionario funcionario) {
		if (funcionario.getSalario() < 3000.00)
			return funcionario.getSalario() * 0.8;
		return funcionario.getSalario() * 0.9;
	}
}
