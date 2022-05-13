
public class AlunoGraduacao extends Aluno {
	
	@Override
	public double calcularMadia(double prova1, double prova2, double prova3) {
		double resultado = (0.3 * prova1) + (0.4 * prova2) + (0.5 * prova3);
				return resultado ;
	}
	
	public double calcularMedia(double notaFinal, double notaProvaRec) {
		double resultado = ( notaFinal+ notaProvaRec) - 12;
		return resultado;
	}
	
	@Override
	public void verificarPassou(double notaFinal) {
		if(notaFinal >= 7 ) {
			System.out.println("Aluno aprrovado");
		}else if (notaFinal< 7 && notaFinal > 4) {
			System.out.println("Aluno de recuperação");
		}else {
			System.out.println("Aluno Reprovado");
		}
	}
}
