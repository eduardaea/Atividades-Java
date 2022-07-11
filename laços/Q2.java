package laços;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		int num,par,impar;
		par = 0;
		impar = 0;
		
		Scanner input = new Scanner (System.in);
		for(int x=0; x<=9; x++) {
			System.out.println("Digite o "+(x+1)+"° valor");
			num = input.nextInt();
			
			if(num%2 ==0 ) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("Dentre os numeros digitados, "+par+" sao pares e "+impar+" sao impares");
	}

}
