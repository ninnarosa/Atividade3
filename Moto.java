
public class Moto extends Veiculo{
	
	protected int marcha;
	protected double velocidade;

	public int getMarcha() {
		if((marcha <= 4) && (marcha >= 1)) {
			
		}
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public double getVelocidade() {		
		if((velocidade <= 100)&&(velocidade >= 0)) {
		}
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public void aumentarVelocidade() { //acho que tenho que criar condição aqui
		System.out.println("A velocidade da moto aumentou para " + this.getVelocidade() + " km/h");
	}
	public void diminuirVelocidade() { //acho que tenho que criar condição aqui
		System.out.println("A velocidade da moto diminuiu para " + this.getVelocidade() + " km/h");
	}
}
