
import java.util.Collections;
import java.util.LinkedList;


/**
 *
 * @author USUARIO
 */
public class ListaEstudiante {  
    
    static LinkedList<Estudiante> Lista;

    public ListaEstudiante() {
        Lista = new LinkedList<>();
        
     }

   public void agregarEstudiante(Estudiante e){
       Lista.add(e);
      // System.out.println("agregado "+e.toString());
}
   
   public void insertarEstudiante(int index, Estudiante e){

        Lista.add(index,e);
}
   
     public void eliminarEstudiante(int id){

            for (Estudiante estudiante : Lista) {
                if (estudiante.getId()==id){
                Lista.remove(estudiante);
                } else{
                    System.out.println("El ID no existe dentro de la lista");
                }
         }

}
    public void buscarEstudiante(int id){
    for (Estudiante estudiante : Lista) {
            if (estudiante.getId() == id) {
                System.out.println(estudiante.toString());
            } else {
                System.out.println("El ID no existe dentro de la lista");
            }
        }
}
    
    public void Ordernar1(){
        Collections.sort(Lista,(e1,e2)->Double.compare(e1.getPromedio(), e2.getPromedio()));
       // mostrar();
    }
         
   public void obtenerTopEstudiante(int n){
       Ordernar1();
       System.out.println("top es ");
       for (int i = Lista.size()-1; i >=0; i--) {
           System.out.println( Lista.get(i).toString());
       }
}
   
 
   
    public void EliminarReprobados(){


}
    
    public void imprimirLista(){
    for (int i = 0; i < Lista.size(); i++) {
          System.out.println( Lista.get(i).toString());
       }
    
    }
}
