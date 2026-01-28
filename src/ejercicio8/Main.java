package ejercicio8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cantidad = 0;
		boolean seguir = true;
		
		do {
			try {
				System.out.println("Introduce la cantidad del pedido");
				cantidad = sc.nextInt();
				Pedido.realizarPedido(cantidad);
				seguir = false;
			}catch (StockInsuficienteException e) {
				System.out.println("No hay stock suficiente");
			}catch (CantidadInvalidaException e) {
				System.out.println("Cantidad no valida");
				e.printStackTrace();
			}catch(Exception e) {
				System.out.println("Error");
				e.printStackTrace();
			}
			finally {
				sc.nextLine();
			}
		}while (seguir);
		System.out.println("Pedido relizado, cantidad: "+cantidad);
	}

}
