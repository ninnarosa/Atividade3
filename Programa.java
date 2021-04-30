
public class Programa {

	public static void main(String[] args) {
		
		System.out.println("QUESTÃO 01\n");	
		Gato cat = new Gato();
		cat.emitirSom();		
		Cachorro dog = new Cachorro();
		dog.emitirSom();		
		Cavalo horse = new Cavalo();
		horse.emitirSom();		
		Leao lion = new Leao();
		lion.emitirSom();		
		Boi ox = new Boi();
		ox.emitirSom();
		
		System.out.println("");
		System.out.println("QUESTÃO 02\n");
		Agua h2o = new Agua();
		h2o.entrarPontoDeEbulicao();
		h2o.entrarPontoDeFusao();
		Amonia aa = new Amonia();
		aa.entrarPontoDeEbulicao();
		aa.entrarPontoDeFusao();
		Alcool al = new Alcool();
		al.entrarPontoDeEbulicao();
		al.entrarPontoDeFusao();
		
		System.out.println("");
		System.out.println("QUESTÃO 03\n");
		
		Multiplicacao mult = new Multiplicacao();
		mult.calcular();
		mult.calcular(2, 2);
		mult.calcular(2.2, 2.2);
		Divisao div =  new Divisao();
		div.calcular();
		div.calcular(4, 2);
		div.calcular(4.2, 2.0);
		Adicao add = new Adicao();
		add.calcular();
		add.calcular(5, 5);
		add.calcular(2.3, 7.1);
		Subtracao sub = new Subtracao();
		sub.calcular();
		sub.calcular(3, 7);
		sub.calcular(6.2, 5.1);
		
		System.out.println("");
		System.out.println("QUESTÃO 04\n");
		
		Desktop desk = new Desktop();
		desk.informaCaracteristicas();
		desk.tamanhoDaTela("23,8 polegadas");
		desk.corDaTela("branca");
		desk.tamanhoCor("23,8 polegadas", "branca");
		System.out.println("-------------------------------------------");
		Notebook note = new Notebook();
		note.informaCaracteristicas();
		note.tamanhoDaTela("Tela touch HD de 14");
		note.corDaTela("prata");
		note.tamanhoCor("Tela touch HD de 14", "prata");
		System.out.println("-------------------------------------------");
		Ultrabook ultra = new Ultrabook();
		ultra.informaCaracteristicas();
		ultra.tamanhoDaTela("Tela touch Ultra HD de 13.4");
		ultra.corDaTela("Tampa exterior prata com interior na cor preta");
		ultra.tamanhoCor("Tela touch Ultra HD de 13.4", "Tampa exterior prata com interior na cor preta");
		
		System.out.println("");
		System.out.println("QUESTÃO 05\n"); //para correções, editando!!
		
		Carro car = new Carro();
		car.setMarcha(1);
		car.setVelocidade(10.2);
		car.setMarcha(2);
		car.setVelocidade(30.5);
		car.aumentarVelocidade();
		car.diminuirVelocidade(); 
		
	}
}
