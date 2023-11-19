package comercio;

import java.util.Scanner;

import comercio.entities.Product;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		
		System.out.println("Enter product data");
		System.out.println("Name, Price e Quantity:");
		System.out.print("Name :");product.nome  = sc.nextLine();
		System.out.print("Price R$ ");product.preco = sc.nextDouble();
		System.out.print("Quantity ");product.qtd = sc.nextInt();
		System.out.println();
		
		System.out.println("Product data : " + product);
		
		System.out.println("Enter the number of products to be added in stock: ");
		
		
		
		
		
		sc.close();

	}

}
