
public class CalculadoraWagner implements ICalculadora {

	@Override
	public int somar(int numero1, int numero2) {
		System.out.println("Os parametros da soma foram: " + numero1 +" " + numero2);
		return numero1 + numero2;
	}

	@Override
	public int subtrair(int numero1, int numero2) {
		System.out.println("Os parametros da sub foram: " + numero1 +" " + numero2);
		return numero1 - numero2;
	}

	@Override
	public int multiplicar(int numero1, int numero2) {
		System.out.println("Os parametros da mult foram: " + numero1 +" " + numero2);
		return numero1 * numero2;
	}

	@Override
	public int dividir(int numero1, int numero2) {
		System.out.println("Os parametros da div foram: " + numero1 +" " + numero2);
		return numero1 / numero2;
	}
	

}
