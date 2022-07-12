package classes;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome, endereco,cpf;
		int telefone;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o nome");
		nome=input.next();
		System.out.print("\nDigite o endereço: ");
		endereco=input.next();
		System.out.print("\nDigite o cpf: ");
		cpf=input.next();
		System.out.print("\nDigite o telefone: ");
		telefone=input.nextInt();
		
		Cliente Amaro = new Cliente(nome,endereco, telefone,cpf);
	}

}
