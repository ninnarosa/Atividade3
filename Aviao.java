
public class Aviao extends Veiculo{

	protected double velocidade;
	protected double altitude;
	protected double resistenciaDoAr;

	public double getVelocidade() {
		if((velocidade <= 1000)&&(velocidade >= 100)) {
		}
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		if((altitude <= 3000)&&(altitude >= 1000)) {
		this.altitude = altitude;
		}
	}

	public double getResistenciaDoAr() {
		return resistenciaDoAr;
	}
	public void setResistenciaDoAr(double resistenciaDoAr) {
		if((resistenciaDoAr < 50)&&(resistenciaDoAr > 100)) {
		this.resistenciaDoAr = resistenciaDoAr;
		}
	}
	
	@Override
	public void aumentarVelocidade() { //acho que tenho que criar condição aqui
		System.out.println("A velocidade do avião aumentou para " + this.getVelocidade() + " km/h");
	}
	public void diminuirVelocidade() { //acho que tenho que criar condição aqui
		System.out.println("A velocidade do avião diminuiu para " + this.getVelocidade() + " km/h");
	}
}
