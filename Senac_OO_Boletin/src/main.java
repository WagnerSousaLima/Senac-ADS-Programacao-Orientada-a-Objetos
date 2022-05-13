
public class main {

	public static void main(String[] args) {
			Aluno alunoA = new Aluno("001","WAGNER LIMA");
			
			String matriculaA = alunoA.informarMatricula();
		    System.out.println("A mastricula do aluno a é: ");
		    System.out.println(matriculaA);
		    
		    String nomeA = alunoA.informarNome();
		    System.out.println("O nome do aluno a é: ");
		    System.out.println(nomeA);
		    
		    
		    
		    Aluno alunoB = new Aluno("002","Kathellen Marry");
		    
			String matriculaB = alunoB.informarMatricula();
		    System.out.println("A mastricula do aluno B é: ");
		    System.out.println(matriculaB);
		    
		    String nomeB = alunoB.informarNome();
		    System.out.println("O nome do aluno B é: ");
		    System.out.println(nomeB);
		    
		    
		    AlunoGraduacao alunoGraduacaoA = new AlunoGraduacao();
		    
		    String matriculaGradA = alunoGraduacaoA.informarMatricula();
		    System.out.println("A matricula do aluno de Gradução é: ");
		    System.out.println(matriculaGradA);
		   
		    
		    double mediaFinalGraduacaoA = alunoGraduacaoA.calcularMadia(5.5, 4.5, 6.5);
		    System.out.println("A media Final do Aluno de Graduação A é:");
		    System.out.println(mediaFinalGraduacaoA);
		    alunoGraduacaoA.verificarPassou(mediaFinalGraduacaoA);
		    
		    double mediaRecGraduacaoA = alunoGraduacaoA.calcularMedia(mediaFinalGraduacaoA,7.4);
		    System.out.println("A nota Final de Recuperacao do Aluno de Graduação A é:");
		    System.out.println(mediaRecGraduacaoA);
		    
		    
		    
		    AlunoPos alunoPos = new AlunoPos();
		    
		    double mediaFinalPos = alunoPos.calcularMadia(4.5,5.5,5.6);
		    System.out.println("A média final do Aluno de Pós é: ");
		    System.out.println(mediaFinalPos);
		    alunoPos.verificarPassou(mediaFinalPos);
		    
		    
           
		
	}

}
