package validarDatos;

public class ValidarNumeros {

	// Constructor por default.
	ValidarNumeros() {
	}
	
	// Método que verifica si un número es entero.
	public boolean isInt(String num) {
		return num.matches("^-?[0-9]+$");
	}

	// Método que verifica si un número entero es positivo.
	public boolean isPositiveInt(String num) {
		return num.matches("^[0-9]+$");
	}

	// Método que verifica si un número entero es negativo.
	public boolean isNegativeInt(String num) {
		return num.matches("^-[0-9+]$");
	}

	// Método que verifica si un número real es positivo.
	public boolean isPositiveDouble(String num) {
		return num.matches("^[0-9]+([.,][0-9]+)?$");
	}

	// Método que verifica si un número real es negativo.
	public boolean isNegativeDouble(String num) {
		return num.matches("^-[0-9]+([.,][0-9]+)?$");
	}

	// Método que verifica si un número es real.
	public boolean isFloatDouble(String num) {
		return num.matches("^-?[0-9]+([.,][0-9]+)?$");
	}

	// Método que verifica si un número es binario.
	public boolean isBinary(String num) {
		return num.matches("^[0-1]+$");
	}

}
