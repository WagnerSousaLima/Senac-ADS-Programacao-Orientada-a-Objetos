
public class Aluno {
	private String matricula;
	private String nome;
	
	
	public Aluno() {
		
	}
	
	
	public Aluno(String matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	public String informarMatricula() {
		return this.matricula;
	}
	public String informarNome() {
		return this.nome;
	}
	
	public double calcularMadia(double prova1, double prova2, double prova3) {
		double resultado = (prova1 + prova2 +prova3 )/3;
				return resultado ;
	}

	public void verificarPassou(double notaFinal) {
		if(notaFinal >= 5 ) {
			System.out.println("Aluno aprrovado");
		}else {
			System.out.println("Aluno Reprovado");
		}
	}
}
