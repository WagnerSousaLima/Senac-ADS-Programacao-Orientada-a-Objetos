
public class main {
	public static void main(String[] args) {
		Cliente clienteA = new Cliente();
		Cliente clienteB = new Cliente(123, "123456-7", "123.456.789.10",500.50);
		

		double saldoA = clienteA.informarSaldo();
		System.out.println(saldoA);
		
		clienteA.sacarContaCorrente(50.50);
		
		saldoA = clienteA.informarSaldo();
		System.out.println(saldoA);
	
		double saldoB = clienteB.informarSaldo();	
		System.out.println(saldoB);

   }
}