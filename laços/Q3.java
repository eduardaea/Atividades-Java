package laços;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		//idade for =-99. (WHILE)
		
		int id,menos, mais;
		id=0;
		menos=0;
		mais=0;
		
		Scanner input = new Scanner (System.in);
		
		while( id != -99) {
			System.out.println("Escreva: Digite a primeira idade");
			id = input.nextInt();
			
			if(id<21){
				menos++;
			}
			else if (id>50){
				mais++;
			}

		}
		System.out.println("Dentre as Idades digitadas "+menos+" foram menores que 21 anos. E "+mais+" delas, tinham mais que 50 anos.");
	}

}
