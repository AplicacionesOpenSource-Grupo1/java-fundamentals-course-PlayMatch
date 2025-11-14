public static void saludarPersona(String nombre) {
    System.out.println("Hola " + nombre);
}

public static void main(String[] args) {
    saludarPersona("Juan");
}

import java.util.Scanner;

Scanner sc = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String nombre = sc.nextLine();

        System.out.print("¿Cuántos años tienes? ");
        int edad = sc.nextInt();

        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
		
