package ejercicio8;

public class Pedido {
	public static void realizarPedido(int cantidad) throws StockInsuficienteException{
		if (cantidad > 10) {
			throw new StockInsuficienteException();
		}
		if (cantidad <= 0) {
			throw new CantidadInvalidaException();
		}
	}
}
