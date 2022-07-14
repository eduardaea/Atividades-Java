package heranca;

public class Testeanimais {

	public static void main(String[] args) {
		Cavalo cavalo = new Cavalo("Yago",30);
		Preguica preguica = new Preguica();
		Cachorro yago = new Cachorro();
		cavalo.emitirsom();
		cavalo.correr();
	}

}
