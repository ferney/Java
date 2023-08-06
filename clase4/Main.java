package org.example.B1.clase4;
import javax.swing.JOptionPane;
public class Main {
       public static void main(String[] args) {
            int intentos = 0;
            final int MAX_INTENTOS = 3;

            while (intentos < MAX_INTENTOS) {
                int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        "Menú de opciones:\n" +
                                "1. Iniciar sesión\n" +
                                "2. Otra opción\n" +
                                "3. Otra opción\n" +
                                "0. Salir\n\n" +
                                "Seleccione una opción:"
                ));

                switch (opcion) {
                    case 1:
                        if (realizarLogin()) {
                            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");
                            return;
                        } else {
                            intentos++;
                            JOptionPane.showMessageDialog(null, "Inicio de sesión fallido. Intentos restantes: " + (MAX_INTENTOS - intentos));
                        }
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Opción 2 seleccionada.");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Opción 3 seleccionada.");
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                        return;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, elija una opción válida.");
                }
            }

            JOptionPane.showMessageDialog(null, "Usuario bloqueado. Ha excedido el número de intentos.");
        }

        public static boolean realizarLogin() {
            String usuario = JOptionPane.showInputDialog("Ingrese su usuario:");
            String contrasena = JOptionPane.showInputDialog("Ingrese su contraseña:");

            if ("admin".equals(usuario) && "12345".equals(contrasena)) {
                return true;
            } else {
                return false;
            }

        }
    }
