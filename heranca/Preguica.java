package heranca;

public class Preguica extends Animal{
		
	Preguica(){
		super ("Preguiça",12);
	}
	
	@Override
	public void emitirsom() {
		System.out.println("Não sei o som que a preguiça Emite!");
	}
	public void subir() {
		System.out.println("Preguiça Subindo na arvore...");
	}
}
