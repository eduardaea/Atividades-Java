package heranca;

public class Cavalo  extends Animal{

	Cavalo(String nome, int idade){
		super (nome,idade);
	}
	
	@Override
	public void emitirsom() {
		System.out.println("Cavalo Relinchando");
	}
	
	public void correr() {
	System.out.println("Cavalo Correndo...");
	}
}
