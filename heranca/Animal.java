package heranca;

abstract public class Animal {
	
	private String nome;
	private int idade;
	
	Animal(String nome,int idade){
		this.nome = nome;
		this.idade = idade;
				
	}
	
	
	abstract public void  emitirsom();
	


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
