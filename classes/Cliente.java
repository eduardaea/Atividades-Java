package classes;
import java.util.Scanner;
//Crie uma classe cliente  OK
// apresente os atributos e métodos referentes a esta classe,  OK
// em seguida crie um objeto cliente, defina as instancias deste
//objeto e apresente as informações deste objeto no console.
public class Cliente {
	
	int telefone;
	String nome, endereco,cpf;
	Scanner input = new Scanner(System.in);
	
	public Cliente(String nome,String endereco, int telefone, String cpf) {
		this.nome =nome;
		this.endereco =endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		
		
	}
		
}




