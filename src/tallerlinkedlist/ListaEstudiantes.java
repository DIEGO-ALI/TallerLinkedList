package tallerlinkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class ListaEstudiantes {

    static LinkedList<Estudiante> linkedList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedList = new LinkedList<>();

    }

    public static void agregarEstuduante(Estudiante add) {
        linkedList.add(add);
    }

    public static void insertarEstudiante(Estudiante add, int index) {
        linkedList.add(index, add);
    }

    public static void eliminarEstudiante(int id) {

        for (Estudiante estudiante : linkedList) {
            if (estudiante.getId() == id) {
                linkedList.remove(id);
                System.out.println("El estudiante se ha eliminado");
            } else {
                System.out.println("El estduiante con " + estudiante.getId() + "Ha sido eliminado");
            }
        }

    }

    public static void buscarEstudiante(int index){
        for (Estudiante estudiante : linkedList) {
            if (index == estudiante.getId()) {
                estudiante.toString();
            }else{
                System.out.println("El estudiante con id: "+index+" no se encuentra");
                
            }
        }
    }
    
   public static LinkedList<Estudiante> obtenerTopEstudiantes(int n){
   int promedioTop=0;
   int promedio=0;
       LinkedList<Estudiante> ListaEstudiantesTop = new LinkedList<>();
       
       
       
       for (int i = 0; i <linkedList.size(); i++) {
           if (linkedList.get(i).getPromedio()>promedio) {
               
           }
       }
       
       
   
   
   
   
   
   return ListaEstudiantesTop;
   }
    
}
