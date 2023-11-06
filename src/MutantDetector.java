import javax.swing.*;

public class MutantDetector {

        public static boolean isMutant(String[][] dna) {
            int n = dna.length; // Obtenemos el tamaño de la matriz
            int count = 0; // Contador de secuencias mutantes

            // Verificar horizontalmente y verticalmente
            for (int i = 0; i < n; i++) { // Itera sobre las filas
                for (int j = 0; j < n; j++) { // Itera sobre las columnas
                    String currChar = dna[i][j]; // Obtenemos el carácter en la posición i, j

                    // Verificar horizontal
                    if (j + 3 < n && currChar.equals(dna[i][j + 1]) &&
                            currChar.equals(dna[i][j + 2]) &&
                            currChar.equals(dna[i][j + 3])) {
                        count++;
                    }

                    // Verificar vertical
                    if (i + 3 < n && currChar.equals(dna[i + 1][j]) &&
                            currChar.equals(dna[i + 2][j]) &&
                            currChar.equals(dna[i + 3][j])) {
                        count++;
                    }
                }
            }

            // Verificar diagonalmente
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    String currChar = dna[i][j];

                    // Verificar diagonal derecha
                    if (i + 3 < n && j + 3 < n &&
                            currChar.equals(dna[i + 1][j + 1]) &&
                            currChar.equals(dna[i + 2][j + 2]) &&
                            currChar.equals(dna[i + 3][j + 3])) {
                        count++;
                    }

                    // Verificar diagonal izquierda
                    if (i + 3 < n && j >= 3 &&
                            currChar.equals(dna[i + 1][j - 1]) &&
                            currChar.equals(dna[i + 2][j - 2]) &&
                            currChar.equals(dna[i + 3][j - 3])) {
                        count++;
                    }

                    // Detener la verificación si ya se encontraron más de una secuencia mutante
                    if (count > 1) {
                        return true;
                    }
                }
            }

            // Retornar true si se encontraron más de una secuencia mutante
            return count > 1;
        }

    //Función que muestra la matriz definida
    public static void mostrarMatriz(String titulo, String[][] matriz) {
        StringBuilder matrizString = new StringBuilder(titulo + "\n");
        for (String[] fila : matriz) {
            matrizString.append(String.join(" ", fila)).append("\n");
        }
        JOptionPane.showMessageDialog(null, matrizString.toString());
    }
}
