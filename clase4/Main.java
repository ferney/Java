package org.example.B1.clase4;
import javax.swing.JOptionPane;
public class Main {
    private static int intentos=0, MAX_INTENTOS = 3;

    public static void main(String[] args) {

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
                    case 1 -> Entrar();
                    case 2 -> JOptionPane.showMessageDialog(null, "Opción 2 seleccionada.");
                    case 3 -> JOptionPane.showMessageDialog(null, "Opción 3 seleccionada.");
                    case 0 -> {JOptionPane.showMessageDialog(null, "Saliendo del programa."); System.exit(-1);}
                    default-> JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, elija una opción válida.");
                    
                }
            }

            JOptionPane.showMessageDialog(null, "Usuario bloqueado. Ha excedido el número de intentos.");
            JOptionPane.showMessageDialog(null, "Usuario bloqueado", "ALERTA", JOptionPane.WARNING_MESSAGE);
            System.exit(-1);
        }

    private static void Entrar() {
        if (realizarLogin()) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");
            return;
        } else {
            intentos++;
            JOptionPane.showMessageDialog(null, "Inicio de sesión fallido. Intentos restantes: " + (MAX_INTENTOS - intentos));
        }
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

