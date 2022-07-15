package javacollections;
import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
		//trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
		//programa deverá atender as seguintes funcionalidades:
		//Armazenar dados da List
		//Remover dados da list;
		//Atualizar dados da list.
		//Apresentar todos os dados da list.
		
		int op;
		
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> estoque = new ArrayList();
		
			do {
				
				System.out.println("Para Adicionar um novo produto Digite 1");
				System.out.println("\nPara Atualizar um produto Digite 2");
				System.out.println("\nPara Visualizar os produtos Digite 3");
				System.out.println("\nPara Excluir um  produto Digite 4");
				op = input.nextInt();
				
				switch(op) {
					case 1:
						input.nextLine();
						System.out.println("\n Digite o produto a ser incluido no estoque:"); 	
						estoque.add(input.nextLine());
						System.out.println("\nProduto adicionado \n");
						break;
					
					case 2:
						input.nextLine();
						System.out.println("\nDigite O produto a ser Atualizado"); 	
						String produto = input.nextLine();
							if(estoque.contains(produto)) {
								estoque.remove(produto);
								System.out.println("\nDigite");
								System.out.println("\nDigite o Produto a ser incluido");
								estoque.add(input.nextLine());
								
							}
							else {System.out.println("\nO produto não existe no estoque!");}
							break;
					case 3:
						System.out.println(estoque);
						break;
					
					case 4: 
						input.nextLine();
						System.out.println("\nDigite o produto a ser excluido");
						String produto2 = input.nextLine();
						if(estoque.contains(produto2)) {
							estoque.remove(produto2);
							System.out.println("\nExcluido!");
						}
						
						else {System.out.println("\n O produto não existe no estoque!");}
						break;
				}
			
			}
			while(op != 0);
			

		
		}

}
