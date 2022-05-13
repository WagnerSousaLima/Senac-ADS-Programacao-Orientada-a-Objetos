
public class main {

	public static void main(String[] args) {
		/*Calculadora calculadora = new Calculadora();
			int resultadoSoma = calculadora.somar(10, 5);
			int resultadoSubtracao = calculadora.subtrair(10, 5);
			int resultadoMultiplicacao = calculadora.multiplicar(10, 5);
			double resultadoDivisao = calculadora.dividir(10, 5);
			
			System.out.println("Resultado da soma "+ resultadoSoma);
			System.out.println("Resultado da soma "+ resultadoSubtracao);
			System.out.println("Resultado da soma "+ resultadoMultiplicacao);
			System.out.println("Resultado da soma "+ resultadoDivisao);
			
	}
*/
		
		CalculadoraWagner calculadora = new CalculadoraWagner();
		int resultadoSoma = calculadora.somar(10, 5);
		int resultadoSubtracao = calculadora.subtrair(10, 5);
		int resultadoMultiplicacao = calculadora.multiplicar(10, 5);
		double resultadoDivisao = calculadora.dividir(10, 5);
		
		System.out.println("Resultado da soma "+ resultadoSoma);
		System.out.println("Resultado da soma "+ resultadoSubtracao);
		System.out.println("Resultado da soma "+ resultadoMultiplicacao);
		System.out.println("Resultado da soma "+ resultadoDivisao);
		
}
}
