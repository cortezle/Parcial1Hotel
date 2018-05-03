/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelderafael;
import java.util.Scanner;

/**
 *
 * @author Luisa Arevalo <00038617@uca.edu.sv>
 */
public class Menu {

    private static Menu menu;
    private ListaHabitacion p = new ListaHabitacion();
    private ListaClientes lista = new ListaClientes();
    private Paquete pa = new Paquete();
    protected Menu() {}
        
    public static Menu getInstace() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }

    public void Menu_Opciones() {
        System.out.println("*====== Bienvenido al Sistema =======*\n\n"
                + "1. Habitaciones.\n"
                + "2. Paquetes.\n"
                + "3. Clientes.\n"
                + "4. Reservaciones\n"
                + "5. Salir \n\n"
                + "Opcion: ");
    }

    public void Opcion_Seleccionada() {
        int opcion = 0, num = 0, opcion1;
        String palabras;
        Scanner option = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);
        
        while (opcion != 5) {
            Menu_Opciones();
            try {
                opcion = option.nextInt();
                switch (opcion) {
                    case 1:
                            System.out.println("####### Menu de Habitaciones #######\n\n"
                                    + "1. Generar Habitaciones\n"
                                    + "2. Mostrar Habitaciones\n"
                                    + "3. Buscar Habitacion\n\n"
                                    + "Opcion: ");
                            opcion1 = option.nextInt();
                            switch(opcion1){
                                case 1:
                                    p.generar_habitaciones(p.agregarpisosyhabitacion(p.addpiso()), p);
                                    break;
                                case 2:
                                    p.Mostrar_Habitacion();
                                    break;
                                case 3:
                                    p.Buscar_Habitacion();
                                    break;
                                default:
                                    System.out.println("Te equivocaste de opcion :l\n");
                                    break;
                            }
                        break;
                    case 2:

                        System.out.println("######### Menu de Paquete ###########\n\n"
                                + "1. Crear Nuevo Paquete\n"
                                + "2. Modificar Paquete\n\n"
                                + "Opcion: ");
                        opcion1 = option.nextInt();
                        switch (opcion1) {
                            case 1:
                                System.out.println("Tipo de Paquete (PREMIUM/BASICO):");
                                palabras = option.nextLine();
                                pa.setTipo_paquete(palabras);

                                System.out.println("Descripcion: ");
                                palabras = option.nextLine();
                                pa.setDescripcion(palabras);

                                System.out.println("Costo: ");
                                num = numero.nextInt();
                                pa.setCosto(num);

                                System.out.println("Costo Extra: ");
                                num = numero.nextInt();
                                pa.setCosto__extra_por_dia(num);

                                break;
                            case 2:
                                pa.modificar();
                                break;
                            default:
                                System.out.println("Te equivocaste de opcion :v");
                                break;
                        }

                        break;
                    case 3:
                        
                        System.out.println("########### Menu de Cliente ############\n"
                                + "1. Agregar Cliente\n"
                                + "2. Mostrar Cliente\n"
                                + "3. Buscar Cliente\n"
                                + "4. Eliminar Cliente\n\n"
                                + "opcion: ");
                        opcion1 = option.nextInt();
                        switch (opcion1) {
                            case 1:
                                lista.Agregar_Cliente();
                                break;
                            case 2:
                                lista.Mostrar_Cliente();
                                break;
                            case 3:
                                lista.Buscar_Cliente();
                                break;
                            case 4:
                                lista.eliminar();
                                break;
                            default:
                                System.out.println("Opcion no valida :( \n");
                                break;
                        }

                        break;
                    case 4:
                        System.out.println("En construccion vuelve mas tarde :v\n");
                        break;
                    case 5:
                        System.out.println(".....Saliendo del Sistema.....\n");
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;
                }
            } catch (Exception e) {
                System.err.println("Lo que se ha ingresado puede que no sea un numero\n"
                        + "Por favor ingrese un numero\n");
                option.nextLine();
            }
        }
    }
}
