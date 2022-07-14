package heranca;

public class Cachorro  extends Animal{
	Cachorro(){
		super ("Bob",10);
	}
	@Override
	public void emitirsom() {
		System.out.println("AUAUAUAUUAUA");
	}
	public void correr (){
		System.out.println("Cachorro correndo...");		
	}
}
