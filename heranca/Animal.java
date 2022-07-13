package heranca;

public class Animal {
	
	protected String nome;
	protected int idade;
	private String som;
	
	
	public void  emitirsom() {
		 System.out.println(this.som);
	}
	
	public String getSom() {
		return this.som;
	}

	public void setSom(String som) {
		this.som = som;
	}

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
