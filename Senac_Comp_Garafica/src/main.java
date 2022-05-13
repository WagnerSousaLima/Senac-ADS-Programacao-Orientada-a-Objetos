
public class main {
	public static void main(String[] args) {
		Ponto pontoA = new Ponto();
		Ponto pontoB = new Ponto(70,60);
		
		boolean iguais = pontoA.verificarIguais(pontoB);
		System.out.println(iguais);
		
		double distancia = pontoA.calcularDistancia(pontoB);
		System.out.println(distancia);
		
	}

}
