package aula;
import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		float n1, n2, n3, maior;
		
		System.out.println("Entre com o primeiro valor");
			n1= input.nextFloat();
		System.out.println("Entre com o segundo valor!");
			n2= input.nextFloat();
		System.out.println("Entre com o terceiro valor!");
			n3= input.nextFloat();
		
			if(n1>= n2) {
				maior =  n1;
			}
			else if(n2>=n1) {
				maior = n2;
			}
			else {
				maior = n3;
			}
		System.out.println("O maior valor é: "+ maior);	
	}

}
