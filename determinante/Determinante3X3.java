package determinante;

public class Determinante3X3 {
	private double[][] matriz = new double[3][3];
	private double[][] matrizExtendida = new double[3][5];

	// Constructor por default.
	Determinante3X3() {
	}

	// Método que agrega elementos a las matrices.
	public void agregar(int fila, int columna, double elemento) {
		matriz[fila][columna] = elemento;
		matrizExtendida[fila][columna] = elemento;
	}
	
	// Método que extiende la matriz.
	public void extenderMatriz() {
		for (int i = 0; i < matriz.length; i++) {
			int aux = 3;
			for (int j = 0; j < matriz.length - 1; j++) {
				matrizExtendida[i][aux] = matriz[i][j];
				aux++;
			}
		}
	}

	// Método que calcula el determinante de manera iterativa.
	public double determinanteIterativo() {
		double resultadoDeterminante;
		double resultadoPositivo = 0;
		double resultadoNegativo = 0;
		int contadorUno = 0;
		int contadorDos = 2;
		while (!(contadorUno > 2 || contadorDos < 0)) {
			double productoPositivo = 1;
			double productoNegativo = 1;
			// Se va creando una matriz temporal.
			double[][] matrizTemporal = new double[3][3];
			// For que añade elementos a la matriz temporal.
			for (int i = 0; i < matrizExtendida.length; i++) {
				for (int j = contadorUno; j < matrizExtendida[0].length - contadorDos; j++) {
					matrizTemporal[i][j - contadorUno] = matrizExtendida[i][j];
				}
			}
			// For que halla el producto de la diagonal general.
			for (int i = 0, j = 0; i < matriz.length; i++, j++) {
				productoPositivo *= matrizTemporal[i][j];
			}
			// Se adiciona el producto.
			resultadoPositivo += productoPositivo;
			// For que halla el producto de la diagonal inversa.
			for (int i = 0, j = matriz.length - 1; i < matriz.length; i++, j--) {
				productoNegativo *= matrizTemporal[i][j];
			}
			// Se adiciona el producto.
			resultadoNegativo += productoNegativo;
			// Contadores.
			contadorUno++;
			contadorDos--;
		}
		resultadoDeterminante = (resultadoPositivo) - (resultadoNegativo);
		return resultadoDeterminante;
	}
	
	// Getters.
	public double[][] getMatrizExtendida() {
		return matrizExtendida;
	}
	
	public double[][] getMatriz() {
		return matriz;
	}
}