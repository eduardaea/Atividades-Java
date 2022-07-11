package aula;
import java.util.Scanner;
import java.lang.Math;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Faça um programa em que permita a entrada de um número qualquer e exiba se este
	//	número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	//	ímpar exiba o número elevado ao quadrado.
	int  num;
	double rq, quad;
	Scanner input = new Scanner(System.in);
	
	System.out.print("Digite um numero: ");
	num = input.nextInt();
		if(num%2 == 0) {
			rq = Math.sqrt(num);
			System.out.println("O número e par e sua raiz quadrada é igual a: "+rq);
		}
		else if (num%3 == 0) {
			quad = Math.pow(num, 2);
			System.out.println("O número e impar e elevado ao quadrado é igual a: "+ quad);
		}
	}

}
