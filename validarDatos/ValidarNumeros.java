package validarDatos;

public class ValidarNumeros {

	// Constructor por default.
	ValidarNumeros() {
	}
	
	// M�todo que verifica si un n�mero es entero.
	public boolean isInt(String num) {
		return num.matches("^-?[0-9]+$");
	}

	// M�todo que verifica si un n�mero entero es positivo.
	public boolean isPositiveInt(String num) {
		return num.matches("^[0-9]+$");
	}

	// M�todo que verifica si un n�mero entero es negativo.
	public boolean isNegativeInt(String num) {
		return num.matches("^-[0-9+]$");
	}

	// M�todo que verifica si un n�mero real es positivo.
	public boolean isPositiveDouble(String num) {
		return num.matches("^[0-9]+([.,][0-9]+)?$");
	}

	// M�todo que verifica si un n�mero real es negativo.
	public boolean isNegativeDouble(String num) {
		return num.matches("^-[0-9]+([.,][0-9]+)?$");
	}

	// M�todo que verifica si un n�mero es real.
	public boolean isFloatDouble(String num) {
		return num.matches("^-?[0-9]+([.,][0-9]+)?$");
	}

	// M�todo que verifica si un n�mero es binario.
	public boolean isBinary(String num) {
		return num.matches("^[0-1]+$");
	}

}
