
public class Cliente {
	private int agencia;
	private String contaCorrente;
	private String cpf;
	private double saldoCC;
	
	public Cliente() {
		this.saldoCC = 1000.00;
	}

	public Cliente(int agencia, String contaCorrente, String cpf, double saldoCC) {
		this.agencia = agencia;
		this.contaCorrente = contaCorrente;
		this.cpf = cpf;
		this.saldoCC = saldoCC;
	}
     public void sacarContaCorrente(double valor) {
    	 if(this.saldoCC > valor) {
    		 this.saldoCC = this.saldoCC - valor ;
    	 }
     }
	public double informarSaldo() {
		return this.saldoCC;
	}
	}
	
	
		
	

	
	
	