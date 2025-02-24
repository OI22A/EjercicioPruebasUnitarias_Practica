package main;
import model.ContactBook;

import java.util.Scanner;

public class mainClass {

    static ContactBook controller = new ContactBook();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bienvenido pelao");

        menu();
        sc.close();
    }

    public static void removeContact() {

        System.out.println("Ingrese el email del usuario al que desea eliminar");
        String email = sc.nextLine();

        System.out.println(controller.remove(email));
    }

    public static void searchContact() {

        System.out.println("Ingrese su email");
        String email = sc.nextLine();

        System.out.println(controller.search(email));
    }

    public static void addContact() {
        System.out.println("Ingrese el nombre del contacto: ");
        String name = sc.next();
        sc.nextLine();

        System.out.println("Ingrese el email del contacto: ");
        String email = sc.next();
        sc.nextLine();

        System.out.println("Ingrese el telefono del contacto: ");
        String phone = sc.next();
        sc.nextLine();

        controller.add(name,email,phone);
    }

    public static void menu() {

        int opcion = -1;

        while (opcion != 0) {

            System.out.println("Que desea hacer hoy: \n 1. Agregar contacto\n 2. Buscar contacto \n 3. Remover contacto\n 0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    addContact();
                    break;
                    case 2:
                        searchContact();
                        break;
                        case 3:
                            removeContact();
                            break;
                            case 4:
                                opcion = 0;
                                break;
                                    default:
                                        System.out.println("Opción inválida, intente de nuevo.");

            }
        }
    }
}
