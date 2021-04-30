
public class Carro extends Veiculo{
	protected int marcha;
	protected double velocidade;

	public int getMarcha() {
		if((marcha <= 5) && (marcha >= 1)) {
			
		}
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public double getVelocidade() {		
		if((velocidade <= 200)&&(velocidade >= 0)) {
		}
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public void aumentarVelocidade() { //acho que tenho que criar condição aqui
		System.out.println("A velocidade do carro aumentou para " + this.getVelocidade() + " km/h");
	}
	public void diminuirVelocidade() { //acho que tenho que criar condição aqui
		System.out.println("A velocidade do carro diminuiu para " + this.getVelocidade() + " km/h");
	}
}
