package exception;

public class NegativeNumberException extends Exception {
	
	public NegativeNumberException() {
		super("Esta intentando usar un n�mero negativo  para el ingrediente, utilice otro n�mero");
	}

}
