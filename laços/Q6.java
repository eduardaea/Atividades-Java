package laços;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escrever um programa que receba vários números inteiros no teclado. E no
		//final imprimir a média dos números múltiplos de 3. Para sair digitar
		//0(zero).(DO...WHILE)
		int i, num, valor;
		float cont;
		valor = 0;
		cont = 0;		
		
	
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Digite o valor: Obs. Para parar a execução, digite 0");
			num = input.nextInt();
			
			if(num%3 ==0 && num !=0) {
				valor+= num;
				cont++;
			}
			
		}
		while(num != 0);
		System.out.println("A média dos valores multiplos de 3 é igual á: "+(valor/cont));
	}
}