package tdd.simao.calculoDeSalario.test;

import org.junit.Assert;
import org.junit.Test;

import tdd.simao.calculoDeSalario.CalculadoraDeSalario;
import tdd.simao.calculoDeSalario.model.Funcionario;
import tdd.simao.calculoDeSalario.model.enumM.Cargo;

public class CalculadoraDeSalarioTest {
	
	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite(){
		
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario funcionario = new Funcionario("Joao", 1500.0, Cargo.DESENVOLVEDOR);
		
		double salario = calculadora.calcular(funcionario);
		
		Assert.assertEquals(1500.0 * 0.9, salario, 0.00001);
	}
	
	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite(){
		CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();
		Funcionario funcionario = new Funcionario("Silva", 4000.0, Cargo.DESENVOLVEDOR);
		
		double salario = calculadoraDeSalario.calcular(funcionario);
		
		Assert.assertEquals(4000.0 * 0.8, salario, 0.00001);
	}
	
	@Test
	public void deveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite(){
		CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();
		Funcionario funcionario = new Funcionario("Luiz", 500.0, Cargo.DBA);
		
		double salario = calculadoraDeSalario.calcular(funcionario);
		Assert.assertEquals(500 * 0.85, salario, 0.00001);
	}

}
