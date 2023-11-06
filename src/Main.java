import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "BIENVENIDO AL DETECTOR DE MUTANTES. Presione Enter para continuar.");
        MutantDetector mutantDetector = new MutantDetector();

        while (true) {
            String[] options = {"Código de gen mutante", "Código de gen no mutante", "Ingresar ADN por teclado", "Salir"};
            int choice = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);


            switch (choice) {
                case 0:
                    // Opciones de códigos de gen mutante
                    String[] opcionesMutantes = {"MUTANTE 1", "MUTANTE 2", "MUTANTE 3", "MUTANTE 4", "MUTANTE 5"};
                    int seleccionMutante = JOptionPane.showOptionDialog(
                            null,
                            "Seleccione un código de gen mutante:",
                            "Código de gen mutante",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            opcionesMutantes,
                            opcionesMutantes[0]
                    );

                    if (seleccionMutante >= 0 && seleccionMutante < opcionesMutantes.length) {
                        String codigoSeleccionado = opcionesMutantes[seleccionMutante];
                        String[][] genMutanteSeleccionado = null;
                        String[][] genMutante1 = {
                                {"A", "G", "A", "C", "C", "G"},
                                {"C", "A", "G", "T", "G", "C"},
                                {"T", "T", "A", "T", "G", "T"},
                                {"A", "G", "A", "A", "G", "G"},
                                {"C", "A", "C", "C", "G", "A"},
                                {"T", "C", "A", "C", "T", "G"}
                        };

                        String[][] genMutante2 = {
                                {"G", "T", "A", "C", "C", "G"},
                                {"C", "A", "G", "T", "G", "C"},
                                {"T", "T", "A", "A", "G", "T"},
                                {"A", "G", "A", "A", "G", "G"},
                                {"C", "A", "C", "C", "G", "A"},
                                {"A", "C", "A", "C", "T", "G"}
                        };

                        String[][] genMutante3 = {
                                {"A", "G", "A", "C", "C", "G"},
                                {"C", "A", "G", "T", "G", "C"},
                                {"T", "T", "A", "T", "G", "T"},
                                {"A", "G", "A", "A", "G", "G"},
                                {"C", "A", "C", "C", "G", "A"},
                                {"T", "C", "A", "C", "T", "G"}
                        };

                        String[][] genMutante4 = {
                                {"T", "G", "A", "C", "C", "G"},
                                {"C", "T", "G", "T", "G", "C"},
                                {"T", "T", "T", "T", "G", "T"},
                                {"A", "G", "A", "T", "G", "G"},
                                {"C", "A", "C", "C", "G", "A"},
                                {"T", "C", "A", "C", "T", "G"}
                        };

                        String[][] genMutante5 = {
                                {"C", "G", "A", "C", "C", "G"},
                                {"C", "C", "G", "T", "G", "C"},
                                {"T", "T", "C", "G", "G", "T"},
                                {"A", "G", "G", "C", "A", "G"},
                                {"C", "A", "C", "C", "G", "A"},
                                {"T", "C", "A", "C", "T", "G"}
                        };
                        // Determinar qué código de gen mutante seleccionó el usuario
                        switch (codigoSeleccionado) {
                            case "MUTANTE 1":
                                genMutanteSeleccionado = genMutante1;
                                break;
                            case "MUTANTE 2":
                                genMutanteSeleccionado = genMutante2;
                                break;
                            case "MUTANTE 3":
                                genMutanteSeleccionado = genMutante3;
                                break;
                            case "MUTANTE 4":
                                genMutanteSeleccionado = genMutante4;
                                break;
                            case "MUTANTE 5":
                                genMutanteSeleccionado = genMutante5;
                                break;
                        }
                        // Mostrar la matriz seleccionada
                        if (genMutanteSeleccionado != null) {
                            mutantDetector.mostrarMatriz("Código de gen mutante seleccionado:", genMutanteSeleccionado);
                            boolean esMutante = mutantDetector.isMutant(genMutanteSeleccionado);
                            String mensaje = esMutante ? "La matriz Anteriormente mostrada es MUTANTE." : "La matriz anteriormente mostrada es NO MUTANTE.";
                            JOptionPane.showMessageDialog(null, mensaje);
                        }
                    }
                    break;
                case 1:
                    // Opciones de códigos de gen mutante
                    String[] opcionesNoMutantes = {"MUTANTE 1", "MUTANTE 2", "MUTANTE 3", "MUTANTE 4", "MUTANTE 5"};
                    int seleccionNoMutante = JOptionPane.showOptionDialog(
                            null,
                            "Seleccione un código de gen mutante:",
                            "Código de gen mutante",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            opcionesNoMutantes,
                            opcionesNoMutantes[0]
                    );

                    if (seleccionNoMutante >= 0 && seleccionNoMutante < opcionesNoMutantes.length) {
                        String codigoSeleccionado = opcionesNoMutantes[seleccionNoMutante];
                        String[][] genNoMutanteSeleccionado = null;
                        String[][] genNoMutante1 = {
                                {"A", "G", "A", "C", "C", "G"},
                                {"C", "G", "G", "T", "G", "C"},
                                {"T", "T", "A", "T", "T", "T"},
                                {"A", "G", "A", "A", "G", "G"},
                                {"C", "A", "C", "C", "G", "A"},
                                {"T", "C", "A", "C", "T", "G"}
                        };

                        String[][] genNoMutante2 = {
                                {"G", "T", "A", "C", "C", "G"},
                                {"C", "A", "G", "T", "G", "C"},
                                {"T", "T", "A", "T", "G", "T"},
                                {"A", "G", "A", "A", "G", "G"},
                                {"C", "A", "C", "C", "G", "A"},
                                {"T", "C", "A", "C", "T", "G"}
                        };

                        String[][] genNoMutante3 = {
                                {"A", "G", "A", "C", "C", "G"},
                                {"C", "A", "G", "T", "G", "C"},
                                {"T", "T", "A", "T", "G", "T"},
                                {"A", "G", "A", "A", "A", "G"},
                                {"C", "A", "C", "C", "G", "A"},
                                {"T", "C", "A", "C", "T", "G"}
                        };

                        String[][] genNoMutante4 = {
                                {"A", "G", "A", "C", "C", "G"},
                                {"C", "A", "G", "T", "G", "C"},
                                {"T", "T", "A", "T", "G", "T"},
                                {"A", "G", "A", "A", "A", "G"},
                                {"C", "A", "C", "C", "G", "A"},
                                {"T", "C", "A", "C", "T", "G"}
                        };

                        String[][] genNoMutante5 = {
                                {"A", "G", "A", "C", "C", "G"},
                                {"C", "A", "G", "T", "G", "C"},
                                {"T", "T", "G", "T", "G", "T"},
                                {"A", "G", "A", "T", "A", "G"},
                                {"C", "A", "C", "T", "G", "A"},
                                {"T", "C", "A", "C", "T", "G"}
                        };
                        // Determinar qué código de gen mutante seleccionó el usuario
                        switch (codigoSeleccionado) {
                            case "MUTANTE 1":
                                genNoMutanteSeleccionado = genNoMutante1;
                                break;
                            case "MUTANTE 2":
                                genNoMutanteSeleccionado = genNoMutante2;
                                break;
                            case "MUTANTE 3":
                                genNoMutanteSeleccionado = genNoMutante3;
                                break;
                            case "MUTANTE 4":
                                genNoMutanteSeleccionado = genNoMutante4;
                                break;
                            case "MUTANTE 5":
                                genNoMutanteSeleccionado = genNoMutante5;
                                break;
                        }

                        // Mostrar la matriz seleccionada
                        if (genNoMutanteSeleccionado != null) {
                            mutantDetector.mostrarMatriz("Código de gen mutante seleccionado:", genNoMutanteSeleccionado);
                            boolean esMutante = mutantDetector.isMutant(genNoMutanteSeleccionado);
                            String mensaje = esMutante ? "La matriz Anteriormente mostrada es MUTANTE." : "La matriz anteriormente mostrada es NO MUTANTE.";
                            JOptionPane.showMessageDialog(null, mensaje);
                        }
                    }
                    break;
                case 2:
                    // Pedir al usuario que ingrese ADN por teclado y almacenarlo en una matriz
                    String[][] matrizADN = new String[6][6];

                    for (int i = 0; i < 6; i++) {
                        String secuencia = JOptionPane.showInputDialog("Ingrese una secuencia de 6 caracteres (A, T, G, C):").toUpperCase();
                        if (secuencia.length() == 6 && secuencia.matches("[ATGC]+")) {
                            for (int j = 0; j < 6; j++) {
                                matrizADN[i][j] = String.valueOf(secuencia.charAt(j));
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Secuencia inválida. Debe tener una longitud de 6 caracteres y contener solo 'A', 'T', 'G' o 'C'.");
                            i--;
                        }
                    }
                    mutantDetector.mostrarMatriz("Matriz de ADN ingresada:", matrizADN);
                    boolean esMutante = mutantDetector.isMutant(matrizADN);

                    if (esMutante) {
                        JOptionPane.showMessageDialog(null, "La matriz de ADN ingresada es mutante.");
                    } else {
                        JOptionPane.showMessageDialog(null, "La matriz de ADN ingresada no es mutante.");
                    }
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}

