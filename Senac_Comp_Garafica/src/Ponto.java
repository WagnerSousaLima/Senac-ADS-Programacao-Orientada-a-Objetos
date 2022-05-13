import java.util.Objects;

public class Ponto {
	private int x;
	private int y;
	
	
	public Ponto() {
		this.x = 0;
		this.y = 0;
	}
	
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean verificarIguais(Ponto ponto) {
		if(this.x == ponto.x && this.y == ponto.y)
			return true;
		else
			return false;
			
	}
	
	public double calcularDistancia (Ponto ponto) {
		return Math.sqrt(Math.pow(ponto.x - this.x, 2)+ Math.pow(ponto.y - this.y,2));
	}
		
	
	
	}

	
	
	


