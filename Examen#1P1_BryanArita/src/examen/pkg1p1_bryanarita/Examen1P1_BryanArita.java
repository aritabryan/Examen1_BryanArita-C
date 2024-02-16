/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.pkg1p1_bryanarita;

import java.util.Scanner;

/**
 *
 * @author mlope
 */
public class Examen1P1_BryanArita {

    static Scanner duki = new Scanner(System.in);

    public static void impr(String cadena) {
        String acum = "";
        String acum2="";
        if (cadena.length() % 2 != 0) {
            System.out.print("nueva cadena: ");
            String cadena2 = duki.next();
            acum += cadena + cadena2;
            System.out.println(acum);
            int tama = acum.length();
            System.out.println("el tamano de la cadena es: " + tama);
        } else if (cadena.length() % 2 == 0) {
            int mitad = cadena.length() / 2;
            String sub = cadena.substring(mitad);
            String sub2 = cadena.substring(0, mitad);// el substring divide la cadena en 2
            System.out.println("primera mitad: " + sub2);
            System.out.println("segunda mitad: " + sub);
            for (int i = 0; i < sub2.length(); i++) {
                acum2+=sub2.charAt(i)+"-";
            }
            boolean pleca = true;// este boolean hace que no se copie la pleca en la ultima posicion 
            for (int i = 0; i < sub.length(); i++) {
                if (!pleca) {
                    acum2+="/";
                }
                pleca = false;
                acum2+=sub.charAt(i);
            }
            System.out.println("Cadena resultante: "+acum2);
        }
    }

    public static void Menu() {
        System.out.println("\n***Menu*** ");
        System.out.print("[1]Ejercicios String\n[2]Respuestas a preguntas\n[3]Mostrar el historial del menú\nIngrese opcion: ");
    }

    public static void Preguntas() {
        System.out.println("");
        System.out.println("[a] Describa el funcionamiento y diferencias del if y del switch case(3%)");
        System.out.println("estos sirven para poner diferentes condiciones en una variable. La diferencia es que el switch case no evalua condiciones "
                + "como por ejemplo n%2==0, sino que evalua cosas mas especificas que el usuario ingrese");
        System.out.println("\n[b]Describa el funcionamiento de .substring(), equalsIgNoreCase() y .equals()");
        System.out.println("El .substring() hace que podamos dividir las cadenas en diferentes partes dependiendo donde le ponemos que empiece y donde termine el"
                + "substring. \nEl .equalsIgnoraCase() compara 2 cadenas diferentes sin importar si estan en mayuscula o miniscula y nos devuelve si son iguales o no."
                + "\nEl .equals() es casi lo mismo a el anterior solo que aqui en la comparacion de 2 cadenas no se ignora si estan en diferentes case de mayuscula o miniscula, en este se compara"
                + "si son exactamente igual a la otra cadena");
        System.out.println("\n[c]Defina a que se refiere la concatenación");
        System.out.println("es la union de diferentes caracteres para crear y usar una cadena de caracteres");

    }

    public static void main(String[] args) {
        Menu();
        int opcion = duki.nextInt();
        int contejercicio1 = 0;//creo los contadores aca afuera ya que si los leo adentro se va a estar reiniciando a 0 siempre
        int contejercicio2 = 0;
        String historial = "";
        while (opcion != 3) {
            switch (opcion) {
                case 1:
                    duki.nextLine();
                    System.out.print("Ingrese cadena: ");
                    String cadena = duki.nextLine();
                    while (cadena.length() < 3) {
                        System.out.println("la cadena debe de ser mas grande que 3 caracteres");
                        System.out.print("Ingrese cadena: ");
                        cadena = duki.nextLine();
                    }
                    impr(cadena);
                    contejercicio1++;
                    historial += "-Ejercicios String";
                    break;
                case 2:
                    Preguntas();
                    contejercicio2++;
                    historial += "-Respuestas a preguntas";
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            Menu();
            opcion = duki.nextInt();
        }
        System.out.println("Ha ingresa el ejercicio 1, " + contejercicio1 + " veces");
        System.out.println("Ha ingresa el ejercicio 2, " + contejercicio2 + " veces");
        System.out.println("***HISTORIAL***\n" + historial);
        System.out.println("saliendo...");
    }

}
