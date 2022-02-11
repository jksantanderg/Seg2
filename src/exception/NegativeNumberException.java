package exception;

public class NegativeNumberException extends Exception {
	
	public NegativeNumberException() {
		super("Esta intentando usar un número negativo  para el ingrediente, utilice otro número");
	}

}
