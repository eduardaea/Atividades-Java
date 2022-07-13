package classes;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		 Aviao boeing = new Aviao();
		 System.out.println("Digite o Moodelo");
		 boeing.setModelo(input.next());
		 System.out.println("Digite o ano deste modelo");
		 boeing.setAno(input.nextInt());
		 System.out.println();
		 
	}

}
