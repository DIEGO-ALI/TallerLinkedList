/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ImplementarMain {

    public static void main(String[] args) {
        ImplementarMain u = new ImplementarMain();
        ListaEstudiante lis = new ListaEstudiante();
        
       
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu: \n"
                    + "Ingrese la opción que deseamanejar realizar \n"
                    + "1. Agregar Estudiantes \n"
                    + "2. insertar Estudiantes \n"
                    + "3. Eliminar Estudiantes \n"
                    + "4. Buscar Estudiantes \n"
                    + "5. Obtener Top Estudiantes \n"
                    + "6. Elimiar Estudiantes Reprobados  \n"
                    + "7. Ver Listado Estudiantes \n"
                    + "8. Salir..");
            opcion = sc.nextInt();

            switch (opcion) {
                case '1':
                    
                    break;
                case '2':

                    break;
                case '3':

                    break;
                case '4':

                    break;
                case '5':

                    break;
                case '6':

                    break;
                case '7':

                    break;

                case '8':

                    break;

            }

        } while (true);
    }
    
    public void objetosEstudiantes(){
        Estudiante est1 = new Estudiante("Diego", 1, 45);
        Estudiante est2 = new Estudiante("Maria", 2, 25);
        Estudiante est3 = new Estudiante("Julio", 3, 38);
        Estudiante est4 = new Estudiante("Carlos", 4, 50);
    }
}
