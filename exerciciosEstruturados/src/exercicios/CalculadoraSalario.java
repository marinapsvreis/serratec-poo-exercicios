package exercicios;

public class CalculadoraSalario {

	public static void main(String[] args) {
		double salario = 2000.00;
		double salarioDescontado = 0;
		
		if(salario >= 5839.45) {
			salarioDescontado = salario*0.89;
		}else if(salario >= 2919.73){
			salarioDescontado = salario*0.90;
		}else if(salario >= 1751.82){
			salarioDescontado = salario*0.91;
		}else {
			salarioDescontado = salario*0.92;
		}
		
		System.out.printf("Salario descontado INSS: %.2f", salarioDescontado);

	}

}
